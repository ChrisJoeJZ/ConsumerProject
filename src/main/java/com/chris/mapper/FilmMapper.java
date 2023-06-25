package com.chris.mapper;

import com.chris.bean.bo.FilmSearchBo;
import com.chris.bean.po.Film;
import com.chris.bean.po.FilmExample;
import com.chris.bean.po.FilmWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//电影数据访问
@Mapper
public interface FilmMapper {
    //新增两个方法，满足FilmSearchBo条件的影片记录数和满足条件的影片列表
    //满足条件的影片数量
    Integer selectCountByBo(@Param("filmSearchBo") FilmSearchBo filmSearchBo);
    //满足条件的影片列表
    List<FilmWithBLOBs> selectByBo(@Param("filmSearchBo") FilmSearchBo filmSearchBo);

    //根据影院编号，得到该影院正在上映的影片列表
    List<Film> selectListByCmaId(@Param("cinema_id") Integer cinema_id);

    long countByExample(FilmExample example);

    int deleteByExample(FilmExample example);

    int deleteByPrimaryKey(Integer filmId);

    int insert(FilmWithBLOBs record);

    int insertSelective(FilmWithBLOBs record);

    List<FilmWithBLOBs> selectByExampleWithBLOBs(FilmExample example);

    List<Film> selectByExample(FilmExample example);

    FilmWithBLOBs selectByPrimaryKey(Integer filmId);

    int updateByExampleSelective(@Param("record") FilmWithBLOBs record, @Param("example") FilmExample example);

    int updateByExampleWithBLOBs(@Param("record") FilmWithBLOBs record, @Param("example") FilmExample example);

    int updateByExample(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByPrimaryKeySelective(FilmWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FilmWithBLOBs record);

    int updateByPrimaryKey(Film record);
}