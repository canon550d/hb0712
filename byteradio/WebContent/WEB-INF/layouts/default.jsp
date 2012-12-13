<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="s"     uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%-- 
说明：
1、echo $title_for_layout;
2、echo $scripts_for_layout;
3、echo $content_for_layout;
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>彩虹--<tiles:getAsString name="title" /></title>

    <link rel="stylesheet" type="text/css" href="files/yui/3.5.1/build/cssreset/cssreset-min.css"/>
    <link rel="stylesheet" type="text/css" href="files/yui/3.5.1/build/cssfonts/cssfonts-min.css"/>
    <link rel="stylesheet" type="text/css" href="files/yui/3.5.1/build/cssgrids/grids-min.css"/>
    <link rel="stylesheet" type="text/css" href="css/cssbase.css"/>

    <script type="text/javascript" src="files/jquery/1.8.3/jquery.min.js"></script>

    <link rel="stylesheet" type="text/css" href="files/jqueryui/1.9.2/themes/base/jquery-ui.css"/>
    <script type="text/javascript" src="files/jqueryui/1.9.2/jquery-ui.js"></script>

    <s:property value="'scripts_for_layout'" />
  </head>
  <body>
    <div id="global_nav">
      <div class="gn_header">
        <div class="gn_logo">&nbsp;</div>
        <div class="gn_nav">
          <div class="gn_title"><a class="gn_tab" href=""><i>首页</i></a></div>
          <div class="gn_title"><a class="gn_tab" href=""><i>测试</i></a></div>
          <div class="gn_title"><a class="gn_tab" href=""><i>其他</i></a></div>
        </div>
        <div class="search">
          <input class="gn_input" type="text" maxlength="18" title="" name="" />
        </div>
      </div>
    </div>
    <div id="container">
      <div id="header" class="header">
         <!-- /顶部/ -->
         <tiles:insertAttribute name="header" />
      </div>
  
      <div id="content" class="yui3-g">
        <div class="yui3-u-1-6" id="nav">
          <!-- /导航/ -->
          <tiles:insertAttribute name="sidebar1" />
        </div>
  
        <div class="yui3-u-2-3" id="main">
          <!-- /内容/ -->
          <tiles:insertAttribute name="content" />
        </div>
  
        <div class="yui3-u-1-6" id="nav2">
          <!-- /第二导航/ -->
          <tiles:insertAttribute name="sidebar2" />
        </div>
      </div><!-- end .content -->
      <!-- /content_for_layout/ -->
  
      <div id="footer">
          <!-- /页脚/ -->
          <p>彩虹公司版权所有 &copy;1990-2012</p>
      </div><!-- end .footer -->
    </div>

    <br class='xy'/>
    <s:iterator value="#stylesheet" ><link rel="stylesheet" type="text/css" href="<s:property escape="false" />"/>
    </s:iterator>
    <s:iterator value="#javascript" ><script type="text/javascript" src="<s:property escape="false" />"></script>
    </s:iterator>
    <br class='xy'/>
    <div><s:debug  /></div>
  </body>
</html>