<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript">  
  
    //追加一行  
    function addRow(){  
     var table=document.getElementbyId(); 
        //alert("追加一行");  
    }  
  
</script>  

<title>Insert title here</title>
</head>
<body>
     <table id="fieldTable">
           <tr id="tr1"><th>用户名</th><th>密码</th><th>姓名</th></tr>
           <tr id="tr2">
           <td><input type="text" name="username"/></td>
           <td><input type="text" name="userpassword"/></td>
           <td><input type="text" name="name"/></td>
           </tr>
     
     </table> 
     <button Onclick="addRow()">添加行</button>
</body>
</html>