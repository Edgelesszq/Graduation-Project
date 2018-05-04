package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.Dissertation;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.util.DbUtil;

public class NoChooseServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2781888260604515494L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			this.doPost(req, resp);	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession();
		int dissid=Integer.parseInt(req.getParameter("dissertation_id"));
		if( session.getAttribute("student")==null) {
			resp.sendRedirect("login.jsp");
		}
		else {
		Student student=(Student) session.getAttribute("student");
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		Connection connection=DbUtil.getCon();
		int row3=userCRUDDaoImpl.chooseDissbyStudent(student.getStudent_id(), dissid, connection, 3);
		int row4=userCRUDDaoImpl.chooseDissbyStudent(student.getStudent_id(), dissid, connection, 4);
		if(row3==0||row4==0) {
			resp.sendRedirect("fail.jsp");
		}
		else {
			resp.sendRedirect("Success.jsp");
		}

		}
	}

}
