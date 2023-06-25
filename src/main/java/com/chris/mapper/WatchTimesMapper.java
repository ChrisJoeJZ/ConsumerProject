package com.chris.mapper;

import com.chris.bean.po.WatchTimes;
import com.chris.bean.po.WatchTimesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WatchTimesMapper {

    //根据影院编号+影院id查询拍片日期列表
    List<String> selectWathcDateList(@Param("cinema_id") Integer cinema_id,@Param("film_id") Integer film_id);

    //根据影院id+影片id+上映日期 得到拍片场次
    List<WatchTimes> selectList(@Param("cinema_id") Integer cinema_id,@Param("film_id") Integer film_id,@Param("watch_date") String watch_date);

    long countByExample(WatchTimesExample example);

    int deleteByExample(WatchTimesExample example);

    int deleteByPrimaryKey(String wtId);

    int insert(WatchTimes record);

    int insertSelective(WatchTimes record);

    List<WatchTimes> selectByExampleWithBLOBs(WatchTimesExample example);

    List<WatchTimes> selectByExample(WatchTimesExample example);

    WatchTimes selectByPrimaryKey(String wtId);

    int updateByExampleSelective(@Param("record") WatchTimes record, @Param("example") WatchTimesExample example);

    int updateByExampleWithBLOBs(@Param("record") WatchTimes record, @Param("example") WatchTimesExample example);

    int updateByExample(@Param("record") WatchTimes record, @Param("example") WatchTimesExample example);

    int updateByPrimaryKeySelective(WatchTimes record);

    int updateByPrimaryKeyWithBLOBs(WatchTimes record);

    int updateByPrimaryKey(WatchTimes record);
}