package com.chris.bean.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WatchTimesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WatchTimesExample() {
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

        public Criteria andWtIdIsNull() {
            addCriterion("wt_id is null");
            return (Criteria) this;
        }

        public Criteria andWtIdIsNotNull() {
            addCriterion("wt_id is not null");
            return (Criteria) this;
        }

        public Criteria andWtIdEqualTo(String value) {
            addCriterion("wt_id =", value, "wtId");
            return (Criteria) this;
        }

        public Criteria andWtIdNotEqualTo(String value) {
            addCriterion("wt_id <>", value, "wtId");
            return (Criteria) this;
        }

        public Criteria andWtIdGreaterThan(String value) {
            addCriterion("wt_id >", value, "wtId");
            return (Criteria) this;
        }

        public Criteria andWtIdGreaterThanOrEqualTo(String value) {
            addCriterion("wt_id >=", value, "wtId");
            return (Criteria) this;
        }

        public Criteria andWtIdLessThan(String value) {
            addCriterion("wt_id <", value, "wtId");
            return (Criteria) this;
        }

        public Criteria andWtIdLessThanOrEqualTo(String value) {
            addCriterion("wt_id <=", value, "wtId");
            return (Criteria) this;
        }

        public Criteria andWtIdLike(String value) {
            addCriterion("wt_id like", value, "wtId");
            return (Criteria) this;
        }

        public Criteria andWtIdNotLike(String value) {
            addCriterion("wt_id not like", value, "wtId");
            return (Criteria) this;
        }

        public Criteria andWtIdIn(List<String> values) {
            addCriterion("wt_id in", values, "wtId");
            return (Criteria) this;
        }

        public Criteria andWtIdNotIn(List<String> values) {
            addCriterion("wt_id not in", values, "wtId");
            return (Criteria) this;
        }

        public Criteria andWtIdBetween(String value1, String value2) {
            addCriterion("wt_id between", value1, value2, "wtId");
            return (Criteria) this;
        }

        public Criteria andWtIdNotBetween(String value1, String value2) {
            addCriterion("wt_id not between", value1, value2, "wtId");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeIsNull() {
            addCriterion("wt_begintime is null");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeIsNotNull() {
            addCriterion("wt_begintime is not null");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeEqualTo(String value) {
            addCriterion("wt_begintime =", value, "wtBegintime");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeNotEqualTo(String value) {
            addCriterion("wt_begintime <>", value, "wtBegintime");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeGreaterThan(String value) {
            addCriterion("wt_begintime >", value, "wtBegintime");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("wt_begintime >=", value, "wtBegintime");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeLessThan(String value) {
            addCriterion("wt_begintime <", value, "wtBegintime");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeLessThanOrEqualTo(String value) {
            addCriterion("wt_begintime <=", value, "wtBegintime");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeLike(String value) {
            addCriterion("wt_begintime like", value, "wtBegintime");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeNotLike(String value) {
            addCriterion("wt_begintime not like", value, "wtBegintime");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeIn(List<String> values) {
            addCriterion("wt_begintime in", values, "wtBegintime");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeNotIn(List<String> values) {
            addCriterion("wt_begintime not in", values, "wtBegintime");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeBetween(String value1, String value2) {
            addCriterion("wt_begintime between", value1, value2, "wtBegintime");
            return (Criteria) this;
        }

        public Criteria andWtBegintimeNotBetween(String value1, String value2) {
            addCriterion("wt_begintime not between", value1, value2, "wtBegintime");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeIsNull() {
            addCriterion("wt_endtime is null");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeIsNotNull() {
            addCriterion("wt_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeEqualTo(String value) {
            addCriterion("wt_endtime =", value, "wtEndtime");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeNotEqualTo(String value) {
            addCriterion("wt_endtime <>", value, "wtEndtime");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeGreaterThan(String value) {
            addCriterion("wt_endtime >", value, "wtEndtime");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("wt_endtime >=", value, "wtEndtime");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeLessThan(String value) {
            addCriterion("wt_endtime <", value, "wtEndtime");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeLessThanOrEqualTo(String value) {
            addCriterion("wt_endtime <=", value, "wtEndtime");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeLike(String value) {
            addCriterion("wt_endtime like", value, "wtEndtime");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeNotLike(String value) {
            addCriterion("wt_endtime not like", value, "wtEndtime");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeIn(List<String> values) {
            addCriterion("wt_endtime in", values, "wtEndtime");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeNotIn(List<String> values) {
            addCriterion("wt_endtime not in", values, "wtEndtime");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeBetween(String value1, String value2) {
            addCriterion("wt_endtime between", value1, value2, "wtEndtime");
            return (Criteria) this;
        }

        public Criteria andWtEndtimeNotBetween(String value1, String value2) {
            addCriterion("wt_endtime not between", value1, value2, "wtEndtime");
            return (Criteria) this;
        }

        public Criteria andWtVersionIsNull() {
            addCriterion("wt_version is null");
            return (Criteria) this;
        }

        public Criteria andWtVersionIsNotNull() {
            addCriterion("wt_version is not null");
            return (Criteria) this;
        }

        public Criteria andWtVersionEqualTo(String value) {
            addCriterion("wt_version =", value, "wtVersion");
            return (Criteria) this;
        }

        public Criteria andWtVersionNotEqualTo(String value) {
            addCriterion("wt_version <>", value, "wtVersion");
            return (Criteria) this;
        }

        public Criteria andWtVersionGreaterThan(String value) {
            addCriterion("wt_version >", value, "wtVersion");
            return (Criteria) this;
        }

        public Criteria andWtVersionGreaterThanOrEqualTo(String value) {
            addCriterion("wt_version >=", value, "wtVersion");
            return (Criteria) this;
        }

        public Criteria andWtVersionLessThan(String value) {
            addCriterion("wt_version <", value, "wtVersion");
            return (Criteria) this;
        }

        public Criteria andWtVersionLessThanOrEqualTo(String value) {
            addCriterion("wt_version <=", value, "wtVersion");
            return (Criteria) this;
        }

        public Criteria andWtVersionLike(String value) {
            addCriterion("wt_version like", value, "wtVersion");
            return (Criteria) this;
        }

        public Criteria andWtVersionNotLike(String value) {
            addCriterion("wt_version not like", value, "wtVersion");
            return (Criteria) this;
        }

        public Criteria andWtVersionIn(List<String> values) {
            addCriterion("wt_version in", values, "wtVersion");
            return (Criteria) this;
        }

        public Criteria andWtVersionNotIn(List<String> values) {
            addCriterion("wt_version not in", values, "wtVersion");
            return (Criteria) this;
        }

        public Criteria andWtVersionBetween(String value1, String value2) {
            addCriterion("wt_version between", value1, value2, "wtVersion");
            return (Criteria) this;
        }

        public Criteria andWtVersionNotBetween(String value1, String value2) {
            addCriterion("wt_version not between", value1, value2, "wtVersion");
            return (Criteria) this;
        }

        public Criteria andWtCostIsNull() {
            addCriterion("wt_cost is null");
            return (Criteria) this;
        }

        public Criteria andWtCostIsNotNull() {
            addCriterion("wt_cost is not null");
            return (Criteria) this;
        }

        public Criteria andWtCostEqualTo(BigDecimal value) {
            addCriterion("wt_cost =", value, "wtCost");
            return (Criteria) this;
        }

        public Criteria andWtCostNotEqualTo(BigDecimal value) {
            addCriterion("wt_cost <>", value, "wtCost");
            return (Criteria) this;
        }

        public Criteria andWtCostGreaterThan(BigDecimal value) {
            addCriterion("wt_cost >", value, "wtCost");
            return (Criteria) this;
        }

        public Criteria andWtCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wt_cost >=", value, "wtCost");
            return (Criteria) this;
        }

        public Criteria andWtCostLessThan(BigDecimal value) {
            addCriterion("wt_cost <", value, "wtCost");
            return (Criteria) this;
        }

        public Criteria andWtCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wt_cost <=", value, "wtCost");
            return (Criteria) this;
        }

        public Criteria andWtCostIn(List<BigDecimal> values) {
            addCriterion("wt_cost in", values, "wtCost");
            return (Criteria) this;
        }

        public Criteria andWtCostNotIn(List<BigDecimal> values) {
            addCriterion("wt_cost not in", values, "wtCost");
            return (Criteria) this;
        }

        public Criteria andWtCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wt_cost between", value1, value2, "wtCost");
            return (Criteria) this;
        }

        public Criteria andWtCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wt_cost not between", value1, value2, "wtCost");
            return (Criteria) this;
        }

        public Criteria andWtMaxselIsNull() {
            addCriterion("wt_maxsel is null");
            return (Criteria) this;
        }

        public Criteria andWtMaxselIsNotNull() {
            addCriterion("wt_maxsel is not null");
            return (Criteria) this;
        }

        public Criteria andWtMaxselEqualTo(Byte value) {
            addCriterion("wt_maxsel =", value, "wtMaxsel");
            return (Criteria) this;
        }

        public Criteria andWtMaxselNotEqualTo(Byte value) {
            addCriterion("wt_maxsel <>", value, "wtMaxsel");
            return (Criteria) this;
        }

        public Criteria andWtMaxselGreaterThan(Byte value) {
            addCriterion("wt_maxsel >", value, "wtMaxsel");
            return (Criteria) this;
        }

        public Criteria andWtMaxselGreaterThanOrEqualTo(Byte value) {
            addCriterion("wt_maxsel >=", value, "wtMaxsel");
            return (Criteria) this;
        }

        public Criteria andWtMaxselLessThan(Byte value) {
            addCriterion("wt_maxsel <", value, "wtMaxsel");
            return (Criteria) this;
        }

        public Criteria andWtMaxselLessThanOrEqualTo(Byte value) {
            addCriterion("wt_maxsel <=", value, "wtMaxsel");
            return (Criteria) this;
        }

        public Criteria andWtMaxselIn(List<Byte> values) {
            addCriterion("wt_maxsel in", values, "wtMaxsel");
            return (Criteria) this;
        }

        public Criteria andWtMaxselNotIn(List<Byte> values) {
            addCriterion("wt_maxsel not in", values, "wtMaxsel");
            return (Criteria) this;
        }

        public Criteria andWtMaxselBetween(Byte value1, Byte value2) {
            addCriterion("wt_maxsel between", value1, value2, "wtMaxsel");
            return (Criteria) this;
        }

        public Criteria andWtMaxselNotBetween(Byte value1, Byte value2) {
            addCriterion("wt_maxsel not between", value1, value2, "wtMaxsel");
            return (Criteria) this;
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

        public Criteria andWdDateIsNull() {
            addCriterion("wd_date is null");
            return (Criteria) this;
        }

        public Criteria andWdDateIsNotNull() {
            addCriterion("wd_date is not null");
            return (Criteria) this;
        }

        public Criteria andWdDateEqualTo(String value) {
            addCriterion("wd_date =", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateNotEqualTo(String value) {
            addCriterion("wd_date <>", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateGreaterThan(String value) {
            addCriterion("wd_date >", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateGreaterThanOrEqualTo(String value) {
            addCriterion("wd_date >=", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateLessThan(String value) {
            addCriterion("wd_date <", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateLessThanOrEqualTo(String value) {
            addCriterion("wd_date <=", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateLike(String value) {
            addCriterion("wd_date like", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateNotLike(String value) {
            addCriterion("wd_date not like", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateIn(List<String> values) {
            addCriterion("wd_date in", values, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateNotIn(List<String> values) {
            addCriterion("wd_date not in", values, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateBetween(String value1, String value2) {
            addCriterion("wd_date between", value1, value2, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateNotBetween(String value1, String value2) {
            addCriterion("wd_date not between", value1, value2, "wdDate");
            return (Criteria) this;
        }

        public Criteria andCmaIdIsNull() {
            addCriterion("cma_id is null");
            return (Criteria) this;
        }

        public Criteria andCmaIdIsNotNull() {
            addCriterion("cma_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmaIdEqualTo(Integer value) {
            addCriterion("cma_id =", value, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdNotEqualTo(Integer value) {
            addCriterion("cma_id <>", value, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdGreaterThan(Integer value) {
            addCriterion("cma_id >", value, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cma_id >=", value, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdLessThan(Integer value) {
            addCriterion("cma_id <", value, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdLessThanOrEqualTo(Integer value) {
            addCriterion("cma_id <=", value, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdIn(List<Integer> values) {
            addCriterion("cma_id in", values, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdNotIn(List<Integer> values) {
            addCriterion("cma_id not in", values, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdBetween(Integer value1, Integer value2) {
            addCriterion("cma_id between", value1, value2, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cma_id not between", value1, value2, "cmaId");
            return (Criteria) this;
        }

        public Criteria andWtHallsIsNull() {
            addCriterion("wt_halls is null");
            return (Criteria) this;
        }

        public Criteria andWtHallsIsNotNull() {
            addCriterion("wt_halls is not null");
            return (Criteria) this;
        }

        public Criteria andWtHallsEqualTo(String value) {
            addCriterion("wt_halls =", value, "wtHalls");
            return (Criteria) this;
        }

        public Criteria andWtHallsNotEqualTo(String value) {
            addCriterion("wt_halls <>", value, "wtHalls");
            return (Criteria) this;
        }

        public Criteria andWtHallsGreaterThan(String value) {
            addCriterion("wt_halls >", value, "wtHalls");
            return (Criteria) this;
        }

        public Criteria andWtHallsGreaterThanOrEqualTo(String value) {
            addCriterion("wt_halls >=", value, "wtHalls");
            return (Criteria) this;
        }

        public Criteria andWtHallsLessThan(String value) {
            addCriterion("wt_halls <", value, "wtHalls");
            return (Criteria) this;
        }

        public Criteria andWtHallsLessThanOrEqualTo(String value) {
            addCriterion("wt_halls <=", value, "wtHalls");
            return (Criteria) this;
        }

        public Criteria andWtHallsLike(String value) {
            addCriterion("wt_halls like", value, "wtHalls");
            return (Criteria) this;
        }

        public Criteria andWtHallsNotLike(String value) {
            addCriterion("wt_halls not like", value, "wtHalls");
            return (Criteria) this;
        }

        public Criteria andWtHallsIn(List<String> values) {
            addCriterion("wt_halls in", values, "wtHalls");
            return (Criteria) this;
        }

        public Criteria andWtHallsNotIn(List<String> values) {
            addCriterion("wt_halls not in", values, "wtHalls");
            return (Criteria) this;
        }

        public Criteria andWtHallsBetween(String value1, String value2) {
            addCriterion("wt_halls between", value1, value2, "wtHalls");
            return (Criteria) this;
        }

        public Criteria andWtHallsNotBetween(String value1, String value2) {
            addCriterion("wt_halls not between", value1, value2, "wtHalls");
            return (Criteria) this;
        }

        public Criteria andWtEnableIsNull() {
            addCriterion("wt_enable is null");
            return (Criteria) this;
        }

        public Criteria andWtEnableIsNotNull() {
            addCriterion("wt_enable is not null");
            return (Criteria) this;
        }

        public Criteria andWtEnableEqualTo(Byte value) {
            addCriterion("wt_enable =", value, "wtEnable");
            return (Criteria) this;
        }

        public Criteria andWtEnableNotEqualTo(Byte value) {
            addCriterion("wt_enable <>", value, "wtEnable");
            return (Criteria) this;
        }

        public Criteria andWtEnableGreaterThan(Byte value) {
            addCriterion("wt_enable >", value, "wtEnable");
            return (Criteria) this;
        }

        public Criteria andWtEnableGreaterThanOrEqualTo(Byte value) {
            addCriterion("wt_enable >=", value, "wtEnable");
            return (Criteria) this;
        }

        public Criteria andWtEnableLessThan(Byte value) {
            addCriterion("wt_enable <", value, "wtEnable");
            return (Criteria) this;
        }

        public Criteria andWtEnableLessThanOrEqualTo(Byte value) {
            addCriterion("wt_enable <=", value, "wtEnable");
            return (Criteria) this;
        }

        public Criteria andWtEnableIn(List<Byte> values) {
            addCriterion("wt_enable in", values, "wtEnable");
            return (Criteria) this;
        }

        public Criteria andWtEnableNotIn(List<Byte> values) {
            addCriterion("wt_enable not in", values, "wtEnable");
            return (Criteria) this;
        }

        public Criteria andWtEnableBetween(Byte value1, Byte value2) {
            addCriterion("wt_enable between", value1, value2, "wtEnable");
            return (Criteria) this;
        }

        public Criteria andWtEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("wt_enable not between", value1, value2, "wtEnable");
            return (Criteria) this;
        }

        public Criteria andWtUrlIsNull() {
            addCriterion("wt_url is null");
            return (Criteria) this;
        }

        public Criteria andWtUrlIsNotNull() {
            addCriterion("wt_url is not null");
            return (Criteria) this;
        }

        public Criteria andWtUrlEqualTo(String value) {
            addCriterion("wt_url =", value, "wtUrl");
            return (Criteria) this;
        }

        public Criteria andWtUrlNotEqualTo(String value) {
            addCriterion("wt_url <>", value, "wtUrl");
            return (Criteria) this;
        }

        public Criteria andWtUrlGreaterThan(String value) {
            addCriterion("wt_url >", value, "wtUrl");
            return (Criteria) this;
        }

        public Criteria andWtUrlGreaterThanOrEqualTo(String value) {
            addCriterion("wt_url >=", value, "wtUrl");
            return (Criteria) this;
        }

        public Criteria andWtUrlLessThan(String value) {
            addCriterion("wt_url <", value, "wtUrl");
            return (Criteria) this;
        }

        public Criteria andWtUrlLessThanOrEqualTo(String value) {
            addCriterion("wt_url <=", value, "wtUrl");
            return (Criteria) this;
        }

        public Criteria andWtUrlLike(String value) {
            addCriterion("wt_url like", value, "wtUrl");
            return (Criteria) this;
        }

        public Criteria andWtUrlNotLike(String value) {
            addCriterion("wt_url not like", value, "wtUrl");
            return (Criteria) this;
        }

        public Criteria andWtUrlIn(List<String> values) {
            addCriterion("wt_url in", values, "wtUrl");
            return (Criteria) this;
        }

        public Criteria andWtUrlNotIn(List<String> values) {
            addCriterion("wt_url not in", values, "wtUrl");
            return (Criteria) this;
        }

        public Criteria andWtUrlBetween(String value1, String value2) {
            addCriterion("wt_url between", value1, value2, "wtUrl");
            return (Criteria) this;
        }

        public Criteria andWtUrlNotBetween(String value1, String value2) {
            addCriterion("wt_url not between", value1, value2, "wtUrl");
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