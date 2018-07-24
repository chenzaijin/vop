package com.example.vop.model;

import java.io.Serializable;

public class AttachmentEntity implements Serializable {
    private Long attachmentId;

    private String supportId;

    private Long dealId;

    private String pushId;

    private String fileName;

    private String filePath;

    private static final long serialVersionUID = 1L;

    public Long getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getSupportId() {
        return supportId;
    }

    public void setSupportId(String supportId) {
        this.supportId = supportId == null ? null : supportId.trim();
    }

    public Long getDealId() {
        return dealId;
    }

    public void setDealId(Long dealId) {
        this.dealId = dealId;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId == null ? null : pushId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
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
        AttachmentEntity other = (AttachmentEntity) that;
        return (this.getAttachmentId() == null ? other.getAttachmentId() == null : this.getAttachmentId().equals(other.getAttachmentId()))
            && (this.getSupportId() == null ? other.getSupportId() == null : this.getSupportId().equals(other.getSupportId()))
            && (this.getDealId() == null ? other.getDealId() == null : this.getDealId().equals(other.getDealId()))
            && (this.getPushId() == null ? other.getPushId() == null : this.getPushId().equals(other.getPushId()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        result = prime * result + ((getSupportId() == null) ? 0 : getSupportId().hashCode());
        result = prime * result + ((getDealId() == null) ? 0 : getDealId().hashCode());
        result = prime * result + ((getPushId() == null) ? 0 : getPushId().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attachmentId=").append(attachmentId);
        sb.append(", supportId=").append(supportId);
        sb.append(", dealId=").append(dealId);
        sb.append(", pushId=").append(pushId);
        sb.append(", fileName=").append(fileName);
        sb.append(", filePath=").append(filePath);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}