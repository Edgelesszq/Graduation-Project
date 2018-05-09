<%@page import="com.Graduationdesign.entity.Student"%>
<%@page import="com.Graduationdesign.entity.Class"%>
<%@page import="com.Graduationdesign.entity.AcademyManager"%>
<%@page import="com.Graduationdesign.entity.Manager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@page import="java.util.*"%>
<%@page import="com.Graduationdesign.*" %>
<title>Insert title here</title>
</head>
<body>

<%List<Student> sList2=(List<Student>) session.getAttribute("iStudents"); %>
<%int class_id=(Integer)session.getAttribute("class_id"); %>
       <div class="container">
           <div class="row">
                  <div class="col-md-12" ></div>
                  <div class="col-md-4">
                   
		</div>
                  <div class="col-md-8">
                  <!-- 表格 -->
                  <table class="table table-hover">
                 	<tr><th>id</th><th>学生用户名</th><th>学生密码</th><th>学生名字</th><th>论文编号</th><th>操作</th></tr>
               		<%for(int i=0;i<sList2.size();i++){
               			%>
               			<tr>
               			<td><%=sList2.get(i).getStudent_id() %></td>
               			<td><%=sList2.get(i).getStudent_username() %></td>
               			<td><%=sList2.get(i).getStudent_password() %></td>
               			<td><%=sList2.get(i).getStudent_name() %></td>
               			<td><%=sList2.get(i).getDissertion_id() %></td>
               			
               			<td><a href="deleteStduent?student_id=<%=sList2.get(i).getStudent_id() %>">删除</a></td>
               			</tr>
               		<% }%>
                  
                        
                  
                  
                  </table>  
                  <a href="addstudent.jsp?class_id2=<%=class_id %>">添加学生</a>
                  
                  
                  
           </div>
       </div>
</body>
</html>