package com.example.vop.dao.mapper;

import com.example.vop.model.AttachmentEntity;
import com.example.vop.model.AttachmentEntityExample;
import java.util.List;

public interface AttachmentEntityMapper {
    int countByExample(AttachmentEntityExample example);

    int deleteByPrimaryKey(Long attachmentId);

    int insert(AttachmentEntity record);

    int insertSelective(AttachmentEntity record);

    List<AttachmentEntity> selectByExample(AttachmentEntityExample example);

    AttachmentEntity selectByPrimaryKey(Long attachmentId);

    int updateByPrimaryKeySelective(AttachmentEntity record);

    int updateByPrimaryKey(AttachmentEntity record);
}