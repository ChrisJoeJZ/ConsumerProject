package com.chris.bean.bo;

import lombok.Data;

//选座的业务模型类
@Data
public class SelectSeatBo {
    private String watchTimesId;        //场次编号
    private String seatId;              //座位id
}
