package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.util.DbUtil;

public class DeleteDissByTeacherServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("dissertation_id"));
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		Connection connection=DbUtil.getCon();
		int row=userCRUDDaoImpl.deleteDissertationByid(id, connection);
		if(row==0) {
			resp.sendRedirect("fail.jsp");
		}
		else {
			resp.sendRedirect("Success.jsp");
		}
	}

}
