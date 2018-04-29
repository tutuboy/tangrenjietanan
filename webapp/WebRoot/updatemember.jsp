<%@ page language="java" import="java.util.*,com.dao.*,com.bean.*,com.server.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updatemember.jsp' starting page</title>
    
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
       String update=request.getParameter("updatename");
       Update up=new Update();
       String st=up.findI(update);
       if(st==null){
           out.print("none");
       }else{
       
         RequestDispatcher rd=request.getRequestDispatcher("updatemain.jsp");
         rd.forward(request, response);
         
       
       }
       
       

    %>
    
    
  </body>
</html>
