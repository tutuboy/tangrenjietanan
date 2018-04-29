<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upadtemain.jsp' starting page</title>
    
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
   <form action="updatemembermain.jsp" method="post">
       请修改姓名：<input type="text" name="upname"><br>
       请修改性别:<input type="radio" name="upsex" value="1" checked="checked">男
       <input type="radio" name="upsex" value="0">女<br>
       请修改年龄：<input type="text" name="upage"><br>
       请修改爱好:<input type="checkbox" name="upinterest" value="篮球">篮球
     <input type="checkbox" name="upinterest" value="排球">排球
     <input type="checkbox" name="upinterest" value="足球">足球<br>
     <input type="submit" value="提交" >
     <input type="button" value="取消" Onclick="history.go(-1)">
   </form>
  </body>
</html>
