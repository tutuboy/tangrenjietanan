<%@ page language="java" import="java.util.*,com.bean.*,com.dao.*,com.server.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updatemembermain.jsp' starting page</title>
    
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
   <%
      request.setCharacterEncoding("utf-8");
      String upname=request.getParameter("upname");
         String upage=request.getParameter("upage");
         String upsex=request.getParameter("upsex");
         String[] upinterest=request.getParameterValues("upinterest");
         Update up=new Update();
    
         Member m=new Member();
         m.setName(upname);
         m.setAge(Integer.parseInt(upage));
         m.setSex(Integer.parseInt(upsex));
         m.setInterest(new Tostring().toS(upinterest));
         m.setId(up.stri);       
         up.upD(m);
         out.print("do");
    %>
    <a href="show.jsp">返回首页</a>
  </body>
</html>
