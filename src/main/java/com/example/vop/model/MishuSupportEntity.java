package com.example.vop.model;

import java.io.Serializable;

public class MishuSupportEntity implements Serializable {
    private Long mishuSupportId;

    private String suportId;

    private Long supportContentId;

    private String issueDescription;

    private static final long serialVersionUID = 1L;

    public Long getMishuSupportId() {
        return mishuSupportId;
    }

    public void setMishuSupportId(Long mishuSupportId) {
        this.mishuSupportId = mishuSupportId;
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
        MishuSupportEntity other = (MishuSupportEntity) that;
        return (this.getMishuSupportId() == null ? other.getMishuSupportId() == null : this.getMishuSupportId().equals(other.getMishuSupportId()))
            && (this.getSuportId() == null ? other.getSuportId() == null : this.getSuportId().equals(other.getSuportId()))
            && (this.getSupportContentId() == null ? other.getSupportContentId() == null : this.getSupportContentId().equals(other.getSupportContentId()))
            && (this.getIssueDescription() == null ? other.getIssueDescription() == null : this.getIssueDescription().equals(other.getIssueDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMishuSupportId() == null) ? 0 : getMishuSupportId().hashCode());
        result = prime * result + ((getSuportId() == null) ? 0 : getSuportId().hashCode());
        result = prime * result + ((getSupportContentId() == null) ? 0 : getSupportContentId().hashCode());
        result = prime * result + ((getIssueDescription() == null) ? 0 : getIssueDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mishuSupportId=").append(mishuSupportId);
        sb.append(", suportId=").append(suportId);
        sb.append(", supportContentId=").append(supportContentId);
        sb.append(", issueDescription=").append(issueDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}