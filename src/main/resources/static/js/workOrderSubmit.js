

function WorkOrder() {

    var support_deal={};
    var support_content={};
    var entiry={};
    //support_deal
    support_deal.supportId=$("#supportId").val();
    if(support_deal.supportId==null||support_deal.supportId==""){
        alert("工单编号不能为空");
        return;
    }
    support_deal.supportType=$("#support_type").val();
    if(support_deal.supportType==null||support_deal.supportType==""){
        alert("工单类型不能为空");
        return;
    }
    support_deal.username=$("#username").val();
    if(support_deal.username==null||support_deal.username==""){
        alert("用户姓名不能为空");
        return;
    }
    support_deal.phoneNumber=$("#phoneNumber").val();
    if(support_deal.phoneNumber==null||support_deal.phoneNumber==""){
        alert("用户手机号码不能为空");
        return;
    }
    support_deal.contact=$("#contact").val();
    if(support_deal.contact==null||support_deal.contact==""){
        alert("用户联系人姓名不能为空");
        return;
    }
    support_deal.contactNumber=$("#contactNumber").val();
    if(support_deal.contactNumber==null||support_deal.contactNumber==""){
        alert("用户联系人电话不能为空");
        return;
    }
    support_deal.mvnoContact=$("#mvnoContact").val();
    if(support_deal.mvnoContact==null||support_deal.mvnoContact==""){
        alert("转售企业联系人不能为空");
        return;
    }
    support_deal.mvnoContactNumber=$("#mvnoContactNumber").val();
    if(support_deal.mvnoContactNumber==null||support_deal.mvnoContactNumber==""){
        alert("转售企业联系电话不能为空");
        return;
    }
    support_deal.remark=$("#remark").val();



    //support_content
    support_content.supportLevel=$("#supportLevel").val();
    if(support_content.supportLevel==null||support_content.supportLevel==""){
        alert("工单级别不能为空");
        return;
    }
    support_content.issueProvince=$("#issueProvince").val();
    if(support_content.issueProvince==null||support_content.issueProvince==""){
        alert("问题发生省分编码不能为空");
        return;
    }
    support_content.issueCity=$("#issueCity").val();
    if(support_content.issueCity==null||support_content.issueCity==""){
        alert("问题发生地市编码不能为空");
        return;
    }
    support_content.phoneNumberProvince=$("#phoneNumberProvince").val();
    if(support_content.phoneNumberProvince==null||support_content.phoneNumberProvince==""){
        alert("用户号码归属省编码");
        return;
    }
    support_content.phoneNumberCity=$("#phoneNumberCity").val();
    if(support_content.phoneNumberCity==null||support_content.phoneNumberCity==""){
        alert("用户号码归属地市编码不能为空");
        return;
    }
    support_content.repetition=$("#repetition").val();
    support_content.originalSupportId=$("#originalSupportId").val();
    support_content.repetition_description=$("#repetition_description").val();

    if(support_content.repetition==true){
        if(support_content.originalSupportId==null||support_content.originalSupportId==""){
            alert("重复派送工单,原派送工单编号不能为空");
            return;
        }else if(support_content.repetitionDescription==null||support_content.repetitionDescription==""){
            alert("重复派送工单,重复派单说明不能为空");
            return;
        }
    }

    support_content.presentCondition=$("#presentCondition").val();
    if(support_content.presentCondition==null||support_content.presentCondition==""){
        alert("核查处理情况不能为空");
        return;
    }
    support_content.requirements=$("#requirements").val();
    if(support_content.requirements==null||support_content.requirements==""){
        alert("协查处理需求不能为空");
        return;
    }


    //entiry
    if(support_deal.supportType=='01') {
        <!--网络使用类工单实体-->
        entiry.networkType = $("#networkType").val();
        entiry.signal = $("#signal").val();
        entiry.symptom = $("#symptom").val();
        entiry.notCalling = $("#notCalling").val();
        entiry.issueDescription = $("#issueDescription").val();
        if(entiry.issueDescription==null||entiry.issueDescription==""){
            alert("投诉问题描述不能为空");
            return;
        }
        if(entiry.networkType==1){
            if(entiry.signal==null||entiry.signal==""){
                alert("语音业务时,信号情况不能为空");
                return;
            }else if(entiry.symptom==null||entiry.symptom==""){
                alert("语音业务时,故障现象不能为空");
                return;
            }else if(entiry.notCalling==null||entiry.notCalling==""){
                alert("语音业务时,无法主叫不能为空");
                return;
            }
        }
    }else if(support_deal.supportType=='03'){
        <!--计费类工单实体-->
        entiry.cdrType=$("#cdrType").val();
        entiry.cdrFile=$("#cdrFile").val();
        entiry.cdrNumber=$("#cdrNumber").val();
        entiry.issueDescription=$("#billing_issue_description").val();
        if(entiry.issueDescription==null||entiry.issueDescription==""){
            alert("投诉问题描述不能为空");
            return;
        }
    }else if(support_deal.supportType=='05'){
        <!--增值业务工单实体-->
        entiry.systemType=$("#systemType").val();
        entiry.vasType=$("#vasType").val();
        entiry.vasDescription=$("#vasDescription").val();
        entiry.ssueDescription=$("#vas_issue_description").val();
        if(entiry.ssueDescription==null||entiry.ssueDescription==""){
            alert("投诉问题描述不能为空");
            return;
        }
    }else if(support_deal.supportType=='04'){
        <!--充值类工单实体-->
        entiry.payingArrive=$("#payingArrive").val();
        entiry.phoneNumber=$("#recharge_phone_number").val();
        if(entiry.phoneNumber==null||entiry.phoneNumber==""){
            alert("充值号码不能为空");
            return;
        }
        entiry.cardNumber=$("#cardNumber").val();
        entiry.rechargeDate=$("#rechargeDate").val();
        entiry.processSerial=$("#processSerial").val();
        entiry.payamount=$("#payamount").val();
        entiry.issueDescription=$("#issue_description").val();
        if(entiry.issueDescription==null||entiry.issueDescription==""){
            alert("投诉问题描述不能为空");
            return;
        }
        if(entiry.payingArrive==false){
            if(entiry.cardNumber==null||entiry.cardNumber==""){
                alert("一卡充卡号不能为空");
                return;
            }
            if(entiry.rechargeDate==null||entiry.rechargeDate==""){
                alert("充值时间不能为空");
                return;
            }
        }else{
            if(entiry.processSerial==null||entiry.processSerial==""){
                alert("业务流水号不能为空");
                return;
            }
            if(entiry.payamount==null||entiry.payamount==""){
                alert("充值金额不能为空");
                return;
            }
        }

    }else if(support_deal.supportType=='02'){
        <!--开通类投诉实体-->
        entiry.apiName=$("#apiName").val();
        if(entiry.apiName==null||entiry.apiName==""){
            alert("API名称不能为空");
            return;
        }
        entiry.swiftNumber=$("#swiftNumber").val();
        if(entiry.swiftNumber==null||entiry.swiftNumber==""){
            alert("流水号不能为空");
            return;
        }
        entiry.orderId=$("#orderId").val();
        if(entiry.orderId==null||entiry.orderId==""){
            alert("定单 ID不能为空");
            return;
        }
        entiry.issueDescription=$("#account_issue_description").val();
        if(entiry.issueDescription==null||entiry.issueDescription==""){
            alert("投诉问题描述不能为空");
            return;
        }
    }else if(support_deal.supportType=='06'){
        <!--漏电提醒类工单实体-->
        entiry.issueDescription=$("#mishu_issue_description").val();
        if(entiry.issueDescription==null||entiry.issueDescription==""){
            alert("投诉问题描述不能为空");
            return;
        }
    }
    <!--附件实体-->
    //workOrder.file_name=$("#file_name").val();
    //workOrder.file_data=$("#file_data").val();

    return "support_deal="+JSON.stringify(support_deal)+"&support_content="+support_content+"&entiry="+entiry;

}

function selectWorkType() {
    var support_type=$("#supportType").val();

    if(support_type=="01"){
        $(".entityTbody").hide();
        $("#network").show();
        $("#attachment").show();
    }else if(support_type=="02"){
        $(".entityTbody").hide();
        $("#account").show();
        $("#attachment").show();
    }else if(support_type=="03"){
        $(".entityTbody").hide();
        $("#billing").show();
        $("#attachment").show();
    }else if(support_type=="04"){
        $(".entityTbody").hide();
        $("#recharge").show();
        $("#attachment").show();
    }else if(support_type=="05"){
        $(".entityTbody").hide();
        $("#vas").show();
        $("#attachment").show();
    }else if(support_type=="06"){
        $(".entityTbody").hide();
        $("#mishu").show();
        $("#attachment").show();
    }
    
}

$('#send').click(function(){

    $.ajax({
        type: "post",
        url: "workOrderSubmit",
        data: WorkOrder(),
        dataType: "json",
        success: function(data){

        }
    });
});
