<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:set name="stylesheet" value="{'http://192.168.16.9/xieyang/squall/css/test.css'}" />
<s:set name="javascript" value="{'http://218.107.55.92/xy/test/js/template.min.js','http://218.107.55.92/xy/test/js/test.js'}" />

<div class="contacts">
  <div class=""><img width="20px" src=""/><span><s:property value="contact.fistName"/><s:property value="contact.lastName"/></span></div>
  <div class="tab"><span><a href="#">资料</a></span><span><a href="#">历史</a></span></div>
  <div class="aboutPhone">
    <div class="title">手机</div>
    <s:iterator value="contact.phone">
      <div class="label"><s:property value="label"/></div>
      <s:property value="value"/>
    </s:iterator>
  </div>
  <div class="aboutEmail">
    <div class="title">邮箱</div>
    <s:iterator value="contact.email">
      <div class="label"><s:property value="label"/></div>
      <s:property value="value"/>
    </s:iterator>
  </div>
  <div class="aboutPostalAddress">
    <div class="title">通讯地址</div>
    <s:iterator value="contact.postalAddress">
      <div class="label"><s:property value="label"/></div>
      <s:property value="state"/>省 <s:property value="city"/>市 <s:property value="street"/>
    </s:iterator>
  </div>
</div>
