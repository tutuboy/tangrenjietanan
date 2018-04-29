<%@ page language="java" import="java.util.*,com.dao.*,com.bean.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'findmember.jsp' starting page</title>
    
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
      String find=request.getParameter("findname");
      Find f=new Find();
      Member m=f.findO(find);
      String id=m.getId();
       %>
    <table border="1" width="80%">
     
      <tr>
        <td>会员编号</td>
       <td>会员姓名</td>
        <td>会员年龄</td>
        <td>会员性别</td>
        <td>会员爱好</td>
    
      </tr>
      <tr>
     
         <td><%=id%></td>
         <td><%=m.getName() %></td>
         <td><%=m.getAge() %></td>
         <td><%=(m.getSex()==1)?"男":"女" %></td>
         <td><%=m.getInterest() %></td>
         
      </tr>
        
    </table><br>
    <a href="show.jsp">返回首页</a>
    
    </div>
  </body>
  </html> 


