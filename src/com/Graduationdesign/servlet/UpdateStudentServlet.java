package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.util.DbUtil;

public class UpdateStudentServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8103005522184621933L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		this.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		Connection con=DbUtil.getCon();
		String student_name= req.getParameter("student_name");
		String student_password= req.getParameter("student_password");
		Student student=new Student(student_password,student_name);
		
		int row=userCRUDDaoImpl.updateStudentInfo(con, student);
		DbUtil.Conclose(con);
		if(row!=0) {
			resp.sendRedirect("Success.jsp");
		}
		else {
			resp.sendRedirect("fail.jsp");
		}
		
	}
   
}
