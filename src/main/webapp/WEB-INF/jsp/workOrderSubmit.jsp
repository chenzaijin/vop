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
    <script type="text/javascript" src="../js/workOrderSubmit.js"></script>
    <style type="text/css">

        /* textarea 自适应父容器大小 */
        .comments {
            vertical-align: top;
            height: 60px;
            width: 70%; /*自动适应父布局宽度*/
            overflow: auto;
            word-break: break-all;
            /*在ie中解决断行问题(防止自动变为在一行显示，主要解决ie兼容问题，ie8中当设宽度为100%时，文本域类容超过一行时，当我们双击文本内容就会自动变为一行显示，所以只能用ie的专有断行属性“word-break或word-wrap”控制其断行)*/
        }

        label{
            display: inline-block;
            vertical-align: middle;
            color: #000;
            font-weight: normal;
        }

    </style>
</head>
<body>
<div>
    <table>
        <tbody>
        <tr>
            <td><label><span class="redfont">*</span>工单编号</label><input id="supportId" type="text" align="right"> </td>
            <td><label><span class="redfont">*</span>工单类型</label><select id="supportType" align="right" onchange="selectWorkType()"><option value="01">网络使用类</option><option value="02">服务开通变更类</option>
                <option value="03">计费类</option><option value="04">充值类</option><option value="05">增值业务类</option> <option value="06">漏电提醒类</option></select>
                </td>
            <td><label><span class="redfont">*</span>用户姓名</label><input id="username" type="text" align="right"></td>
        </tr>
        <tr>
            <td><label><span class="redfont">*</span>用户手机号码</label><input id="phoneNumber" type="text"></td>
            <td><label><span class="redfont">*</span>用户联系人姓名</label><input id="contact" type="text"></td>
            <td><label><span class="redfont">*</span>用户联系人电话</label><input id="contactNumber" type="text"></td>
        </tr>
        <tr>
            <td><label><span class="redfont">*</span>转售企业联系人</label><input id="mvnoContact" type="text"></td>
            <td><label><span class="redfont">*</span>转售企业联系电话</label><input id="mvnoContactNumber" type="text"></td>
            <td></td>
        </tr>
        <tr>
            <td><label><span class="redfont">*</span>工单级别</label><select id="supportLevel"><option value="common">一般</option><option value="emergency">紧急</option></select></td>
            <td><label><span class="redfont">*</span>问题发生省分编码</label><select id="issueProvince"></select></td>
            <td><label><span class="redfont">*</span>问题发生地市编码</label><select id="issueCity"></select></td>
        </tr>
        <tr>
            <td><label><span class="redfont">*</span>用户号码归属省编码</label><select id="phoneNumberProvince"></select></td>
            <td><label><span class="redfont">*</span>用户号码归属地市编码</label><select id="phoneNumberCity"></select></td>
            <td><label>重复派送工单标记</label><select id="repetition"><option value="false">否</option><option value="true">是</option></select></td>
        </tr>
        <tr>
            <td><label>原派送工单编号</label><input id="originalSupportId" type="text"></td>
            <td colspan="2"><label>重复派单说明</label><textarea id="repetitionDescription" class="comments"></textarea></td>
        </tr>
        <tr>
            <td colspan="3"><label ><span class="redfont">*</span>核查处理情况</label><textarea id="presentCondition" class="comments"></textarea></td>
        </tr>
        <tr>
            <td colspan="3"><label><span class="redfont">*</span>协查处理需求</label><textarea id="requirements" class="comments"></textarea></td>
        </tr>
        <!--网络使用类工单实体-->
        <tbody id="network" class="entityTbody">
            <tr>
                <td colspan="3">网络使用类工单实体</td>
            </tr>
            <tr>
                <td><label><span class="redfont">*</span>业务类别</label><select id="networkType"><option value="1">语音业务</option><option value="2">数据业务</option>
                    <option value="3">短信业务</option></select></td>
                <td><label>信号情况</label><select id="signal"><option value="1">正常</option><option value="2">信号弱/不稳定</option>
                    <option value="3">无信号</option></select></td>
                <td><label>故障现象</label><select id="symptom"><option value="1">拨打特定号码有问题</option><option value="2">拨打所有号码有问题</option></select></td>
            </tr>
            <tr>
                <td><label>无法主叫</label><select id="notCalling"><option value="1">忙音</option><option value="2">号码为空/错误</option>
                    <option value="3">无法连接/呼叫失败</option><option value="4">其他</option></select></td>
                <td colspan="2"><label><span class="redfont">*</span>投诉问题描述</label><textarea id="issueDescription" class="comments"></textarea></td>
            </tr>

        </tbody>

        <!--计费业务工单实体-->
        <tbody id="billing" style="display:none;" class="entityTbody">
            <tr>
                <td colspan="3">计费业务工单实体</td>
            </tr>
            <tr>
                <td><label><span class="redfont">*</span>话单类型</label><select id="cdrType"><option value="1">语音话单</option><option value="2">数据话单</option>
                    <option value="3">短信话单</option><option value="4">增值业务话单</option></select></td>
                <td><label>话单文件名</label><input id="cdrFile" type="text"></td>
                <td><label>话单编号</label><input id="cdrNumber" type="text"></td>
            </tr>
            <tr>
                <td colspan="3"><label><span class="redfont">*</span>投诉问题描述</label><textarea id="billing_issue_description" class="comments"></textarea></td>
            </tr>
        </tbody>

        <!--增值业务工单实体-->
        <tbody id="vas" style="display:none;" class="entityTbody">
            <tr>
                <td colspan="3">增值业务工单实体</td>
            </tr>
            <tr>
                <td><label>手机操作系统</label><input id="systemType" type="text"></td>
                <td><label><span class="redfont">*</span>增值业务类型</label><select id="vasType"><option value="1">炫铃</option><option value="0">其他</option></select></td>
                <td></td>
            </tr>
            <tr>
                <td colspan="3"><label>业务描述</label><textarea id="vasDescription" class="comments"></textarea></td>
            </tr>
            <tr>
                <td colspan="3"><label><span class="redfont">*</span>投诉问题描述</label><textarea id="vas_issue_description" class="comments"></textarea></td>
            </tr>
        </tbody>

        <!--充值类工单实体-->
        <tbody id="recharge" style="display:none;" class="entityTbody">
            <tr>
                <td colspan="3">充值类工单实体(充值未到帐需填写 充值时间、 一卡充卡号 字段，充值到帐需填写 业务流水号、 充值金额 字段)</td>
            </tr>
            <tr>
                <td><label><span class="redfont">*</span>是否到帐</label><select id="payingArrive"><option value="false">未到帐</option><option value="true">到帐</option></select></td>
                <td><label><span class="redfont">*</span>充值号码</label><input id="recharge_phone_number" type="text"></td>
                <td><label>一卡充卡号</label><input id="cardNumber" type="text"></td>
            </tr>
            <tr>
                <td><label>充值时间</label><input id="rechargeDate" type="text"></td>
                <td><label>业务流水号</label><input id="processSerial" type="text"></td>
                <td><label>充值金额</label><input id="payamount" type="text"></td>
            </tr>
            <tr>
                <td colspan="3"><label><span class="redfont">*</span>投诉问题描述</label><textarea id="recharge_issue_description" class="comments"></textarea></td>
            </tr>
        </tbody>

        <!--开通类投诉实体-->
        <tbody id="account" style="display:none;" class="entityTbody">
            <tr>
                <td colspan="3">开通类投诉实体</td>
            </tr>
            <tr>
                <td><label><span class="redfont">*</span>API 名称</label><input id="apiName" type="text"></td>
                <td><label><span class="redfont">*</span>流水号</label><input id="swiftNumber" type="text"></td>
                <td><label><span class="redfont">*</span>定单 ID</label><input id="orderId" type="text"></td>
            </tr>
            <tr>
                <td colspan="3"><label><span class="redfont">*</span>投诉问题描述</label><textarea id="account_issue_description"  class="comments"></textarea></td>
            </tr>

        </tbody>

        <!--漏电提醒类工单实体-->
        <tbody id="mishu" style="display:none" class="entityTbody">
            <tr>
                <td colspan="3">漏电提醒类工单实体</td>
            </tr>
            <tr>
                <td colspan="3"><label><span class="redfont">*</span>投诉问题描述</label><textarea id="mishu_issue_description" class="comments"></textarea></td>
            </tr>
        </tbody>

        <!--附件实体-->
        <div id="attachment">
            <tr>
                <td colspan="3">附件实体</td>
            </tr>
            <tr>
                <td><label>附件名称</label><input id="file_name" type="text"></td>
                <td><label>附件数据</label><input type="file"></td>
                <td></td>
            </tr>
        </div>
        <tr>
            <td colspan="3"><label>备注</label><textarea id="remark" class="comments"></textarea></td>
        </tr>
        <tr>
            <td><input type="button" value="提交" id="send"></td>
            <td><input type="button" value="取消" id="cancle"></td>
            <td></td>
        </tr>

        </tbody>
    </table>
</div>

</body>
</html>
