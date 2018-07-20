package com.example.vop.service.impl;

import com.example.vop.dao.WorkOrderDao;
import com.example.vop.service.WorkOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("WorkOrderService")
public class WorkOrderServiceImpl implements WorkOrderService {

    @Resource
    private WorkOrderDao workOrderDao;

    @Override
    public List<String> test() {

        List<String> strs= null;
        try {
            strs = workOrderDao.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strs;
    }
}
