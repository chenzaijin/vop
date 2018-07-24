package com.example.vop.dao.mapper;

import com.example.vop.model.NetworkSupportEntity;
import com.example.vop.model.NetworkSupportEntityExample;
import java.util.List;

public interface NetworkSupportEntityMapper {
    int countByExample(NetworkSupportEntityExample example);

    int deleteByPrimaryKey(Long networkSupportId);

    int insert(NetworkSupportEntity record);

    int insertSelective(NetworkSupportEntity record);

    List<NetworkSupportEntity> selectByExample(NetworkSupportEntityExample example);

    NetworkSupportEntity selectByPrimaryKey(Long networkSupportId);

    int updateByPrimaryKeySelective(NetworkSupportEntity record);

    int updateByPrimaryKey(NetworkSupportEntity record);
}