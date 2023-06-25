package com.chris.mapper;

import com.chris.bean.po.Orders;
import com.chris.bean.po.OrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersMapper {
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(String orderNo);

    //插入一条数据（全部字段）
    int insert(Orders record);

    //插入一条数据（部分字段）
    int insertSelective(Orders record);

    //构建了一个订单的查询条件(场次ID/order_wt_id = ? 和 order_sites字段 like %座位编号% )
    //查询符合条件的订单列表
    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(String orderNo);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}