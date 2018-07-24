package com.example.vop.dao.mapper;

import com.example.vop.model.ResDistrictChange;
import com.example.vop.model.SupportList;
import com.example.vop.model.SupportListExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SupportListMapper {
    int countByExample(SupportListExample example);

    int deleteByPrimaryKey(String supportId);

    int insert(SupportList record);

    int insertSelective(SupportList record);

    List<SupportList> selectByExample(SupportListExample example);

    SupportList selectByPrimaryKey(String supportId);

    int updateByPrimaryKeySelective(SupportList record);

    int updateByPrimaryKey(SupportList record);

    String getOipMvnoKEY();

    String getSupportSequence();

    List<ResDistrictChange> getProvinceList();

    List<ResDistrictChange> getCityList();
}