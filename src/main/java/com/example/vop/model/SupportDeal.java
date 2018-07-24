package com.example.vop.model;

import java.io.Serializable;
import java.util.Date;

public class SupportDeal implements Serializable {
    private Long dealId;

    private String suportId;

    private String status;

    private String content;

    private Date dealTime;

    private String phoneNumber;

    private String contact;

    private String remark;

    private String dealResult;

    private String dealMessage;

    private String apiName;

    private static final long serialVersionUID = 1L;

    public Long getDealId() {
        return dealId;
    }

    public void setDealId(Long dealId) {
        this.dealId = dealId;
    }

    public String getSuportId() {
        return suportId;
    }

    public void setSuportId(String suportId) {
        this.suportId = suportId == null ? null : suportId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDealResult() {
        return dealResult;
    }

    public void setDealResult(String dealResult) {
        this.dealResult = dealResult == null ? null : dealResult.trim();
    }

    public String getDealMessage() {
        return dealMessage;
    }

    public void setDealMessage(String dealMessage) {
        this.dealMessage = dealMessage == null ? null : dealMessage.trim();
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
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
        SupportDeal other = (SupportDeal) that;
        return (this.getDealId() == null ? other.getDealId() == null : this.getDealId().equals(other.getDealId()))
            && (this.getSuportId() == null ? other.getSuportId() == null : this.getSuportId().equals(other.getSuportId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDealTime() == null ? other.getDealTime() == null : this.getDealTime().equals(other.getDealTime()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDealResult() == null ? other.getDealResult() == null : this.getDealResult().equals(other.getDealResult()))
            && (this.getDealMessage() == null ? other.getDealMessage() == null : this.getDealMessage().equals(other.getDealMessage()))
            && (this.getApiName() == null ? other.getApiName() == null : this.getApiName().equals(other.getApiName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDealId() == null) ? 0 : getDealId().hashCode());
        result = prime * result + ((getSuportId() == null) ? 0 : getSuportId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getDealTime() == null) ? 0 : getDealTime().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDealResult() == null) ? 0 : getDealResult().hashCode());
        result = prime * result + ((getDealMessage() == null) ? 0 : getDealMessage().hashCode());
        result = prime * result + ((getApiName() == null) ? 0 : getApiName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dealId=").append(dealId);
        sb.append(", suportId=").append(suportId);
        sb.append(", status=").append(status);
        sb.append(", content=").append(content);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", contact=").append(contact);
        sb.append(", remark=").append(remark);
        sb.append(", dealResult=").append(dealResult);
        sb.append(", dealMessage=").append(dealMessage);
        sb.append(", apiName=").append(apiName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}