package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;import org.apache.catalina.startup.FailedContext;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.util.DbUtil;

public class AddStudentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String student_username=req.getParameter("student_username");
		String student_password=req.getParameter("student_password");
		String student_name=req.getParameter("student_name");
		int class_id=Integer.parseInt(req.getParameter("class_id"));
		
		Connection con=DbUtil.getCon();
		Student student=new Student(student_username,student_password,student_name,class_id);
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		int row=userCRUDDaoImpl.add(student, con);
		DbUtil.Conclose(con);
		if(row!=0) {
			resp.sendRedirect("Success.jsp");
		}
		else {
			resp.sendRedirect("fail.jsp");
		}
	}

}
