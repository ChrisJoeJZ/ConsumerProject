package com.chris.bean.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FilmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilmExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andFilmIdIsNull() {
            addCriterion("film_id is null");
            return (Criteria) this;
        }

        public Criteria andFilmIdIsNotNull() {
            addCriterion("film_id is not null");
            return (Criteria) this;
        }

        public Criteria andFilmIdEqualTo(Integer value) {
            addCriterion("film_id =", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotEqualTo(Integer value) {
            addCriterion("film_id <>", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdGreaterThan(Integer value) {
            addCriterion("film_id >", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("film_id >=", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdLessThan(Integer value) {
            addCriterion("film_id <", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdLessThanOrEqualTo(Integer value) {
            addCriterion("film_id <=", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdIn(List<Integer> values) {
            addCriterion("film_id in", values, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotIn(List<Integer> values) {
            addCriterion("film_id not in", values, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdBetween(Integer value1, Integer value2) {
            addCriterion("film_id between", value1, value2, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("film_id not between", value1, value2, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameIsNull() {
            addCriterion("film_real_name is null");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameIsNotNull() {
            addCriterion("film_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameEqualTo(String value) {
            addCriterion("film_real_name =", value, "filmRealName");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameNotEqualTo(String value) {
            addCriterion("film_real_name <>", value, "filmRealName");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameGreaterThan(String value) {
            addCriterion("film_real_name >", value, "filmRealName");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("film_real_name >=", value, "filmRealName");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameLessThan(String value) {
            addCriterion("film_real_name <", value, "filmRealName");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameLessThanOrEqualTo(String value) {
            addCriterion("film_real_name <=", value, "filmRealName");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameLike(String value) {
            addCriterion("film_real_name like", value, "filmRealName");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameNotLike(String value) {
            addCriterion("film_real_name not like", value, "filmRealName");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameIn(List<String> values) {
            addCriterion("film_real_name in", values, "filmRealName");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameNotIn(List<String> values) {
            addCriterion("film_real_name not in", values, "filmRealName");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameBetween(String value1, String value2) {
            addCriterion("film_real_name between", value1, value2, "filmRealName");
            return (Criteria) this;
        }

        public Criteria andFilmRealNameNotBetween(String value1, String value2) {
            addCriterion("film_real_name not between", value1, value2, "filmRealName");
            return (Criteria) this;
        }

        public Criteria andFilmNameIsNull() {
            addCriterion("film_name is null");
            return (Criteria) this;
        }

        public Criteria andFilmNameIsNotNull() {
            addCriterion("film_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilmNameEqualTo(String value) {
            addCriterion("film_name =", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotEqualTo(String value) {
            addCriterion("film_name <>", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameGreaterThan(String value) {
            addCriterion("film_name >", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameGreaterThanOrEqualTo(String value) {
            addCriterion("film_name >=", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameLessThan(String value) {
            addCriterion("film_name <", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameLessThanOrEqualTo(String value) {
            addCriterion("film_name <=", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameLike(String value) {
            addCriterion("film_name like", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotLike(String value) {
            addCriterion("film_name not like", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameIn(List<String> values) {
            addCriterion("film_name in", values, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotIn(List<String> values) {
            addCriterion("film_name not in", values, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameBetween(String value1, String value2) {
            addCriterion("film_name between", value1, value2, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotBetween(String value1, String value2) {
            addCriterion("film_name not between", value1, value2, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmDescIsNull() {
            addCriterion("film_desc is null");
            return (Criteria) this;
        }

        public Criteria andFilmDescIsNotNull() {
            addCriterion("film_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFilmDescEqualTo(String value) {
            addCriterion("film_desc =", value, "filmDesc");
            return (Criteria) this;
        }

        public Criteria andFilmDescNotEqualTo(String value) {
            addCriterion("film_desc <>", value, "filmDesc");
            return (Criteria) this;
        }

        public Criteria andFilmDescGreaterThan(String value) {
            addCriterion("film_desc >", value, "filmDesc");
            return (Criteria) this;
        }

        public Criteria andFilmDescGreaterThanOrEqualTo(String value) {
            addCriterion("film_desc >=", value, "filmDesc");
            return (Criteria) this;
        }

        public Criteria andFilmDescLessThan(String value) {
            addCriterion("film_desc <", value, "filmDesc");
            return (Criteria) this;
        }

        public Criteria andFilmDescLessThanOrEqualTo(String value) {
            addCriterion("film_desc <=", value, "filmDesc");
            return (Criteria) this;
        }

        public Criteria andFilmDescLike(String value) {
            addCriterion("film_desc like", value, "filmDesc");
            return (Criteria) this;
        }

        public Criteria andFilmDescNotLike(String value) {
            addCriterion("film_desc not like", value, "filmDesc");
            return (Criteria) this;
        }

        public Criteria andFilmDescIn(List<String> values) {
            addCriterion("film_desc in", values, "filmDesc");
            return (Criteria) this;
        }

        public Criteria andFilmDescNotIn(List<String> values) {
            addCriterion("film_desc not in", values, "filmDesc");
            return (Criteria) this;
        }

        public Criteria andFilmDescBetween(String value1, String value2) {
            addCriterion("film_desc between", value1, value2, "filmDesc");
            return (Criteria) this;
        }

        public Criteria andFilmDescNotBetween(String value1, String value2) {
            addCriterion("film_desc not between", value1, value2, "filmDesc");
            return (Criteria) this;
        }

        public Criteria andFilmAvatIsNull() {
            addCriterion("film_avat is null");
            return (Criteria) this;
        }

        public Criteria andFilmAvatIsNotNull() {
            addCriterion("film_avat is not null");
            return (Criteria) this;
        }

        public Criteria andFilmAvatEqualTo(String value) {
            addCriterion("film_avat =", value, "filmAvat");
            return (Criteria) this;
        }

        public Criteria andFilmAvatNotEqualTo(String value) {
            addCriterion("film_avat <>", value, "filmAvat");
            return (Criteria) this;
        }

        public Criteria andFilmAvatGreaterThan(String value) {
            addCriterion("film_avat >", value, "filmAvat");
            return (Criteria) this;
        }

        public Criteria andFilmAvatGreaterThanOrEqualTo(String value) {
            addCriterion("film_avat >=", value, "filmAvat");
            return (Criteria) this;
        }

        public Criteria andFilmAvatLessThan(String value) {
            addCriterion("film_avat <", value, "filmAvat");
            return (Criteria) this;
        }

        public Criteria andFilmAvatLessThanOrEqualTo(String value) {
            addCriterion("film_avat <=", value, "filmAvat");
            return (Criteria) this;
        }

        public Criteria andFilmAvatLike(String value) {
            addCriterion("film_avat like", value, "filmAvat");
            return (Criteria) this;
        }

        public Criteria andFilmAvatNotLike(String value) {
            addCriterion("film_avat not like", value, "filmAvat");
            return (Criteria) this;
        }

        public Criteria andFilmAvatIn(List<String> values) {
            addCriterion("film_avat in", values, "filmAvat");
            return (Criteria) this;
        }

        public Criteria andFilmAvatNotIn(List<String> values) {
            addCriterion("film_avat not in", values, "filmAvat");
            return (Criteria) this;
        }

        public Criteria andFilmAvatBetween(String value1, String value2) {
            addCriterion("film_avat between", value1, value2, "filmAvat");
            return (Criteria) this;
        }

        public Criteria andFilmAvatNotBetween(String value1, String value2) {
            addCriterion("film_avat not between", value1, value2, "filmAvat");
            return (Criteria) this;
        }

        public Criteria andFilmImgsIsNull() {
            addCriterion("film_imgs is null");
            return (Criteria) this;
        }

        public Criteria andFilmImgsIsNotNull() {
            addCriterion("film_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andFilmImgsEqualTo(String value) {
            addCriterion("film_imgs =", value, "filmImgs");
            return (Criteria) this;
        }

        public Criteria andFilmImgsNotEqualTo(String value) {
            addCriterion("film_imgs <>", value, "filmImgs");
            return (Criteria) this;
        }

        public Criteria andFilmImgsGreaterThan(String value) {
            addCriterion("film_imgs >", value, "filmImgs");
            return (Criteria) this;
        }

        public Criteria andFilmImgsGreaterThanOrEqualTo(String value) {
            addCriterion("film_imgs >=", value, "filmImgs");
            return (Criteria) this;
        }

        public Criteria andFilmImgsLessThan(String value) {
            addCriterion("film_imgs <", value, "filmImgs");
            return (Criteria) this;
        }

        public Criteria andFilmImgsLessThanOrEqualTo(String value) {
            addCriterion("film_imgs <=", value, "filmImgs");
            return (Criteria) this;
        }

        public Criteria andFilmImgsLike(String value) {
            addCriterion("film_imgs like", value, "filmImgs");
            return (Criteria) this;
        }

        public Criteria andFilmImgsNotLike(String value) {
            addCriterion("film_imgs not like", value, "filmImgs");
            return (Criteria) this;
        }

        public Criteria andFilmImgsIn(List<String> values) {
            addCriterion("film_imgs in", values, "filmImgs");
            return (Criteria) this;
        }

        public Criteria andFilmImgsNotIn(List<String> values) {
            addCriterion("film_imgs not in", values, "filmImgs");
            return (Criteria) this;
        }

        public Criteria andFilmImgsBetween(String value1, String value2) {
            addCriterion("film_imgs between", value1, value2, "filmImgs");
            return (Criteria) this;
        }

        public Criteria andFilmImgsNotBetween(String value1, String value2) {
            addCriterion("film_imgs not between", value1, value2, "filmImgs");
            return (Criteria) this;
        }

        public Criteria andFilmShowTimeIsNull() {
            addCriterion("film_show_time is null");
            return (Criteria) this;
        }

        public Criteria andFilmShowTimeIsNotNull() {
            addCriterion("film_show_time is not null");
            return (Criteria) this;
        }

        public Criteria andFilmShowTimeEqualTo(Date value) {
            addCriterionForJDBCDate("film_show_time =", value, "filmShowTime");
            return (Criteria) this;
        }

        public Criteria andFilmShowTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("film_show_time <>", value, "filmShowTime");
            return (Criteria) this;
        }

        public Criteria andFilmShowTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("film_show_time >", value, "filmShowTime");
            return (Criteria) this;
        }

        public Criteria andFilmShowTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("film_show_time >=", value, "filmShowTime");
            return (Criteria) this;
        }

        public Criteria andFilmShowTimeLessThan(Date value) {
            addCriterionForJDBCDate("film_show_time <", value, "filmShowTime");
            return (Criteria) this;
        }

        public Criteria andFilmShowTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("film_show_time <=", value, "filmShowTime");
            return (Criteria) this;
        }

        public Criteria andFilmShowTimeIn(List<Date> values) {
            addCriterionForJDBCDate("film_show_time in", values, "filmShowTime");
            return (Criteria) this;
        }

        public Criteria andFilmShowTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("film_show_time not in", values, "filmShowTime");
            return (Criteria) this;
        }

        public Criteria andFilmShowTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("film_show_time between", value1, value2, "filmShowTime");
            return (Criteria) this;
        }

        public Criteria andFilmShowTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("film_show_time not between", value1, value2, "filmShowTime");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceIsNull() {
            addCriterion("film_show_place is null");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceIsNotNull() {
            addCriterion("film_show_place is not null");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceEqualTo(String value) {
            addCriterion("film_show_place =", value, "filmShowPlace");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceNotEqualTo(String value) {
            addCriterion("film_show_place <>", value, "filmShowPlace");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceGreaterThan(String value) {
            addCriterion("film_show_place >", value, "filmShowPlace");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("film_show_place >=", value, "filmShowPlace");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceLessThan(String value) {
            addCriterion("film_show_place <", value, "filmShowPlace");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceLessThanOrEqualTo(String value) {
            addCriterion("film_show_place <=", value, "filmShowPlace");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceLike(String value) {
            addCriterion("film_show_place like", value, "filmShowPlace");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceNotLike(String value) {
            addCriterion("film_show_place not like", value, "filmShowPlace");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceIn(List<String> values) {
            addCriterion("film_show_place in", values, "filmShowPlace");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceNotIn(List<String> values) {
            addCriterion("film_show_place not in", values, "filmShowPlace");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceBetween(String value1, String value2) {
            addCriterion("film_show_place between", value1, value2, "filmShowPlace");
            return (Criteria) this;
        }

        public Criteria andFilmShowPlaceNotBetween(String value1, String value2) {
            addCriterion("film_show_place not between", value1, value2, "filmShowPlace");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongIsNull() {
            addCriterion("film_timelong is null");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongIsNotNull() {
            addCriterion("film_timelong is not null");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongEqualTo(String value) {
            addCriterion("film_timelong =", value, "filmTimelong");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongNotEqualTo(String value) {
            addCriterion("film_timelong <>", value, "filmTimelong");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongGreaterThan(String value) {
            addCriterion("film_timelong >", value, "filmTimelong");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongGreaterThanOrEqualTo(String value) {
            addCriterion("film_timelong >=", value, "filmTimelong");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongLessThan(String value) {
            addCriterion("film_timelong <", value, "filmTimelong");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongLessThanOrEqualTo(String value) {
            addCriterion("film_timelong <=", value, "filmTimelong");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongLike(String value) {
            addCriterion("film_timelong like", value, "filmTimelong");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongNotLike(String value) {
            addCriterion("film_timelong not like", value, "filmTimelong");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongIn(List<String> values) {
            addCriterion("film_timelong in", values, "filmTimelong");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongNotIn(List<String> values) {
            addCriterion("film_timelong not in", values, "filmTimelong");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongBetween(String value1, String value2) {
            addCriterion("film_timelong between", value1, value2, "filmTimelong");
            return (Criteria) this;
        }

        public Criteria andFilmTimelongNotBetween(String value1, String value2) {
            addCriterion("film_timelong not between", value1, value2, "filmTimelong");
            return (Criteria) this;
        }

        public Criteria andFilmEndTimeIsNull() {
            addCriterion("film_end_time is null");
            return (Criteria) this;
        }

        public Criteria andFilmEndTimeIsNotNull() {
            addCriterion("film_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andFilmEndTimeEqualTo(Byte value) {
            addCriterion("film_end_time =", value, "filmEndTime");
            return (Criteria) this;
        }

        public Criteria andFilmEndTimeNotEqualTo(Byte value) {
            addCriterion("film_end_time <>", value, "filmEndTime");
            return (Criteria) this;
        }

        public Criteria andFilmEndTimeGreaterThan(Byte value) {
            addCriterion("film_end_time >", value, "filmEndTime");
            return (Criteria) this;
        }

        public Criteria andFilmEndTimeGreaterThanOrEqualTo(Byte value) {
            addCriterion("film_end_time >=", value, "filmEndTime");
            return (Criteria) this;
        }

        public Criteria andFilmEndTimeLessThan(Byte value) {
            addCriterion("film_end_time <", value, "filmEndTime");
            return (Criteria) this;
        }

        public Criteria andFilmEndTimeLessThanOrEqualTo(Byte value) {
            addCriterion("film_end_time <=", value, "filmEndTime");
            return (Criteria) this;
        }

        public Criteria andFilmEndTimeIn(List<Byte> values) {
            addCriterion("film_end_time in", values, "filmEndTime");
            return (Criteria) this;
        }

        public Criteria andFilmEndTimeNotIn(List<Byte> values) {
            addCriterion("film_end_time not in", values, "filmEndTime");
            return (Criteria) this;
        }

        public Criteria andFilmEndTimeBetween(Byte value1, Byte value2) {
            addCriterion("film_end_time between", value1, value2, "filmEndTime");
            return (Criteria) this;
        }

        public Criteria andFilmEndTimeNotBetween(Byte value1, Byte value2) {
            addCriterion("film_end_time not between", value1, value2, "filmEndTime");
            return (Criteria) this;
        }

        public Criteria andFilmFavoriteIsNull() {
            addCriterion("film_favorite is null");
            return (Criteria) this;
        }

        public Criteria andFilmFavoriteIsNotNull() {
            addCriterion("film_favorite is not null");
            return (Criteria) this;
        }

        public Criteria andFilmFavoriteEqualTo(Integer value) {
            addCriterion("film_favorite =", value, "filmFavorite");
            return (Criteria) this;
        }

        public Criteria andFilmFavoriteNotEqualTo(Integer value) {
            addCriterion("film_favorite <>", value, "filmFavorite");
            return (Criteria) this;
        }

        public Criteria andFilmFavoriteGreaterThan(Integer value) {
            addCriterion("film_favorite >", value, "filmFavorite");
            return (Criteria) this;
        }

        public Criteria andFilmFavoriteGreaterThanOrEqualTo(Integer value) {
            addCriterion("film_favorite >=", value, "filmFavorite");
            return (Criteria) this;
        }

        public Criteria andFilmFavoriteLessThan(Integer value) {
            addCriterion("film_favorite <", value, "filmFavorite");
            return (Criteria) this;
        }

        public Criteria andFilmFavoriteLessThanOrEqualTo(Integer value) {
            addCriterion("film_favorite <=", value, "filmFavorite");
            return (Criteria) this;
        }

        public Criteria andFilmFavoriteIn(List<Integer> values) {
            addCriterion("film_favorite in", values, "filmFavorite");
            return (Criteria) this;
        }

        public Criteria andFilmFavoriteNotIn(List<Integer> values) {
            addCriterion("film_favorite not in", values, "filmFavorite");
            return (Criteria) this;
        }

        public Criteria andFilmFavoriteBetween(Integer value1, Integer value2) {
            addCriterion("film_favorite between", value1, value2, "filmFavorite");
            return (Criteria) this;
        }

        public Criteria andFilmFavoriteNotBetween(Integer value1, Integer value2) {
            addCriterion("film_favorite not between", value1, value2, "filmFavorite");
            return (Criteria) this;
        }

        public Criteria andFilmTotalcostIsNull() {
            addCriterion("film_totalcost is null");
            return (Criteria) this;
        }

        public Criteria andFilmTotalcostIsNotNull() {
            addCriterion("film_totalcost is not null");
            return (Criteria) this;
        }

        public Criteria andFilmTotalcostEqualTo(Integer value) {
            addCriterion("film_totalcost =", value, "filmTotalcost");
            return (Criteria) this;
        }

        public Criteria andFilmTotalcostNotEqualTo(Integer value) {
            addCriterion("film_totalcost <>", value, "filmTotalcost");
            return (Criteria) this;
        }

        public Criteria andFilmTotalcostGreaterThan(Integer value) {
            addCriterion("film_totalcost >", value, "filmTotalcost");
            return (Criteria) this;
        }

        public Criteria andFilmTotalcostGreaterThanOrEqualTo(Integer value) {
            addCriterion("film_totalcost >=", value, "filmTotalcost");
            return (Criteria) this;
        }

        public Criteria andFilmTotalcostLessThan(Integer value) {
            addCriterion("film_totalcost <", value, "filmTotalcost");
            return (Criteria) this;
        }

        public Criteria andFilmTotalcostLessThanOrEqualTo(Integer value) {
            addCriterion("film_totalcost <=", value, "filmTotalcost");
            return (Criteria) this;
        }

        public Criteria andFilmTotalcostIn(List<Integer> values) {
            addCriterion("film_totalcost in", values, "filmTotalcost");
            return (Criteria) this;
        }

        public Criteria andFilmTotalcostNotIn(List<Integer> values) {
            addCriterion("film_totalcost not in", values, "filmTotalcost");
            return (Criteria) this;
        }

        public Criteria andFilmTotalcostBetween(Integer value1, Integer value2) {
            addCriterion("film_totalcost between", value1, value2, "filmTotalcost");
            return (Criteria) this;
        }

        public Criteria andFilmTotalcostNotBetween(Integer value1, Integer value2) {
            addCriterion("film_totalcost not between", value1, value2, "filmTotalcost");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseIsNull() {
            addCriterion("film_praise is null");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseIsNotNull() {
            addCriterion("film_praise is not null");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseEqualTo(BigDecimal value) {
            addCriterion("film_praise =", value, "filmPraise");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseNotEqualTo(BigDecimal value) {
            addCriterion("film_praise <>", value, "filmPraise");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseGreaterThan(BigDecimal value) {
            addCriterion("film_praise >", value, "filmPraise");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("film_praise >=", value, "filmPraise");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseLessThan(BigDecimal value) {
            addCriterion("film_praise <", value, "filmPraise");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("film_praise <=", value, "filmPraise");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseIn(List<BigDecimal> values) {
            addCriterion("film_praise in", values, "filmPraise");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseNotIn(List<BigDecimal> values) {
            addCriterion("film_praise not in", values, "filmPraise");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("film_praise between", value1, value2, "filmPraise");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("film_praise not between", value1, value2, "filmPraise");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseStarIsNull() {
            addCriterion("film_praise_star is null");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseStarIsNotNull() {
            addCriterion("film_praise_star is not null");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseStarEqualTo(Byte value) {
            addCriterion("film_praise_star =", value, "filmPraiseStar");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseStarNotEqualTo(Byte value) {
            addCriterion("film_praise_star <>", value, "filmPraiseStar");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseStarGreaterThan(Byte value) {
            addCriterion("film_praise_star >", value, "filmPraiseStar");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseStarGreaterThanOrEqualTo(Byte value) {
            addCriterion("film_praise_star >=", value, "filmPraiseStar");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseStarLessThan(Byte value) {
            addCriterion("film_praise_star <", value, "filmPraiseStar");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseStarLessThanOrEqualTo(Byte value) {
            addCriterion("film_praise_star <=", value, "filmPraiseStar");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseStarIn(List<Byte> values) {
            addCriterion("film_praise_star in", values, "filmPraiseStar");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseStarNotIn(List<Byte> values) {
            addCriterion("film_praise_star not in", values, "filmPraiseStar");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseStarBetween(Byte value1, Byte value2) {
            addCriterion("film_praise_star between", value1, value2, "filmPraiseStar");
            return (Criteria) this;
        }

        public Criteria andFilmPraiseStarNotBetween(Byte value1, Byte value2) {
            addCriterion("film_praise_star not between", value1, value2, "filmPraiseStar");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleIsNull() {
            addCriterion("film_praise_pepole is null");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleIsNotNull() {
            addCriterion("film_praise_pepole is not null");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleEqualTo(String value) {
            addCriterion("film_praise_pepole =", value, "filmPraisePepole");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleNotEqualTo(String value) {
            addCriterion("film_praise_pepole <>", value, "filmPraisePepole");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleGreaterThan(String value) {
            addCriterion("film_praise_pepole >", value, "filmPraisePepole");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleGreaterThanOrEqualTo(String value) {
            addCriterion("film_praise_pepole >=", value, "filmPraisePepole");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleLessThan(String value) {
            addCriterion("film_praise_pepole <", value, "filmPraisePepole");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleLessThanOrEqualTo(String value) {
            addCriterion("film_praise_pepole <=", value, "filmPraisePepole");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleLike(String value) {
            addCriterion("film_praise_pepole like", value, "filmPraisePepole");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleNotLike(String value) {
            addCriterion("film_praise_pepole not like", value, "filmPraisePepole");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleIn(List<String> values) {
            addCriterion("film_praise_pepole in", values, "filmPraisePepole");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleNotIn(List<String> values) {
            addCriterion("film_praise_pepole not in", values, "filmPraisePepole");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleBetween(String value1, String value2) {
            addCriterion("film_praise_pepole between", value1, value2, "filmPraisePepole");
            return (Criteria) this;
        }

        public Criteria andFilmPraisePepoleNotBetween(String value1, String value2) {
            addCriterion("film_praise_pepole not between", value1, value2, "filmPraisePepole");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceIsNull() {
            addCriterion("film_advance is null");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceIsNotNull() {
            addCriterion("film_advance is not null");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceEqualTo(String value) {
            addCriterion("film_advance =", value, "filmAdvance");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceNotEqualTo(String value) {
            addCriterion("film_advance <>", value, "filmAdvance");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceGreaterThan(String value) {
            addCriterion("film_advance >", value, "filmAdvance");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceGreaterThanOrEqualTo(String value) {
            addCriterion("film_advance >=", value, "filmAdvance");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceLessThan(String value) {
            addCriterion("film_advance <", value, "filmAdvance");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceLessThanOrEqualTo(String value) {
            addCriterion("film_advance <=", value, "filmAdvance");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceLike(String value) {
            addCriterion("film_advance like", value, "filmAdvance");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceNotLike(String value) {
            addCriterion("film_advance not like", value, "filmAdvance");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceIn(List<String> values) {
            addCriterion("film_advance in", values, "filmAdvance");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceNotIn(List<String> values) {
            addCriterion("film_advance not in", values, "filmAdvance");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceBetween(String value1, String value2) {
            addCriterion("film_advance between", value1, value2, "filmAdvance");
            return (Criteria) this;
        }

        public Criteria andFilmAdvanceNotBetween(String value1, String value2) {
            addCriterion("film_advance not between", value1, value2, "filmAdvance");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeIsNull() {
            addCriterion("film_attribute is null");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeIsNotNull() {
            addCriterion("film_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeEqualTo(String value) {
            addCriterion("film_attribute =", value, "filmAttribute");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeNotEqualTo(String value) {
            addCriterion("film_attribute <>", value, "filmAttribute");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeGreaterThan(String value) {
            addCriterion("film_attribute >", value, "filmAttribute");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("film_attribute >=", value, "filmAttribute");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeLessThan(String value) {
            addCriterion("film_attribute <", value, "filmAttribute");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeLessThanOrEqualTo(String value) {
            addCriterion("film_attribute <=", value, "filmAttribute");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeLike(String value) {
            addCriterion("film_attribute like", value, "filmAttribute");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeNotLike(String value) {
            addCriterion("film_attribute not like", value, "filmAttribute");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeIn(List<String> values) {
            addCriterion("film_attribute in", values, "filmAttribute");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeNotIn(List<String> values) {
            addCriterion("film_attribute not in", values, "filmAttribute");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeBetween(String value1, String value2) {
            addCriterion("film_attribute between", value1, value2, "filmAttribute");
            return (Criteria) this;
        }

        public Criteria andFilmAttributeNotBetween(String value1, String value2) {
            addCriterion("film_attribute not between", value1, value2, "filmAttribute");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordIsNull() {
            addCriterion("film_cate_keyword is null");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordIsNotNull() {
            addCriterion("film_cate_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordEqualTo(String value) {
            addCriterion("film_cate_keyword =", value, "filmCateKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordNotEqualTo(String value) {
            addCriterion("film_cate_keyword <>", value, "filmCateKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordGreaterThan(String value) {
            addCriterion("film_cate_keyword >", value, "filmCateKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("film_cate_keyword >=", value, "filmCateKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordLessThan(String value) {
            addCriterion("film_cate_keyword <", value, "filmCateKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordLessThanOrEqualTo(String value) {
            addCriterion("film_cate_keyword <=", value, "filmCateKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordLike(String value) {
            addCriterion("film_cate_keyword like", value, "filmCateKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordNotLike(String value) {
            addCriterion("film_cate_keyword not like", value, "filmCateKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordIn(List<String> values) {
            addCriterion("film_cate_keyword in", values, "filmCateKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordNotIn(List<String> values) {
            addCriterion("film_cate_keyword not in", values, "filmCateKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordBetween(String value1, String value2) {
            addCriterion("film_cate_keyword between", value1, value2, "filmCateKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmCateKeywordNotBetween(String value1, String value2) {
            addCriterion("film_cate_keyword not between", value1, value2, "filmCateKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordIsNull() {
            addCriterion("film_region_keyword is null");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordIsNotNull() {
            addCriterion("film_region_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordEqualTo(String value) {
            addCriterion("film_region_keyword =", value, "filmRegionKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordNotEqualTo(String value) {
            addCriterion("film_region_keyword <>", value, "filmRegionKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordGreaterThan(String value) {
            addCriterion("film_region_keyword >", value, "filmRegionKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("film_region_keyword >=", value, "filmRegionKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordLessThan(String value) {
            addCriterion("film_region_keyword <", value, "filmRegionKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordLessThanOrEqualTo(String value) {
            addCriterion("film_region_keyword <=", value, "filmRegionKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordLike(String value) {
            addCriterion("film_region_keyword like", value, "filmRegionKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordNotLike(String value) {
            addCriterion("film_region_keyword not like", value, "filmRegionKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordIn(List<String> values) {
            addCriterion("film_region_keyword in", values, "filmRegionKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordNotIn(List<String> values) {
            addCriterion("film_region_keyword not in", values, "filmRegionKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordBetween(String value1, String value2) {
            addCriterion("film_region_keyword between", value1, value2, "filmRegionKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmRegionKeywordNotBetween(String value1, String value2) {
            addCriterion("film_region_keyword not between", value1, value2, "filmRegionKeyword");
            return (Criteria) this;
        }

        public Criteria andFilmYearsIsNull() {
            addCriterion("film_years is null");
            return (Criteria) this;
        }

        public Criteria andFilmYearsIsNotNull() {
            addCriterion("film_years is not null");
            return (Criteria) this;
        }

        public Criteria andFilmYearsEqualTo(String value) {
            addCriterion("film_years =", value, "filmYears");
            return (Criteria) this;
        }

        public Criteria andFilmYearsNotEqualTo(String value) {
            addCriterion("film_years <>", value, "filmYears");
            return (Criteria) this;
        }

        public Criteria andFilmYearsGreaterThan(String value) {
            addCriterion("film_years >", value, "filmYears");
            return (Criteria) this;
        }

        public Criteria andFilmYearsGreaterThanOrEqualTo(String value) {
            addCriterion("film_years >=", value, "filmYears");
            return (Criteria) this;
        }

        public Criteria andFilmYearsLessThan(String value) {
            addCriterion("film_years <", value, "filmYears");
            return (Criteria) this;
        }

        public Criteria andFilmYearsLessThanOrEqualTo(String value) {
            addCriterion("film_years <=", value, "filmYears");
            return (Criteria) this;
        }

        public Criteria andFilmYearsLike(String value) {
            addCriterion("film_years like", value, "filmYears");
            return (Criteria) this;
        }

        public Criteria andFilmYearsNotLike(String value) {
            addCriterion("film_years not like", value, "filmYears");
            return (Criteria) this;
        }

        public Criteria andFilmYearsIn(List<String> values) {
            addCriterion("film_years in", values, "filmYears");
            return (Criteria) this;
        }

        public Criteria andFilmYearsNotIn(List<String> values) {
            addCriterion("film_years not in", values, "filmYears");
            return (Criteria) this;
        }

        public Criteria andFilmYearsBetween(String value1, String value2) {
            addCriterion("film_years between", value1, value2, "filmYears");
            return (Criteria) this;
        }

        public Criteria andFilmYearsNotBetween(String value1, String value2) {
            addCriterion("film_years not between", value1, value2, "filmYears");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryIsNull() {
            addCriterion("film_cate_query is null");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryIsNotNull() {
            addCriterion("film_cate_query is not null");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryEqualTo(String value) {
            addCriterion("film_cate_query =", value, "filmCateQuery");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryNotEqualTo(String value) {
            addCriterion("film_cate_query <>", value, "filmCateQuery");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryGreaterThan(String value) {
            addCriterion("film_cate_query >", value, "filmCateQuery");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryGreaterThanOrEqualTo(String value) {
            addCriterion("film_cate_query >=", value, "filmCateQuery");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryLessThan(String value) {
            addCriterion("film_cate_query <", value, "filmCateQuery");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryLessThanOrEqualTo(String value) {
            addCriterion("film_cate_query <=", value, "filmCateQuery");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryLike(String value) {
            addCriterion("film_cate_query like", value, "filmCateQuery");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryNotLike(String value) {
            addCriterion("film_cate_query not like", value, "filmCateQuery");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryIn(List<String> values) {
            addCriterion("film_cate_query in", values, "filmCateQuery");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryNotIn(List<String> values) {
            addCriterion("film_cate_query not in", values, "filmCateQuery");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryBetween(String value1, String value2) {
            addCriterion("film_cate_query between", value1, value2, "filmCateQuery");
            return (Criteria) this;
        }

        public Criteria andFilmCateQueryNotBetween(String value1, String value2) {
            addCriterion("film_cate_query not between", value1, value2, "filmCateQuery");
            return (Criteria) this;
        }

        public Criteria andFilmEnabledIsNull() {
            addCriterion("film_enabled is null");
            return (Criteria) this;
        }

        public Criteria andFilmEnabledIsNotNull() {
            addCriterion("film_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andFilmEnabledEqualTo(Byte value) {
            addCriterion("film_enabled =", value, "filmEnabled");
            return (Criteria) this;
        }

        public Criteria andFilmEnabledNotEqualTo(Byte value) {
            addCriterion("film_enabled <>", value, "filmEnabled");
            return (Criteria) this;
        }

        public Criteria andFilmEnabledGreaterThan(Byte value) {
            addCriterion("film_enabled >", value, "filmEnabled");
            return (Criteria) this;
        }

        public Criteria andFilmEnabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("film_enabled >=", value, "filmEnabled");
            return (Criteria) this;
        }

        public Criteria andFilmEnabledLessThan(Byte value) {
            addCriterion("film_enabled <", value, "filmEnabled");
            return (Criteria) this;
        }

        public Criteria andFilmEnabledLessThanOrEqualTo(Byte value) {
            addCriterion("film_enabled <=", value, "filmEnabled");
            return (Criteria) this;
        }

        public Criteria andFilmEnabledIn(List<Byte> values) {
            addCriterion("film_enabled in", values, "filmEnabled");
            return (Criteria) this;
        }

        public Criteria andFilmEnabledNotIn(List<Byte> values) {
            addCriterion("film_enabled not in", values, "filmEnabled");
            return (Criteria) this;
        }

        public Criteria andFilmEnabledBetween(Byte value1, Byte value2) {
            addCriterion("film_enabled between", value1, value2, "filmEnabled");
            return (Criteria) this;
        }

        public Criteria andFilmEnabledNotBetween(Byte value1, Byte value2) {
            addCriterion("film_enabled not between", value1, value2, "filmEnabled");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryIsNull() {
            addCriterion("film_region_query is null");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryIsNotNull() {
            addCriterion("film_region_query is not null");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryEqualTo(String value) {
            addCriterion("film_region_query =", value, "filmRegionQuery");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryNotEqualTo(String value) {
            addCriterion("film_region_query <>", value, "filmRegionQuery");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryGreaterThan(String value) {
            addCriterion("film_region_query >", value, "filmRegionQuery");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryGreaterThanOrEqualTo(String value) {
            addCriterion("film_region_query >=", value, "filmRegionQuery");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryLessThan(String value) {
            addCriterion("film_region_query <", value, "filmRegionQuery");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryLessThanOrEqualTo(String value) {
            addCriterion("film_region_query <=", value, "filmRegionQuery");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryLike(String value) {
            addCriterion("film_region_query like", value, "filmRegionQuery");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryNotLike(String value) {
            addCriterion("film_region_query not like", value, "filmRegionQuery");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryIn(List<String> values) {
            addCriterion("film_region_query in", values, "filmRegionQuery");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryNotIn(List<String> values) {
            addCriterion("film_region_query not in", values, "filmRegionQuery");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryBetween(String value1, String value2) {
            addCriterion("film_region_query between", value1, value2, "filmRegionQuery");
            return (Criteria) this;
        }

        public Criteria andFilmRegionQueryNotBetween(String value1, String value2) {
            addCriterion("film_region_query not between", value1, value2, "filmRegionQuery");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}