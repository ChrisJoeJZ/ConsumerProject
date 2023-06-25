package com.chris.bean.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIsNull() {
            addCriterion("order_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIsNotNull() {
            addCriterion("order_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdEqualTo(Integer value) {
            addCriterion("order_user_id =", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotEqualTo(Integer value) {
            addCriterion("order_user_id <>", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThan(Integer value) {
            addCriterion("order_user_id >", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_user_id >=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThan(Integer value) {
            addCriterion("order_user_id <", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_user_id <=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIn(List<Integer> values) {
            addCriterion("order_user_id in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotIn(List<Integer> values) {
            addCriterion("order_user_id not in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdBetween(Integer value1, Integer value2) {
            addCriterion("order_user_id between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_user_id not between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickIsNull() {
            addCriterion("order_user_nick is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickIsNotNull() {
            addCriterion("order_user_nick is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickEqualTo(String value) {
            addCriterion("order_user_nick =", value, "orderUserNick");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickNotEqualTo(String value) {
            addCriterion("order_user_nick <>", value, "orderUserNick");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickGreaterThan(String value) {
            addCriterion("order_user_nick >", value, "orderUserNick");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickGreaterThanOrEqualTo(String value) {
            addCriterion("order_user_nick >=", value, "orderUserNick");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickLessThan(String value) {
            addCriterion("order_user_nick <", value, "orderUserNick");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickLessThanOrEqualTo(String value) {
            addCriterion("order_user_nick <=", value, "orderUserNick");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickLike(String value) {
            addCriterion("order_user_nick like", value, "orderUserNick");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickNotLike(String value) {
            addCriterion("order_user_nick not like", value, "orderUserNick");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickIn(List<String> values) {
            addCriterion("order_user_nick in", values, "orderUserNick");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickNotIn(List<String> values) {
            addCriterion("order_user_nick not in", values, "orderUserNick");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickBetween(String value1, String value2) {
            addCriterion("order_user_nick between", value1, value2, "orderUserNick");
            return (Criteria) this;
        }

        public Criteria andOrderUserNickNotBetween(String value1, String value2) {
            addCriterion("order_user_nick not between", value1, value2, "orderUserNick");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaIdIsNull() {
            addCriterion("order_cinema_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaIdIsNotNull() {
            addCriterion("order_cinema_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaIdEqualTo(Integer value) {
            addCriterion("order_cinema_id =", value, "orderCinemaId");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaIdNotEqualTo(Integer value) {
            addCriterion("order_cinema_id <>", value, "orderCinemaId");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaIdGreaterThan(Integer value) {
            addCriterion("order_cinema_id >", value, "orderCinemaId");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_cinema_id >=", value, "orderCinemaId");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaIdLessThan(Integer value) {
            addCriterion("order_cinema_id <", value, "orderCinemaId");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_cinema_id <=", value, "orderCinemaId");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaIdIn(List<Integer> values) {
            addCriterion("order_cinema_id in", values, "orderCinemaId");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaIdNotIn(List<Integer> values) {
            addCriterion("order_cinema_id not in", values, "orderCinemaId");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaIdBetween(Integer value1, Integer value2) {
            addCriterion("order_cinema_id between", value1, value2, "orderCinemaId");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_cinema_id not between", value1, value2, "orderCinemaId");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameIsNull() {
            addCriterion("order_cinema_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameIsNotNull() {
            addCriterion("order_cinema_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameEqualTo(String value) {
            addCriterion("order_cinema_name =", value, "orderCinemaName");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameNotEqualTo(String value) {
            addCriterion("order_cinema_name <>", value, "orderCinemaName");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameGreaterThan(String value) {
            addCriterion("order_cinema_name >", value, "orderCinemaName");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_cinema_name >=", value, "orderCinemaName");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameLessThan(String value) {
            addCriterion("order_cinema_name <", value, "orderCinemaName");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameLessThanOrEqualTo(String value) {
            addCriterion("order_cinema_name <=", value, "orderCinemaName");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameLike(String value) {
            addCriterion("order_cinema_name like", value, "orderCinemaName");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameNotLike(String value) {
            addCriterion("order_cinema_name not like", value, "orderCinemaName");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameIn(List<String> values) {
            addCriterion("order_cinema_name in", values, "orderCinemaName");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameNotIn(List<String> values) {
            addCriterion("order_cinema_name not in", values, "orderCinemaName");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameBetween(String value1, String value2) {
            addCriterion("order_cinema_name between", value1, value2, "orderCinemaName");
            return (Criteria) this;
        }

        public Criteria andOrderCinemaNameNotBetween(String value1, String value2) {
            addCriterion("order_cinema_name not between", value1, value2, "orderCinemaName");
            return (Criteria) this;
        }

        public Criteria andOrderFilmIdIsNull() {
            addCriterion("order_film_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderFilmIdIsNotNull() {
            addCriterion("order_film_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFilmIdEqualTo(Integer value) {
            addCriterion("order_film_id =", value, "orderFilmId");
            return (Criteria) this;
        }

        public Criteria andOrderFilmIdNotEqualTo(Integer value) {
            addCriterion("order_film_id <>", value, "orderFilmId");
            return (Criteria) this;
        }

        public Criteria andOrderFilmIdGreaterThan(Integer value) {
            addCriterion("order_film_id >", value, "orderFilmId");
            return (Criteria) this;
        }

        public Criteria andOrderFilmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_film_id >=", value, "orderFilmId");
            return (Criteria) this;
        }

        public Criteria andOrderFilmIdLessThan(Integer value) {
            addCriterion("order_film_id <", value, "orderFilmId");
            return (Criteria) this;
        }

        public Criteria andOrderFilmIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_film_id <=", value, "orderFilmId");
            return (Criteria) this;
        }

        public Criteria andOrderFilmIdIn(List<Integer> values) {
            addCriterion("order_film_id in", values, "orderFilmId");
            return (Criteria) this;
        }

        public Criteria andOrderFilmIdNotIn(List<Integer> values) {
            addCriterion("order_film_id not in", values, "orderFilmId");
            return (Criteria) this;
        }

        public Criteria andOrderFilmIdBetween(Integer value1, Integer value2) {
            addCriterion("order_film_id between", value1, value2, "orderFilmId");
            return (Criteria) this;
        }

        public Criteria andOrderFilmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_film_id not between", value1, value2, "orderFilmId");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameIsNull() {
            addCriterion("order_film_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameIsNotNull() {
            addCriterion("order_film_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameEqualTo(String value) {
            addCriterion("order_film_name =", value, "orderFilmName");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameNotEqualTo(String value) {
            addCriterion("order_film_name <>", value, "orderFilmName");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameGreaterThan(String value) {
            addCriterion("order_film_name >", value, "orderFilmName");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_film_name >=", value, "orderFilmName");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameLessThan(String value) {
            addCriterion("order_film_name <", value, "orderFilmName");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameLessThanOrEqualTo(String value) {
            addCriterion("order_film_name <=", value, "orderFilmName");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameLike(String value) {
            addCriterion("order_film_name like", value, "orderFilmName");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameNotLike(String value) {
            addCriterion("order_film_name not like", value, "orderFilmName");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameIn(List<String> values) {
            addCriterion("order_film_name in", values, "orderFilmName");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameNotIn(List<String> values) {
            addCriterion("order_film_name not in", values, "orderFilmName");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameBetween(String value1, String value2) {
            addCriterion("order_film_name between", value1, value2, "orderFilmName");
            return (Criteria) this;
        }

        public Criteria andOrderFilmNameNotBetween(String value1, String value2) {
            addCriterion("order_film_name not between", value1, value2, "orderFilmName");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateIsNull() {
            addCriterion("order_wd_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateIsNotNull() {
            addCriterion("order_wd_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateEqualTo(String value) {
            addCriterion("order_wd_date =", value, "orderWdDate");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateNotEqualTo(String value) {
            addCriterion("order_wd_date <>", value, "orderWdDate");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateGreaterThan(String value) {
            addCriterion("order_wd_date >", value, "orderWdDate");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateGreaterThanOrEqualTo(String value) {
            addCriterion("order_wd_date >=", value, "orderWdDate");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateLessThan(String value) {
            addCriterion("order_wd_date <", value, "orderWdDate");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateLessThanOrEqualTo(String value) {
            addCriterion("order_wd_date <=", value, "orderWdDate");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateLike(String value) {
            addCriterion("order_wd_date like", value, "orderWdDate");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateNotLike(String value) {
            addCriterion("order_wd_date not like", value, "orderWdDate");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateIn(List<String> values) {
            addCriterion("order_wd_date in", values, "orderWdDate");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateNotIn(List<String> values) {
            addCriterion("order_wd_date not in", values, "orderWdDate");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateBetween(String value1, String value2) {
            addCriterion("order_wd_date between", value1, value2, "orderWdDate");
            return (Criteria) this;
        }

        public Criteria andOrderWdDateNotBetween(String value1, String value2) {
            addCriterion("order_wd_date not between", value1, value2, "orderWdDate");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeIsNull() {
            addCriterion("order_wt_begintime is null");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeIsNotNull() {
            addCriterion("order_wt_begintime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeEqualTo(String value) {
            addCriterion("order_wt_begintime =", value, "orderWtBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeNotEqualTo(String value) {
            addCriterion("order_wt_begintime <>", value, "orderWtBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeGreaterThan(String value) {
            addCriterion("order_wt_begintime >", value, "orderWtBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_wt_begintime >=", value, "orderWtBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeLessThan(String value) {
            addCriterion("order_wt_begintime <", value, "orderWtBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeLessThanOrEqualTo(String value) {
            addCriterion("order_wt_begintime <=", value, "orderWtBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeLike(String value) {
            addCriterion("order_wt_begintime like", value, "orderWtBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeNotLike(String value) {
            addCriterion("order_wt_begintime not like", value, "orderWtBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeIn(List<String> values) {
            addCriterion("order_wt_begintime in", values, "orderWtBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeNotIn(List<String> values) {
            addCriterion("order_wt_begintime not in", values, "orderWtBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeBetween(String value1, String value2) {
            addCriterion("order_wt_begintime between", value1, value2, "orderWtBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderWtBegintimeNotBetween(String value1, String value2) {
            addCriterion("order_wt_begintime not between", value1, value2, "orderWtBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeIsNull() {
            addCriterion("order_wt_endtime is null");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeIsNotNull() {
            addCriterion("order_wt_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeEqualTo(String value) {
            addCriterion("order_wt_endtime =", value, "orderWtEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeNotEqualTo(String value) {
            addCriterion("order_wt_endtime <>", value, "orderWtEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeGreaterThan(String value) {
            addCriterion("order_wt_endtime >", value, "orderWtEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_wt_endtime >=", value, "orderWtEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeLessThan(String value) {
            addCriterion("order_wt_endtime <", value, "orderWtEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeLessThanOrEqualTo(String value) {
            addCriterion("order_wt_endtime <=", value, "orderWtEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeLike(String value) {
            addCriterion("order_wt_endtime like", value, "orderWtEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeNotLike(String value) {
            addCriterion("order_wt_endtime not like", value, "orderWtEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeIn(List<String> values) {
            addCriterion("order_wt_endtime in", values, "orderWtEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeNotIn(List<String> values) {
            addCriterion("order_wt_endtime not in", values, "orderWtEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeBetween(String value1, String value2) {
            addCriterion("order_wt_endtime between", value1, value2, "orderWtEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderWtEndtimeNotBetween(String value1, String value2) {
            addCriterion("order_wt_endtime not between", value1, value2, "orderWtEndtime");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsIsNull() {
            addCriterion("order_wt_halls is null");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsIsNotNull() {
            addCriterion("order_wt_halls is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsEqualTo(String value) {
            addCriterion("order_wt_halls =", value, "orderWtHalls");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsNotEqualTo(String value) {
            addCriterion("order_wt_halls <>", value, "orderWtHalls");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsGreaterThan(String value) {
            addCriterion("order_wt_halls >", value, "orderWtHalls");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsGreaterThanOrEqualTo(String value) {
            addCriterion("order_wt_halls >=", value, "orderWtHalls");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsLessThan(String value) {
            addCriterion("order_wt_halls <", value, "orderWtHalls");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsLessThanOrEqualTo(String value) {
            addCriterion("order_wt_halls <=", value, "orderWtHalls");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsLike(String value) {
            addCriterion("order_wt_halls like", value, "orderWtHalls");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsNotLike(String value) {
            addCriterion("order_wt_halls not like", value, "orderWtHalls");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsIn(List<String> values) {
            addCriterion("order_wt_halls in", values, "orderWtHalls");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsNotIn(List<String> values) {
            addCriterion("order_wt_halls not in", values, "orderWtHalls");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsBetween(String value1, String value2) {
            addCriterion("order_wt_halls between", value1, value2, "orderWtHalls");
            return (Criteria) this;
        }

        public Criteria andOrderWtHallsNotBetween(String value1, String value2) {
            addCriterion("order_wt_halls not between", value1, value2, "orderWtHalls");
            return (Criteria) this;
        }

        public Criteria andOrderCostIsNull() {
            addCriterion("order_cost is null");
            return (Criteria) this;
        }

        public Criteria andOrderCostIsNotNull() {
            addCriterion("order_cost is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCostEqualTo(BigDecimal value) {
            addCriterion("order_cost =", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostNotEqualTo(BigDecimal value) {
            addCriterion("order_cost <>", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostGreaterThan(BigDecimal value) {
            addCriterion("order_cost >", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_cost >=", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostLessThan(BigDecimal value) {
            addCriterion("order_cost <", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_cost <=", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostIn(List<BigDecimal> values) {
            addCriterion("order_cost in", values, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostNotIn(List<BigDecimal> values) {
            addCriterion("order_cost not in", values, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_cost between", value1, value2, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_cost not between", value1, value2, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderSitesIsNull() {
            addCriterion("order_sites is null");
            return (Criteria) this;
        }

        public Criteria andOrderSitesIsNotNull() {
            addCriterion("order_sites is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSitesEqualTo(String value) {
            addCriterion("order_sites =", value, "orderSites");
            return (Criteria) this;
        }

        public Criteria andOrderSitesNotEqualTo(String value) {
            addCriterion("order_sites <>", value, "orderSites");
            return (Criteria) this;
        }

        public Criteria andOrderSitesGreaterThan(String value) {
            addCriterion("order_sites >", value, "orderSites");
            return (Criteria) this;
        }

        public Criteria andOrderSitesGreaterThanOrEqualTo(String value) {
            addCriterion("order_sites >=", value, "orderSites");
            return (Criteria) this;
        }

        public Criteria andOrderSitesLessThan(String value) {
            addCriterion("order_sites <", value, "orderSites");
            return (Criteria) this;
        }

        public Criteria andOrderSitesLessThanOrEqualTo(String value) {
            addCriterion("order_sites <=", value, "orderSites");
            return (Criteria) this;
        }

        public Criteria andOrderSitesLike(String value) {
            addCriterion("order_sites like", value, "orderSites");
            return (Criteria) this;
        }

        public Criteria andOrderSitesNotLike(String value) {
            addCriterion("order_sites not like", value, "orderSites");
            return (Criteria) this;
        }

        public Criteria andOrderSitesIn(List<String> values) {
            addCriterion("order_sites in", values, "orderSites");
            return (Criteria) this;
        }

        public Criteria andOrderSitesNotIn(List<String> values) {
            addCriterion("order_sites not in", values, "orderSites");
            return (Criteria) this;
        }

        public Criteria andOrderSitesBetween(String value1, String value2) {
            addCriterion("order_sites between", value1, value2, "orderSites");
            return (Criteria) this;
        }

        public Criteria andOrderSitesNotBetween(String value1, String value2) {
            addCriterion("order_sites not between", value1, value2, "orderSites");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdIsNull() {
            addCriterion("order_wt_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdIsNotNull() {
            addCriterion("order_wt_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdEqualTo(String value) {
            addCriterion("order_wt_id =", value, "orderWtId");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdNotEqualTo(String value) {
            addCriterion("order_wt_id <>", value, "orderWtId");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdGreaterThan(String value) {
            addCriterion("order_wt_id >", value, "orderWtId");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_wt_id >=", value, "orderWtId");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdLessThan(String value) {
            addCriterion("order_wt_id <", value, "orderWtId");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdLessThanOrEqualTo(String value) {
            addCriterion("order_wt_id <=", value, "orderWtId");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdLike(String value) {
            addCriterion("order_wt_id like", value, "orderWtId");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdNotLike(String value) {
            addCriterion("order_wt_id not like", value, "orderWtId");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdIn(List<String> values) {
            addCriterion("order_wt_id in", values, "orderWtId");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdNotIn(List<String> values) {
            addCriterion("order_wt_id not in", values, "orderWtId");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdBetween(String value1, String value2) {
            addCriterion("order_wt_id between", value1, value2, "orderWtId");
            return (Criteria) this;
        }

        public Criteria andOrderWtIdNotBetween(String value1, String value2) {
            addCriterion("order_wt_id not between", value1, value2, "orderWtId");
            return (Criteria) this;
        }

        public Criteria andOrderIsUseIsNull() {
            addCriterion("order_is_use is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsUseIsNotNull() {
            addCriterion("order_is_use is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIsUseEqualTo(Byte value) {
            addCriterion("order_is_use =", value, "orderIsUse");
            return (Criteria) this;
        }

        public Criteria andOrderIsUseNotEqualTo(Byte value) {
            addCriterion("order_is_use <>", value, "orderIsUse");
            return (Criteria) this;
        }

        public Criteria andOrderIsUseGreaterThan(Byte value) {
            addCriterion("order_is_use >", value, "orderIsUse");
            return (Criteria) this;
        }

        public Criteria andOrderIsUseGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_is_use >=", value, "orderIsUse");
            return (Criteria) this;
        }

        public Criteria andOrderIsUseLessThan(Byte value) {
            addCriterion("order_is_use <", value, "orderIsUse");
            return (Criteria) this;
        }

        public Criteria andOrderIsUseLessThanOrEqualTo(Byte value) {
            addCriterion("order_is_use <=", value, "orderIsUse");
            return (Criteria) this;
        }

        public Criteria andOrderIsUseIn(List<Byte> values) {
            addCriterion("order_is_use in", values, "orderIsUse");
            return (Criteria) this;
        }

        public Criteria andOrderIsUseNotIn(List<Byte> values) {
            addCriterion("order_is_use not in", values, "orderIsUse");
            return (Criteria) this;
        }

        public Criteria andOrderIsUseBetween(Byte value1, Byte value2) {
            addCriterion("order_is_use between", value1, value2, "orderIsUse");
            return (Criteria) this;
        }

        public Criteria andOrderIsUseNotBetween(Byte value1, Byte value2) {
            addCriterion("order_is_use not between", value1, value2, "orderIsUse");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Byte value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Byte value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Byte value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Byte value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Byte value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Byte> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Byte> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Byte value1, Byte value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Byte value1, Byte value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
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