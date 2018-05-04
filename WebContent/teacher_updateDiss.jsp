<%@page import="com.Graduationdesign.entity.Dissertation"%>
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
<%Dissertation dissertation=(Dissertation)session.getAttribute("rdissertation"); %>
</head>
<body>

       <div class="container">
           <div class="row">
                  <div class="col-md-12" >导航</div>
                  <div class="col-md-4">
                   <ul class="nav nav-pills nav-stacked">
                          <li role="presentation"> <a href="main_teacher.jsp">首页</a></li>
						  <li role="presentation"><a href="addDissertation.jsp">添加论文</a></li>
						  <li role="presentation"  class="active"><a href="glDissertation">管理论文</a></li>
						  <li role="presentation"><a href="teacher_updateinfo.jsp">修改资料</a></li>
						  
						 
						  
					</ul>    
		</div>
                  <div class="col-md-8">
                  <!-- 表格 -->
                  
                  <form action="updateDissTeacher" method="post">
					  <div class="form-group">
					    <label for="exampleInputEmail1">标题</label>
					    <input type="text" name="dissertation_title" class="form-control" id="exampleInputEmail1" value="<%=dissertation.getDis_title() %>">
					  </div>
					  <label for="exampleInputPassword1">内容</label>
					  <div class="form-group">
					  
					    <textarea rows="50" style="width: 650px;"  name="dissertation_context" cols="20"><%=dissertation.getDis_context() %></textarea>
					  </div>
					 <div class="form-group">
					    <label for="exampleInputPassword1"></label>
					    <input type="text"style="visibility: hidden;"  class="form-control" name="dissertation_id" value="<%=dissertation.getId() %>" id="exampleInputPassword1">
					    
					  </div>
					  <button type="submit" style="text-align: center;" class="btn btn-default">Submit</button>
                </form>
                  
                        
                  
                  
                 
                  
                  
                  
                  
           </div>
       </div>
</body>
</html>