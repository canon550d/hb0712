<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!--  
<div><img src="<s:url value='/img/logo.png' />"/></div>
-->

<div class="content">
    <p>新建工单</p>
    <ul>
        <li><a href="addWorkBill.aspx" class="first">新建工单</a></li>
    </ul>
</div>



<div class="content">
    <p>待处理</p>
    <ul>
        <li><a href="listTodo.do?v=view1&showType=mima" class="first">非游戏帐号修复</a></li>
        <li><a href="listTodo.do?v=view1&showType=huawu">话务</a></li>
        <li><a href="listTodo.do?v=view1&showType=vipmail">VIP邮箱</a></li>
    </ul>
</div>


<div class="content">
    <p>高级</p>
    <ul>
        <li><a href="listTodo.do?v=myFollowView" class="first">我的工单</a></li>
        <li><a href="query.do">检索</a></li>
        <li><a href="stat.do">数据统计</a></li>
        <li><a href="adminMain.do">高级管理</a></li>
        <li><a href="feedBack.aspx">反馈管理</a></li>
        <li><a href="reply_platform_index.aspx">快速恢复</a></li>
        <li><a href="extra/hc/index.jsp">VIP企业客户管理</a></li>
    </ul>
</div>