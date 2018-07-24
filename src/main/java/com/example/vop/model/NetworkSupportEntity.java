package com.example.vop.model;

import java.io.Serializable;

public class NetworkSupportEntity implements Serializable {
    private Long networkSupportId;

    private String suportId;

    private Long supportContentId;

    private Short networkType;

    private Short signal;

    private Short symptom;

    private Short notCalling;

    private String issueDescription;

    private static final long serialVersionUID = 1L;

    public Long getNetworkSupportId() {
        return networkSupportId;
    }

    public void setNetworkSupportId(Long networkSupportId) {
        this.networkSupportId = networkSupportId;
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

    public Short getNetworkType() {
        return networkType;
    }

    public void setNetworkType(Short networkType) {
        this.networkType = networkType;
    }

    public Short getSignal() {
        return signal;
    }

    public void setSignal(Short signal) {
        this.signal = signal;
    }

    public Short getSymptom() {
        return symptom;
    }

    public void setSymptom(Short symptom) {
        this.symptom = symptom;
    }

    public Short getNotCalling() {
        return notCalling;
    }

    public void setNotCalling(Short notCalling) {
        this.notCalling = notCalling;
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
        NetworkSupportEntity other = (NetworkSupportEntity) that;
        return (this.getNetworkSupportId() == null ? other.getNetworkSupportId() == null : this.getNetworkSupportId().equals(other.getNetworkSupportId()))
            && (this.getSuportId() == null ? other.getSuportId() == null : this.getSuportId().equals(other.getSuportId()))
            && (this.getSupportContentId() == null ? other.getSupportContentId() == null : this.getSupportContentId().equals(other.getSupportContentId()))
            && (this.getNetworkType() == null ? other.getNetworkType() == null : this.getNetworkType().equals(other.getNetworkType()))
            && (this.getSignal() == null ? other.getSignal() == null : this.getSignal().equals(other.getSignal()))
            && (this.getSymptom() == null ? other.getSymptom() == null : this.getSymptom().equals(other.getSymptom()))
            && (this.getNotCalling() == null ? other.getNotCalling() == null : this.getNotCalling().equals(other.getNotCalling()))
            && (this.getIssueDescription() == null ? other.getIssueDescription() == null : this.getIssueDescription().equals(other.getIssueDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNetworkSupportId() == null) ? 0 : getNetworkSupportId().hashCode());
        result = prime * result + ((getSuportId() == null) ? 0 : getSuportId().hashCode());
        result = prime * result + ((getSupportContentId() == null) ? 0 : getSupportContentId().hashCode());
        result = prime * result + ((getNetworkType() == null) ? 0 : getNetworkType().hashCode());
        result = prime * result + ((getSignal() == null) ? 0 : getSignal().hashCode());
        result = prime * result + ((getSymptom() == null) ? 0 : getSymptom().hashCode());
        result = prime * result + ((getNotCalling() == null) ? 0 : getNotCalling().hashCode());
        result = prime * result + ((getIssueDescription() == null) ? 0 : getIssueDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", networkSupportId=").append(networkSupportId);
        sb.append(", suportId=").append(suportId);
        sb.append(", supportContentId=").append(supportContentId);
        sb.append(", networkType=").append(networkType);
        sb.append(", signal=").append(signal);
        sb.append(", symptom=").append(symptom);
        sb.append(", notCalling=").append(notCalling);
        sb.append(", issueDescription=").append(issueDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}