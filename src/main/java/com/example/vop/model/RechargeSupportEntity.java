package com.example.vop.model;

import java.io.Serializable;
import java.util.Date;

public class RechargeSupportEntity implements Serializable {
    private Long rechargeSupportId;

    private String suportId;

    private Long supportContentId;

    private Short payingArrive;

    private String phoneNumber;

    private String cardNumber;

    private Date rechargeDate;

    private String processSerial;

    private Long payamount;

    private String issueDescription;

    private static final long serialVersionUID = 1L;

    public Long getRechargeSupportId() {
        return rechargeSupportId;
    }

    public void setRechargeSupportId(Long rechargeSupportId) {
        this.rechargeSupportId = rechargeSupportId;
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

    public Short getPayingArrive() {
        return payingArrive;
    }

    public void setPayingArrive(Short payingArrive) {
        this.payingArrive = payingArrive;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public Date getRechargeDate() {
        return rechargeDate;
    }

    public void setRechargeDate(Date rechargeDate) {
        this.rechargeDate = rechargeDate;
    }

    public String getProcessSerial() {
        return processSerial;
    }

    public void setProcessSerial(String processSerial) {
        this.processSerial = processSerial == null ? null : processSerial.trim();
    }

    public Long getPayamount() {
        return payamount;
    }

    public void setPayamount(Long payamount) {
        this.payamount = payamount;
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
        RechargeSupportEntity other = (RechargeSupportEntity) that;
        return (this.getRechargeSupportId() == null ? other.getRechargeSupportId() == null : this.getRechargeSupportId().equals(other.getRechargeSupportId()))
            && (this.getSuportId() == null ? other.getSuportId() == null : this.getSuportId().equals(other.getSuportId()))
            && (this.getSupportContentId() == null ? other.getSupportContentId() == null : this.getSupportContentId().equals(other.getSupportContentId()))
            && (this.getPayingArrive() == null ? other.getPayingArrive() == null : this.getPayingArrive().equals(other.getPayingArrive()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getCardNumber() == null ? other.getCardNumber() == null : this.getCardNumber().equals(other.getCardNumber()))
            && (this.getRechargeDate() == null ? other.getRechargeDate() == null : this.getRechargeDate().equals(other.getRechargeDate()))
            && (this.getProcessSerial() == null ? other.getProcessSerial() == null : this.getProcessSerial().equals(other.getProcessSerial()))
            && (this.getPayamount() == null ? other.getPayamount() == null : this.getPayamount().equals(other.getPayamount()))
            && (this.getIssueDescription() == null ? other.getIssueDescription() == null : this.getIssueDescription().equals(other.getIssueDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRechargeSupportId() == null) ? 0 : getRechargeSupportId().hashCode());
        result = prime * result + ((getSuportId() == null) ? 0 : getSuportId().hashCode());
        result = prime * result + ((getSupportContentId() == null) ? 0 : getSupportContentId().hashCode());
        result = prime * result + ((getPayingArrive() == null) ? 0 : getPayingArrive().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getCardNumber() == null) ? 0 : getCardNumber().hashCode());
        result = prime * result + ((getRechargeDate() == null) ? 0 : getRechargeDate().hashCode());
        result = prime * result + ((getProcessSerial() == null) ? 0 : getProcessSerial().hashCode());
        result = prime * result + ((getPayamount() == null) ? 0 : getPayamount().hashCode());
        result = prime * result + ((getIssueDescription() == null) ? 0 : getIssueDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rechargeSupportId=").append(rechargeSupportId);
        sb.append(", suportId=").append(suportId);
        sb.append(", supportContentId=").append(supportContentId);
        sb.append(", payingArrive=").append(payingArrive);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", rechargeDate=").append(rechargeDate);
        sb.append(", processSerial=").append(processSerial);
        sb.append(", payamount=").append(payamount);
        sb.append(", issueDescription=").append(issueDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}