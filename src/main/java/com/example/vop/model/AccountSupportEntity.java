package com.example.vop.model;

import java.io.Serializable;

public class AccountSupportEntity implements Serializable {
    private Long accountSupportId;

    private String suportId;

    private Long supportContentId;

    private String apiName;

    private String swiftNumber;

    private String orderId;

    private String issueDescription;

    private static final long serialVersionUID = 1L;

    public Long getAccountSupportId() {
        return accountSupportId;
    }

    public void setAccountSupportId(Long accountSupportId) {
        this.accountSupportId = accountSupportId;
    }

    public String getSuportId() {
        return suportId;
    }

    public void setSuportId(String suportId) {
        this.suportId = suportId == null ? null : suportId.trim();
    }

    public Long getSupportContentId() {
        return supportContentId;
    }

    public void setSupportContentId(Long supportContentId) {
        this.supportContentId = supportContentId;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    public String getSwiftNumber() {
        return swiftNumber;
    }

    public void setSwiftNumber(String swiftNumber) {
        this.swiftNumber = swiftNumber == null ? null : swiftNumber.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription == null ? null : issueDescription.trim();
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
        AccountSupportEntity other = (AccountSupportEntity) that;
        return (this.getAccountSupportId() == null ? other.getAccountSupportId() == null : this.getAccountSupportId().equals(other.getAccountSupportId()))
            && (this.getSuportId() == null ? other.getSuportId() == null : this.getSuportId().equals(other.getSuportId()))
            && (this.getSupportContentId() == null ? other.getSupportContentId() == null : this.getSupportContentId().equals(other.getSupportContentId()))
            && (this.getApiName() == null ? other.getApiName() == null : this.getApiName().equals(other.getApiName()))
            && (this.getSwiftNumber() == null ? other.getSwiftNumber() == null : this.getSwiftNumber().equals(other.getSwiftNumber()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getIssueDescription() == null ? other.getIssueDescription() == null : this.getIssueDescription().equals(other.getIssueDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountSupportId() == null) ? 0 : getAccountSupportId().hashCode());
        result = prime * result + ((getSuportId() == null) ? 0 : getSuportId().hashCode());
        result = prime * result + ((getSupportContentId() == null) ? 0 : getSupportContentId().hashCode());
        result = prime * result + ((getApiName() == null) ? 0 : getApiName().hashCode());
        result = prime * result + ((getSwiftNumber() == null) ? 0 : getSwiftNumber().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getIssueDescription() == null) ? 0 : getIssueDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountSupportId=").append(accountSupportId);
        sb.append(", suportId=").append(suportId);
        sb.append(", supportContentId=").append(supportContentId);
        sb.append(", apiName=").append(apiName);
        sb.append(", swiftNumber=").append(swiftNumber);
        sb.append(", orderId=").append(orderId);
        sb.append(", issueDescription=").append(issueDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}