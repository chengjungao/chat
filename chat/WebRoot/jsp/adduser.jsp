<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <table  align="center" style="width:300px;height:180px">
  <tr><td>用户id：</td><td><input type="text" name="userid" id="userid"/></td></tr>
   <tr><td>用户姓名：</td><td><input type="text" name="username" id="username"/></td></tr>
    <tr><td>密  码：</td><td><input type="password" name="password" id="password"/></td></tr>
    <tr><td>确认密码：</td><td><input type="password" name="confirmpassword" id="confirmpassword"/></td></tr>
  </table>
  </body>
</html>
