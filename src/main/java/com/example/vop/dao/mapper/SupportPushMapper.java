package com.example.vop.dao.mapper;

import com.example.vop.model.SupportPush;
import com.example.vop.model.SupportPushExample;
import java.util.List;

public interface SupportPushMapper {
    int countByExample(SupportPushExample example);

    int deleteByPrimaryKey(String pushId);

    int insert(SupportPush record);

    int insertSelective(SupportPush record);

    List<SupportPush> selectByExample(SupportPushExample example);

    SupportPush selectByPrimaryKey(String pushId);

    int updateByPrimaryKeySelective(SupportPush record);

    int updateByPrimaryKey(SupportPush record);
}