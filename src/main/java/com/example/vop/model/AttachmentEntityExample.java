package com.example.vop.model;

import java.util.ArrayList;
import java.util.List;

public class AttachmentEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttachmentEntityExample() {
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

        public Criteria andAttachmentIdIsNull() {
            addCriterion("ATTACHMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIsNotNull() {
            addCriterion("ATTACHMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdEqualTo(Long value) {
            addCriterion("ATTACHMENT_ID =", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotEqualTo(Long value) {
            addCriterion("ATTACHMENT_ID <>", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdGreaterThan(Long value) {
            addCriterion("ATTACHMENT_ID >", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ATTACHMENT_ID >=", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLessThan(Long value) {
            addCriterion("ATTACHMENT_ID <", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLessThanOrEqualTo(Long value) {
            addCriterion("ATTACHMENT_ID <=", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIn(List<Long> values) {
            addCriterion("ATTACHMENT_ID in", values, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotIn(List<Long> values) {
            addCriterion("ATTACHMENT_ID not in", values, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdBetween(Long value1, Long value2) {
            addCriterion("ATTACHMENT_ID between", value1, value2, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotBetween(Long value1, Long value2) {
            addCriterion("ATTACHMENT_ID not between", value1, value2, "attachmentId");
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

        public Criteria andDealIdIsNull() {
            addCriterion("DEAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDealIdIsNotNull() {
            addCriterion("DEAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDealIdEqualTo(Long value) {
            addCriterion("DEAL_ID =", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotEqualTo(Long value) {
            addCriterion("DEAL_ID <>", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdGreaterThan(Long value) {
            addCriterion("DEAL_ID >", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEAL_ID >=", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdLessThan(Long value) {
            addCriterion("DEAL_ID <", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdLessThanOrEqualTo(Long value) {
            addCriterion("DEAL_ID <=", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdIn(List<Long> values) {
            addCriterion("DEAL_ID in", values, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotIn(List<Long> values) {
            addCriterion("DEAL_ID not in", values, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdBetween(Long value1, Long value2) {
            addCriterion("DEAL_ID between", value1, value2, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotBetween(Long value1, Long value2) {
            addCriterion("DEAL_ID not between", value1, value2, "dealId");
            return (Criteria) this;
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

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("FILE_PATH =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("FILE_PATH <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("FILE_PATH >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_PATH >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("FILE_PATH <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("FILE_PATH <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("FILE_PATH like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("FILE_PATH not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("FILE_PATH in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("FILE_PATH not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("FILE_PATH between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("FILE_PATH not between", value1, value2, "filePath");
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