package com.chris.bean.po;

import java.util.ArrayList;
import java.util.List;

public class CinemaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CinemaExample() {
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

        public Criteria andCmaNameIsNull() {
            addCriterion("cma_name is null");
            return (Criteria) this;
        }

        public Criteria andCmaNameIsNotNull() {
            addCriterion("cma_name is not null");
            return (Criteria) this;
        }

        public Criteria andCmaNameEqualTo(String value) {
            addCriterion("cma_name =", value, "cmaName");
            return (Criteria) this;
        }

        public Criteria andCmaNameNotEqualTo(String value) {
            addCriterion("cma_name <>", value, "cmaName");
            return (Criteria) this;
        }

        public Criteria andCmaNameGreaterThan(String value) {
            addCriterion("cma_name >", value, "cmaName");
            return (Criteria) this;
        }

        public Criteria andCmaNameGreaterThanOrEqualTo(String value) {
            addCriterion("cma_name >=", value, "cmaName");
            return (Criteria) this;
        }

        public Criteria andCmaNameLessThan(String value) {
            addCriterion("cma_name <", value, "cmaName");
            return (Criteria) this;
        }

        public Criteria andCmaNameLessThanOrEqualTo(String value) {
            addCriterion("cma_name <=", value, "cmaName");
            return (Criteria) this;
        }

        public Criteria andCmaNameLike(String value) {
            addCriterion("cma_name like", value, "cmaName");
            return (Criteria) this;
        }

        public Criteria andCmaNameNotLike(String value) {
            addCriterion("cma_name not like", value, "cmaName");
            return (Criteria) this;
        }

        public Criteria andCmaNameIn(List<String> values) {
            addCriterion("cma_name in", values, "cmaName");
            return (Criteria) this;
        }

        public Criteria andCmaNameNotIn(List<String> values) {
            addCriterion("cma_name not in", values, "cmaName");
            return (Criteria) this;
        }

        public Criteria andCmaNameBetween(String value1, String value2) {
            addCriterion("cma_name between", value1, value2, "cmaName");
            return (Criteria) this;
        }

        public Criteria andCmaNameNotBetween(String value1, String value2) {
            addCriterion("cma_name not between", value1, value2, "cmaName");
            return (Criteria) this;
        }

        public Criteria andCmaAddressIsNull() {
            addCriterion("cma_address is null");
            return (Criteria) this;
        }

        public Criteria andCmaAddressIsNotNull() {
            addCriterion("cma_address is not null");
            return (Criteria) this;
        }

        public Criteria andCmaAddressEqualTo(String value) {
            addCriterion("cma_address =", value, "cmaAddress");
            return (Criteria) this;
        }

        public Criteria andCmaAddressNotEqualTo(String value) {
            addCriterion("cma_address <>", value, "cmaAddress");
            return (Criteria) this;
        }

        public Criteria andCmaAddressGreaterThan(String value) {
            addCriterion("cma_address >", value, "cmaAddress");
            return (Criteria) this;
        }

