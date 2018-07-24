package com.example.vop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RechargeSupportEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeSupportEntityExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRechargeSupportIdIsNull() {
            addCriterion("RECHARGE_SUPPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRechargeSupportIdIsNotNull() {
            addCriterion("RECHARGE_SUPPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeSupportIdEqualTo(Long value) {
            addCriterion("RECHARGE_SUPPORT_ID =", value, "rechargeSupportId");
            return (Criteria) this;
        }

        public Criteria andRechargeSupportIdNotEqualTo(Long value) {
            addCriterion("RECHARGE_SUPPORT_ID <>", value, "rechargeSupportId");
            return (Criteria) this;
        }

        public Criteria andRechargeSupportIdGreaterThan(Long value) {
            addCriterion("RECHARGE_SUPPORT_ID >", value, "rechargeSupportId");
            return (Criteria) this;
        }

        public Criteria andRechargeSupportIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RECHARGE_SUPPORT_ID >=", value, "rechargeSupportId");
            return (Criteria) this;
        }

        public Criteria andRechargeSupportIdLessThan(Long value) {
            addCriterion("RECHARGE_SUPPORT_ID <", value, "rechargeSupportId");
            return (Criteria) this;
        }

        public Criteria andRechargeSupportIdLessThanOrEqualTo(Long value) {
            addCriterion("RECHARGE_SUPPORT_ID <=", value, "rechargeSupportId");
            return (Criteria) this;
        }

        public Criteria andRechargeSupportIdIn(List<Long> values) {
            addCriterion("RECHARGE_SUPPORT_ID in", values, "rechargeSupportId");
            return (Criteria) this;
        }

        public Criteria andRechargeSupportIdNotIn(List<Long> values) {
            addCriterion("RECHARGE_SUPPORT_ID not in", values, "rechargeSupportId");
            return (Criteria) this;
        }

        public Criteria andRechargeSupportIdBetween(Long value1, Long value2) {
            addCriterion("RECHARGE_SUPPORT_ID between", value1, value2, "rechargeSupportId");
            return (Criteria) this;
        }

        public Criteria andRechargeSupportIdNotBetween(Long value1, Long value2) {
            addCriterion("RECHARGE_SUPPORT_ID not between", value1, value2, "rechargeSupportId");
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

        public Criteria andPayingArriveIsNull() {
            addCriterion("PAYING_ARRIVE is null");
            return (Criteria) this;
        }

        public Criteria andPayingArriveIsNotNull() {
            addCriterion("PAYING_ARRIVE is not null");
            return (Criteria) this;
        }

        public Criteria andPayingArriveEqualTo(Short value) {
            addCriterion("PAYING_ARRIVE =", value, "payingArrive");
            return (Criteria) this;
        }

        public Criteria andPayingArriveNotEqualTo(Short value) {
            addCriterion("PAYING_ARRIVE <>", value, "payingArrive");
            return (Criteria) this;
        }

        public Criteria andPayingArriveGreaterThan(Short value) {
            addCriterion("PAYING_ARRIVE >", value, "payingArrive");
            return (Criteria) this;
        }

        public Criteria andPayingArriveGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYING_ARRIVE >=", value, "payingArrive");
            return (Criteria) this;
        }

        public Criteria andPayingArriveLessThan(Short value) {
            addCriterion("PAYING_ARRIVE <", value, "payingArrive");
            return (Criteria) this;
        }

        public Criteria andPayingArriveLessThanOrEqualTo(Short value) {
            addCriterion("PAYING_ARRIVE <=", value, "payingArrive");
            return (Criteria) this;
        }

        public Criteria andPayingArriveIn(List<Short> values) {
            addCriterion("PAYING_ARRIVE in", values, "payingArrive");
            return (Criteria) this;
        }

        public Criteria andPayingArriveNotIn(List<Short> values) {
            addCriterion("PAYING_ARRIVE not in", values, "payingArrive");
            return (Criteria) this;
        }

        public Criteria andPayingArriveBetween(Short value1, Short value2) {
            addCriterion("PAYING_ARRIVE between", value1, value2, "payingArrive");
            return (Criteria) this;
        }

        public Criteria andPayingArriveNotBetween(Short value1, Short value2) {
            addCriterion("PAYING_ARRIVE not between", value1, value2, "payingArrive");
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

        public Criteria andCardNumberIsNull() {
            addCriterion("CARD_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("CARD_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("CARD_NUMBER =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("CARD_NUMBER <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("CARD_NUMBER >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NUMBER >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("CARD_NUMBER <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("CARD_NUMBER <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("CARD_NUMBER like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("CARD_NUMBER not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("CARD_NUMBER in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("CARD_NUMBER not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("CARD_NUMBER between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("CARD_NUMBER not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIsNull() {
            addCriterion("RECHARGE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIsNotNull() {
            addCriterion("RECHARGE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeDateEqualTo(Date value) {
            addCriterionForJDBCDate("RECHARGE_DATE =", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RECHARGE_DATE <>", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("RECHARGE_DATE >", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECHARGE_DATE >=", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateLessThan(Date value) {
            addCriterionForJDBCDate("RECHARGE_DATE <", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECHARGE_DATE <=", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIn(List<Date> values) {
            addCriterionForJDBCDate("RECHARGE_DATE in", values, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RECHARGE_DATE not in", values, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECHARGE_DATE between", value1, value2, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECHARGE_DATE not between", value1, value2, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andProcessSerialIsNull() {
            addCriterion("PROCESS_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andProcessSerialIsNotNull() {
            addCriterion("PROCESS_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andProcessSerialEqualTo(String value) {
            addCriterion("PROCESS_SERIAL =", value, "processSerial");
            return (Criteria) this;
        }

        public Criteria andProcessSerialNotEqualTo(String value) {
            addCriterion("PROCESS_SERIAL <>", value, "processSerial");
            return (Criteria) this;
        }

        public Criteria andProcessSerialGreaterThan(String value) {
            addCriterion("PROCESS_SERIAL >", value, "processSerial");
            return (Criteria) this;
        }

        public Criteria andProcessSerialGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_SERIAL >=", value, "processSerial");
            return (Criteria) this;
        }

        public Criteria andProcessSerialLessThan(String value) {
            addCriterion("PROCESS_SERIAL <", value, "processSerial");
            return (Criteria) this;
        }

        public Criteria andProcessSerialLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_SERIAL <=", value, "processSerial");
            return (Criteria) this;
        }

        public Criteria andProcessSerialLike(String value) {
            addCriterion("PROCESS_SERIAL like", value, "processSerial");
            return (Criteria) this;
        }

        public Criteria andProcessSerialNotLike(String value) {
            addCriterion("PROCESS_SERIAL not like", value, "processSerial");
            return (Criteria) this;
        }

        public Criteria andProcessSerialIn(List<String> values) {
            addCriterion("PROCESS_SERIAL in", values, "processSerial");
            return (Criteria) this;
        }

        public Criteria andProcessSerialNotIn(List<String> values) {
            addCriterion("PROCESS_SERIAL not in", values, "processSerial");
            return (Criteria) this;
        }

        public Criteria andProcessSerialBetween(String value1, String value2) {
            addCriterion("PROCESS_SERIAL between", value1, value2, "processSerial");
            return (Criteria) this;
        }

        public Criteria andProcessSerialNotBetween(String value1, String value2) {
            addCriterion("PROCESS_SERIAL not between", value1, value2, "processSerial");
            return (Criteria) this;
        }

        public Criteria andPayamountIsNull() {
            addCriterion("PAYAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPayamountIsNotNull() {
            addCriterion("PAYAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPayamountEqualTo(Long value) {
            addCriterion("PAYAMOUNT =", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountNotEqualTo(Long value) {
            addCriterion("PAYAMOUNT <>", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountGreaterThan(Long value) {
            addCriterion("PAYAMOUNT >", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYAMOUNT >=", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountLessThan(Long value) {
            addCriterion("PAYAMOUNT <", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountLessThanOrEqualTo(Long value) {
            addCriterion("PAYAMOUNT <=", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountIn(List<Long> values) {
            addCriterion("PAYAMOUNT in", values, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountNotIn(List<Long> values) {
            addCriterion("PAYAMOUNT not in", values, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountBetween(Long value1, Long value2) {
            addCriterion("PAYAMOUNT between", value1, value2, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountNotBetween(Long value1, Long value2) {
            addCriterion("PAYAMOUNT not between", value1, value2, "payamount");
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