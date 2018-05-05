<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
       
        <div class="container">
        <div class="row">
        	<div class="col-md-12" style="height:300px;"></div>
        	<div class="col-md-12" style="height:500px;">
        	
        	<div class="col-md-4" style="height:500px;">
        	
        	
        	</div><div class="col-md-4" style="height:500px;">
        	               <h2 style="margin-left:60px ;">毕业论文选题系统</h2>
        	   
						  <form action="login" method="post">
						  <div class="form-group" > 
						    <label for="exampleInputEmail1">Username</label>
						    <input type="text" class="form-control" id="exampleInputEmail1"name="login_username" placeholder="用户名">
						  </div>
						  <div class="form-group">
						    <label for="exampleInputPassword1">Password</label>
						    <input type="password" class="form-control" name="login_password"  id="exampleInputPassword1" placeholder="密码">
						  </div>
						 
						  <div >
						    <select name="login_type" class="form-control">
						              <option value="login_student" >学生</option>
						              <option value="login_teacher">老师</option>
						              <option value="login_amanager">学院管理员</option>
						              <option value="login_manager">系统管理员</option>
						        </select>
						  </div>
						  <button type="submit" style="text-align: center;margin-left: 120px; margin-top: 50px;" class="btn btn-default">登录</button>
						</form>
        	</div><div class="col-md-4" style="height:500px;">
        	
        	
        	</div>
        	</div>
        	<div class="col-md-12" style="height:300px;"></div>
        </div>
        
        
        </div>
     
</body>
</html>