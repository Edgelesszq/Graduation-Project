package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.util.DbUtil;

public class UpdateDiss2YesServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5996355315589913167L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		Connection con=DbUtil.getCon();
		int id=Integer.parseInt(req.getParameter("dissertation_id"));
		int rew=userCRUDDaoImpl.EvaYes(id, con);
		DbUtil.Conclose(con);
		if(rew==1) {
			resp.sendRedirect("Success.jsp");
		}
		else {
			resp.sendRedirect("fail.jsp");
		}
	}

}
