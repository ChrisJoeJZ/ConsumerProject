package com.chris.bean.bo;

import lombok.Data;

//查询业务-基础业务模型类（超类）
@Data
public class BaseBo {
    //排序字段
    private String orderColumn;     //排序的列名
    private String orderType;     //排序规则（升序还是降序）

    //分页字段
    private Integer page=1;      //当前显示页数
    private Integer pageSize = 10;    //每页显示几条记录
    private Integer startIndex = 0;  //每页的起始索引
    private Integer pageCount;   //总页数
    private Integer resultCount; //总记录条数

    // 按照关键字进行搜索（电影关键字或者影院关键字）
    private String search;


    public void setPage(Integer page) {
        this.page = page;
        this.setStartIndex( (getPage()-1)*getPageSize() );
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        this.setStartIndex( (getPage()-1)*getPageSize() );
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;

        setPageCount(
                getResultCount() % getPageSize() == 0? getResultCount()/getPageSize() : getResultCount()/getPageSize() +1
        );
    }

    //边界控制，无法访问超出页数之外的页面（防止传入数据库进行非法查询）

    public void setPageCount(Integer pageCount) {

        this.pageCount = pageCount;
        //更新页码参数，必须大于一
        if(getPage()<1){
            setPage(1);
        }
        //更新的页数也不能超过做大页码数
        if (getPage()>getPageCount()){
            setPage(getPageCount());
        }
    }
}
