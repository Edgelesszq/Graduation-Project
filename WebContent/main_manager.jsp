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
<%session.getAttribute("manager"); %>
</head>
<body>

       <div class="container">
           <div class="row">
                  <div class="col-md-12" >导航</div>
                  <div class="col-md-4">
                   <ul class="nav nav-pills nav-stacked">
                          <li role="presentation" class="active"> <a href="main_manager.jsp">首页</a></li>
						  <li role="presentation"><a href="allManager">管理系统用户</a></li>
						  <li role="presentation"><a href="allAmanager">管理学院用户</a></li>
						  <li role="presentation"><a href="allTeacher">管理老师用户</a></li>
						  <li role="presentation"><a href="allStudent">管理学生用户</a></li>
						  <li role="presentation"><a href="searchAllAcademy">管理学院</a></li>
						  
					</ul>    
		</div>
                  <div class="col-md-8">
                  <!-- 表格 -->
                  <table class="table table-hover">
                  <tr><th></th><th>用户名</th><th>密码</th><th>姓名</th><th>删除</th><th>修改</th></tr>
                
                  
                        
                  
                  
                  </table>  
                  
                  
                  
                  
           </div>
       </div>
</body>
</html>