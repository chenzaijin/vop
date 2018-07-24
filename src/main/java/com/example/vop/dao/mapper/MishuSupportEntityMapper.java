package com.example.vop.dao.mapper;

import com.example.vop.model.MishuSupportEntity;
import com.example.vop.model.MishuSupportEntityExample;
import java.util.List;

public interface MishuSupportEntityMapper {
    int countByExample(MishuSupportEntityExample example);

    int deleteByPrimaryKey(Long mishuSupportId);

    int insert(MishuSupportEntity record);

    int insertSelective(MishuSupportEntity record);

    List<MishuSupportEntity> selectByExample(MishuSupportEntityExample example);

    MishuSupportEntity selectByPrimaryKey(Long mishuSupportId);

    int updateByPrimaryKeySelective(MishuSupportEntity record);

    int updateByPrimaryKey(MishuSupportEntity record);
}