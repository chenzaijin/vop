package com.example.vop.model;

import java.io.Serializable;

public class BillingSupportEntity implements Serializable {
    private Long billingSupportId;

    private String suportId;

    private Long supportContentId;

    private Short cdrType;

    private String cdrFile;

    private String cdrNumber;

    private String issueDescription;

    private static final long serialVersionUID = 1L;

    public Long getBillingSupportId() {
        return billingSupportId;
    }

    public void setBillingSupportId(Long billingSupportId) {
        this.billingSupportId = billingSupportId;
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

    public Short getCdrType() {
        return cdrType;
    }

    public void setCdrType(Short cdrType) {
        this.cdrType = cdrType;
    }

    public String getCdrFile() {
        return cdrFile;
    }

    public void setCdrFile(String cdrFile) {
        this.cdrFile = cdrFile == null ? null : cdrFile.trim();
    }

    public String getCdrNumber() {
        return cdrNumber;
    }

    public void setCdrNumber(String cdrNumber) {
        this.cdrNumber = cdrNumber == null ? null : cdrNumber.trim();
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
        BillingSupportEntity other = (BillingSupportEntity) that;
        return (this.getBillingSupportId() == null ? other.getBillingSupportId() == null : this.getBillingSupportId().equals(other.getBillingSupportId()))
            && (this.getSuportId() == null ? other.getSuportId() == null : this.getSuportId().equals(other.getSuportId()))
            && (this.getSupportContentId() == null ? other.getSupportContentId() == null : this.getSupportContentId().equals(other.getSupportContentId()))
            && (this.getCdrType() == null ? other.getCdrType() == null : this.getCdrType().equals(other.getCdrType()))
            && (this.getCdrFile() == null ? other.getCdrFile() == null : this.getCdrFile().equals(other.getCdrFile()))
            && (this.getCdrNumber() == null ? other.getCdrNumber() == null : this.getCdrNumber().equals(other.getCdrNumber()))
            && (this.getIssueDescription() == null ? other.getIssueDescription() == null : this.getIssueDescription().equals(other.getIssueDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBillingSupportId() == null) ? 0 : getBillingSupportId().hashCode());
        result = prime * result + ((getSuportId() == null) ? 0 : getSuportId().hashCode());
        result = prime * result + ((getSupportContentId() == null) ? 0 : getSupportContentId().hashCode());
        result = prime * result + ((getCdrType() == null) ? 0 : getCdrType().hashCode());
        result = prime * result + ((getCdrFile() == null) ? 0 : getCdrFile().hashCode());
        result = prime * result + ((getCdrNumber() == null) ? 0 : getCdrNumber().hashCode());
        result = prime * result + ((getIssueDescription() == null) ? 0 : getIssueDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", billingSupportId=").append(billingSupportId);
        sb.append(", suportId=").append(suportId);
        sb.append(", supportContentId=").append(supportContentId);
        sb.append(", cdrType=").append(cdrType);
        sb.append(", cdrFile=").append(cdrFile);
        sb.append(", cdrNumber=").append(cdrNumber);
        sb.append(", issueDescription=").append(issueDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}