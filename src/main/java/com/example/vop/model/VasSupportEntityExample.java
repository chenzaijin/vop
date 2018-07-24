package com.example.vop.model;

import java.util.ArrayList;
import java.util.List;

public class VasSupportEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VasSupportEntityExample() {
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

        public Criteria andVasSupportIdIsNull() {
            addCriterion("VAS_SUPPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andVasSupportIdIsNotNull() {
            addCriterion("VAS_SUPPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVasSupportIdEqualTo(Long value) {
            addCriterion("VAS_SUPPORT_ID =", value, "vasSupportId");
            return (Criteria) this;
        }

        public Criteria andVasSupportIdNotEqualTo(Long value) {
            addCriterion("VAS_SUPPORT_ID <>", value, "vasSupportId");
            return (Criteria) this;
        }

        public Criteria andVasSupportIdGreaterThan(Long value) {
            addCriterion("VAS_SUPPORT_ID >", value, "vasSupportId");
            return (Criteria) this;
        }

        public Criteria andVasSupportIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VAS_SUPPORT_ID >=", value, "vasSupportId");
            return (Criteria) this;
        }

        public Criteria andVasSupportIdLessThan(Long value) {
            addCriterion("VAS_SUPPORT_ID <", value, "vasSupportId");
            return (Criteria) this;
        }

        public Criteria andVasSupportIdLessThanOrEqualTo(Long value) {
            addCriterion("VAS_SUPPORT_ID <=", value, "vasSupportId");
            return (Criteria) this;
        }

        public Criteria andVasSupportIdIn(List<Long> values) {
            addCriterion("VAS_SUPPORT_ID in", values, "vasSupportId");
            return (Criteria) this;
        }

        public Criteria andVasSupportIdNotIn(List<Long> values) {
            addCriterion("VAS_SUPPORT_ID not in", values, "vasSupportId");
            return (Criteria) this;
        }

        public Criteria andVasSupportIdBetween(Long value1, Long value2) {
            addCriterion("VAS_SUPPORT_ID between", value1, value2, "vasSupportId");
            return (Criteria) this;
        }

        public Criteria andVasSupportIdNotBetween(Long value1, Long value2) {
            addCriterion("VAS_SUPPORT_ID not between", value1, value2, "vasSupportId");
            return (Criteria) this;
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

        public Criteria andSupportContentIdIsNull() {
            addCriterion("SUPPORT_CONTENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupportContentIdIsNotNull() {
            addCriterion("SUPPORT_CONTENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupportContentIdEqualTo(Long value) {
            addCriterion("SUPPORT_CONTENT_ID =", value, "supportContentId");
            return (Criteria) this;
        }

        public Criteria andSupportContentIdNotEqualTo(Long value) {
            addCriterion("SUPPORT_CONTENT_ID <>", value, "supportContentId");
            return (Criteria) this;
        }

        public Criteria andSupportContentIdGreaterThan(Long value) {
            addCriterion("SUPPORT_CONTENT_ID >", value, "supportContentId");
            return (Criteria) this;
        }

        public Criteria andSupportContentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUPPORT_CONTENT_ID >=", value, "supportContentId");
            return (Criteria) this;
        }

        public Criteria andSupportContentIdLessThan(Long value) {
            addCriterion("SUPPORT_CONTENT_ID <", value, "supportContentId");
            return (Criteria) this;
        }

        public Criteria andSupportContentIdLessThanOrEqualTo(Long value) {
            addCriterion("SUPPORT_CONTENT_ID <=", value, "supportContentId");
            return (Criteria) this;
        }

        public Criteria andSupportContentIdIn(List<Long> values) {
            addCriterion("SUPPORT_CONTENT_ID in", values, "supportContentId");
            return (Criteria) this;
        }

        public Criteria andSupportContentIdNotIn(List<Long> values) {
            addCriterion("SUPPORT_CONTENT_ID not in", values, "supportContentId");
            return (Criteria) this;
        }

        public Criteria andSupportContentIdBetween(Long value1, Long value2) {
            addCriterion("SUPPORT_CONTENT_ID between", value1, value2, "supportContentId");
            return (Criteria) this;
        }

        public Criteria andSupportContentIdNotBetween(Long value1, Long value2) {
            addCriterion("SUPPORT_CONTENT_ID not between", value1, value2, "supportContentId");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNull() {
            addCriterion("SYSTEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNotNull() {
            addCriterion("SYSTEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeEqualTo(String value) {
            addCriterion("SYSTEM_TYPE =", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotEqualTo(String value) {
            addCriterion("SYSTEM_TYPE <>", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThan(String value) {
            addCriterion("SYSTEM_TYPE >", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_TYPE >=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThan(String value) {
            addCriterion("SYSTEM_TYPE <", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_TYPE <=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLike(String value) {
            addCriterion("SYSTEM_TYPE like", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotLike(String value) {
            addCriterion("SYSTEM_TYPE not like", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIn(List<String> values) {
            addCriterion("SYSTEM_TYPE in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotIn(List<String> values) {
            addCriterion("SYSTEM_TYPE not in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeBetween(String value1, String value2) {
            addCriterion("SYSTEM_TYPE between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_TYPE not between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andVasTypeIsNull() {
            addCriterion("VAS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVasTypeIsNotNull() {
            addCriterion("VAS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVasTypeEqualTo(Short value) {
            addCriterion("VAS_TYPE =", value, "vasType");
            return (Criteria) this;
        }

        public Criteria andVasTypeNotEqualTo(Short value) {
            addCriterion("VAS_TYPE <>", value, "vasType");
            return (Criteria) this;
        }

        public Criteria andVasTypeGreaterThan(Short value) {
            addCriterion("VAS_TYPE >", value, "vasType");
            return (Criteria) this;
        }

        public Criteria andVasTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("VAS_TYPE >=", value, "vasType");
            return (Criteria) this;
        }

        public Criteria andVasTypeLessThan(Short value) {
            addCriterion("VAS_TYPE <", value, "vasType");
            return (Criteria) this;
        }

        public Criteria andVasTypeLessThanOrEqualTo(Short value) {
            addCriterion("VAS_TYPE <=", value, "vasType");
            return (Criteria) this;
        }

        public Criteria andVasTypeIn(List<Short> values) {
            addCriterion("VAS_TYPE in", values, "vasType");
            return (Criteria) this;
        }

        public Criteria andVasTypeNotIn(List<Short> values) {
            addCriterion("VAS_TYPE not in", values, "vasType");
            return (Criteria) this;
        }

        public Criteria andVasTypeBetween(Short value1, Short value2) {
            addCriterion("VAS_TYPE between", value1, value2, "vasType");
            return (Criteria) this;
        }

        public Criteria andVasTypeNotBetween(Short value1, Short value2) {
            addCriterion("VAS_TYPE not between", value1, value2, "vasType");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionIsNull() {
            addCriterion("VAS_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionIsNotNull() {
            addCriterion("VAS_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionEqualTo(String value) {
            addCriterion("VAS_DESCRIPTION =", value, "vasDescription");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionNotEqualTo(String value) {
            addCriterion("VAS_DESCRIPTION <>", value, "vasDescription");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionGreaterThan(String value) {
            addCriterion("VAS_DESCRIPTION >", value, "vasDescription");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("VAS_DESCRIPTION >=", value, "vasDescription");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionLessThan(String value) {
            addCriterion("VAS_DESCRIPTION <", value, "vasDescription");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionLessThanOrEqualTo(String value) {
            addCriterion("VAS_DESCRIPTION <=", value, "vasDescription");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionLike(String value) {
            addCriterion("VAS_DESCRIPTION like", value, "vasDescription");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionNotLike(String value) {
            addCriterion("VAS_DESCRIPTION not like", value, "vasDescription");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionIn(List<String> values) {
            addCriterion("VAS_DESCRIPTION in", values, "vasDescription");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionNotIn(List<String> values) {
            addCriterion("VAS_DESCRIPTION not in", values, "vasDescription");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionBetween(String value1, String value2) {
            addCriterion("VAS_DESCRIPTION between", value1, value2, "vasDescription");
            return (Criteria) this;
        }

        public Criteria andVasDescriptionNotBetween(String value1, String value2) {
            addCriterion("VAS_DESCRIPTION not between", value1, value2, "vasDescription");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionIsNull() {
            addCriterion("SSUE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionIsNotNull() {
            addCriterion("SSUE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionEqualTo(String value) {
            addCriterion("SSUE_DESCRIPTION =", value, "ssueDescription");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionNotEqualTo(String value) {
            addCriterion("SSUE_DESCRIPTION <>", value, "ssueDescription");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionGreaterThan(String value) {
            addCriterion("SSUE_DESCRIPTION >", value, "ssueDescription");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("SSUE_DESCRIPTION >=", value, "ssueDescription");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionLessThan(String value) {
            addCriterion("SSUE_DESCRIPTION <", value, "ssueDescription");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionLessThanOrEqualTo(String value) {
            addCriterion("SSUE_DESCRIPTION <=", value, "ssueDescription");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionLike(String value) {
            addCriterion("SSUE_DESCRIPTION like", value, "ssueDescription");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionNotLike(String value) {
            addCriterion("SSUE_DESCRIPTION not like", value, "ssueDescription");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionIn(List<String> values) {
            addCriterion("SSUE_DESCRIPTION in", values, "ssueDescription");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionNotIn(List<String> values) {
            addCriterion("SSUE_DESCRIPTION not in", values, "ssueDescription");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionBetween(String value1, String value2) {
            addCriterion("SSUE_DESCRIPTION between", value1, value2, "ssueDescription");
            return (Criteria) this;
        }

        public Criteria andSsueDescriptionNotBetween(String value1, String value2) {
            addCriterion("SSUE_DESCRIPTION not between", value1, value2, "ssueDescription");
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