package com.example.vop.model;

import java.util.ArrayList;
import java.util.List;

public class AccountSupportEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountSupportEntityExample() {
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

        public Criteria andAccountSupportIdIsNull() {
            addCriterion("ACCOUNT_SUPPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountSupportIdIsNotNull() {
            addCriterion("ACCOUNT_SUPPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSupportIdEqualTo(Long value) {
            addCriterion("ACCOUNT_SUPPORT_ID =", value, "accountSupportId");
            return (Criteria) this;
        }

        public Criteria andAccountSupportIdNotEqualTo(Long value) {
            addCriterion("ACCOUNT_SUPPORT_ID <>", value, "accountSupportId");
            return (Criteria) this;
        }

        public Criteria andAccountSupportIdGreaterThan(Long value) {
            addCriterion("ACCOUNT_SUPPORT_ID >", value, "accountSupportId");
            return (Criteria) this;
        }

        public Criteria andAccountSupportIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_SUPPORT_ID >=", value, "accountSupportId");
            return (Criteria) this;
        }

        public Criteria andAccountSupportIdLessThan(Long value) {
            addCriterion("ACCOUNT_SUPPORT_ID <", value, "accountSupportId");
            return (Criteria) this;
        }

        public Criteria andAccountSupportIdLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_SUPPORT_ID <=", value, "accountSupportId");
            return (Criteria) this;
        }

        public Criteria andAccountSupportIdIn(List<Long> values) {
            addCriterion("ACCOUNT_SUPPORT_ID in", values, "accountSupportId");
            return (Criteria) this;
        }

        public Criteria andAccountSupportIdNotIn(List<Long> values) {
            addCriterion("ACCOUNT_SUPPORT_ID not in", values, "accountSupportId");
            return (Criteria) this;
        }

        public Criteria andAccountSupportIdBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_SUPPORT_ID between", value1, value2, "accountSupportId");
            return (Criteria) this;
        }

        public Criteria andAccountSupportIdNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_SUPPORT_ID not between", value1, value2, "accountSupportId");
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

        public Criteria andSwiftNumberIsNull() {
            addCriterion("SWIFT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberIsNotNull() {
            addCriterion("SWIFT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberEqualTo(String value) {
            addCriterion("SWIFT_NUMBER =", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberNotEqualTo(String value) {
            addCriterion("SWIFT_NUMBER <>", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberGreaterThan(String value) {
            addCriterion("SWIFT_NUMBER >", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberGreaterThanOrEqualTo(String value) {
            addCriterion("SWIFT_NUMBER >=", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberLessThan(String value) {
            addCriterion("SWIFT_NUMBER <", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberLessThanOrEqualTo(String value) {
            addCriterion("SWIFT_NUMBER <=", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberLike(String value) {
            addCriterion("SWIFT_NUMBER like", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberNotLike(String value) {
            addCriterion("SWIFT_NUMBER not like", value, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberIn(List<String> values) {
            addCriterion("SWIFT_NUMBER in", values, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberNotIn(List<String> values) {
            addCriterion("SWIFT_NUMBER not in", values, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberBetween(String value1, String value2) {
            addCriterion("SWIFT_NUMBER between", value1, value2, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andSwiftNumberNotBetween(String value1, String value2) {
            addCriterion("SWIFT_NUMBER not between", value1, value2, "swiftNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
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