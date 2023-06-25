package com.chris.bean.po;

import java.math.BigDecimal;
import java.util.Date;

public class Film {
    private Integer filmId;

    private String filmRealName;

    private String filmName;

    private String filmDesc;

    private String filmAvat;

    private String filmImgs;

    private Date filmShowTime;

    private String filmShowPlace;

    private String filmTimelong;

    private Byte filmEndTime;

    private Integer filmFavorite;

    private Integer filmTotalcost;

    private BigDecimal filmPraise;

    private Byte filmPraiseStar;

    private String filmPraisePepole;

    private String filmAdvance;

    private String filmAttribute;

    private String filmCateKeyword;

    private String filmRegionKeyword;

    private String filmYears;

    private String filmCateQuery;

    private Byte filmEnabled;

    private String filmRegionQuery;

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getFilmRealName() {
        return filmRealName;
    }

    public void setFilmRealName(String filmRealName) {
        this.filmRealName = filmRealName == null ? null : filmRealName.trim();
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName == null ? null : filmName.trim();
    }

    public String getFilmDesc() {
        return filmDesc;
    }

    public void setFilmDesc(String filmDesc) {
        this.filmDesc = filmDesc == null ? null : filmDesc.trim();
    }

    public String getFilmAvat() {
        return filmAvat;
    }

    public void setFilmAvat(String filmAvat) {
        this.filmAvat = filmAvat == null ? null : filmAvat.trim();
    }

    public String getFilmImgs() {
        return filmImgs;
    }

    public void setFilmImgs(String filmImgs) {
        this.filmImgs = filmImgs == null ? null : filmImgs.trim();
    }

    public Date getFilmShowTime() {
        return filmShowTime;
    }

    public void setFilmShowTime(Date filmShowTime) {
        this.filmShowTime = filmShowTime;
    }

    public String getFilmShowPlace() {
        return filmShowPlace;
    }

    public void setFilmShowPlace(String filmShowPlace) {
        this.filmShowPlace = filmShowPlace == null ? null : filmShowPlace.trim();
    }

    public String getFilmTimelong() {
        return filmTimelong;
    }

    public void setFilmTimelong(String filmTimelong) {
        this.filmTimelong = filmTimelong == null ? null : filmTimelong.trim();
    }

    public Byte getFilmEndTime() {
        return filmEndTime;
    }

    public void setFilmEndTime(Byte filmEndTime) {
        this.filmEndTime = filmEndTime;
    }

    public Integer getFilmFavorite() {
        return filmFavorite;
    }

    public void setFilmFavorite(Integer filmFavorite) {
        this.filmFavorite = filmFavorite;
    }

    public Integer getFilmTotalcost() {
        return filmTotalcost;
    }

    public void setFilmTotalcost(Integer filmTotalcost) {
        this.filmTotalcost = filmTotalcost;
    }

    public BigDecimal getFilmPraise() {
        return filmPraise;
    }

    public void setFilmPraise(BigDecimal filmPraise) {
        this.filmPraise = filmPraise;
    }

    public Byte getFilmPraiseStar() {
        return filmPraiseStar;
    }

    public void setFilmPraiseStar(Byte filmPraiseStar) {
        this.filmPraiseStar = filmPraiseStar;
    }

    public String getFilmPraisePepole() {
        return filmPraisePepole;
    }

    public void setFilmPraisePepole(String filmPraisePepole) {
        this.filmPraisePepole = filmPraisePepole == null ? null : filmPraisePepole.trim();
    }

    public String getFilmAdvance() {
        return filmAdvance;
    }

    public void setFilmAdvance(String filmAdvance) {
        this.filmAdvance = filmAdvance == null ? null : filmAdvance.trim();
    }

    public String getFilmAttribute() {
        return filmAttribute;
    }

    public void setFilmAttribute(String filmAttribute) {
        this.filmAttribute = filmAttribute == null ? null : filmAttribute.trim();
    }

    public String getFilmCateKeyword() {
        return filmCateKeyword;
    }

    public void setFilmCateKeyword(String filmCateKeyword) {
        this.filmCateKeyword = filmCateKeyword == null ? null : filmCateKeyword.trim();
    }

    public String getFilmRegionKeyword() {
        return filmRegionKeyword;
    }

    public void setFilmRegionKeyword(String filmRegionKeyword) {
        this.filmRegionKeyword = filmRegionKeyword == null ? null : filmRegionKeyword.trim();
    }

    public String getFilmYears() {
        return filmYears;
    }

    public void setFilmYears(String filmYears) {
        this.filmYears = filmYears == null ? null : filmYears.trim();
    }

    public String getFilmCateQuery() {
        return filmCateQuery;
    }

    public void setFilmCateQuery(String filmCateQuery) {
        this.filmCateQuery = filmCateQuery == null ? null : filmCateQuery.trim();
    }

    public Byte getFilmEnabled() {
        return filmEnabled;
    }

    public void setFilmEnabled(Byte filmEnabled) {
        this.filmEnabled = filmEnabled;
    }

    public String getFilmRegionQuery() {
        return filmRegionQuery;
    }

    public void setFilmRegionQuery(String filmRegionQuery) {
        this.filmRegionQuery = filmRegionQuery == null ? null : filmRegionQuery.trim();
    }
}