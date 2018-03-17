<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
        <form action="login" method="post">
        <input type="text" name="login_username"/>
        <input type="password" name="login_password">
        <select name="login_type">
              <option value="login_student">学生</option>
              <option value="login_teacher">老师</option>
              <option value="login_amanager">学院管理员</option>
              <option value="login_manager">系统管理员</option>
        </select>
        <input type="submit" value="登录"/>
        
        </form>
</body>
</html>