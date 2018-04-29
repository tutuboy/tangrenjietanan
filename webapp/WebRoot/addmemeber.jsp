<%@ page language="java" import="java.util.*,com.bean.*,com.server.*,com.dao.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加</title>
    
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
     String name=request.getParameter("username");
     String sex=request.getParameter("sex");
     String age=request.getParameter("age");
     String[] interest=request.getParameterValues("interest");
    
     Member me=new Member();
     
     me.setId(new Stringuuid().getI());
     me.setName(name);
     me.setSex(Integer.parseInt(sex));
     me.setAge(Integer.parseInt(age));
     Tostring tt=new Tostring();
     me.setInterest(tt.toS(interest));
     
     Save sv=new Save();
     int rows=sv.saveM(me);
     if(rows>0){
    	 
    	 RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
    	 rd.forward(request, response);

     }

   %>
  </body>
</html>
