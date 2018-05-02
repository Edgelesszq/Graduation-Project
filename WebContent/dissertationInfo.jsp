<%@page import="com.Graduationdesign.entity.Dissertation"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
<%Dissertation d=(Dissertation)session.getAttribute("rsDissertation"); %>
<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="col-md-2" style="height: 100px; text-align: center;">
						
					</div>
					<div class="col-md-8" style="height: 100px; text-align: center;">
						<h3><%=d.getDis_title() %></h3>
					</div>
					<div class="col-md-2" style="height: 100px; text-align: center;"></div>
				</div>
				<div class="col-md-12">
						<div class="col-md-2" style="height: auto; text-align: center;">
							
						</div>
						<div class="col-md-8" style="height: auto; text-align: center;font-size: 20px;">
							<p><%=d.getDis_context() %></p>
						</div>
						<div class="col-md-2" style="height:auto; text-align: center;"></div>
			</div>
			</div>
			<div class="col-md-12" style="padding-top: 200px;">
				<div class="col-md-3" style="height: 100px; text-align: center;">
						
					</div>
					<div class="col-md-6" style="height: 100px; text-align: center;">
						<a href="eavYes?dissertation_id=<%=d.getId() %>" style="font-size: 25px; padding-right: 100px;">通过</a>
						
						<a href="eavNo?dissertation_id=<%=d.getId() %>" style="font-size: 25px;">驳回</a>
					</div>
					<div class="col-md-3" style="height: 100px; text-align: center;"></div>
			</div>
		</div>
      
</body>
</html>