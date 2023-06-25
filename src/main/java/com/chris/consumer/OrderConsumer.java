package com.chris.consumer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.chris.bean.bo.OrderAddBo;
import com.chris.bean.bo.SelectSeatBo;
import com.chris.bean.po.*;
import com.chris.bean.vo.SeatVo;
import com.chris.mapper.CinemaMapper;
import com.chris.mapper.FilmMapper;
import com.chris.mapper.OrdersMapper;
import com.chris.mapper.WatchTimesMapper;
import com.chris.utils.RedisUtils;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

//订单的消费者
@Component
public class OrderConsumer {

    //redis工具类
    @Resource
    RedisUtils redisUtils;
    @Resource
    WatchTimesMapper watchTimesMapper;
    @Resource
    CinemaMapper cinemaMapper;
    @Resource
    FilmMapper filmMapper;
    @Resource
    OrdersMapper ordersMapper;

    //mysql数据库访问层（实体类+mapper，mapper.xml 和service）
    //实体类 OrderAddBo，Orders，UsersInfo,WatchTimes,Cinema,seatVo
    //访问层


    //需要从placeorder的topic中接收消息
    //需要监听指定的kafka的topic，一旦这个topic到达，就会触发addorder方法执行
    @KafkaListener(topics = "placeorder",groupId = "group-01")
    public void addOrder(ConsumerRecord<String,String> consumerRecord, Acknowledgment ack){

        //从consumerRecord解析出，消息中的key+value
        String key = consumerRecord.key();
        String value = consumerRecord.value();

        System.out.println("key ="+key);
        System.out.println("value =" +value);

        //从key中解析出orderAddBo
        OrderAddBo orderAddBo = JSON.parseObject(key,OrderAddBo.class);
        //从value也就是token中解析出用户信息
        UserInfo userInfo= (UserInfo) redisUtils.get(value);

        //中间包含的代码都由消费者渠道消息后代替执行
        //往order中插入数据
        Orders orders = new Orders();
        orders.setOrderNo(UUID.randomUUID().toString());
        orders.setOrderTime(new Date());
        orders.setOrderUserId(userInfo.getUserId());
        orders.setOrderUserNick(userInfo.getUserNickName());

        ///////////第三步：访问mysql 根据场次id得到场次实体类///////////////
        WatchTimes watchTimes = watchTimesMapper.selectByPrimaryKey(orderAddBo.getWatchTimesId());
        orders.setOrderCinemaId(watchTimes.getCmaId());

        //第四步 访问mysql根据影院id得到影院信息
        Cinema cinema = cinemaMapper.selectByPrimaryKey(watchTimes.getCmaId());
        orders.setOrderCinemaName(cinema.getCmaName());

        //第五步：访问mysql 根据电影id得到电影信息
        orders.setOrderFilmId(watchTimes.getFilmId());
        Film film = filmMapper.selectByPrimaryKey(watchTimes.getFilmId());
        orders.setOrderFilmName(film.getFilmName());

        orders.setOrderWdDate(watchTimes.getWdDate());        //设置场次日期
        orders.setOrderWtBegintime(watchTimes.getWtBegintime());
        orders.setOrderWtEndtime(watchTimes.getWtEndtime());
        orders.setOrderWtHalls(watchTimes.getWtHalls());      //设置放映厅类型

        //该订单总价的计算：该场次的单价*该用户选择的座位数的数量
        //场次的单价从watchTimes中取得 getWtCost
        //该用户该场次冻结的座位数量（用户冻结的那些座位会在redis中存放）seatList：从json转成List<seatVo>然后获取他的size也就是选了几个座位

        List<SeatVo> list = JSONArray.parseArray( orderAddBo.getSeatList(),SeatVo.class );
        int seatCount = list.size();      //选中座位的个数
        orders.setOrderCost(new BigDecimal(seatCount * watchTimes.getWtCost().doubleValue()));  //将BigDecimal类型的weCost转为Double类型

        orders.setOrderSites(orderAddBo.getSeatList());    //设置订单中的座位信息

        orders.setOrderWtId(orderAddBo.getWatchTimesId());  //设置电影场次id

        //第六步 访问mysql 记录生成的订单数据
        int affectedRows = ordersMapper.insert(orders);
        //判断插入的结果（受影响的条数大于零）
        //第七步  访问mysql  删除冻结的座位号
        if (affectedRows <= 0){
            System.out.println("添加订单信息返回的记录不合法，返回false");

        }else {
            //调用redis，解除冻结座位数据
            for (SeatVo seatVo : list) {
                SelectSeatBo selectSeatBo = new SelectSeatBo();
                selectSeatBo.setWatchTimesId(orderAddBo.getWatchTimesId());
                selectSeatBo.setSeatId(orderAddBo.getSeatList());
                //订单中的每个座位生成一个key，用来删除redis中的key seat-frozen-josnstring
                String redisKey = "seat-frozen-"+JSON.toJSONString(selectSeatBo);
                //假如在删除过程中，因为redis服务器出现故障，导致删除动作失败，造成订单已经写入数据库，但是redis中并没有删除（给用户造成该座位还在冻结的假象）
                //会使用户看到座位依旧时已选择（绿色：已选择但是没有付款），但实际上自己已经付款了
                redisUtils.del(redisKey);


            }
            //所有的业务完成后，消费者的服务需要给broker发送一个回执（消息已经被成功处理了）
            //这段话如果没执行，重启服务的时候，会发现数据从broker中获取一次重新走了一遍消费者逻辑（重复执行的效果）
            ack.acknowledge();
        }

    }
}
