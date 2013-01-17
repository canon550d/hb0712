<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:set name="stylesheet" value="{'http://218.107.55.92/xy/test/css/test.css'}" />
<s:set name="javascript" value="{'http://218.107.55.92/xy/test/js/template.min.js','http://218.107.55.92/xy/test/js/test.js'}" />

<div class="content">
    <p class="contentTitle">#01</p>
    <table>
        <tr><td>*帐号：</td><td><input type="text"/></td><td></td><td></td></tr>
        <tr><td>*姓名：</td><td><input type="text"/></td><td></td><td></td></tr>
        <tr><td>主叫号码：</td><td><input type="text"/></td><td>联系电话：</td><td><input type="text"/></td></tr>
        <tr><td>电子邮件：</td><td><input type="text"/></td><td>省市：</td><td><select><option>湖北</option></select><select><option>武汉</option></select></td></tr>
        <tr><td>客户类型：</td><td></td><td></td><td></td></tr>
    </table>
</div>

<div class="content">
    <p class="contentTitle">#03 日志</p>
    <div class="feed_lists">
      <s:iterator value="workStands.works">
      <dl class="feed_list">
        <dt class="face">
          <a href="javascript:;"><img height="50" width="50" src="<s:url value='/img/face.jpg' />" /></a>
        </dt>
        <dd class="content">
          <a class="W_blkarrow W_bglinka hover" title="展开屏蔽选项" href="javascript:;"><cite class="arr_m"></cite></a>
          <p>
            <a href="javascript:;"> <s:property value="human.name"/></a>：
            <em><s:property value="text"/></em>
          </p>
          <p class="info W_linkb W_textb">
            <span>
              <a href="javascript:void(0);">骚扰</a>
              <i class="W_vline">|</i>
              <a href="javascript:void(0);">解答</a>
              <i class="W_vline">|</i>
              <a href="javascript:void(0);">回复(2)</a>
            </span>
            <a class="date" href="javascript:;"><s:property value="workTime"/></a> 待跟进
            <em class="hover"></em>
          </p>
        </dd>
      </dl>
      </s:iterator>

      <% for(int i=0; i<2; i++){%>
      <dl class="feed_list">
        <dt class="face">
          <a href="javascript:;"><img height="50" width="50" src="<s:url value='/img/face.jpg' />" /></a>
        </dt>
        <dd class="content">
          <a class="W_blkarrow W_bglinka hover" title="展开屏蔽选项" href="javascript:;"><cite class="arr_m"></cite></a>
          <p>
            <a href="javascript:;"> 刘永</a>：
            <em>尼康D600传感器证实由索尼制造！Chipworks网站通过对尼康D600传感器进行拆解后证实，D600上搭载的传感器确由索尼制造，传感器型号IMX128L。 在尼康今年发布的单反相机中，D600、D800/D800E采用索尼传感器，其余均由尼康自行设计。</em>
          </p>
          <p class="info W_linkb W_textb">
            <span>
              <a href="javascript:void(0);">骚扰</a>
              <i class="W_vline">|</i>
              <a href="javascript:void(0);">解答</a>
              <i class="W_vline">|</i>
              <a href="javascript:void(0);">回复(2)</a>
            </span>
            <a class="date" href="javascript:;">2012-11-08 00:36</a> 待跟进
            <em class="hover"></em>
          </p>
          <!-- /回复/ -->
          <div class="repeat W_textc W_linecolor W_bgcolor" style="display:;">
            <div class="arrow W_bgcolor_arrow">
            </div>
            <div class="private">
            </div>
            <div class="input clearfix">
              <div>
                <textarea name="" rows="" cols="" style="margin: 0px 0px 3px; padding: 4px 4px 0px; border-color: rgb(198, 198, 198); border-style: solid; border-width: 1px; font-size: 12px; font-family: Tahoma,宋体; word-wrap: break-word; line-height: 18px; overflow: hidden; outline: medium none; height: 20px;"></textarea>
              </div>
              <div class="action clearfix"></div>
              <p class="btn">
                <a class="W_btn_b btn_noloading" onclick="return false" href="####">
                  <span>
                    <b class="loading"></b>
                    <em>回复</em>
                  </span>
                </a>
              </p>
            </div>
            <div class="tab_b W_textb W_linkb">
            </div>
            <div class="comment_lists">
              <% for(int ii=0; ii<3; ii++){ %>
              <dl class="comment_list W_linecolor">
                <dt>
                  <a href="/bnubaby"><img width="30" height="30"  src="<s:url value='/img/face.jpg' />" alt="辽A丫头"></a>
                </dt>
                <dd>
                  <a href="/bnubaby">杜莉莉</a>：回复
                  <a href="/n/%E8%8E%AB%E5%AD%90%E7%9D%BF">@张慧</a>:你多大肚子... (今天 16:01) 
                </dd>
                <dd class="clear"></dd>
              </dl>
              <% } %>
            </div>
          </div>
        </dd>
        <dd class="clear"></dd>
      </dl>
      <% } %>
      More...
    </div>
</div>

<div class="content">
    <p class="contentTitle">#04</p>
    <div>测试</div>
</div>