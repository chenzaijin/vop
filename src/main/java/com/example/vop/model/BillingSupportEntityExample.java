package com.example.vop.model;

import java.util.ArrayList;
import java.util.List;

public class BillingSupportEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillingSupportEntityExample() {
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

        public Criteria andBillingSupportIdIsNull() {
            addCriterion("BILLING_SUPPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillingSupportIdIsNotNull() {
            addCriterion("BILLING_SUPPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillingSupportIdEqualTo(Long value) {
            addCriterion("BILLING_SUPPORT_ID =", value, "billingSupportId");
            return (Criteria) this;
        }

        public Criteria andBillingSupportIdNotEqualTo(Long value) {
            addCriterion("BILLING_SUPPORT_ID <>", value, "billingSupportId");
            return (Criteria) this;
        }

        public Criteria andBillingSupportIdGreaterThan(Long value) {
            addCriterion("BILLING_SUPPORT_ID >", value, "billingSupportId");
            return (Criteria) this;
        }

        public Criteria andBillingSupportIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BILLING_SUPPORT_ID >=", value, "billingSupportId");
            return (Criteria) this;
        }

        public Criteria andBillingSupportIdLessThan(Long value) {
            addCriterion("BILLING_SUPPORT_ID <", value, "billingSupportId");
            return (Criteria) this;
        }

        public Criteria andBillingSupportIdLessThanOrEqualTo(Long value) {
            addCriterion("BILLING_SUPPORT_ID <=", value, "billingSupportId");
            return (Criteria) this;
        }

        public Criteria andBillingSupportIdIn(List<Long> values) {
            addCriterion("BILLING_SUPPORT_ID in", values, "billingSupportId");
            return (Criteria) this;
        }

        public Criteria andBillingSupportIdNotIn(List<Long> values) {
            addCriterion("BILLING_SUPPORT_ID not in", values, "billingSupportId");
            return (Criteria) this;
        }

        public Criteria andBillingSupportIdBetween(Long value1, Long value2) {
            addCriterion("BILLING_SUPPORT_ID between", value1, value2, "billingSupportId");
            return (Criteria) this;
        }

        public Criteria andBillingSupportIdNotBetween(Long value1, Long value2) {
            addCriterion("BILLING_SUPPORT_ID not between", value1, value2, "billingSupportId");
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

        public Criteria andCdrTypeIsNull() {
            addCriterion("CDR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCdrTypeIsNotNull() {
            addCriterion("CDR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCdrTypeEqualTo(Short value) {
            addCriterion("CDR_TYPE =", value, "cdrType");
            return (Criteria) this;
        }

        public Criteria andCdrTypeNotEqualTo(Short value) {
            addCriterion("CDR_TYPE <>", value, "cdrType");
            return (Criteria) this;
        }

        public Criteria andCdrTypeGreaterThan(Short value) {
            addCriterion("CDR_TYPE >", value, "cdrType");
            return (Criteria) this;
        }

        public Criteria andCdrTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CDR_TYPE >=", value, "cdrType");
            return (Criteria) this;
        }

        public Criteria andCdrTypeLessThan(Short value) {
            addCriterion("CDR_TYPE <", value, "cdrType");
            return (Criteria) this;
        }

        public Criteria andCdrTypeLessThanOrEqualTo(Short value) {
            addCriterion("CDR_TYPE <=", value, "cdrType");
            return (Criteria) this;
        }

        public Criteria andCdrTypeIn(List<Short> values) {
            addCriterion("CDR_TYPE in", values, "cdrType");
            return (Criteria) this;
        }

        public Criteria andCdrTypeNotIn(List<Short> values) {
            addCriterion("CDR_TYPE not in", values, "cdrType");
            return (Criteria) this;
        }

        public Criteria andCdrTypeBetween(Short value1, Short value2) {
            addCriterion("CDR_TYPE between", value1, value2, "cdrType");
            return (Criteria) this;
        }

        public Criteria andCdrTypeNotBetween(Short value1, Short value2) {
            addCriterion("CDR_TYPE not between", value1, value2, "cdrType");
            return (Criteria) this;
        }

        public Criteria andCdrFileIsNull() {
            addCriterion("CDR_FILE is null");
            return (Criteria) this;
        }

        public Criteria andCdrFileIsNotNull() {
            addCriterion("CDR_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andCdrFileEqualTo(String value) {
            addCriterion("CDR_FILE =", value, "cdrFile");
            return (Criteria) this;
        }

        public Criteria andCdrFileNotEqualTo(String value) {
            addCriterion("CDR_FILE <>", value, "cdrFile");
            return (Criteria) this;
        }

        public Criteria andCdrFileGreaterThan(String value) {
            addCriterion("CDR_FILE >", value, "cdrFile");
            return (Criteria) this;
        }

        public Criteria andCdrFileGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_FILE >=", value, "cdrFile");
            return (Criteria) this;
        }

        public Criteria andCdrFileLessThan(String value) {
            addCriterion("CDR_FILE <", value, "cdrFile");
            return (Criteria) this;
        }

        public Criteria andCdrFileLessThanOrEqualTo(String value) {
            addCriterion("CDR_FILE <=", value, "cdrFile");
            return (Criteria) this;
        }

        public Criteria andCdrFileLike(String value) {
            addCriterion("CDR_FILE like", value, "cdrFile");
            return (Criteria) this;
        }

        public Criteria andCdrFileNotLike(String value) {
            addCriterion("CDR_FILE not like", value, "cdrFile");
            return (Criteria) this;
        }

        public Criteria andCdrFileIn(List<String> values) {
            addCriterion("CDR_FILE in", values, "cdrFile");
            return (Criteria) this;
        }

        public Criteria andCdrFileNotIn(List<String> values) {
            addCriterion("CDR_FILE not in", values, "cdrFile");
            return (Criteria) this;
        }

        public Criteria andCdrFileBetween(String value1, String value2) {
            addCriterion("CDR_FILE between", value1, value2, "cdrFile");
            return (Criteria) this;
        }

        public Criteria andCdrFileNotBetween(String value1, String value2) {
            addCriterion("CDR_FILE not between", value1, value2, "cdrFile");
            return (Criteria) this;
        }

        public Criteria andCdrNumberIsNull() {
            addCriterion("CDR_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCdrNumberIsNotNull() {
            addCriterion("CDR_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCdrNumberEqualTo(String value) {
            addCriterion("CDR_NUMBER =", value, "cdrNumber");
            return (Criteria) this;
        }

        public Criteria andCdrNumberNotEqualTo(String value) {
            addCriterion("CDR_NUMBER <>", value, "cdrNumber");
            return (Criteria) this;
        }

        public Criteria andCdrNumberGreaterThan(String value) {
            addCriterion("CDR_NUMBER >", value, "cdrNumber");
            return (Criteria) this;
        }

        public Criteria andCdrNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CDR_NUMBER >=", value, "cdrNumber");
            return (Criteria) this;
        }

        public Criteria andCdrNumberLessThan(String value) {
            addCriterion("CDR_NUMBER <", value, "cdrNumber");
            return (Criteria) this;
        }

        public Criteria andCdrNumberLessThanOrEqualTo(String value) {
            addCriterion("CDR_NUMBER <=", value, "cdrNumber");
            return (Criteria) this;
        }

        public Criteria andCdrNumberLike(String value) {
            addCriterion("CDR_NUMBER like", value, "cdrNumber");
            return (Criteria) this;
        }

        public Criteria andCdrNumberNotLike(String value) {
            addCriterion("CDR_NUMBER not like", value, "cdrNumber");
            return (Criteria) this;
        }

        public Criteria andCdrNumberIn(List<String> values) {
            addCriterion("CDR_NUMBER in", values, "cdrNumber");
            return (Criteria) this;
        }

        public Criteria andCdrNumberNotIn(List<String> values) {
            addCriterion("CDR_NUMBER not in", values, "cdrNumber");
            return (Criteria) this;
        }

        public Criteria andCdrNumberBetween(String value1, String value2) {
            addCriterion("CDR_NUMBER between", value1, value2, "cdrNumber");
            return (Criteria) this;
        }

        public Criteria andCdrNumberNotBetween(String value1, String value2) {
            addCriterion("CDR_NUMBER not between", value1, value2, "cdrNumber");
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