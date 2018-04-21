<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
     <div>
         
        <form action="addAcademy" method="post">
			<table>
				<tr>
					<td>			
						 学院id:<input type="text" name="academy_id" />
					</td>
				</tr>
				<tr>
					<td>
					               学院名字：<input type="text" name="academy_name" />	
					</td>
				</tr>
				<tr><td>
					    <input type="submit" values="添加学院"/>
				</td>
				
				</tr>
				
			</table>
		</form>
		  <form>
			<table>
				<tr>
					<td>			
						 学院id:<input type="text" name="academy_id" />
					</td>
				</tr>
				<tr>
					<td>
					               学院名字：<input type="text" name="academy_name" />	
					</td>
				</tr>
				<tr><td>
					    <input type="submit" values="删除学院"/>
				</td></tr>
			</table>
		</form>
     </div>
</body>
</html>