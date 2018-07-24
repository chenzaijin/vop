package com.example.vop.model;

import java.util.ArrayList;
import java.util.List;

public class SupportContentEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupportContentEntityExample() {
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

        public Criteria andSupportLevelIsNull() {
            addCriterion("SUPPORT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSupportLevelIsNotNull() {
            addCriterion("SUPPORT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSupportLevelEqualTo(String value) {
            addCriterion("SUPPORT_LEVEL =", value, "supportLevel");
            return (Criteria) this;
        }

        public Criteria andSupportLevelNotEqualTo(String value) {
            addCriterion("SUPPORT_LEVEL <>", value, "supportLevel");
            return (Criteria) this;
        }

        public Criteria andSupportLevelGreaterThan(String value) {
            addCriterion("SUPPORT_LEVEL >", value, "supportLevel");
            return (Criteria) this;
        }

        public Criteria andSupportLevelGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPORT_LEVEL >=", value, "supportLevel");
            return (Criteria) this;
        }

        public Criteria andSupportLevelLessThan(String value) {
            addCriterion("SUPPORT_LEVEL <", value, "supportLevel");
            return (Criteria) this;
        }

        public Criteria andSupportLevelLessThanOrEqualTo(String value) {
            addCriterion("SUPPORT_LEVEL <=", value, "supportLevel");
            return (Criteria) this;
        }

        public Criteria andSupportLevelLike(String value) {
            addCriterion("SUPPORT_LEVEL like", value, "supportLevel");
            return (Criteria) this;
        }

        public Criteria andSupportLevelNotLike(String value) {
            addCriterion("SUPPORT_LEVEL not like", value, "supportLevel");
            return (Criteria) this;
        }

        public Criteria andSupportLevelIn(List<String> values) {
            addCriterion("SUPPORT_LEVEL in", values, "supportLevel");
            return (Criteria) this;
        }

        public Criteria andSupportLevelNotIn(List<String> values) {
            addCriterion("SUPPORT_LEVEL not in", values, "supportLevel");
            return (Criteria) this;
        }

        public Criteria andSupportLevelBetween(String value1, String value2) {
            addCriterion("SUPPORT_LEVEL between", value1, value2, "supportLevel");
            return (Criteria) this;
        }

        public Criteria andSupportLevelNotBetween(String value1, String value2) {
            addCriterion("SUPPORT_LEVEL not between", value1, value2, "supportLevel");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceIsNull() {
            addCriterion("ISSUE_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceIsNotNull() {
            addCriterion("ISSUE_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceEqualTo(String value) {
            addCriterion("ISSUE_PROVINCE =", value, "issueProvince");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceNotEqualTo(String value) {
            addCriterion("ISSUE_PROVINCE <>", value, "issueProvince");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceGreaterThan(String value) {
            addCriterion("ISSUE_PROVINCE >", value, "issueProvince");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("ISSUE_PROVINCE >=", value, "issueProvince");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceLessThan(String value) {
            addCriterion("ISSUE_PROVINCE <", value, "issueProvince");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceLessThanOrEqualTo(String value) {
            addCriterion("ISSUE_PROVINCE <=", value, "issueProvince");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceLike(String value) {
            addCriterion("ISSUE_PROVINCE like", value, "issueProvince");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceNotLike(String value) {
            addCriterion("ISSUE_PROVINCE not like", value, "issueProvince");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceIn(List<String> values) {
            addCriterion("ISSUE_PROVINCE in", values, "issueProvince");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceNotIn(List<String> values) {
            addCriterion("ISSUE_PROVINCE not in", values, "issueProvince");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceBetween(String value1, String value2) {
            addCriterion("ISSUE_PROVINCE between", value1, value2, "issueProvince");
            return (Criteria) this;
        }

        public Criteria andIssueProvinceNotBetween(String value1, String value2) {
            addCriterion("ISSUE_PROVINCE not between", value1, value2, "issueProvince");
            return (Criteria) this;
        }

        public Criteria andIssueCityIsNull() {
            addCriterion("ISSUE_CITY is null");
            return (Criteria) this;
        }

        public Criteria andIssueCityIsNotNull() {
            addCriterion("ISSUE_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCityEqualTo(String value) {
            addCriterion("ISSUE_CITY =", value, "issueCity");
            return (Criteria) this;
        }

        public Criteria andIssueCityNotEqualTo(String value) {
            addCriterion("ISSUE_CITY <>", value, "issueCity");
            return (Criteria) this;
        }

        public Criteria andIssueCityGreaterThan(String value) {
            addCriterion("ISSUE_CITY >", value, "issueCity");
            return (Criteria) this;
        }

        public Criteria andIssueCityGreaterThanOrEqualTo(String value) {
            addCriterion("ISSUE_CITY >=", value, "issueCity");
            return (Criteria) this;
        }

        public Criteria andIssueCityLessThan(String value) {
            addCriterion("ISSUE_CITY <", value, "issueCity");
            return (Criteria) this;
        }

        public Criteria andIssueCityLessThanOrEqualTo(String value) {
            addCriterion("ISSUE_CITY <=", value, "issueCity");
            return (Criteria) this;
        }

        public Criteria andIssueCityLike(String value) {
            addCriterion("ISSUE_CITY like", value, "issueCity");
            return (Criteria) this;
        }

        public Criteria andIssueCityNotLike(String value) {
            addCriterion("ISSUE_CITY not like", value, "issueCity");
            return (Criteria) this;
        }

        public Criteria andIssueCityIn(List<String> values) {
            addCriterion("ISSUE_CITY in", values, "issueCity");
            return (Criteria) this;
        }

        public Criteria andIssueCityNotIn(List<String> values) {
            addCriterion("ISSUE_CITY not in", values, "issueCity");
            return (Criteria) this;
        }

        public Criteria andIssueCityBetween(String value1, String value2) {
            addCriterion("ISSUE_CITY between", value1, value2, "issueCity");
            return (Criteria) this;
        }

        public Criteria andIssueCityNotBetween(String value1, String value2) {
            addCriterion("ISSUE_CITY not between", value1, value2, "issueCity");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceIsNull() {
            addCriterion("PHONE_NUMBER_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceIsNotNull() {
            addCriterion("PHONE_NUMBER_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceEqualTo(String value) {
            addCriterion("PHONE_NUMBER_PROVINCE =", value, "phoneNumberProvince");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER_PROVINCE <>", value, "phoneNumberProvince");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceGreaterThan(String value) {
            addCriterion("PHONE_NUMBER_PROVINCE >", value, "phoneNumberProvince");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER_PROVINCE >=", value, "phoneNumberProvince");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceLessThan(String value) {
            addCriterion("PHONE_NUMBER_PROVINCE <", value, "phoneNumberProvince");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER_PROVINCE <=", value, "phoneNumberProvince");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceLike(String value) {
            addCriterion("PHONE_NUMBER_PROVINCE like", value, "phoneNumberProvince");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceNotLike(String value) {
            addCriterion("PHONE_NUMBER_PROVINCE not like", value, "phoneNumberProvince");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceIn(List<String> values) {
            addCriterion("PHONE_NUMBER_PROVINCE in", values, "phoneNumberProvince");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER_PROVINCE not in", values, "phoneNumberProvince");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER_PROVINCE between", value1, value2, "phoneNumberProvince");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberProvinceNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER_PROVINCE not between", value1, value2, "phoneNumberProvince");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityIsNull() {
            addCriterion("PHONE_NUMBER_CITY is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityIsNotNull() {
            addCriterion("PHONE_NUMBER_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityEqualTo(String value) {
            addCriterion("PHONE_NUMBER_CITY =", value, "phoneNumberCity");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER_CITY <>", value, "phoneNumberCity");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityGreaterThan(String value) {
            addCriterion("PHONE_NUMBER_CITY >", value, "phoneNumberCity");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER_CITY >=", value, "phoneNumberCity");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityLessThan(String value) {
            addCriterion("PHONE_NUMBER_CITY <", value, "phoneNumberCity");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER_CITY <=", value, "phoneNumberCity");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityLike(String value) {
            addCriterion("PHONE_NUMBER_CITY like", value, "phoneNumberCity");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityNotLike(String value) {
            addCriterion("PHONE_NUMBER_CITY not like", value, "phoneNumberCity");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityIn(List<String> values) {
            addCriterion("PHONE_NUMBER_CITY in", values, "phoneNumberCity");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER_CITY not in", values, "phoneNumberCity");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER_CITY between", value1, value2, "phoneNumberCity");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberCityNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER_CITY not between", value1, value2, "phoneNumberCity");
            return (Criteria) this;
        }

        public Criteria andRepetitionIsNull() {
            addCriterion("REPETITION is null");
            return (Criteria) this;
        }

        public Criteria andRepetitionIsNotNull() {
            addCriterion("REPETITION is not null");
            return (Criteria) this;
        }

        public Criteria andRepetitionEqualTo(Short value) {
            addCriterion("REPETITION =", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionNotEqualTo(Short value) {
            addCriterion("REPETITION <>", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionGreaterThan(Short value) {
            addCriterion("REPETITION >", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionGreaterThanOrEqualTo(Short value) {
            addCriterion("REPETITION >=", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionLessThan(Short value) {
            addCriterion("REPETITION <", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionLessThanOrEqualTo(Short value) {
            addCriterion("REPETITION <=", value, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionIn(List<Short> values) {
            addCriterion("REPETITION in", values, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionNotIn(List<Short> values) {
            addCriterion("REPETITION not in", values, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionBetween(Short value1, Short value2) {
            addCriterion("REPETITION between", value1, value2, "repetition");
            return (Criteria) this;
        }

        public Criteria andRepetitionNotBetween(Short value1, Short value2) {
            addCriterion("REPETITION not between", value1, value2, "repetition");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdIsNull() {
            addCriterion("ORIGINAL_SUPPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdIsNotNull() {
            addCriterion("ORIGINAL_SUPPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdEqualTo(String value) {
            addCriterion("ORIGINAL_SUPPORT_ID =", value, "originalSupportId");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdNotEqualTo(String value) {
            addCriterion("ORIGINAL_SUPPORT_ID <>", value, "originalSupportId");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdGreaterThan(String value) {
            addCriterion("ORIGINAL_SUPPORT_ID >", value, "originalSupportId");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_SUPPORT_ID >=", value, "originalSupportId");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdLessThan(String value) {
            addCriterion("ORIGINAL_SUPPORT_ID <", value, "originalSupportId");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_SUPPORT_ID <=", value, "originalSupportId");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdLike(String value) {
            addCriterion("ORIGINAL_SUPPORT_ID like", value, "originalSupportId");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdNotLike(String value) {
            addCriterion("ORIGINAL_SUPPORT_ID not like", value, "originalSupportId");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdIn(List<String> values) {
            addCriterion("ORIGINAL_SUPPORT_ID in", values, "originalSupportId");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdNotIn(List<String> values) {
            addCriterion("ORIGINAL_SUPPORT_ID not in", values, "originalSupportId");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdBetween(String value1, String value2) {
            addCriterion("ORIGINAL_SUPPORT_ID between", value1, value2, "originalSupportId");
            return (Criteria) this;
        }

        public Criteria andOriginalSupportIdNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_SUPPORT_ID not between", value1, value2, "originalSupportId");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionIsNull() {
            addCriterion("REPETITION_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionIsNotNull() {
            addCriterion("REPETITION_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionEqualTo(String value) {
            addCriterion("REPETITION_DESCRIPTION =", value, "repetitionDescription");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionNotEqualTo(String value) {
            addCriterion("REPETITION_DESCRIPTION <>", value, "repetitionDescription");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionGreaterThan(String value) {
            addCriterion("REPETITION_DESCRIPTION >", value, "repetitionDescription");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("REPETITION_DESCRIPTION >=", value, "repetitionDescription");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionLessThan(String value) {
            addCriterion("REPETITION_DESCRIPTION <", value, "repetitionDescription");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionLessThanOrEqualTo(String value) {
            addCriterion("REPETITION_DESCRIPTION <=", value, "repetitionDescription");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionLike(String value) {
            addCriterion("REPETITION_DESCRIPTION like", value, "repetitionDescription");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionNotLike(String value) {
            addCriterion("REPETITION_DESCRIPTION not like", value, "repetitionDescription");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionIn(List<String> values) {
            addCriterion("REPETITION_DESCRIPTION in", values, "repetitionDescription");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionNotIn(List<String> values) {
            addCriterion("REPETITION_DESCRIPTION not in", values, "repetitionDescription");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionBetween(String value1, String value2) {
            addCriterion("REPETITION_DESCRIPTION between", value1, value2, "repetitionDescription");
            return (Criteria) this;
        }

        public Criteria andRepetitionDescriptionNotBetween(String value1, String value2) {
            addCriterion("REPETITION_DESCRIPTION not between", value1, value2, "repetitionDescription");
            return (Criteria) this;
        }

        public Criteria andPresentConditionIsNull() {
            addCriterion("PRESENT_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andPresentConditionIsNotNull() {
            addCriterion("PRESENT_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andPresentConditionEqualTo(String value) {
            addCriterion("PRESENT_CONDITION =", value, "presentCondition");
            return (Criteria) this;
        }

        public Criteria andPresentConditionNotEqualTo(String value) {
            addCriterion("PRESENT_CONDITION <>", value, "presentCondition");
            return (Criteria) this;
        }

        public Criteria andPresentConditionGreaterThan(String value) {
            addCriterion("PRESENT_CONDITION >", value, "presentCondition");
            return (Criteria) this;
        }

        public Criteria andPresentConditionGreaterThanOrEqualTo(String value) {
            addCriterion("PRESENT_CONDITION >=", value, "presentCondition");
            return (Criteria) this;
        }

        public Criteria andPresentConditionLessThan(String value) {
            addCriterion("PRESENT_CONDITION <", value, "presentCondition");
            return (Criteria) this;
        }

        public Criteria andPresentConditionLessThanOrEqualTo(String value) {
            addCriterion("PRESENT_CONDITION <=", value, "presentCondition");
            return (Criteria) this;
        }

        public Criteria andPresentConditionLike(String value) {
            addCriterion("PRESENT_CONDITION like", value, "presentCondition");
            return (Criteria) this;
        }

        public Criteria andPresentConditionNotLike(String value) {
            addCriterion("PRESENT_CONDITION not like", value, "presentCondition");
            return (Criteria) this;
        }

        public Criteria andPresentConditionIn(List<String> values) {
            addCriterion("PRESENT_CONDITION in", values, "presentCondition");
            return (Criteria) this;
        }

        public Criteria andPresentConditionNotIn(List<String> values) {
            addCriterion("PRESENT_CONDITION not in", values, "presentCondition");
            return (Criteria) this;
        }

        public Criteria andPresentConditionBetween(String value1, String value2) {
            addCriterion("PRESENT_CONDITION between", value1, value2, "presentCondition");
            return (Criteria) this;
        }

        public Criteria andPresentConditionNotBetween(String value1, String value2) {
            addCriterion("PRESENT_CONDITION not between", value1, value2, "presentCondition");
            return (Criteria) this;
        }

        public Criteria andRequirementsIsNull() {
            addCriterion("REQUIREMENTS is null");
            return (Criteria) this;
        }

        public Criteria andRequirementsIsNotNull() {
            addCriterion("REQUIREMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementsEqualTo(String value) {
            addCriterion("REQUIREMENTS =", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsNotEqualTo(String value) {
            addCriterion("REQUIREMENTS <>", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsGreaterThan(String value) {
            addCriterion("REQUIREMENTS >", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIREMENTS >=", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsLessThan(String value) {
            addCriterion("REQUIREMENTS <", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsLessThanOrEqualTo(String value) {
            addCriterion("REQUIREMENTS <=", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsLike(String value) {
            addCriterion("REQUIREMENTS like", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsNotLike(String value) {
            addCriterion("REQUIREMENTS not like", value, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsIn(List<String> values) {
            addCriterion("REQUIREMENTS in", values, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsNotIn(List<String> values) {
            addCriterion("REQUIREMENTS not in", values, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsBetween(String value1, String value2) {
            addCriterion("REQUIREMENTS between", value1, value2, "requirements");
            return (Criteria) this;
        }

        public Criteria andRequirementsNotBetween(String value1, String value2) {
            addCriterion("REQUIREMENTS not between", value1, value2, "requirements");
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