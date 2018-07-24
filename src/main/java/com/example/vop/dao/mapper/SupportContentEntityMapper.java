package com.example.vop.dao.mapper;

import com.example.vop.model.SupportContentEntity;
import com.example.vop.model.SupportContentEntityExample;
import java.util.List;

public interface SupportContentEntityMapper {
    int countByExample(SupportContentEntityExample example);

    int deleteByPrimaryKey(Long supportContentId);

    int insert(SupportContentEntity record);

    int insertSelective(SupportContentEntity record);

    List<SupportContentEntity> selectByExample(SupportContentEntityExample example);

    SupportContentEntity selectByPrimaryKey(Long supportContentId);

    int updateByPrimaryKeySelective(SupportContentEntity record);

    int updateByPrimaryKey(SupportContentEntity record);
}