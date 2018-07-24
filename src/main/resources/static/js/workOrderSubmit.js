

function WorkOrder() {

    var support_deal={};
    var support_content={};
    var entiry={};
    //support_deal
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



    //support_content
    support_content.support_level=$("#support_level").val();
    if(support_content.support_level==null||support_content.support_level==""){
        alert("工单级别不能为空");
        return;
    }
    support_content.issue_province=$("#issue_province").val();
    if(support_content.issue_province==null||support_content.issue_province==""){
        alert("问题发生省分编码不能为空");
        return;
    }
    support_content.issue_city=$("#issue_city").val();
    if(support_content.issue_city==null||support_content.issue_city==""){
        alert("问题发生地市编码不能为空");
        return;
    }
    support_content.phone_number_province=$("#phone_number_province").val();
    if(support_content.phone_number_province==null||support_content.phone_number_province==""){
        alert("用户号码归属省编码");
        return;
    }
    support_content.phone_number_city=$("#phone_number_city").val();
    if(support_content.phone_number_city==null||support_content.phone_number_city==""){
        alert("用户号码归属地市编码不能为空");
        return;
    }
    support_content.repetition=$("#repetition").val();
    support_content.original_support_id=$("#original_support_id").val();
    support_content.repetition_description=$("#repetition_description").val();

    if(support_content.repetition==true){
        if(support_content.original_support_id==null||support_content.original_support_id==""){
            alert("重复派送工单,原派送工单编号不能为空");
            return;
        }else if(support_content.repetition_description==null||support_content.repetition_description==""){
            alert("重复派送工单,重复派单说明不能为空");
            return;
        }
    }

    support_content.present_condition=$("#present_condition").val();
    if(support_content.present_condition==null||support_content.present_condition==""){
        alert("核查处理情况不能为空");
        return;
    }
    support_content.requirements=$("#requirements").val();
    if(support_content.requirements==null||support_content.requirements==""){
        alert("协查处理需求不能为空");
        return;
    }


    //entiry
    if(support_deal.support_type=='01') {
        <!--网络使用类工单实体-->
        entiry.network_type = $("#network_type").val();
        entiry.signal = $("#signal").val();
        entiry.symptom = $("#symptom").val();
        entiry.not_calling = $("#not_calling").val();
        entiry.issue_description = $("#issue_description").val();
        if(entiry.network_type==1){
            if(entiry.signal==null||entiry.signal==""){
                alert("语音业务时,信号情况不能为空");
                return;
            }else if(entiry.symptom==null||entiry.symptom==""){
                alert("语音业务时,故障现象不能为空");
                return;
            }else if(entiry.not_calling==null||entiry.not_calling==""){
                alert("语音业务时,无法主叫不能为空");
                return;
            }
        }
    }else if(support_deal.support_type=='03'){
        <!--计费类工单实体-->
        entiry.cdr_type=$("#cdr_type").val();
        entiry.cdr_file=$("#cdr_file").val();
        entiry.cdr_number=$("#cdr_number").val();
        entiry.issue_description=$("#issue_description").val();
        if(entiry.issue_description==null||entiry.issue_description==""){
            alert("投诉问题描述不能为空");
            return;
        }
    }else if(support_deal.support_type=='05'){
        <!--增值业务工单实体-->
        entiry.system_type=$("#system_type").val();
        entiry.vas_type=$("#vas_type").val();
        entiry.vas_description=$("#vas_description").val();
        entiry.vas_issue_description=$("#vas_issue_description").val();
        if(entiry.issue_description==null||entiry.issue_description==""){
            alert("投诉问题描述不能为空");
            return;
        }
    }else if(support_deal.support_type=='04'){
        <!--充值类工单实体-->
        entiry.paying_arrive=$("#paying_arrive").val();
        entiry.recharge_phone_number=$("#recharge_phone_number").val();
        if(entiry.recharge_phone_number==null||entiry.recharge_phone_number==""){
            alert("充值号码不能为空");
            return;
        }
        entiry.card_number=$("#card_number").val();
        entiry.recharge_date=$("#recharge_date").val();
        entiry.process_serial=$("#process_serial").val();
        entiry.payamount=$("#payamount").val();
        entiry.issue_description=$("#issue_description").val();
        if(entiry.issue_description==null||entiry.issue_description==""){
            alert("投诉问题描述不能为空");
            return;
        }
        if(entiry.paying_arrive==false){
            if(entiry.card_number==null||entiry.card_number==""){
                alert("一卡充卡号不能为空");
                return;
            }
            if(entiry.recharge_date==null||entiry.recharge_date==""){
                alert("充值时间不能为空");
                return;
            }
        }else{
            if(entiry.process_serial==null||entiry.process_serial==""){
                alert("业务流水号不能为空");
                return;
            }
            if(entiry.payamount==null||entiry.payamount==""){
                alert("充值金额不能为空");
                return;
            }
        }

    }else if(support_deal.support_type=='02'){
        <!--开通类投诉实体-->
        entiry.api_name=$("#api_name").val();
        if(entiry.api_name==null||entiry.api_name==""){
            alert("API名称不能为空");
            return;
        }
        entiry.swift_number=$("#swift_number").val();
        if(entiry.swift_number==null||entiry.swift_number==""){
            alert("流水号不能为空");
            return;
        }
        entiry.order_id=$("#order_id").val();
        if(entiry.order_id==null||entiry.order_id==""){
            alert("定单 ID不能为空");
            return;
        }
        entiry.issue_description=$("#account_issue_description").val();
        if(entiry.issue_description==null||entiry.issue_description==""){
            alert("投诉问题描述不能为空");
            return;
        }
    }else if(support_deal.support_type=='06'){
        <!--漏电提醒类工单实体-->
        entiry.issue_description=$("#mishu_issue_description").val();
        if(entiry.issue_description==null||entiry.issue_description==""){
            alert("投诉问题描述不能为空");
            return;
        }
    }
    <!--附件实体-->
    //workOrder.file_name=$("#file_name").val();
    //workOrder.file_data=$("#file_data").val();

    return ""+""+"";

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
