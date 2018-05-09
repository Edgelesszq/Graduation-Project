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

<div class="container">
           <div class="row">
                  <div class="col-md-12" >导航</div>
                  <div class="col-md-4">
                   <ul class="nav nav-pills nav-stacked">
                           <li role="presentation" class="active"> <a href="main_amanager.jsp">首页</a></li>
						  <li role="presentation"><a href="amanager_updateinfo.jsp">修改个人资料</a></li>
						  <li role="presentation"><a href="serachallDiss">论文管理</a></li>
						  <li role="presentation"><a href="academyTeacher">本学院所有老师管理</a></li>
						  <li role="presentation"><a href="searchAllProfession">管理专业</a></li>
						  
					</ul>    
		</div>
                  <div class="col-md-8">
                 <div class="col-md-12" style="height: 100px;"></div>
                 <div class="col-md-4" style="height: 300px;"></div>
                 <div class="col-md-4" style="height: 300px;"> 
				 <form action="updateAmanagerInfo" >
				  <div class="form-group">
				    <label for="exampleInputEmail1">密码修改</label>
				    <input type="text" name="amanager_password" class="form-control" id="exampleInputEmail1" placeholder="密码">
				  </div>
				  <div class="form-group">
				    <label for="exampleInputPassword1">姓名修改</label>
				    <input type="text" name="amanager_name" class="form-control" id="exampleInputPassword1" placeholder="姓名">
				  </div>
				  
				  
				  <button type="submit" class="btn btn-default">Submit</button>
				</form>
                 
                 
                 
                 </div>
                 <div class="col-md-4" style="height: 300px;"></div>
                 <div class="col-md-12"></div> 
                 
                  
                  
                  
                  
           </div>
       </div>
</body>
</html>