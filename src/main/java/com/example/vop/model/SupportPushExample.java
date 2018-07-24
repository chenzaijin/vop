package com.example.vop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupportPushExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupportPushExample() {
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

        public Criteria andPushIdIsNull() {
            addCriterion("PUSH_ID is null");
            return (Criteria) this;
        }

        public Criteria andPushIdIsNotNull() {
            addCriterion("PUSH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPushIdEqualTo(String value) {
            addCriterion("PUSH_ID =", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdNotEqualTo(String value) {
            addCriterion("PUSH_ID <>", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdGreaterThan(String value) {
            addCriterion("PUSH_ID >", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdGreaterThanOrEqualTo(String value) {
            addCriterion("PUSH_ID >=", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdLessThan(String value) {
            addCriterion("PUSH_ID <", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdLessThanOrEqualTo(String value) {
            addCriterion("PUSH_ID <=", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdLike(String value) {
            addCriterion("PUSH_ID like", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdNotLike(String value) {
            addCriterion("PUSH_ID not like", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdIn(List<String> values) {
            addCriterion("PUSH_ID in", values, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdNotIn(List<String> values) {
            addCriterion("PUSH_ID not in", values, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdBetween(String value1, String value2) {
            addCriterion("PUSH_ID between", value1, value2, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdNotBetween(String value1, String value2) {
            addCriterion("PUSH_ID not between", value1, value2, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushTypeIsNull() {
            addCriterion("PUSH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPushTypeIsNotNull() {
            addCriterion("PUSH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPushTypeEqualTo(String value) {
            addCriterion("PUSH_TYPE =", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotEqualTo(String value) {
            addCriterion("PUSH_TYPE <>", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeGreaterThan(String value) {
            addCriterion("PUSH_TYPE >", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PUSH_TYPE >=", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeLessThan(String value) {
            addCriterion("PUSH_TYPE <", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeLessThanOrEqualTo(String value) {
            addCriterion("PUSH_TYPE <=", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeLike(String value) {
            addCriterion("PUSH_TYPE like", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotLike(String value) {
            addCriterion("PUSH_TYPE not like", value, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeIn(List<String> values) {
            addCriterion("PUSH_TYPE in", values, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotIn(List<String> values) {
            addCriterion("PUSH_TYPE not in", values, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeBetween(String value1, String value2) {
            addCriterion("PUSH_TYPE between", value1, value2, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushTypeNotBetween(String value1, String value2) {
            addCriterion("PUSH_TYPE not between", value1, value2, "pushType");
            return (Criteria) this;
        }

        public Criteria andPushContentIsNull() {
            addCriterion("PUSH_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andPushContentIsNotNull() {
            addCriterion("PUSH_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andPushContentEqualTo(String value) {
            addCriterion("PUSH_CONTENT =", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentNotEqualTo(String value) {
            addCriterion("PUSH_CONTENT <>", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentGreaterThan(String value) {
            addCriterion("PUSH_CONTENT >", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentGreaterThanOrEqualTo(String value) {
            addCriterion("PUSH_CONTENT >=", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentLessThan(String value) {
            addCriterion("PUSH_CONTENT <", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentLessThanOrEqualTo(String value) {
            addCriterion("PUSH_CONTENT <=", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentLike(String value) {
            addCriterion("PUSH_CONTENT like", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentNotLike(String value) {
            addCriterion("PUSH_CONTENT not like", value, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentIn(List<String> values) {
            addCriterion("PUSH_CONTENT in", values, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentNotIn(List<String> values) {
            addCriterion("PUSH_CONTENT not in", values, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentBetween(String value1, String value2) {
            addCriterion("PUSH_CONTENT between", value1, value2, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushContentNotBetween(String value1, String value2) {
            addCriterion("PUSH_CONTENT not between", value1, value2, "pushContent");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNull() {
            addCriterion("PUSH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNotNull() {
            addCriterion("PUSH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPushTimeEqualTo(Date value) {
            addCriterion("PUSH_TIME =", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotEqualTo(Date value) {
            addCriterion("PUSH_TIME <>", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThan(Date value) {
            addCriterion("PUSH_TIME >", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PUSH_TIME >=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThan(Date value) {
            addCriterion("PUSH_TIME <", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThanOrEqualTo(Date value) {
            addCriterion("PUSH_TIME <=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIn(List<Date> values) {
            addCriterion("PUSH_TIME in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotIn(List<Date> values) {
            addCriterion("PUSH_TIME not in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeBetween(Date value1, Date value2) {
            addCriterion("PUSH_TIME between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotBetween(Date value1, Date value2) {
            addCriterion("PUSH_TIME not between", value1, value2, "pushTime");
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

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("PHONE_NUMBER =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("PHONE_NUMBER >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("PHONE_NUMBER <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("PHONE_NUMBER like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("PHONE_NUMBER not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("PHONE_NUMBER in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
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