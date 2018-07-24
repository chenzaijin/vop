package com.example.vop.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.vop.dao.WorkOrderDao;
import com.example.vop.dao.mapper.SupportContentEntityMapper;
import com.example.vop.dao.mapper.SupportListMapper;
import com.example.vop.model.*;
import com.example.vop.service.WorkOrderService;
import com.example.vop.uitl.DateUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import org.apache.commons.lang.StringUtils;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service("WorkOrderService")
public class WorkOrderServiceImpl implements WorkOrderService {

    @Resource
    private WorkOrderDao workOrderDao;

    @Resource
    SupportListMapper supportListMapper;
    @Resource
    SupportContentEntityMapper supportContentEntityMapper;

    private String serialNum = "";
    private String excuteTime = "";

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

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public String supportSubmit(String support_deal,String support_content,String entiry) {
        String mvnoKey=supportListMapper.getOipMvnoKEY();
        long contenID=supportContentEntityMapper.getContenID();
        Timestamp nowTime = new Timestamp(System.currentTimeMillis());
        String supportSequence=supportListMapper.getSupportSequence();
        String reqTime = DateUtil.formatTime(nowTime, "yyyyMMddHHmmssSSS");
        String timeStamp = DateUtil.formatTime(nowTime, "yyyy-MM-dd HH:mm:ss");
        // 计算序列号mvnokey+YYYYMMDDHHMMSS+毫秒(3)+6位随机数

        // 生成6位随机数
        String ranNum = String.valueOf(new Random().nextInt(1000000));

        String serialNumber = mvnoKey + reqTime
                + StringUtils.leftPad(ranNum, 6, '0');

        serialNum = serialNumber;
        excuteTime = timeStamp;
        SupportList supportList=JSONObject.parseObject(support_deal,SupportList.class);
        supportList.setSupportId(serialNumber+supportSequence);
        supportList.setApiName("cu.vop.basic_service.submit_support");
        supportList.setCreateTime(new Date());
        short s=1;
        supportList.setStatus(s);


        /*SONObject jsonObject = JSONObject.parseObject(support_deal);
        jsonObject.put("support_id",supportList.getSupportId());*/

        SupportContentEntity supportContentEntity=JSONObject.parseObject(support_content,SupportContentEntity.class);
        supportContentEntity.setSuportId(supportList.getSupportId());
        supportContentEntity.setSupportContentId(contenID);

        if(supportList.getSupportType().equals("01")){

            NetworkSupportEntity networkSupportEntity=JSONObject.parseObject(entiry,NetworkSupportEntity.class);
            networkSupportEntity.setSuportId(supportList.getSupportId());
            networkSupportEntity.setSupportContentId(contenID);
        }else if(supportList.getSupportType().equals("02")){

            AccountSupportEntity accountSupportEntity=JSONObject.parseObject(entiry,AccountSupportEntity.class);
            accountSupportEntity.setSuportId(supportList.getSupportId());
            accountSupportEntity.setSupportContentId(contenID);
        }else if(supportList.getSupportType().equals("03")){

            BillingSupportEntity billingSupportEntity=JSONObject.parseObject(entiry,BillingSupportEntity.class);
            billingSupportEntity.setSuportId(supportList.getSupportId());
            billingSupportEntity.setSupportContentId(contenID);
        }else if(supportList.getSupportType().equals("04")){

            RechargeSupportEntity rechargeSupportEntity=JSONObject.parseObject(entiry,RechargeSupportEntity.class);
            rechargeSupportEntity.setSuportId(supportList.getSupportId());
            rechargeSupportEntity.setSupportContentId(contenID);
        }else if(supportList.getSupportType().equals("05")){

            VasSupportEntity vasSupportEntity=JSONObject.parseObject(entiry,VasSupportEntity.class);
            vasSupportEntity.setSupportId(supportList.getSupportId());
            vasSupportEntity.setSupportContentId(contenID);
        }else if(supportList.getSupportType().equals("06")){

            MishuSupportEntity mishuSupportEntity=JSONObject.parseObject(entiry,MishuSupportEntity.class);
            mishuSupportEntity.setSuportId(supportList.getSupportId());
            mishuSupportEntity.setSupportContentId(contenID);
        }


        //SupportList supportList=JSONObject.parseObject(support_deal,SupportList.class);
        return null;
    }
}
