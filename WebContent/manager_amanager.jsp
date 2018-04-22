<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
      <form action="addAmanager">
			<table>
				
				<tr>
					<td>
					               用户名：<input type="text" name="amanager_username" />	
					</td>
				</tr>
				<tr>
					<td>
					               密码：<input type="text" name="amanager_password" />	
					</td>
				</tr>
				<tr>
					<td>
					               姓名：<input type="text" name="amanager_name" />	
					</td>
				</tr>
				
				<tr>
					<td>			
						     学院账户id:<input type="text" name="academy_id" />
					</td>
				</tr>
				<tr><td>
					    <input type="submit" values="添加学院管理员"/>
				</td></tr>
			</table>
		</form>
		<form action="deleteAmanager">
			<table>
				
				<tr>
					<td>
					               用户名：<input type="text" name="amanager_type" />	
					</td>
				</tr>
				
				<tr>
					<td>			
					  <select name="type_option">
					  <option  value ="type_id" selected="selected">学院管理员id</option>
					  <option value ="type_username">学院管理员账号</option>
					  </select>
					</td>
				</tr>
				<tr><td>
					    <input type="submit" values="删除学院管理员"/>
				</td></tr>
			</table>
		</form>
</body>
</html>