package com.example.vop.model;

import java.util.ArrayList;
import java.util.List;

public class NetworkSupportEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NetworkSupportEntityExample() {
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

        public Criteria andNetworkSupportIdIsNull() {
            addCriterion("NETWORK_SUPPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andNetworkSupportIdIsNotNull() {
            addCriterion("NETWORK_SUPPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkSupportIdEqualTo(Long value) {
            addCriterion("NETWORK_SUPPORT_ID =", value, "networkSupportId");
            return (Criteria) this;
        }

        public Criteria andNetworkSupportIdNotEqualTo(Long value) {
            addCriterion("NETWORK_SUPPORT_ID <>", value, "networkSupportId");
            return (Criteria) this;
        }

        public Criteria andNetworkSupportIdGreaterThan(Long value) {
            addCriterion("NETWORK_SUPPORT_ID >", value, "networkSupportId");
            return (Criteria) this;
        }

        public Criteria andNetworkSupportIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NETWORK_SUPPORT_ID >=", value, "networkSupportId");
            return (Criteria) this;
        }

        public Criteria andNetworkSupportIdLessThan(Long value) {
            addCriterion("NETWORK_SUPPORT_ID <", value, "networkSupportId");
            return (Criteria) this;
        }

        public Criteria andNetworkSupportIdLessThanOrEqualTo(Long value) {
            addCriterion("NETWORK_SUPPORT_ID <=", value, "networkSupportId");
            return (Criteria) this;
        }

        public Criteria andNetworkSupportIdIn(List<Long> values) {
            addCriterion("NETWORK_SUPPORT_ID in", values, "networkSupportId");
            return (Criteria) this;
        }

        public Criteria andNetworkSupportIdNotIn(List<Long> values) {
            addCriterion("NETWORK_SUPPORT_ID not in", values, "networkSupportId");
            return (Criteria) this;
        }

        public Criteria andNetworkSupportIdBetween(Long value1, Long value2) {
            addCriterion("NETWORK_SUPPORT_ID between", value1, value2, "networkSupportId");
            return (Criteria) this;
        }

        public Criteria andNetworkSupportIdNotBetween(Long value1, Long value2) {
            addCriterion("NETWORK_SUPPORT_ID not between", value1, value2, "networkSupportId");
            return (Criteria) this;
        }

        public Criteria andSuportIdIsNull() {
            addCriterion("SUPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSuportIdIsNotNull() {
            addCriterion("SUPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSuportIdEqualTo(String value) {
            addCriterion("SUPORT_ID =", value, "suportId");
            return (Criteria) this;
        }

        public Criteria andSuportIdNotEqualTo(String value) {
            addCriterion("SUPORT_ID <>", value, "suportId");
            return (Criteria) this;
        }

        public Criteria andSuportIdGreaterThan(String value) {
            addCriterion("SUPORT_ID >", value, "suportId");
            return (Criteria) this;
        }

        public Criteria andSuportIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPORT_ID >=", value, "suportId");
            return (Criteria) this;
        }

        public Criteria andSuportIdLessThan(String value) {
            addCriterion("SUPORT_ID <", value, "suportId");
            return (Criteria) this;
        }

        public Criteria andSuportIdLessThanOrEqualTo(String value) {
            addCriterion("SUPORT_ID <=", value, "suportId");
            return (Criteria) this;
        }

        public Criteria andSuportIdLike(String value) {
            addCriterion("SUPORT_ID like", value, "suportId");
            return (Criteria) this;
        }

        public Criteria andSuportIdNotLike(String value) {
            addCriterion("SUPORT_ID not like", value, "suportId");
            return (Criteria) this;
        }

        public Criteria andSuportIdIn(List<String> values) {
            addCriterion("SUPORT_ID in", values, "suportId");
            return (Criteria) this;
        }

        public Criteria andSuportIdNotIn(List<String> values) {
            addCriterion("SUPORT_ID not in", values, "suportId");
            return (Criteria) this;
        }

        public Criteria andSuportIdBetween(String value1, String value2) {
            addCriterion("SUPORT_ID between", value1, value2, "suportId");
            return (Criteria) this;
        }

        public Criteria andSuportIdNotBetween(String value1, String value2) {
            addCriterion("SUPORT_ID not between", value1, value2, "suportId");
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

        public Criteria andNetworkTypeIsNull() {
            addCriterion("NETWORK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIsNotNull() {
            addCriterion("NETWORK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeEqualTo(Short value) {
            addCriterion("NETWORK_TYPE =", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotEqualTo(Short value) {
            addCriterion("NETWORK_TYPE <>", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeGreaterThan(Short value) {
            addCriterion("NETWORK_TYPE >", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("NETWORK_TYPE >=", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeLessThan(Short value) {
            addCriterion("NETWORK_TYPE <", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeLessThanOrEqualTo(Short value) {
            addCriterion("NETWORK_TYPE <=", value, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeIn(List<Short> values) {
            addCriterion("NETWORK_TYPE in", values, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotIn(List<Short> values) {
            addCriterion("NETWORK_TYPE not in", values, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeBetween(Short value1, Short value2) {
            addCriterion("NETWORK_TYPE between", value1, value2, "networkType");
            return (Criteria) this;
        }

        public Criteria andNetworkTypeNotBetween(Short value1, Short value2) {
            addCriterion("NETWORK_TYPE not between", value1, value2, "networkType");
            return (Criteria) this;
        }

        public Criteria andSignalIsNull() {
            addCriterion("SIGNAL is null");
            return (Criteria) this;
        }

        public Criteria andSignalIsNotNull() {
            addCriterion("SIGNAL is not null");
            return (Criteria) this;
        }

        public Criteria andSignalEqualTo(Short value) {
            addCriterion("SIGNAL =", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalNotEqualTo(Short value) {
            addCriterion("SIGNAL <>", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalGreaterThan(Short value) {
            addCriterion("SIGNAL >", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalGreaterThanOrEqualTo(Short value) {
            addCriterion("SIGNAL >=", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalLessThan(Short value) {
            addCriterion("SIGNAL <", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalLessThanOrEqualTo(Short value) {
            addCriterion("SIGNAL <=", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalIn(List<Short> values) {
            addCriterion("SIGNAL in", values, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalNotIn(List<Short> values) {
            addCriterion("SIGNAL not in", values, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalBetween(Short value1, Short value2) {
            addCriterion("SIGNAL between", value1, value2, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalNotBetween(Short value1, Short value2) {
            addCriterion("SIGNAL not between", value1, value2, "signal");
            return (Criteria) this;
        }

        public Criteria andSymptomIsNull() {
            addCriterion("SYMPTOM is null");
            return (Criteria) this;
        }

        public Criteria andSymptomIsNotNull() {
            addCriterion("SYMPTOM is not null");
            return (Criteria) this;
        }

        public Criteria andSymptomEqualTo(Short value) {
            addCriterion("SYMPTOM =", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotEqualTo(Short value) {
            addCriterion("SYMPTOM <>", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomGreaterThan(Short value) {
            addCriterion("SYMPTOM >", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomGreaterThanOrEqualTo(Short value) {
            addCriterion("SYMPTOM >=", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLessThan(Short value) {
            addCriterion("SYMPTOM <", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLessThanOrEqualTo(Short value) {
            addCriterion("SYMPTOM <=", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomIn(List<Short> values) {
            addCriterion("SYMPTOM in", values, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotIn(List<Short> values) {
            addCriterion("SYMPTOM not in", values, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomBetween(Short value1, Short value2) {
            addCriterion("SYMPTOM between", value1, value2, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotBetween(Short value1, Short value2) {
            addCriterion("SYMPTOM not between", value1, value2, "symptom");
            return (Criteria) this;
        }

        public Criteria andNotCallingIsNull() {
            addCriterion("NOT_CALLING is null");
            return (Criteria) this;
        }

        public Criteria andNotCallingIsNotNull() {
            addCriterion("NOT_CALLING is not null");
            return (Criteria) this;
        }

        public Criteria andNotCallingEqualTo(Short value) {
            addCriterion("NOT_CALLING =", value, "notCalling");
            return (Criteria) this;
        }

        public Criteria andNotCallingNotEqualTo(Short value) {
            addCriterion("NOT_CALLING <>", value, "notCalling");
            return (Criteria) this;
        }

        public Criteria andNotCallingGreaterThan(Short value) {
            addCriterion("NOT_CALLING >", value, "notCalling");
            return (Criteria) this;
        }

        public Criteria andNotCallingGreaterThanOrEqualTo(Short value) {
            addCriterion("NOT_CALLING >=", value, "notCalling");
            return (Criteria) this;
        }

        public Criteria andNotCallingLessThan(Short value) {
            addCriterion("NOT_CALLING <", value, "notCalling");
            return (Criteria) this;
        }

        public Criteria andNotCallingLessThanOrEqualTo(Short value) {
            addCriterion("NOT_CALLING <=", value, "notCalling");
            return (Criteria) this;
        }

        public Criteria andNotCallingIn(List<Short> values) {
            addCriterion("NOT_CALLING in", values, "notCalling");
            return (Criteria) this;
        }

        public Criteria andNotCallingNotIn(List<Short> values) {
            addCriterion("NOT_CALLING not in", values, "notCalling");
            return (Criteria) this;
        }

        public Criteria andNotCallingBetween(Short value1, Short value2) {
            addCriterion("NOT_CALLING between", value1, value2, "notCalling");
            return (Criteria) this;
        }

        public Criteria andNotCallingNotBetween(Short value1, Short value2) {
            addCriterion("NOT_CALLING not between", value1, value2, "notCalling");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionIsNull() {
            addCriterion("ISSUE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionIsNotNull() {
            addCriterion("ISSUE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionEqualTo(String value) {
            addCriterion("ISSUE_DESCRIPTION =", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionNotEqualTo(String value) {
            addCriterion("ISSUE_DESCRIPTION <>", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionGreaterThan(String value) {
            addCriterion("ISSUE_DESCRIPTION >", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ISSUE_DESCRIPTION >=", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionLessThan(String value) {
            addCriterion("ISSUE_DESCRIPTION <", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ISSUE_DESCRIPTION <=", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionLike(String value) {
            addCriterion("ISSUE_DESCRIPTION like", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionNotLike(String value) {
            addCriterion("ISSUE_DESCRIPTION not like", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionIn(List<String> values) {
            addCriterion("ISSUE_DESCRIPTION in", values, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionNotIn(List<String> values) {
            addCriterion("ISSUE_DESCRIPTION not in", values, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionBetween(String value1, String value2) {
            addCriterion("ISSUE_DESCRIPTION between", value1, value2, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionNotBetween(String value1, String value2) {
            addCriterion("ISSUE_DESCRIPTION not between", value1, value2, "issueDescription");
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