<%@ page language="java" import="java.util.*"  pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    
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
    <form action="addmemeber.jsp" method="post">
     会员姓名:<input type="text" name="username"><br>
     会员性别:<input type="radio" name="sex" value="1" checked="checked">男
     <input type="radio" name="sex" value="0">女<br>
     会员年龄:<input type="text" name="age"><br>
     会员爱好:<input type="checkbox" name="interest" value="篮球">篮球
     <input type="checkbox" name="interest" value="排球">排球
     <input type="checkbox" name="interest" value="足球">足球<br>
     <input type="submit" value="提交" >
     <input type="button" value="取消" Onclick="history.go(-1)">
     
  </form>
  </body>
</html>
