

function WorkOrder() {

    var support_deal={};
    var ={};

    support_deal.support_id=$("#support_id").val();
    if(support_deal.support_id==null||support_deal.support_id==""){
        alert("工单编号不能为空");
        return;
    }
    support_deal.support_type=$("#support_type").val();
    if(support_deal.support_type==null||support_deal.support_type==""){
        alert("工单类型不能为空");
        return;
    }
    support_deal.username=$("#username").val();
    if(support_deal.username==null||support_deal.username==""){
        alert("用户姓名不能为空");
        return;
    }
    support_deal.phone_number=$("#phone_number").val();
    if(support_deal.phone_number==null||support_deal.phone_number==""){
        alert("用户手机号码不能为空");
        return;
    }
    support_deal.contact=$("#contact").val();
    if(support_deal.contact==null||support_deal.contact==""){
        alert("用户联系人姓名不能为空");
        return;
    }
    support_deal.contact_number=$("#contact_number").val();
    if(support_deal.contact_number==null||support_deal.contact_number==""){
        alert("用户联系人电话不能为空");
        return;
    }
    support_deal.mvno_contact=$("#mvno_contact").val();
    if(support_deal.mvno_contact==null||support_deal.mvno_contact==""){
        alert("转售企业联系人不能为空");
        return;
    }
    support_deal.mvno_contact_number=$("#mvno_contact_number").val();
    if(support_deal.mvno_contact_number==null||support_deal.mvno_contact_number==""){
        alert("转售企业联系电话不能为空");
        return;
    }

    workOrder.support_level=$("#support_level").val();
    if(workOrder.support_level==null||workOrder.support_level==""){
        alert("工单级别不能为空");
        return;
    }
    workOrder.issue_province=$("#issue_province").val();
    if(workOrder.issue_province==null||workOrder.issue_province==""){
        alert("问题发生省分编码不能为空");
        return;
    }
    workOrder.issue_city=$("#issue_city").val();
    if(workOrder.issue_city==null||workOrder.issue_city==""){
        alert("问题发生地市编码不能为空");
        return;
    }
    workOrder.phone_number_province=$("#phone_number_province").val();
    if(workOrder.phone_number_province==null||workOrder.phone_number_province==""){
        alert("用户号码归属省编码");
        return;
    }
    workOrder.phone_number_city=$("#phone_number_city").val();
    if(workOrder.phone_number_city==null||workOrder.phone_number_city==""){
        alert("用户号码归属地市编码不能为空");
        return;
    }
    workOrder.repetition=$("#repetition").val();
    workOrder.original_support_id=$("#original_support_id").val();
    workOrder.repetition_description=$("#repetition_description").val();

    if(workOrder.repetition==true){
        if(workOrder.original_support_id==null||workOrder.original_support_id==""){
            alert("重复派送工单,原派送工单编号不能为空");
            return;
        }else if(workOrder.repetition_description==null||workOrder.repetition_description==""){
            alert("重复派送工单,重复派单说明不能为空");
            return;
        }
    }

    workOrder.present_condition=$("#present_condition").val();
    if(workOrder.present_condition==null||workOrder.present_condition==""){
        alert("核查处理情况不能为空");
        return;
    }
    workOrder.requirements=$("#requirements").val();
    if(workOrder.requirements==null||workOrder.requirements==""){
        alert("协查处理需求不能为空");
        return;
    }


    if(workOrder.support_type=='01') {
        <!--网络使用类工单实体-->
        workOrder.network_type = $("#network_type").val();
        workOrder.signal = $("#signal").val();
        workOrder.symptom = $("#symptom").val();
        workOrder.not_calling = $("#not_calling").val();
        workOrder.issue_description = $("#issue_description").val();
        if(workOrder.network_type==1){
            if(workOrder.signal==null||workOrder.signal==""){
                alert("语音业务时,信号情况不能为空");
                return;
            }else if(workOrder.symptom==null||workOrder.symptom==""){
                alert("语音业务时,故障现象不能为空");
                return;
            }else if(workOrder.not_calling==null||workOrder.not_calling==""){
                alert("语音业务时,无法主叫不能为空");
                return;
            }
        }
    }else if(workOrder.support_type=='03'){
        <!--计费类工单实体-->
        workOrder.cdr_type=$("#cdr_type").val();
        workOrder.cdr_file=$("#cdr_file").val();
        workOrder.cdr_number=$("#cdr_number").val();
        workOrder.billing_issue_description=$("#billing_issue_description").val();
        if(workOrder.requirements==null||workOrder.requirements==""){
            alert("协查处理需求不能为空");
            return;
        }
    }else if(workOrder.support_type=='05'){
        <!--增值业务工单实体-->
        workOrder.system_type=$("#system_type").val();
        workOrder.vas_type=$("#vas_type").val();
        workOrder.vas_description=$("#vas_description").val();
        workOrder.vas_issue_description=$("#vas_issue_description").val();
        if(workOrder.vas_issue_description==null||workOrder.vas_issue_description==""){
            alert("投诉问题描述不能为空");
            return;
        }
    }else if(workOrder.support_type=='04'){
        <!--充值类工单实体-->
        workOrder.paying_arrive=$("#paying_arrive").val();
        workOrder.recharge_phone_number=$("#recharge_phone_number").val();
        if(workOrder.recharge_phone_number==null||workOrder.recharge_phone_number==""){
            alert("充值号码不能为空");
            return;
        }
        workOrder.card_number=$("#card_number").val();
        workOrder.recharge_date=$("#recharge_date").val();
        workOrder.process_serial=$("#process_serial").val();
        workOrder.payamount=$("#payamount").val();
        workOrder.recharge_issue_description=$("#recharge_issue_description").val();
        if(workOrder.recharge_phone_number==null||workOrder.recharge_phone_number==""){
            alert("投诉问题描述不能为空");
            return;
        }
        if(workOrder.paying_arrive==false){
            if(workOrder.card_number==null||workOrder.card_number==""){
                alert("一卡充卡号不能为空");
                return;
            }
            if(workOrder.recharge_date==null||workOrder.recharge_date==""){
                alert("充值时间不能为空");
                return;
            }
        }else{
            if(workOrder.process_serial==null||workOrder.process_serial==""){
                alert("业务流水号不能为空");
                return;
            }
            if(workOrder.payamount==null||workOrder.payamount==""){
                alert("充值金额不能为空");
                return;
            }
        }

    }else if(workOrder.support_type=='02'){
        <!--开通类投诉实体-->
        workOrder.api_name=$("#api_name").val();
        if(workOrder.api_name==null||workOrder.api_name==""){
            alert("API名称不能为空");
            return;
        }
        workOrder.swift_number=$("#swift_number").val();
        if(workOrder.swift_number==null||workOrder.swift_number==""){
            alert("流水号不能为空");
            return;
        }
        workOrder.order_id=$("#order_id").val();
        if(workOrder.order_id==null||workOrder.order_id==""){
            alert("定单 ID不能为空");
            return;
        }
        workOrder.account_issue_description=$("#account_issue_description").val();
        if(workOrder.account_issue_description==null||workOrder.account_issue_description==""){
            alert("投诉问题描述不能为空");
            return;
        }
    }else if(workOrder.support_type=='06'){
        <!--漏电提醒类工单实体-->
        workOrder.mishu_issue_description=$("#mishu_issue_description").val();
        if(workOrder.mishu_issue_description==null||workOrder.mishu_issue_description==""){
            alert("投诉问题描述不能为空");
            return;
        }
    }
    <!--附件实体-->
    workOrder.file_name=$("#file_name").val();
    workOrder.file_data=$("#file_data").val();

}

function selectWorkType() {
    var support_type=$("#support_type").val();

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
        data: "support_deal="+support_deal,
        dataType: "json",
        success: function(data){
            $('#resText').empty();   //清空resText里面的所有内容
            var html = '';
            $.each(data, function(commentIndex, comment){
                html += '<div class="comment"><h6>' + comment['username']
                    + ':</h6><p class="para"' + comment['content']
                    + '</p></div>';
            });
            $('#resText').html(html);
        }
    });
});
