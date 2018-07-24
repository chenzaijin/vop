package com.example.vop.dao.mapper;

import com.example.vop.model.VasSupportEntity;
import com.example.vop.model.VasSupportEntityExample;
import java.util.List;

public interface VasSupportEntityMapper {
    int countByExample(VasSupportEntityExample example);

    int deleteByPrimaryKey(Long vasSupportId);

    int insert(VasSupportEntity record);

    int insertSelective(VasSupportEntity record);

    List<VasSupportEntity> selectByExample(VasSupportEntityExample example);

    VasSupportEntity selectByPrimaryKey(Long vasSupportId);

    int updateByPrimaryKeySelective(VasSupportEntity record);

    int updateByPrimaryKey(VasSupportEntity record);
}