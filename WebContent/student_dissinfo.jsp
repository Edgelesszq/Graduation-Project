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
<%Dissertation sDissertation=(Dissertation)session.getAttribute("rdissertation"); %>
<title>Insert title here</title>
</head>
<body>

       <div class="container">
           <div class="row">
                  <div class="col-md-12" >导航</div>
                  <div class="col-md-4">
                   <ul class="nav nav-pills nav-stacked">
                          <li role="presentation" class="active"> <a href="">首页</a></li>
						  <li role="presentation" ><a href="serachallDiss">选择论文</a></li>
						  <li role="presentation"><a href="seeDiss">查看论文</a></li>
						  <li role="presentation"><a href="student_updateInfo.jsp">修改资料</a></li>
						  
						 
						  
					</ul>    
		</div>
                  <div class="col-md-8">
                  <!-- 表格 -->
                      
                        
                   <div class="form-group" style="text-align: center;">
					    <label for="exampleInputEmail1">标题</label>
					    <h3><%=sDissertation.getDis_title() %></h3>
					  </div>
					  
					  <div class="form-group" style="text-align: center; padding-top: 30px;">
					  	<label for="exampleInputPassword1"  style="text-align: center;">内容</label>
					  <h4 style="height: auto;,width: 500px; font-size:25dp;background-color:#FFEFDB;"><%=sDissertation.getDis_context() %></h4>
					  </div>
					 <div class="form-group" style="text-align: center;">
					   <a href="noChoose?dissertation_id=<%=sDissertation.getId() %>">退选</a>
					    
					  </div>
                  
                  
                  
                  
                  
           </div>
       </div>
</body>
</html>