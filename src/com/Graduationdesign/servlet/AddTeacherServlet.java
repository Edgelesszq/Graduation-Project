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
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.util.DbUtil;

public class AddTeacherServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3806083259960475561L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String teacher_username=req.getParameter("teacher_username");
		String teacher_password=req.getParameter("teacher_password");
		String teacher_name=req.getParameter("teacher_name");
		int academy_id=Integer.parseInt(req.getParameter("academy_id"));
		
		Connection con=DbUtil.getCon();
		Teacher teacher=new Teacher(teacher_username,teacher_password,teacher_name,academy_id);
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		int row=userCRUDDaoImpl.add(teacher, con);
		DbUtil.Conclose(con);
		if(row!=0) {
			resp.sendRedirect("Success.jsp");
		}
		else {
			resp.sendRedirect("fail.jsp");
		}
	}

}

