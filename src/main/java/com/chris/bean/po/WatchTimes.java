package com.chris.bean.po;

import java.math.BigDecimal;

public class WatchTimes {
    private String wtId;

    private String wtBegintime;

    private String wtEndtime;

    private String wtVersion;

    private BigDecimal wtCost;

    private Byte wtMaxsel;

    private Integer filmId;

    private String wdDate;

    private Integer cmaId;

    private String wtHalls;

    private Byte wtEnable;

    private String wtUrl;

    private String wtCostSites;       //json字段
                                      //site_no 如果为空，则说明还作为不可用
                                      //site_row 第几行
                                      //sie_state 1是可选的座位  0是该座位不可用  2是已销售的作为
                                      //site_colum  从右往左数第几个

    public String getWtId() {
        return wtId;
    }

    public void setWtId(String wtId) {
        this.wtId = wtId == null ? null : wtId.trim();
    }

    public String getWtBegintime() {
        return wtBegintime;
    }

    public void setWtBegintime(String wtBegintime) {
        this.wtBegintime = wtBegintime == null ? null : wtBegintime.trim();
    }

    public String getWtEndtime() {
        return wtEndtime;
    }

    public void setWtEndtime(String wtEndtime) {
        this.wtEndtime = wtEndtime == null ? null : wtEndtime.trim();
    }

    public String getWtVersion() {
        return wtVersion;
    }

    public void setWtVersion(String wtVersion) {
        this.wtVersion = wtVersion == null ? null : wtVersion.trim();
    }

    public BigDecimal getWtCost() {
        return wtCost;
    }

    public void setWtCost(BigDecimal wtCost) {
        this.wtCost = wtCost;
    }

    public Byte getWtMaxsel() {
        return wtMaxsel;
    }

    public void setWtMaxsel(Byte wtMaxsel) {
        this.wtMaxsel = wtMaxsel;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getWdDate() {
        return wdDate;
    }

    public void setWdDate(String wdDate) {
        this.wdDate = wdDate == null ? null : wdDate.trim();
    }

    public Integer getCmaId() {
        return cmaId;
    }

    public void setCmaId(Integer cmaId) {
        this.cmaId = cmaId;
    }

    public String getWtHalls() {
        return wtHalls;
    }

    public void setWtHalls(String wtHalls) {
        this.wtHalls = wtHalls == null ? null : wtHalls.trim();
    }

    public Byte getWtEnable() {
        return wtEnable;
    }

    public void setWtEnable(Byte wtEnable) {
        this.wtEnable = wtEnable;
    }

    public String getWtUrl() {
        return wtUrl;
    }

    public void setWtUrl(String wtUrl) {
        this.wtUrl = wtUrl == null ? null : wtUrl.trim();
    }

    public String getWtCostSites() {
        return wtCostSites;
    }

    public void setWtCostSites(String wtCostSites) {
        this.wtCostSites = wtCostSites == null ? null : wtCostSites.trim();
    }
}