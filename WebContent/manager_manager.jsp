<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%session.getAttribute("manager"); %>

  

<title>Insert title here</title>
</head>
<body>
  
        <div class="container">
        <div class="row">
        	<div class="col-md-12" style="height:300px;"></div>
        	<div class="col-md-12" style="height:500px;">
        	
        	<div class="col-md-4" style="height:500px;">
        	  <h2 style="margin-left:60px ;">根据类型删除管理员</h2>
        	   
						  <form action="deleteManager" method="post">
						  <div class="form-group" > 
						    <label for="exampleInputEmail1">输入类型</label>
						    <input type="text" class="form-control" id="exampleInputEmail1"name="manager_type" placeholder="type">
						  </div>
						  
						    <select name="type_option" class="form-control">
						              <option value="type_id" >管理员id</option>
						              <option value="type_username">管理员账号</option>
						             
						        </select>
						  
						  <button type="submit" style="text-align: center;margin-left: 120px; margin-top: 50px;" class="btn btn-default">删除</button>
						</form>
        	
        	
        	
        	</div>
        	
        	
        	<div class="col-md-4" style="height:500px;">
        	
						 <h2 style="margin-left:60px ;">更改用户信息</h2>
        	   
						  <form action="updateManagerInfo" method="post">
						  <div class="form-group" > 
						    <label for="exampleInputEmail1">name</label>
						    <input type="text" class="form-control" id="exampleInputEmail1"name="manager_name" placeholder="姓名">
						  </div>
						  <div class="form-group">
						    <label for="exampleInputPassword1">Password</label>
						    <input type="password" class="form-control" name="manager_password"  id="exampleInputPassword1" placeholder="密码">
						  </div>
						 
						  <div >
						    <select name="login_type" class="form-control">
						              <option value="login_student" >学生</option>
						              <option value="login_teacher">老师</option>
						              <option value="login_amanager">学院管理员</option>
						              <option value="login_manager">系统管理员</option>
						        </select>
						  </div>
						  <button type="submit" style="text-align: center;margin-left: 120px; margin-top: 50px;" class="btn btn-default">确定</button>
						 <span>root用户可进行此操作</span>
						</form>
        	
        	</div>
        	
        	
        	<div class="col-md-4" style="height:500px;">
        	    
						 <h2 style="margin-left:60px ;">毕业论文选题系统</h2>
        	   
						  <form action="addManager" method="post">
						  <div class="form-group" > 
						    <label for="exampleInputEmail1">Username</label>
						    <input type="text" class="form-control" id="exampleInputEmail1"name="manager_username" placeholder="用户名">
						  </div>
						  <div class="form-group">
						    <label for="exampleInputPassword1">Password</label>
						    <input type="password" class="form-control" name="manager_password"  id="exampleInputPassword1" placeholder="密码">
						  </div>
						 <div class="form-group">
						    <label for="exampleInputPassword1">name</label>
						    <input type="text" class="form-control" name="manager_password"  id="exampleInputPassword1" placeholder="名字">
						  </div>
						  
						  <button type="submit" style="text-align: center;margin-left: 120px; margin-top: 50px;" class="btn btn-default">添加</button>
						</form>          
        	</div>
        	
        	
        
        	</div>
        	<div class="col-md-12" style="height:300px;"></div>
        </div>
        
        
        </div>
  
		
</body>
</html>