package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.util.DbUtil;

public class DeleteTeacherServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String teacher_username=req.getParameter("teahcer_username");
		int teacher_id=Integer.parseInt(req.getParameter("teacher_id"));
		Teacher techar=new Teacher(teacher_id,teacher_username);
		String type=req.getParameter("type_option");
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		if(type.equals("type_id")) {
			int row=userCRUDDaoImpl.deleteTeacherbyType(con, 1, techar);
		
			DbUtil.Conclose(con);
			if (row!=0) {
				resp.sendRedirect("Success.jsp");
			}
			else {
				resp.sendRedirect("fail.jsp");
			}
		}
		else {
			int row=userCRUDDaoImpl.deleteTeacherbyType(con, 2, techar);
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
