<%@ page language="java" import="java.util.*,com.bean.*,com.dao.*,com.server.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'deletemember.jsp' starting page</title>
    
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
    <div align="center">
     <%
        request.setCharacterEncoding("utf-8");
        String dename=request.getParameter("deletename");
        Delete de=new Delete();
        int rows=de.delete(dename);
        if(rows>0){
          out.print("deleted");
        }else{out.print("none");}
      %>
      <a href="show.jsp">返回首页</a>
      </div>
  </body>
</html>
