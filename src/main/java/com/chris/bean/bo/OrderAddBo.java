package com.chris.bean.bo;

import lombok.Data;

//添加订单的业务模型类
@Data
public class OrderAddBo {

    private String watchTimesId;   //场次编号
    private String seatList;       //座位ID

}
