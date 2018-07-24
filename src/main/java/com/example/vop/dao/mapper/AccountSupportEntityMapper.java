package com.example.vop.dao.mapper;

import com.example.vop.model.AccountSupportEntity;
import com.example.vop.model.AccountSupportEntityExample;
import java.util.List;

public interface AccountSupportEntityMapper {
    int countByExample(AccountSupportEntityExample example);

    int deleteByPrimaryKey(Long accountSupportId);

    int insert(AccountSupportEntity record);

    int insertSelective(AccountSupportEntity record);

    List<AccountSupportEntity> selectByExample(AccountSupportEntityExample example);

    AccountSupportEntity selectByPrimaryKey(Long accountSupportId);

    int updateByPrimaryKeySelective(AccountSupportEntity record);

    int updateByPrimaryKey(AccountSupportEntity record);
}