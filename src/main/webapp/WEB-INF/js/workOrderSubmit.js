

function WorkOrder() {

    this.support_id=$("#support_id").val();
    this.support_type=$("#support_type").val();
    this.username=$("#username").val();
    this.phone_number=$("#phone_number").val();
    this.contact=$("#contact").val();
    this.contact_number=$("#contact_number").val();
    this.mvno_contact=$("#mvno_contact").val();
    this.mvno_contact_number=$("#mvno_contact_number").val();
    this.support_level=$("#support_level").val();
    this.issue_province=$("#issue_province").val();
    this.issue_city=$("#issue_city").val();
    this.phone_number_province=$("#phone_number_province").val();
    this.phone_number_city=$("#phone_number_city").val();
    this.repetition=$("#repetition").val();
    this.original_support_id=$("#original_support_id").val();
    this.repetition_description=$("#repetition_description").val();
    this.present_condition=$("#present_condition").val();
    this.requirements=$("#requirements").val();

    <!--附件实体-->
    this.file_name=$("#file_name").val();
    this.file_data=$("#file_data").val();

}

function WorkOrderEntity() {

    var support_type=$("#support_type").val();
    <!--计费业务工单实体-->
    var network_type=$("#network_type").val();
    var signal=$("#signal").val();
    var symptom=$("#symptom").val();
    var not_calling=$("#not_calling").val();
    var issue_description=$("#issue_description").val();

    <!--计费类工单实体-->
    var cdr_type=$("#cdr_type").val();
    var cdr_file=$("#cdr_file").val();
    var cdr_number=$("#cdr_number").val();
    var billing_issue_description=$("#billing_issue_description").val();

    <!--增值业务工单实体-->
    var system_type=$("#system_type").val();
    var vas_type=$("#vas_type").val();
    var vas_description=$("#vas_description").val();
    var vas_issue_description=$("#vas_issue_description").val();

    <!--充值类工单实体-->
    var paying_arrive=$("#paying_arrive").val();
    var recharge_phone_number=$("#recharge_phone_number").val();
    var card_number=$("#card_number").val();
    var recharge_date=$("#recharge_date").val();
    var process_serial=$("#process_serial").val();
    var payamount=$("#payamount").val();
    var recharge_issue_description=$("#recharge_issue_description").val();

    <!--开通类投诉实体-->
    var api_name=$("#api_name").val();
    var swift_number=$("#swift_number").val();
    var order_id=$("#order_id").val();
    var account_issue_description=$("#account_issue_description").val();

    <!--漏电提醒类工单实体-->
    var mishu_issue_description=$("#mishu_issue_description").val();

}