package com.chris.bean.vo;

import lombok.Data;

@Data
public class SeatVo {
    private String site_no;
    private Byte site_row;
    private Byte site_column;
    private Byte site_status;     //座位状态  1：可选  2：已售  3：已选
}
