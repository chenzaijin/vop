package com.example.vop.model;

import java.io.Serializable;
import java.util.Date;

public class SupportList implements Serializable {
    private String supportId;

    private String supportType;

    private String username;

    private Long phoneNumber;

    private String contact;

    private String contactNumber;

    private String mvnoContact;

    private String mvnoContactNumber;

    private String remark;

    private Short status;

    private Date createTime;

    private String apiName;

    private Date dealTime;

    private String dealContent;

    private static final long serialVersionUID = 1L;

    public String getSupportId() {
        return supportId;
    }

    public void setSupportId(String supportId) {
        this.supportId = supportId == null ? null : supportId.trim();
    }

    public String getSupportType() {
        return supportType;
    }

    public void setSupportType(String supportType) {
        this.supportType = supportType == null ? null : supportType.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public String getMvnoContact() {
        return mvnoContact;
    }

    public void setMvnoContact(String mvnoContact) {
        this.mvnoContact = mvnoContact == null ? null : mvnoContact.trim();
    }

    public String getMvnoContactNumber() {
        return mvnoContactNumber;
    }

    public void setMvnoContactNumber(String mvnoContactNumber) {
        this.mvnoContactNumber = mvnoContactNumber == null ? null : mvnoContactNumber.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealContent() {
        return dealContent;
    }

    public void setDealContent(String dealContent) {
        this.dealContent = dealContent == null ? null : dealContent.trim();
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
        SupportList other = (SupportList) that;
        return (this.getSupportId() == null ? other.getSupportId() == null : this.getSupportId().equals(other.getSupportId()))
            && (this.getSupportType() == null ? other.getSupportType() == null : this.getSupportType().equals(other.getSupportType()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getContactNumber() == null ? other.getContactNumber() == null : this.getContactNumber().equals(other.getContactNumber()))
            && (this.getMvnoContact() == null ? other.getMvnoContact() == null : this.getMvnoContact().equals(other.getMvnoContact()))
            && (this.getMvnoContactNumber() == null ? other.getMvnoContactNumber() == null : this.getMvnoContactNumber().equals(other.getMvnoContactNumber()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getApiName() == null ? other.getApiName() == null : this.getApiName().equals(other.getApiName()))
            && (this.getDealTime() == null ? other.getDealTime() == null : this.getDealTime().equals(other.getDealTime()))
            && (this.getDealContent() == null ? other.getDealContent() == null : this.getDealContent().equals(other.getDealContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSupportId() == null) ? 0 : getSupportId().hashCode());
        result = prime * result + ((getSupportType() == null) ? 0 : getSupportType().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getContactNumber() == null) ? 0 : getContactNumber().hashCode());
        result = prime * result + ((getMvnoContact() == null) ? 0 : getMvnoContact().hashCode());
        result = prime * result + ((getMvnoContactNumber() == null) ? 0 : getMvnoContactNumber().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getApiName() == null) ? 0 : getApiName().hashCode());
        result = prime * result + ((getDealTime() == null) ? 0 : getDealTime().hashCode());
        result = prime * result + ((getDealContent() == null) ? 0 : getDealContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", supportId=").append(supportId);
        sb.append(", supportType=").append(supportType);
        sb.append(", username=").append(username);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", contact=").append(contact);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", mvnoContact=").append(mvnoContact);
        sb.append(", mvnoContactNumber=").append(mvnoContactNumber);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", apiName=").append(apiName);
        sb.append(", dealTime=").append(dealTime);
        sb.append(", dealContent=").append(dealContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}