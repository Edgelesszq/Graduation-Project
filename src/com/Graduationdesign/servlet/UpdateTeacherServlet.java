package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.util.DbUtil;

public class UpdateTeacherServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8103005522184621933L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		Connection con=DbUtil.getCon();
		String teacher_name= req.getParameter("teacher_name");
		String teacher_password= req.getParameter("teacher_password");
		Teacher teacher=new Teacher(teacher_password,teacher_name);
		
		int row=userCRUDDaoImpl.updateTeacherInfo(con, teacher);
		DbUtil.Conclose(con);
		if(row!=0) {
			resp.sendRedirect("Success.jsp");
		}
		else {
			resp.sendRedirect("fail.jsp");
		}
		
	}
   
}
