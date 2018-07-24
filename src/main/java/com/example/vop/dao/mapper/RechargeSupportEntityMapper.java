package com.example.vop.dao.mapper;

import com.example.vop.model.RechargeSupportEntity;
import com.example.vop.model.RechargeSupportEntityExample;
import java.util.List;

public interface RechargeSupportEntityMapper {
    int countByExample(RechargeSupportEntityExample example);

    int deleteByPrimaryKey(Long rechargeSupportId);

    int insert(RechargeSupportEntity record);

    int insertSelective(RechargeSupportEntity record);

    List<RechargeSupportEntity> selectByExample(RechargeSupportEntityExample example);

    RechargeSupportEntity selectByPrimaryKey(Long rechargeSupportId);

    int updateByPrimaryKeySelective(RechargeSupportEntity record);

    int updateByPrimaryKey(RechargeSupportEntity record);
}