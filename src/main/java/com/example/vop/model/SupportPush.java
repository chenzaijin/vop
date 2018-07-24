package com.example.vop.model;

import java.io.Serializable;
import java.util.Date;

public class SupportPush implements Serializable {
    private String pushId;

    private String pushType;

    private String pushContent;

    private Date pushTime;

    private String phoneNumber;

    private String contact;

    private String remark;

    private String apiName;

    private static final long serialVersionUID = 1L;

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId == null ? null : pushId.trim();
    }

    public String getPushType() {
        return pushType;
    }

    public void setPushType(String pushType) {
        this.pushType = pushType == null ? null : pushType.trim();
    }

    public String getPushContent() {
        return pushContent;
    }

    public void setPushContent(String pushContent) {
        this.pushContent = pushContent == null ? null : pushContent.trim();
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
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
        SupportPush other = (SupportPush) that;
        return (this.getPushId() == null ? other.getPushId() == null : this.getPushId().equals(other.getPushId()))
            && (this.getPushType() == null ? other.getPushType() == null : this.getPushType().equals(other.getPushType()))
            && (this.getPushContent() == null ? other.getPushContent() == null : this.getPushContent().equals(other.getPushContent()))
            && (this.getPushTime() == null ? other.getPushTime() == null : this.getPushTime().equals(other.getPushTime()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getApiName() == null ? other.getApiName() == null : this.getApiName().equals(other.getApiName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPushId() == null) ? 0 : getPushId().hashCode());
        result = prime * result + ((getPushType() == null) ? 0 : getPushType().hashCode());
        result = prime * result + ((getPushContent() == null) ? 0 : getPushContent().hashCode());
        result = prime * result + ((getPushTime() == null) ? 0 : getPushTime().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getApiName() == null) ? 0 : getApiName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pushId=").append(pushId);
        sb.append(", pushType=").append(pushType);
        sb.append(", pushContent=").append(pushContent);
        sb.append(", pushTime=").append(pushTime);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", contact=").append(contact);
        sb.append(", remark=").append(remark);
        sb.append(", apiName=").append(apiName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}