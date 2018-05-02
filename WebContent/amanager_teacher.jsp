<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="com.Graduationdesign.entity.Teacher"%>
    <%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%List<Teacher> tlist=(List<Teacher>)session.getAttribute("teacherlist"); %>
<div class="container">
           <div class="row">
                  <div class="col-md-12" >导航</div>
                  <div class="col-md-4">
                   <ul class="nav nav-pills nav-stacked">
                          <li role="presentation" > <a href="main_amanager.jsp">首页</a></li>
						  <li role="presentation"><a href="amanager_updateinfo.jsp">修改个人资料</a></li>
						  <li role="presentation"><a href="searchAllDissertation">论文管理</a></li>
						  <li role="presentation" class="active"><a href="academyTeacher">本学院所有老师管理</a></li>
						  <li role="presentation"><a href="amanager_student.jsp">本学院所有学生管理</a></li>
						  <li role="presentation"><a href="amanager_profession.jsp">管理专业</a></li>
						  
					</ul>    
		</div>
                  <div class="col-md-8">
                  <!-- 表格 -->
                 <table class="table table-striped">
						<tr><th>id</th><th>用户名</th><th>姓名</th><th>操作</th></tr>
						<%for(int i=0;i<tlist.size();i++){
							%>
							<tr>
								<td><%=tlist.get(i).getTeacher_id() %></td>
								<td><%=tlist.get(i).getTeacher_username() %></td>
								<td><%=tlist.get(i).getTeacher_name() %></td>
								<td><a href="deleteTeacherByid?teacher_id=<%=tlist.get(i).getTeacher_id() %>">删除</a></td>
							</tr>
						<%} %>
				</table>
                  
                  <span><a href="addTeacher">添加老师</a></span>
                  
                  
           </div>
       </div>
</body>
</html>