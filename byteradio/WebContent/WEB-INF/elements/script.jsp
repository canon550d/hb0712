<%@ page language="java" contentType="text/html; charset=GB2312" pageEncoding="GB2312"%>
<link rel="stylesheet" type="text/css" href="http://192.168.16.9/libs/jqueryui/1.8.23/css/smoothness/jquery-ui-1.8.23.custom.css"/>
<script type="text/javascript" src="http://192.168.16.9/libs/jquery/1.8.1/jquery.min.js"></script>
<script type="text/javascript" src="http://192.168.16.9/libs/jqueryui/1.8.23/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/lib/jquery.validate.min.js"></script>

<script type="text/javascript" src="javascript/calendar_pop.js"></script>
<script type="text/javascript" src="javascript/calendar_layers.js"></script>
<script type="text/javascript" src="javascript/calendar_menu.js"></script>

<script type="text/javascript">
$(document).ready(function(){
  $( "#type" ).tabs();

  $( ".from" ).datepicker({
    dateFormat: "yy-mm-dd",
    monthNames:['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
  });
  $( ".to" ).datepicker({
    dateFormat: "yy-mm-dd",
    monthNames:['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
  });
});


</script>