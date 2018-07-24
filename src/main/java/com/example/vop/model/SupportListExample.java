package com.example.vop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupportListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupportListExample() {
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

        public Criteria andSupportIdIsNull() {
            addCriterion("SUPPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupportIdIsNotNull() {
            addCriterion("SUPPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupportIdEqualTo(String value) {
            addCriterion("SUPPORT_ID =", value, "supportId");
            return (Criteria) this;
        }

        public Criteria andSupportIdNotEqualTo(String value) {
            addCriterion("SUPPORT_ID <>", value, "supportId");
            return (Criteria) this;
        }

        public Criteria andSupportIdGreaterThan(String value) {
            addCriterion("SUPPORT_ID >", value, "supportId");
            return (Criteria) this;
        }

        public Criteria andSupportIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPORT_ID >=", value, "supportId");
            return (Criteria) this;
        }

        public Criteria andSupportIdLessThan(String value) {
            addCriterion("SUPPORT_ID <", value, "supportId");
            return (Criteria) this;
        }

        public Criteria andSupportIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPORT_ID <=", value, "supportId");
            return (Criteria) this;
        }

        public Criteria andSupportIdLike(String value) {
            addCriterion("SUPPORT_ID like", value, "supportId");
            return (Criteria) this;
        }

        public Criteria andSupportIdNotLike(String value) {
            addCriterion("SUPPORT_ID not like", value, "supportId");
            return (Criteria) this;
        }

        public Criteria andSupportIdIn(List<String> values) {
            addCriterion("SUPPORT_ID in", values, "supportId");
            return (Criteria) this;
        }

        public Criteria andSupportIdNotIn(List<String> values) {
            addCriterion("SUPPORT_ID not in", values, "supportId");
            return (Criteria) this;
        }

        public Criteria andSupportIdBetween(String value1, String value2) {
            addCriterion("SUPPORT_ID between", value1, value2, "supportId");
            return (Criteria) this;
        }

        public Criteria andSupportIdNotBetween(String value1, String value2) {
            addCriterion("SUPPORT_ID not between", value1, value2, "supportId");
            return (Criteria) this;
        }

        public Criteria andSupportTypeIsNull() {
            addCriterion("SUPPORT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSupportTypeIsNotNull() {
            addCriterion("SUPPORT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSupportTypeEqualTo(String value) {
            addCriterion("SUPPORT_TYPE =", value, "supportType");
            return (Criteria) this;
        }

        public Criteria andSupportTypeNotEqualTo(String value) {
            addCriterion("SUPPORT_TYPE <>", value, "supportType");
            return (Criteria) this;
        }

        public Criteria andSupportTypeGreaterThan(String value) {
            addCriterion("SUPPORT_TYPE >", value, "supportType");
            return (Criteria) this;
        }

        public Criteria andSupportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPORT_TYPE >=", value, "supportType");
            return (Criteria) this;
        }

        public Criteria andSupportTypeLessThan(String value) {
            addCriterion("SUPPORT_TYPE <", value, "supportType");
            return (Criteria) this;
        }

        public Criteria andSupportTypeLessThanOrEqualTo(String value) {
            addCriterion("SUPPORT_TYPE <=", value, "supportType");
            return (Criteria) this;
        }

        public Criteria andSupportTypeLike(String value) {
            addCriterion("SUPPORT_TYPE like", value, "supportType");
            return (Criteria) this;
        }

        public Criteria andSupportTypeNotLike(String value) {
            addCriterion("SUPPORT_TYPE not like", value, "supportType");
            return (Criteria) this;
        }

        public Criteria andSupportTypeIn(List<String> values) {
            addCriterion("SUPPORT_TYPE in", values, "supportType");
            return (Criteria) this;
        }

        public Criteria andSupportTypeNotIn(List<String> values) {
            addCriterion("SUPPORT_TYPE not in", values, "supportType");
            return (Criteria) this;
        }

        public Criteria andSupportTypeBetween(String value1, String value2) {
            addCriterion("SUPPORT_TYPE between", value1, value2, "supportType");
            return (Criteria) this;
        }

        public Criteria andSupportTypeNotBetween(String value1, String value2) {
            addCriterion("SUPPORT_TYPE not between", value1, value2, "supportType");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("PHONE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("PHONE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(Long value) {
            addCriterion("PHONE_NUMBER =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(Long value) {
            addCriterion("PHONE_NUMBER <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(Long value) {
            addCriterion("PHONE_NUMBER >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("PHONE_NUMBER >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(Long value) {
            addCriterion("PHONE_NUMBER <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(Long value) {
            addCriterion("PHONE_NUMBER <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<Long> values) {
            addCriterion("PHONE_NUMBER in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<Long> values) {
            addCriterion("PHONE_NUMBER not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(Long value1, Long value2) {
            addCriterion("PHONE_NUMBER between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(Long value1, Long value2) {
            addCriterion("PHONE_NUMBER not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNull() {
            addCriterion("CONTACT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNotNull() {
            addCriterion("CONTACT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andContactNumberEqualTo(String value) {
            addCriterion("CONTACT_NUMBER =", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotEqualTo(String value) {
            addCriterion("CONTACT_NUMBER <>", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThan(String value) {
            addCriterion("CONTACT_NUMBER >", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_NUMBER >=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThan(String value) {
            addCriterion("CONTACT_NUMBER <", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_NUMBER <=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLike(String value) {
            addCriterion("CONTACT_NUMBER like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotLike(String value) {
            addCriterion("CONTACT_NUMBER not like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberIn(List<String> values) {
            addCriterion("CONTACT_NUMBER in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotIn(List<String> values) {
            addCriterion("CONTACT_NUMBER not in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberBetween(String value1, String value2) {
            addCriterion("CONTACT_NUMBER between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotBetween(String value1, String value2) {
            addCriterion("CONTACT_NUMBER not between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andMvnoContactIsNull() {
            addCriterion("MVNO_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andMvnoContactIsNotNull() {
            addCriterion("MVNO_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andMvnoContactEqualTo(String value) {
            addCriterion("MVNO_CONTACT =", value, "mvnoContact");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNotEqualTo(String value) {
            addCriterion("MVNO_CONTACT <>", value, "mvnoContact");
            return (Criteria) this;
        }

        public Criteria andMvnoContactGreaterThan(String value) {
            addCriterion("MVNO_CONTACT >", value, "mvnoContact");
            return (Criteria) this;
        }

        public Criteria andMvnoContactGreaterThanOrEqualTo(String value) {
            addCriterion("MVNO_CONTACT >=", value, "mvnoContact");
            return (Criteria) this;
        }

        public Criteria andMvnoContactLessThan(String value) {
            addCriterion("MVNO_CONTACT <", value, "mvnoContact");
            return (Criteria) this;
        }

        public Criteria andMvnoContactLessThanOrEqualTo(String value) {
            addCriterion("MVNO_CONTACT <=", value, "mvnoContact");
            return (Criteria) this;
        }

        public Criteria andMvnoContactLike(String value) {
            addCriterion("MVNO_CONTACT like", value, "mvnoContact");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNotLike(String value) {
            addCriterion("MVNO_CONTACT not like", value, "mvnoContact");
            return (Criteria) this;
        }

        public Criteria andMvnoContactIn(List<String> values) {
            addCriterion("MVNO_CONTACT in", values, "mvnoContact");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNotIn(List<String> values) {
            addCriterion("MVNO_CONTACT not in", values, "mvnoContact");
            return (Criteria) this;
        }

        public Criteria andMvnoContactBetween(String value1, String value2) {
            addCriterion("MVNO_CONTACT between", value1, value2, "mvnoContact");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNotBetween(String value1, String value2) {
            addCriterion("MVNO_CONTACT not between", value1, value2, "mvnoContact");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberIsNull() {
            addCriterion("MVNO_CONTACT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberIsNotNull() {
            addCriterion("MVNO_CONTACT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberEqualTo(String value) {
            addCriterion("MVNO_CONTACT_NUMBER =", value, "mvnoContactNumber");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberNotEqualTo(String value) {
            addCriterion("MVNO_CONTACT_NUMBER <>", value, "mvnoContactNumber");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberGreaterThan(String value) {
            addCriterion("MVNO_CONTACT_NUMBER >", value, "mvnoContactNumber");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("MVNO_CONTACT_NUMBER >=", value, "mvnoContactNumber");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberLessThan(String value) {
            addCriterion("MVNO_CONTACT_NUMBER <", value, "mvnoContactNumber");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberLessThanOrEqualTo(String value) {
            addCriterion("MVNO_CONTACT_NUMBER <=", value, "mvnoContactNumber");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberLike(String value) {
            addCriterion("MVNO_CONTACT_NUMBER like", value, "mvnoContactNumber");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberNotLike(String value) {
            addCriterion("MVNO_CONTACT_NUMBER not like", value, "mvnoContactNumber");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberIn(List<String> values) {
            addCriterion("MVNO_CONTACT_NUMBER in", values, "mvnoContactNumber");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberNotIn(List<String> values) {
            addCriterion("MVNO_CONTACT_NUMBER not in", values, "mvnoContactNumber");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberBetween(String value1, String value2) {
            addCriterion("MVNO_CONTACT_NUMBER between", value1, value2, "mvnoContactNumber");
            return (Criteria) this;
        }

        public Criteria andMvnoContactNumberNotBetween(String value1, String value2) {
            addCriterion("MVNO_CONTACT_NUMBER not between", value1, value2, "mvnoContactNumber");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andApiNameIsNull() {
            addCriterion("API_NAME is null");
            return (Criteria) this;
        }

        public Criteria andApiNameIsNotNull() {
            addCriterion("API_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andApiNameEqualTo(String value) {
            addCriterion("API_NAME =", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotEqualTo(String value) {
            addCriterion("API_NAME <>", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameGreaterThan(String value) {
            addCriterion("API_NAME >", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameGreaterThanOrEqualTo(String value) {
            addCriterion("API_NAME >=", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLessThan(String value) {
            addCriterion("API_NAME <", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLessThanOrEqualTo(String value) {
            addCriterion("API_NAME <=", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLike(String value) {
            addCriterion("API_NAME like", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotLike(String value) {
            addCriterion("API_NAME not like", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameIn(List<String> values) {
            addCriterion("API_NAME in", values, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotIn(List<String> values) {
            addCriterion("API_NAME not in", values, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameBetween(String value1, String value2) {
            addCriterion("API_NAME between", value1, value2, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotBetween(String value1, String value2) {
            addCriterion("API_NAME not between", value1, value2, "apiName");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNull() {
            addCriterion("DEAL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNotNull() {
            addCriterion("DEAL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDealTimeEqualTo(Date value) {
            addCriterion("DEAL_TIME =", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotEqualTo(Date value) {
            addCriterion("DEAL_TIME <>", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThan(Date value) {
            addCriterion("DEAL_TIME >", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DEAL_TIME >=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThan(Date value) {
            addCriterion("DEAL_TIME <", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThanOrEqualTo(Date value) {
            addCriterion("DEAL_TIME <=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIn(List<Date> values) {
            addCriterion("DEAL_TIME in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotIn(List<Date> values) {
            addCriterion("DEAL_TIME not in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeBetween(Date value1, Date value2) {
            addCriterion("DEAL_TIME between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotBetween(Date value1, Date value2) {
            addCriterion("DEAL_TIME not between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealContentIsNull() {
            addCriterion("DEAL_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andDealContentIsNotNull() {
            addCriterion("DEAL_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andDealContentEqualTo(String value) {
            addCriterion("DEAL_CONTENT =", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentNotEqualTo(String value) {
            addCriterion("DEAL_CONTENT <>", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentGreaterThan(String value) {
            addCriterion("DEAL_CONTENT >", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_CONTENT >=", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentLessThan(String value) {
            addCriterion("DEAL_CONTENT <", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentLessThanOrEqualTo(String value) {
            addCriterion("DEAL_CONTENT <=", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentLike(String value) {
            addCriterion("DEAL_CONTENT like", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentNotLike(String value) {
            addCriterion("DEAL_CONTENT not like", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentIn(List<String> values) {
            addCriterion("DEAL_CONTENT in", values, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentNotIn(List<String> values) {
            addCriterion("DEAL_CONTENT not in", values, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentBetween(String value1, String value2) {
            addCriterion("DEAL_CONTENT between", value1, value2, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentNotBetween(String value1, String value2) {
            addCriterion("DEAL_CONTENT not between", value1, value2, "dealContent");
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