<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
Hello World
<div>
    <s:property value="workStands.user.name"/>

    <s:iterator value="workStands.works">
    <fieldset>
    <legend>work</legend>
    <s:property value="text"/>
    <s:property value="workTime"/>
        <s:iterator value="conversations">
        <fieldset>
        <legend>conversation</legend>
            <a href="/bnubaby"><s:property value="speaker.name"/></a>：
            <s:property value="text"/> (今天 16:01) 
        </fieldset>
        </s:iterator>
    </fieldset>
    </s:iterator>
</div>