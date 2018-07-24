package com.example.vop.dao.mapper;

import com.example.vop.model.BillingSupportEntity;
import com.example.vop.model.BillingSupportEntityExample;
import java.util.List;

public interface BillingSupportEntityMapper {
    int countByExample(BillingSupportEntityExample example);

    int deleteByPrimaryKey(Long billingSupportId);

    int insert(BillingSupportEntity record);

    int insertSelective(BillingSupportEntity record);

    List<BillingSupportEntity> selectByExample(BillingSupportEntityExample example);

    BillingSupportEntity selectByPrimaryKey(Long billingSupportId);

    int updateByPrimaryKeySelective(BillingSupportEntity record);

    int updateByPrimaryKey(BillingSupportEntity record);
}