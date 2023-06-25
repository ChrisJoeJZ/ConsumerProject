package com.chris.bean.po;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private String orderNo;

    private Date orderTime;

    private Integer orderUserId;

    private String orderUserNick;

    private Integer orderCinemaId;

    private String orderCinemaName;

    private Integer orderFilmId;

    private String orderFilmName;

    private String orderWdDate;

    private String orderWtBegintime;

    private String orderWtEndtime;

    private String orderWtHalls;

    private BigDecimal orderCost;

    private String orderSites;

    private String orderWtId;

    private Byte orderIsUse=0;     //订单是否已被使用   0：未使用  1：以使用    默认0

    private Byte orderState=0;     //订单状态    0： 订单已生成但还没支付   1：已支付   默认0

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public String getOrderUserNick() {
        return orderUserNick;
    }

    public void setOrderUserNick(String orderUserNick) {
        this.orderUserNick = orderUserNick == null ? null : orderUserNick.trim();
    }

    public Integer getOrderCinemaId() {
        return orderCinemaId;
    }

    public void setOrderCinemaId(Integer orderCinemaId) {
        this.orderCinemaId = orderCinemaId;
    }

    public String getOrderCinemaName() {
        return orderCinemaName;
    }

    public void setOrderCinemaName(String orderCinemaName) {
        this.orderCinemaName = orderCinemaName == null ? null : orderCinemaName.trim();
    }

    public Integer getOrderFilmId() {
        return orderFilmId;
    }

    public void setOrderFilmId(Integer orderFilmId) {
        this.orderFilmId = orderFilmId;
    }

    public String getOrderFilmName() {
        return orderFilmName;
    }

    public void setOrderFilmName(String orderFilmName) {
        this.orderFilmName = orderFilmName == null ? null : orderFilmName.trim();
    }

    public String getOrderWdDate() {
        return orderWdDate;
    }

    public void setOrderWdDate(String orderWdDate) {
        this.orderWdDate = orderWdDate == null ? null : orderWdDate.trim();
    }

    public String getOrderWtBegintime() {
        return orderWtBegintime;
    }

    public void setOrderWtBegintime(String orderWtBegintime) {
        this.orderWtBegintime = orderWtBegintime == null ? null : orderWtBegintime.trim();
    }

    public String getOrderWtEndtime() {
        return orderWtEndtime;
    }

    public void setOrderWtEndtime(String orderWtEndtime) {
        this.orderWtEndtime = orderWtEndtime == null ? null : orderWtEndtime.trim();
    }

    public String getOrderWtHalls() {
        return orderWtHalls;
    }

    public void setOrderWtHalls(String orderWtHalls) {
        this.orderWtHalls = orderWtHalls == null ? null : orderWtHalls.trim();
    }

    public BigDecimal getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(BigDecimal orderCost) {
        this.orderCost = orderCost;
    }

    public String getOrderSites() {
        return orderSites;
    }

    public void setOrderSites(String orderSites) {
        this.orderSites = orderSites == null ? null : orderSites.trim();
    }

    public String getOrderWtId() {
        return orderWtId;
    }

    public void setOrderWtId(String orderWtId) {
        this.orderWtId = orderWtId == null ? null : orderWtId.trim();
    }

    public Byte getOrderIsUse() {
        return orderIsUse;
    }

    public void setOrderIsUse(Byte orderIsUse) {
        this.orderIsUse = orderIsUse;
    }

    public Byte getOrderState() {
        return orderState;
    }

    public void setOrderState(Byte orderState) {
        this.orderState = orderState;
    }
}