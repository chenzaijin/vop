package com.example.vop.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkOrderDao {
    List<String> test();
}
