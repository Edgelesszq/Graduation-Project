<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="com.Graduationdesign.entity.Dissertation"%>
<%@page import="java.util.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
"WebContent/addTeachers.jsp"
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%List<Dissertation> list=(List<Dissertation>)request.getAttribute("resultND3"); %>
<div class="container">
           <div class="row">
                  
		    <div class="col-md-12">
						<div class="col-md-2" style="height: auto; text-align: center;">
							
						</div>
						<div class="col-md-8" style="height: auto; text-align: center;font-size: 20px;">
							<table class="table table-striped">
                     <tr> <th>id</th><th>论文名字</th><th>审核状态</th><th>删除</th></tr>
                     <%
                     for(int i=0;i<list.size();i++){ 
                    	int id= list.get(i).getId();
                    	int status=list.get(i).getStatus();
                     %>
                     <tr>
                      
                     	<td><%=list.get(i).getId() %></td>
                     	<td><a href="searchDissByid?dissertation_id=<%=id %>"><%=list.get(i).getDis_title() %></a></td>
                     	<td><%=list.get(i).getStatus() %><td>
                     	<td><a href="deleteDissertation?dissertation_id=<%=id %>&dissertation_status=<%=status %>">删除</a></td>
                     	
                     </tr>
                     <%} %>
                           <tr><td align="center" colspan="4"><%=session.getAttribute("bar") %></td></tr>
                     
                </table>  
						</div>
						<div class="col-md-2" style="height:auto; text-align: center;"></div>
			</div>
                  
                 
                  
                  
                  
                  
           </div>
           </div>
      
</body>
</html>