package com.example.vop.dao.mapper;

import com.example.vop.model.SupportDeal;
import com.example.vop.model.SupportDealExample;
import java.util.List;

public interface SupportDealMapper {
    int countByExample(SupportDealExample example);

    int deleteByPrimaryKey(Long dealId);

    int insert(SupportDeal record);

    int insertSelective(SupportDeal record);

    List<SupportDeal> selectByExample(SupportDealExample example);

    SupportDeal selectByPrimaryKey(Long dealId);

    int updateByPrimaryKeySelective(SupportDeal record);

    int updateByPrimaryKey(SupportDeal record);
}