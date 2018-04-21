package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.util.DbUtil;

public class DeleteStudentServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String student_username=req.getParameter("student_username");
		int student_id=Integer.parseInt(req.getParameter("student_id"));
		Student student=new Student(student_id,student_username);
		String type=req.getParameter("type_option");
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		if(type.equals("type_id")) {
			int row=userCRUDDaoImpl.deleteStudentbyType(con, 1, student);
			DbUtil.Conclose(con);

			if (row!=0) {
				resp.sendRedirect("Success.jsp");
			}
			else {
				resp.sendRedirect("fail.jsp");
			}
		}
		else {
			int row=userCRUDDaoImpl.deleteStudentbyType(con, 2, student);
			DbUtil.Conclose(con);

			if (row!=0) {
				resp.sendRedirect("Success.jsp");
			}
			else {
				resp.sendRedirect("fail.jsp");
			}
		}
		
	}
       
}
