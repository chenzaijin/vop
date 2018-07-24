package com.example.vop.model;

import java.io.Serializable;

public class VasSupportEntity implements Serializable {
    private Long vasSupportId;

    private String supportId;

    private Long supportContentId;

    private String systemType;

    private Short vasType;

    private String vasDescription;

    private String ssueDescription;

    private static final long serialVersionUID = 1L;

    public Long getVasSupportId() {
        return vasSupportId;
    }

    public void setVasSupportId(Long vasSupportId) {
        this.vasSupportId = vasSupportId;
    }

    public String getSupportId() {
        return supportId;
    }

    public void setSupportId(String supportId) {
        this.supportId = supportId == null ? null : supportId.trim();
    }

    public Long getSupportContentId() {
        return supportContentId;
    }

    public void setSupportContentId(Long supportContentId) {
        this.supportContentId = supportContentId;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType == null ? null : systemType.trim();
    }

    public Short getVasType() {
        return vasType;
    }

    public void setVasType(Short vasType) {
        this.vasType = vasType;
    }

    public String getVasDescription() {
        return vasDescription;
    }

    public void setVasDescription(String vasDescription) {
        this.vasDescription = vasDescription == null ? null : vasDescription.trim();
    }

    public String getSsueDescription() {
        return ssueDescription;
    }

    public void setSsueDescription(String ssueDescription) {
        this.ssueDescription = ssueDescription == null ? null : ssueDescription.trim();
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
        VasSupportEntity other = (VasSupportEntity) that;
        return (this.getVasSupportId() == null ? other.getVasSupportId() == null : this.getVasSupportId().equals(other.getVasSupportId()))
            && (this.getSupportId() == null ? other.getSupportId() == null : this.getSupportId().equals(other.getSupportId()))
            && (this.getSupportContentId() == null ? other.getSupportContentId() == null : this.getSupportContentId().equals(other.getSupportContentId()))
            && (this.getSystemType() == null ? other.getSystemType() == null : this.getSystemType().equals(other.getSystemType()))
            && (this.getVasType() == null ? other.getVasType() == null : this.getVasType().equals(other.getVasType()))
            && (this.getVasDescription() == null ? other.getVasDescription() == null : this.getVasDescription().equals(other.getVasDescription()))
            && (this.getSsueDescription() == null ? other.getSsueDescription() == null : this.getSsueDescription().equals(other.getSsueDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVasSupportId() == null) ? 0 : getVasSupportId().hashCode());
        result = prime * result + ((getSupportId() == null) ? 0 : getSupportId().hashCode());
        result = prime * result + ((getSupportContentId() == null) ? 0 : getSupportContentId().hashCode());
        result = prime * result + ((getSystemType() == null) ? 0 : getSystemType().hashCode());
        result = prime * result + ((getVasType() == null) ? 0 : getVasType().hashCode());
        result = prime * result + ((getVasDescription() == null) ? 0 : getVasDescription().hashCode());
        result = prime * result + ((getSsueDescription() == null) ? 0 : getSsueDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vasSupportId=").append(vasSupportId);
        sb.append(", supportId=").append(supportId);
        sb.append(", supportContentId=").append(supportContentId);
        sb.append(", systemType=").append(systemType);
        sb.append(", vasType=").append(vasType);
        sb.append(", vasDescription=").append(vasDescription);
        sb.append(", ssueDescription=").append(ssueDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}