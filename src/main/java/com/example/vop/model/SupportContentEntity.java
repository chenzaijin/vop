package com.example.vop.model;

import java.io.Serializable;

public class SupportContentEntity implements Serializable {
    private Long supportContentId;

    private String suportId;

    private String supportLevel;

    private String issueProvince;

    private String issueCity;

    private String phoneNumberProvince;

    private String phoneNumberCity;

    private Short repetition;

    private String originalSupportId;

    private String repetitionDescription;

    private String presentCondition;

    private String requirements;

    private static final long serialVersionUID = 1L;

    public Long getSupportContentId() {
        return supportContentId;
    }

    public void setSupportContentId(Long supportContentId) {
        this.supportContentId = supportContentId;
    }

    public String getSuportId() {
        return suportId;
    }

    public void setSuportId(String suportId) {
        this.suportId = suportId == null ? null : suportId.trim();
    }

    public String getSupportLevel() {
        return supportLevel;
    }

    public void setSupportLevel(String supportLevel) {
        this.supportLevel = supportLevel == null ? null : supportLevel.trim();
    }

    public String getIssueProvince() {
        return issueProvince;
    }

    public void setIssueProvince(String issueProvince) {
        this.issueProvince = issueProvince == null ? null : issueProvince.trim();
    }

    public String getIssueCity() {
        return issueCity;
    }

    public void setIssueCity(String issueCity) {
        this.issueCity = issueCity == null ? null : issueCity.trim();
    }

    public String getPhoneNumberProvince() {
        return phoneNumberProvince;
    }

    public void setPhoneNumberProvince(String phoneNumberProvince) {
        this.phoneNumberProvince = phoneNumberProvince == null ? null : phoneNumberProvince.trim();
    }

    public String getPhoneNumberCity() {
        return phoneNumberCity;
    }

    public void setPhoneNumberCity(String phoneNumberCity) {
        this.phoneNumberCity = phoneNumberCity == null ? null : phoneNumberCity.trim();
    }

    public Short getRepetition() {
        return repetition;
    }

    public void setRepetition(Short repetition) {
        this.repetition = repetition;
    }

    public String getOriginalSupportId() {
        return originalSupportId;
    }

    public void setOriginalSupportId(String originalSupportId) {
        this.originalSupportId = originalSupportId == null ? null : originalSupportId.trim();
    }

    public String getRepetitionDescription() {
        return repetitionDescription;
    }

    public void setRepetitionDescription(String repetitionDescription) {
        this.repetitionDescription = repetitionDescription == null ? null : repetitionDescription.trim();
    }

    public String getPresentCondition() {
        return presentCondition;
    }

    public void setPresentCondition(String presentCondition) {
        this.presentCondition = presentCondition == null ? null : presentCondition.trim();
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements == null ? null : requirements.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SupportContentEntity other = (SupportContentEntity) that;
        return (this.getSupportContentId() == null ? other.getSupportContentId() == null : this.getSupportContentId().equals(other.getSupportContentId()))
            && (this.getSuportId() == null ? other.getSuportId() == null : this.getSuportId().equals(other.getSuportId()))
            && (this.getSupportLevel() == null ? other.getSupportLevel() == null : this.getSupportLevel().equals(other.getSupportLevel()))
            && (this.getIssueProvince() == null ? other.getIssueProvince() == null : this.getIssueProvince().equals(other.getIssueProvince()))
            && (this.getIssueCity() == null ? other.getIssueCity() == null : this.getIssueCity().equals(other.getIssueCity()))
            && (this.getPhoneNumberProvince() == null ? other.getPhoneNumberProvince() == null : this.getPhoneNumberProvince().equals(other.getPhoneNumberProvince()))
            && (this.getPhoneNumberCity() == null ? other.getPhoneNumberCity() == null : this.getPhoneNumberCity().equals(other.getPhoneNumberCity()))
            && (this.getRepetition() == null ? other.getRepetition() == null : this.getRepetition().equals(other.getRepetition()))
            && (this.getOriginalSupportId() == null ? other.getOriginalSupportId() == null : this.getOriginalSupportId().equals(other.getOriginalSupportId()))
            && (this.getRepetitionDescription() == null ? other.getRepetitionDescription() == null : this.getRepetitionDescription().equals(other.getRepetitionDescription()))
            && (this.getPresentCondition() == null ? other.getPresentCondition() == null : this.getPresentCondition().equals(other.getPresentCondition()))
            && (this.getRequirements() == null ? other.getRequirements() == null : this.getRequirements().equals(other.getRequirements()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSupportContentId() == null) ? 0 : getSupportContentId().hashCode());
        result = prime * result + ((getSuportId() == null) ? 0 : getSuportId().hashCode());
        result = prime * result + ((getSupportLevel() == null) ? 0 : getSupportLevel().hashCode());
        result = prime * result + ((getIssueProvince() == null) ? 0 : getIssueProvince().hashCode());
        result = prime * result + ((getIssueCity() == null) ? 0 : getIssueCity().hashCode());
        result = prime * result + ((getPhoneNumberProvince() == null) ? 0 : getPhoneNumberProvince().hashCode());
        result = prime * result + ((getPhoneNumberCity() == null) ? 0 : getPhoneNumberCity().hashCode());
        result = prime * result + ((getRepetition() == null) ? 0 : getRepetition().hashCode());
        result = prime * result + ((getOriginalSupportId() == null) ? 0 : getOriginalSupportId().hashCode());
        result = prime * result + ((getRepetitionDescription() == null) ? 0 : getRepetitionDescription().hashCode());
        result = prime * result + ((getPresentCondition() == null) ? 0 : getPresentCondition().hashCode());
        result = prime * result + ((getRequirements() == null) ? 0 : getRequirements().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", supportContentId=").append(supportContentId);
        sb.append(", suportId=").append(suportId);
        sb.append(", supportLevel=").append(supportLevel);
        sb.append(", issueProvince=").append(issueProvince);
        sb.append(", issueCity=").append(issueCity);
        sb.append(", phoneNumberProvince=").append(phoneNumberProvince);
        sb.append(", phoneNumberCity=").append(phoneNumberCity);
        sb.append(", repetition=").append(repetition);
        sb.append(", originalSupportId=").append(originalSupportId);
        sb.append(", repetitionDescription=").append(repetitionDescription);
        sb.append(", presentCondition=").append(presentCondition);
        sb.append(", requirements=").append(requirements);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}