        public Criteria andCmaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cma_address >=", value, "cmaAddress");
            return (Criteria) this;
        }

        public Criteria andCmaAddressLessThan(String value) {
            addCriterion("cma_address <", value, "cmaAddress");
            return (Criteria) this;
        }

        public Criteria andCmaAddressLessThanOrEqualTo(String value) {
            addCriterion("cma_address <=", value, "cmaAddress");
            return (Criteria) this;
        }

        public Criteria andCmaAddressLike(String value) {
            addCriterion("cma_address like", value, "cmaAddress");
            return (Criteria) this;
        }

        public Criteria andCmaAddressNotLike(String value) {
            addCriterion("cma_address not like", value, "cmaAddress");
            return (Criteria) this;
        }

        public Criteria andCmaAddressIn(List<String> values) {
            addCriterion("cma_address in", values, "cmaAddress");
            return (Criteria) this;
        }

        public Criteria andCmaAddressNotIn(List<String> values) {
            addCriterion("cma_address not in", values, "cmaAddress");
            return (Criteria) this;
        }

        public Criteria andCmaAddressBetween(String value1, String value2) {
            addCriterion("cma_address between", value1, value2, "cmaAddress");
            return (Criteria) this;
        }

        public Criteria andCmaAddressNotBetween(String value1, String value2) {
            addCriterion("cma_address not between", value1, value2, "cmaAddress");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneIsNull() {
            addCriterion("cma_phone is null");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneIsNotNull() {
            addCriterion("cma_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneEqualTo(String value) {
            addCriterion("cma_phone =", value, "cmaPhone");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneNotEqualTo(String value) {
            addCriterion("cma_phone <>", value, "cmaPhone");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneGreaterThan(String value) {
            addCriterion("cma_phone >", value, "cmaPhone");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cma_phone >=", value, "cmaPhone");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneLessThan(String value) {
            addCriterion("cma_phone <", value, "cmaPhone");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneLessThanOrEqualTo(String value) {
            addCriterion("cma_phone <=", value, "cmaPhone");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneLike(String value) {
            addCriterion("cma_phone like", value, "cmaPhone");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneNotLike(String value) {
            addCriterion("cma_phone not like", value, "cmaPhone");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneIn(List<String> values) {
            addCriterion("cma_phone in", values, "cmaPhone");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneNotIn(List<String> values) {
            addCriterion("cma_phone not in", values, "cmaPhone");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneBetween(String value1, String value2) {
            addCriterion("cma_phone between", value1, value2, "cmaPhone");
            return (Criteria) this;
        }

        public Criteria andCmaPhoneNotBetween(String value1, String value2) {
            addCriterion("cma_phone not between", value1, value2, "cmaPhone");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialIsNull() {
            addCriterion("cma_sepcial is null");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialIsNotNull() {
            addCriterion("cma_sepcial is not null");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialEqualTo(String value) {
            addCriterion("cma_sepcial =", value, "cmaSepcial");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialNotEqualTo(String value) {
            addCriterion("cma_sepcial <>", value, "cmaSepcial");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialGreaterThan(String value) {
            addCriterion("cma_sepcial >", value, "cmaSepcial");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialGreaterThanOrEqualTo(String value) {
            addCriterion("cma_sepcial >=", value, "cmaSepcial");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialLessThan(String value) {
            addCriterion("cma_sepcial <", value, "cmaSepcial");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialLessThanOrEqualTo(String value) {
            addCriterion("cma_sepcial <=", value, "cmaSepcial");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialLike(String value) {
            addCriterion("cma_sepcial like", value, "cmaSepcial");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialNotLike(String value) {
            addCriterion("cma_sepcial not like", value, "cmaSepcial");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialIn(List<String> values) {
            addCriterion("cma_sepcial in", values, "cmaSepcial");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialNotIn(List<String> values) {
            addCriterion("cma_sepcial not in", values, "cmaSepcial");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialBetween(String value1, String value2) {
            addCriterion("cma_sepcial between", value1, value2, "cmaSepcial");
            return (Criteria) this;
        }

        public Criteria andCmaSepcialNotBetween(String value1, String value2) {
            addCriterion("cma_sepcial not between", value1, value2, "cmaSepcial");
            return (Criteria) this;
        }

        public Criteria andCmaServiceIsNull() {
            addCriterion("cma_service is null");
            return (Criteria) this;
        }

        public Criteria andCmaServiceIsNotNull() {
            addCriterion("cma_service is not null");
            return (Criteria) this;
        }

        public Criteria andCmaServiceEqualTo(String value) {
            addCriterion("cma_service =", value, "cmaService");
            return (Criteria) this;
        }

        public Criteria andCmaServiceNotEqualTo(String value) {
            addCriterion("cma_service <>", value, "cmaService");
            return (Criteria) this;
        }

        public Criteria andCmaServiceGreaterThan(String value) {
            addCriterion("cma_service >", value, "cmaService");
            return (Criteria) this;
        }

        public Criteria andCmaServiceGreaterThanOrEqualTo(String value) {
            addCriterion("cma_service >=", value, "cmaService");
            return (Criteria) this;
        }

        public Criteria andCmaServiceLessThan(String value) {
            addCriterion("cma_service <", value, "cmaService");
            return (Criteria) this;
        }

        public Criteria andCmaServiceLessThanOrEqualTo(String value) {
            addCriterion("cma_service <=", value, "cmaService");
            return (Criteria) this;
        }

        public Criteria andCmaServiceLike(String value) {
            addCriterion("cma_service like", value, "cmaService");
            return (Criteria) this;
        }

        public Criteria andCmaServiceNotLike(String value) {
            addCriterion("cma_service not like", value, "cmaService");
            return (Criteria) this;
        }

        public Criteria andCmaServiceIn(List<String> values) {
            addCriterion("cma_service in", values, "cmaService");
            return (Criteria) this;
        }

        public Criteria andCmaServiceNotIn(List<String> values) {
            addCriterion("cma_service not in", values, "cmaService");
            return (Criteria) this;
        }

        public Criteria andCmaServiceBetween(String value1, String value2) {
            addCriterion("cma_service between", value1, value2, "cmaService");
            return (Criteria) this;
        }

        public Criteria andCmaServiceNotBetween(String value1, String value2) {
            addCriterion("cma_service not between", value1, value2, "cmaService");
            return (Criteria) this;
        }

        public Criteria andCmaImgsIsNull() {
            addCriterion("cma_imgs is null");
            return (Criteria) this;
        }

        public Criteria andCmaImgsIsNotNull() {
            addCriterion("cma_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andCmaImgsEqualTo(String value) {
            addCriterion("cma_imgs =", value, "cmaImgs");
            return (Criteria) this;
        }

        public Criteria andCmaImgsNotEqualTo(String value) {
            addCriterion("cma_imgs <>", value, "cmaImgs");
            return (Criteria) this;
        }

        public Criteria andCmaImgsGreaterThan(String value) {
            addCriterion("cma_imgs >", value, "cmaImgs");
            return (Criteria) this;
        }

        public Criteria andCmaImgsGreaterThanOrEqualTo(String value) {
            addCriterion("cma_imgs >=", value, "cmaImgs");
            return (Criteria) this;
        }

        public Criteria andCmaImgsLessThan(String value) {
            addCriterion("cma_imgs <", value, "cmaImgs");
            return (Criteria) this;
        }

        public Criteria andCmaImgsLessThanOrEqualTo(String value) {
            addCriterion("cma_imgs <=", value, "cmaImgs");
            return (Criteria) this;
        }

        public Criteria andCmaImgsLike(String value) {
            addCriterion("cma_imgs like", value, "cmaImgs");
            return (Criteria) this;
        }

        public Criteria andCmaImgsNotLike(String value) {
            addCriterion("cma_imgs not like", value, "cmaImgs");
            return (Criteria) this;
        }

        public Criteria andCmaImgsIn(List<String> values) {
            addCriterion("cma_imgs in", values, "cmaImgs");
            return (Criteria) this;
        }

        public Criteria andCmaImgsNotIn(List<String> values) {
            addCriterion("cma_imgs not in", values, "cmaImgs");
            return (Criteria) this;
        }

        public Criteria andCmaImgsBetween(String value1, String value2) {
            addCriterion("cma_imgs between", value1, value2, "cmaImgs");
            return (Criteria) this;
        }

        public Criteria andCmaImgsNotBetween(String value1, String value2) {
            addCriterion("cma_imgs not between", value1, value2, "cmaImgs");
            return (Criteria) this;
        }

        public Criteria andCmaCostIsNull() {
            addCriterion("cma_cost is null");
            return (Criteria) this;
        }

        public Criteria andCmaCostIsNotNull() {
            addCriterion("cma_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCmaCostEqualTo(Integer value) {
            addCriterion("cma_cost =", value, "cmaCost");
            return (Criteria) this;
        }

        public Criteria andCmaCostNotEqualTo(Integer value) {
            addCriterion("cma_cost <>", value, "cmaCost");
            return (Criteria) this;
        }

        public Criteria andCmaCostGreaterThan(Integer value) {
            addCriterion("cma_cost >", value, "cmaCost");
            return (Criteria) this;
        }

        public Criteria andCmaCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("cma_cost >=", value, "cmaCost");
            return (Criteria) this;
        }

        public Criteria andCmaCostLessThan(Integer value) {
            addCriterion("cma_cost <", value, "cmaCost");
            return (Criteria) this;
        }

        public Criteria andCmaCostLessThanOrEqualTo(Integer value) {
            addCriterion("cma_cost <=", value, "cmaCost");
            return (Criteria) this;
        }

        public Criteria andCmaCostIn(List<Integer> values) {
            addCriterion("cma_cost in", values, "cmaCost");
            return (Criteria) this;
        }

        public Criteria andCmaCostNotIn(List<Integer> values) {
            addCriterion("cma_cost not in", values, "cmaCost");
            return (Criteria) this;
        }

        public Criteria andCmaCostBetween(Integer value1, Integer value2) {
            addCriterion("cma_cost between", value1, value2, "cmaCost");
            return (Criteria) this;
        }

        public Criteria andCmaCostNotBetween(Integer value1, Integer value2) {
            addCriterion("cma_cost not between", value1, value2, "cmaCost");
            return (Criteria) this;
        }

        public Criteria andCmaAwayIsNull() {
            addCriterion("cma_away is null");
            return (Criteria) this;
        }

        public Criteria andCmaAwayIsNotNull() {
            addCriterion("cma_away is not null");
            return (Criteria) this;
        }

        public Criteria andCmaAwayEqualTo(String value) {
            addCriterion("cma_away =", value, "cmaAway");
            return (Criteria) this;
        }

        public Criteria andCmaAwayNotEqualTo(String value) {
            addCriterion("cma_away <>", value, "cmaAway");
            return (Criteria) this;
        }

        public Criteria andCmaAwayGreaterThan(String value) {
            addCriterion("cma_away >", value, "cmaAway");
            return (Criteria) this;
        }

        public Criteria andCmaAwayGreaterThanOrEqualTo(String value) {
            addCriterion("cma_away >=", value, "cmaAway");
            return (Criteria) this;
        }

        public Criteria andCmaAwayLessThan(String value) {
            addCriterion("cma_away <", value, "cmaAway");
            return (Criteria) this;
        }

        public Criteria andCmaAwayLessThanOrEqualTo(String value) {
            addCriterion("cma_away <=", value, "cmaAway");
            return (Criteria) this;
        }

        public Criteria andCmaAwayLike(String value) {
            addCriterion("cma_away like", value, "cmaAway");
            return (Criteria) this;
        }

        public Criteria andCmaAwayNotLike(String value) {
            addCriterion("cma_away not like", value, "cmaAway");
            return (Criteria) this;
        }

        public Criteria andCmaAwayIn(List<String> values) {
            addCriterion("cma_away in", values, "cmaAway");
            return (Criteria) this;
        }

        public Criteria andCmaAwayNotIn(List<String> values) {
            addCriterion("cma_away not in", values, "cmaAway");
            return (Criteria) this;
        }

        public Criteria andCmaAwayBetween(String value1, String value2) {
            addCriterion("cma_away between", value1, value2, "cmaAway");
            return (Criteria) this;
        }

        public Criteria andCmaAwayNotBetween(String value1, String value2) {
            addCriterion("cma_away not between", value1, value2, "cmaAway");
            return (Criteria) this;
        }

        public Criteria andCmaSortIsNull() {
            addCriterion("cma_sort is null");
            return (Criteria) this;
        }

        public Criteria andCmaSortIsNotNull() {
            addCriterion("cma_sort is not null");
            return (Criteria) this;
        }

        public Criteria andCmaSortEqualTo(Byte value) {
            addCriterion("cma_sort =", value, "cmaSort");
            return (Criteria) this;
        }

        public Criteria andCmaSortNotEqualTo(Byte value) {
            addCriterion("cma_sort <>", value, "cmaSort");
            return (Criteria) this;
        }

        public Criteria andCmaSortGreaterThan(Byte value) {
            addCriterion("cma_sort >", value, "cmaSort");
            return (Criteria) this;
        }

        public Criteria andCmaSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("cma_sort >=", value, "cmaSort");
            return (Criteria) this;
        }

        public Criteria andCmaSortLessThan(Byte value) {
            addCriterion("cma_sort <", value, "cmaSort");
            return (Criteria) this;
        }

        public Criteria andCmaSortLessThanOrEqualTo(Byte value) {
            addCriterion("cma_sort <=", value, "cmaSort");
            return (Criteria) this;
        }

        public Criteria andCmaSortIn(List<Byte> values) {
            addCriterion("cma_sort in", values, "cmaSort");
            return (Criteria) this;
        }

        public Criteria andCmaSortNotIn(List<Byte> values) {
            addCriterion("cma_sort not in", values, "cmaSort");
            return (Criteria) this;
        }

        public Criteria andCmaSortBetween(Byte value1, Byte value2) {
            addCriterion("cma_sort between", value1, value2, "cmaSort");
            return (Criteria) this;
        }

        public Criteria andCmaSortNotBetween(Byte value1, Byte value2) {
            addCriterion("cma_sort not between", value1, value2, "cmaSort");
            return (Criteria) this;
        }

        public Criteria andCmaUrlIsNull() {
            addCriterion("cma_url is null");
            return (Criteria) this;
        }

        public Criteria andCmaUrlIsNotNull() {
            addCriterion("cma_url is not null");
            return (Criteria) this;
        }

        public Criteria andCmaUrlEqualTo(String value) {
            addCriterion("cma_url =", value, "cmaUrl");
            return (Criteria) this;
        }

        public Criteria andCmaUrlNotEqualTo(String value) {
            addCriterion("cma_url <>", value, "cmaUrl");
            return (Criteria) this;
        }

        public Criteria andCmaUrlGreaterThan(String value) {
            addCriterion("cma_url >", value, "cmaUrl");
            return (Criteria) this;
        }

        public Criteria andCmaUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cma_url >=", value, "cmaUrl");
            return (Criteria) this;
        }

        public Criteria andCmaUrlLessThan(String value) {
            addCriterion("cma_url <", value, "cmaUrl");
            return (Criteria) this;
        }

        public Criteria andCmaUrlLessThanOrEqualTo(String value) {
            addCriterion("cma_url <=", value, "cmaUrl");
            return (Criteria) this;
        }

        public Criteria andCmaUrlLike(String value) {
            addCriterion("cma_url like", value, "cmaUrl");
            return (Criteria) this;
        }

        public Criteria andCmaUrlNotLike(String value) {
            addCriterion("cma_url not like", value, "cmaUrl");
            return (Criteria) this;
        }

        public Criteria andCmaUrlIn(List<String> values) {
            addCriterion("cma_url in", values, "cmaUrl");
            return (Criteria) this;
        }

        public Criteria andCmaUrlNotIn(List<String> values) {
            addCriterion("cma_url not in", values, "cmaUrl");
            return (Criteria) this;
        }

        public Criteria andCmaUrlBetween(String value1, String value2) {
            addCriterion("cma_url between", value1, value2, "cmaUrl");
            return (Criteria) this;
        }

        public Criteria andCmaUrlNotBetween(String value1, String value2) {
            addCriterion("cma_url not between", value1, value2, "cmaUrl");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryIsNull() {
            addCriterion("cma_service_query is null");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryIsNotNull() {
            addCriterion("cma_service_query is not null");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryEqualTo(String value) {
            addCriterion("cma_service_query =", value, "cmaServiceQuery");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryNotEqualTo(String value) {
            addCriterion("cma_service_query <>", value, "cmaServiceQuery");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryGreaterThan(String value) {
            addCriterion("cma_service_query >", value, "cmaServiceQuery");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryGreaterThanOrEqualTo(String value) {
            addCriterion("cma_service_query >=", value, "cmaServiceQuery");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryLessThan(String value) {
            addCriterion("cma_service_query <", value, "cmaServiceQuery");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryLessThanOrEqualTo(String value) {
            addCriterion("cma_service_query <=", value, "cmaServiceQuery");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryLike(String value) {
            addCriterion("cma_service_query like", value, "cmaServiceQuery");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryNotLike(String value) {
            addCriterion("cma_service_query not like", value, "cmaServiceQuery");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryIn(List<String> values) {
            addCriterion("cma_service_query in", values, "cmaServiceQuery");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryNotIn(List<String> values) {
            addCriterion("cma_service_query not in", values, "cmaServiceQuery");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryBetween(String value1, String value2) {
            addCriterion("cma_service_query between", value1, value2, "cmaServiceQuery");
            return (Criteria) this;
        }

        public Criteria andCmaServiceQueryNotBetween(String value1, String value2) {
            addCriterion("cma_service_query not between", value1, value2, "cmaServiceQuery");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryIsNull() {
            addCriterion("cma_halls_query is null");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryIsNotNull() {
            addCriterion("cma_halls_query is not null");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryEqualTo(String value) {
            addCriterion("cma_halls_query =", value, "cmaHallsQuery");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryNotEqualTo(String value) {
            addCriterion("cma_halls_query <>", value, "cmaHallsQuery");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryGreaterThan(String value) {
            addCriterion("cma_halls_query >", value, "cmaHallsQuery");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryGreaterThanOrEqualTo(String value) {
            addCriterion("cma_halls_query >=", value, "cmaHallsQuery");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryLessThan(String value) {
            addCriterion("cma_halls_query <", value, "cmaHallsQuery");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryLessThanOrEqualTo(String value) {
            addCriterion("cma_halls_query <=", value, "cmaHallsQuery");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryLike(String value) {
            addCriterion("cma_halls_query like", value, "cmaHallsQuery");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryNotLike(String value) {
            addCriterion("cma_halls_query not like", value, "cmaHallsQuery");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryIn(List<String> values) {
            addCriterion("cma_halls_query in", values, "cmaHallsQuery");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryNotIn(List<String> values) {
            addCriterion("cma_halls_query not in", values, "cmaHallsQuery");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryBetween(String value1, String value2) {
            addCriterion("cma_halls_query between", value1, value2, "cmaHallsQuery");
            return (Criteria) this;
        }

        public Criteria andCmaHallsQueryNotBetween(String value1, String value2) {
            addCriterion("cma_halls_query not between", value1, value2, "cmaHallsQuery");
            return (Criteria) this;
        }

        public Criteria andCmaRelationIsNull() {
            addCriterion("cma_relation is null");
            return (Criteria) this;
        }

        public Criteria andCmaRelationIsNotNull() {
            addCriterion("cma_relation is not null");
            return (Criteria) this;
        }

        public Criteria andCmaRelationEqualTo(String value) {
            addCriterion("cma_relation =", value, "cmaRelation");
            return (Criteria) this;
        }

        public Criteria andCmaRelationNotEqualTo(String value) {
            addCriterion("cma_relation <>", value, "cmaRelation");
            return (Criteria) this;
        }

        public Criteria andCmaRelationGreaterThan(String value) {
            addCriterion("cma_relation >", value, "cmaRelation");
            return (Criteria) this;
        }

        public Criteria andCmaRelationGreaterThanOrEqualTo(String value) {
            addCriterion("cma_relation >=", value, "cmaRelation");
            return (Criteria) this;
        }

        public Criteria andCmaRelationLessThan(String value) {
            addCriterion("cma_relation <", value, "cmaRelation");
            return (Criteria) this;
        }

        public Criteria andCmaRelationLessThanOrEqualTo(String value) {
            addCriterion("cma_relation <=", value, "cmaRelation");
            return (Criteria) this;
        }

        public Criteria andCmaRelationLike(String value) {
            addCriterion("cma_relation like", value, "cmaRelation");
            return (Criteria) this;
        }

        public Criteria andCmaRelationNotLike(String value) {
            addCriterion("cma_relation not like", value, "cmaRelation");
            return (Criteria) this;
        }

        public Criteria andCmaRelationIn(List<String> values) {
            addCriterion("cma_relation in", values, "cmaRelation");
            return (Criteria) this;
        }

        public Criteria andCmaRelationNotIn(List<String> values) {
            addCriterion("cma_relation not in", values, "cmaRelation");
            return (Criteria) this;
        }

        public Criteria andCmaRelationBetween(String value1, String value2) {
            addCriterion("cma_relation between", value1, value2, "cmaRelation");
            return (Criteria) this;
        }

        public Criteria andCmaRelationNotBetween(String value1, String value2) {
            addCriterion("cma_relation not between", value1, value2, "cmaRelation");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andCmaEnableIsNull() {
            addCriterion("cma_enable is null");
            return (Criteria) this;
        }

        public Criteria andCmaEnableIsNotNull() {
            addCriterion("cma_enable is not null");
            return (Criteria) this;
        }

        public Criteria andCmaEnableEqualTo(Byte value) {
            addCriterion("cma_enable =", value, "cmaEnable");
            return (Criteria) this;
        }

        public Criteria andCmaEnableNotEqualTo(Byte value) {
            addCriterion("cma_enable <>", value, "cmaEnable");
            return (Criteria) this;
        }

        public Criteria andCmaEnableGreaterThan(Byte value) {
            addCriterion("cma_enable >", value, "cmaEnable");
            return (Criteria) this;
        }

        public Criteria andCmaEnableGreaterThanOrEqualTo(Byte value) {
            addCriterion("cma_enable >=", value, "cmaEnable");
            return (Criteria) this;
        }

        public Criteria andCmaEnableLessThan(Byte value) {
            addCriterion("cma_enable <", value, "cmaEnable");
            return (Criteria) this;
        }

        public Criteria andCmaEnableLessThanOrEqualTo(Byte value) {
            addCriterion("cma_enable <=", value, "cmaEnable");
            return (Criteria) this;
        }

        public Criteria andCmaEnableIn(List<Byte> values) {
            addCriterion("cma_enable in", values, "cmaEnable");
            return (Criteria) this;
        }

        public Criteria andCmaEnableNotIn(List<Byte> values) {
            addCriterion("cma_enable not in", values, "cmaEnable");
            return (Criteria) this;
        }

        public Criteria andCmaEnableBetween(Byte value1, Byte value2) {
            addCriterion("cma_enable between", value1, value2, "cmaEnable");
            return (Criteria) this;
        }

        public Criteria andCmaEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("cma_enable not between", value1, value2, "cmaEnable");
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