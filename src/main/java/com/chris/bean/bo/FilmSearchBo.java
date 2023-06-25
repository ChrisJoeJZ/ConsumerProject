package com.chris.bean.bo;

import lombok.Data;

//电影查询业务（baseBo的子类）
@Data
public class FilmSearchBo extends BaseBo{
    //想看人数排序  orderColumn = "film_favorite"
    //orderType = "desc"


    //评分排序   orderColumn = "film_praise"
    //orderType ="desc"

    //电影业务的筛选条件（类型category 拍摄地film-region，film_firegion_rel 上映年代film表，
    // film_years字段  typeId（1：正在热映；2：即将上映；3：热播电影））
    //影票类型category
    private Integer categoryId;
    //拍摄地
    private Integer filmRegionId;
    //上映年份
    private String filmYears;
    //按照typeID
    private Integer typeId;

}
