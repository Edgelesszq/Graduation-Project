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
    <form action="addManager">
			<table>
				<tr>
					<td>			
						 管理员账号:<input type="text" name="manager_username" />
					</td>
				</tr>
				<tr>
					<td>
					               管理员密码：<input type="text" name="manager_password" />	
					</td>
				</tr>
				<tr>
					<td>
					             管理员名字：<input type="text" name="manager_password" />	
					</td>
				</tr>
				<tr><td>
					              <input type="submit" values="添加管理员"/>  <span>root用户可进行此操作</span>
				</td></tr>
			</table>
		</form>
		<form action="deleteManager">
			<table>
				<tr>
					<td>			
						 管理员账号:<input type="text" name="manager_type" />
					</td>
				</tr>
				<tr><td>
					<select name="type_option">
					  <option  value ="type_id" selected="selected">管理员id</option>
					  <option value ="type_username">管理员账号</option>
					  
					</select>
				</td></tr>
				
				<tr><td>
					              <input type="submit" values="删除管理员"/>  <span>root用户可进行此操作</span>
				</td></tr>
			</table>
		</form>
		<form action="updateManagerInfo">
			<table>
				
				<tr>
					<td>			
						 管理员密码:<input type="text" name="manager_password" />
					</td>
				</tr>
				<tr>
					<td>			
						 管理员姓名:<input type="text" name="manager_name" />
					</td>
				</tr>
				
				
				<tr><td>
					              <input type="submit" values="更改个人资料"/>  <span>所有用户可进行此操作</span>
				</td></tr>
			</table>
		</form>
</body>
</html>