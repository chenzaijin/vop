package com.example.vop.dao.mapper;

import com.example.vop.model.SupportAttachmentEntity;
import com.example.vop.model.SupportAttachmentEntityExample;
import java.util.List;

public interface SupportAttachmentEntityMapper {
    int countByExample(SupportAttachmentEntityExample example);

    int deleteByPrimaryKey(Long attachmentId);

    int insert(SupportAttachmentEntity record);

    int insertSelective(SupportAttachmentEntity record);

    List<SupportAttachmentEntity> selectByExample(SupportAttachmentEntityExample example);

    SupportAttachmentEntity selectByPrimaryKey(Long attachmentId);

    int updateByPrimaryKeySelective(SupportAttachmentEntity record);

    int updateByPrimaryKey(SupportAttachmentEntity record);
}