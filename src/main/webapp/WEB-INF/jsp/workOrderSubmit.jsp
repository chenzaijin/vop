<%--
  Created by IntelliJ IDEA.
  User: 陈载今
  Date: 2018/7/17
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交工单</title>
    <script type="text/javascript" src="../js/jquery.min.js"></script>
</head>
<body>
<div>
    <table>
        <tbody>
        <tr>
            <td><label>工单编号</label><input id="support_id" type="text"> </td>
            <td><label>工单类型</label><select id="support_type"><option value="01">网络使用类</option><option value="02">服务开通变更类</option>
                <option value="03">计费类</option><option value="04">充值类</option></select>
                <option value="05">增值业务类</option> <option value="06">漏电提醒类</option></td>
            <td><label>用户姓名</label><input id="username" type="text"></td>
        </tr>
        <tr>
            <td><label>用户手机号码</label><input id="phone_number" type="text"></td>
            <td><label>用户联系人姓名</label><input id="contact" type="text"></td>
            <td><label>用户联系人电话</label><input id="contact_number" type="text"></td>
        </tr>
        <tr>
            <td><label>转售企业联系人</label><input id="mvno_contact" type="text"></td>
            <td><label>转售企业联系电话</label><input id="mvno_contact_number" type="text"></td>
            <td></td>
        </tr>
        <tr>
            <td><label>工单级别</label><select id="support_level"><option value="common">一般</option><option value="emergency">紧急</option></select></td>
            <td><label>问题发生省分编码</label><select id="issue_province"></select></td>
            <td><label>问题发生地市编码</label><select id="issue_city"></select></td>
        </tr>
        <tr>
            <td><label>用户号码归属省编码</label><select id="phone_number_province"></select></td>
            <td><label>用户号码归属地市编码</label><select id="phone_number_city"></select></td>
            <td><label>重复派送工单标记</label><select id="repetition"><option value="false">否</option><option value="true">是</option></select></td>
        </tr>
        <tr>
            <td><label>原派送工单编号</label><input id="original_support_id" type="text"></td>
            <td><label>重复派单说明</label><textarea id="repetition_description"></textarea></td>
            <td></td>
        </tr>
        <tr>
            <td><label>核查处理情况</label><textarea id="present_condition"></textarea></td>
            <td><label>协查处理需求</label><textarea id="requirements"></textarea></td>
            <td></td>
        </tr>
        <!--网络使用类工单实体-->
        <div>

            <tr>
                <td><label>业务类别</label><select id="network_type"><option value="1">语音业务</option><option value="2">数据业务</option>
                    <option value="3">短信业务</option></select></td>
                <td><label>信号情况</label><select id="signal"><option value="1">正常</option><option value="2">信号弱/不稳定</option>
                    <option value="3">无信号</option></select></td>
                <td><label>故障现象</label><select id="symptom"><option value="1">拨打特定号码有问题</option><option value="2">拨打所有号码有问题</option></select></td>
            </tr>
            <tr>
                <td><label>无法主叫</label><select id="not_calling"><option value="1">忙音</option><option value="2">号码为空/错误</option>
                    <option value="3">无法连接/呼叫失败</option><option value="4">其他</option></select></td>
                <td><label>投诉问题描述</label><textarea id="issue_description"></textarea></td>
                <td></td>
            </tr>

        </div>

        <!--计费业务工单实体-->
        <div>
            <tr>
                <td><label>话单类型</label><select id="cdr_type"><option value="1">语音话单</option><option value="2">数据话单</option>
                    <option value="3">短信话单</option><option value="4">增值业务话单</option></select></td>
                <td><label>话单文件名</label><input id="cdr_file" type="text"></td>
                <td><label>话单编号</label><input id="cdr_number" type="text"></td>
            </tr>
            <tr>
                <td><label>投诉问题描述</label><textarea id="billing_issue_description"></textarea></td>
                <td></td>
                <td></td>
            </tr>
        </div>

        <!--增值业务工单实体-->
        <div>
            <tr>
                <td><label>手机操作系统</label><input id="system_type" type="text"></td>
                <td><label>增值业务类型</label><select id="vas_type"><option value="1">炫铃</option><option value="0">其他</option></select></td>
                <td><label>业务描述</label><textarea id="vas_description"></textarea></td>
            </tr>
            <tr>
                <td><label>投诉问题描述</label><textarea id="vas_issue_description"></textarea></td>
                <td></td>
                <td></td>
            </tr>
        </div>

        <!--充值类工单实体-->
        <div>
            <tr>
                <td><label>是否到帐</label><select id="paying_arrive"><option value="false">未到帐</option><option value="true">到帐</option></select></td>
                <td><label>充值号码</label><input id="recharge_phone_number" type="text"></td>
                <td><label>一卡充卡号</label><input id="card_number" type="text"></td>
            </tr>
            <tr>
                <td><label>充值时间</label><input id="recharge_date" type="text"></td>
                <td><label>业务流水号</label><input id="process_serial" type="text"></td>
                <td><label>充值金额</label><input id="payamount" type="text"></td>
            </tr>
            <tr>
                <td><label>投诉问题描述</label><textarea id="recharge_issue_description"></textarea></td>
                <td></td>
                <td></td>
            </tr>
        </div>

        <!--开通类投诉实体-->
        <div>
            <tr>
                <td><label>API 名称</label><input id="api_name" type="text"></td>
                <td><label>流水号</label><input id="swift_number" type="text"></td>
                <td><label>定单 ID</label><input id="order_id" type="text"></td>
            </tr>
            <tr>
                <td><label>投诉问题描述</label><textarea id="account_issue_description" type="text"></textarea></td>
                <td></td>
                <td></td>
            </tr>

        </div>

        <!--漏电提醒类工单实体-->
        <div>
            <tr>
                <td><label>投诉问题描述</label><textarea id="mishu_issue_description"></textarea></td>
                <td></td>
                <td></td>
            </tr>
        </div>

        <!--附件实体-->
        <div>
            <tr>
                <td><label>附件名称</label><input id="file_name" type="text"></td>
                <td><label>附件数据</label><input type="file"></td>
                <td></td>
            </tr>
        </div>

        <tr>
            <td><input type="button" value="提交"></td>
            <td><input type="button" value="取消"></td>
            <td></td>
        </tr>

        </tbody>
    </table>
</div>

</body>
</html>
