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
import com.Graduationdesign.util.DbUtil;

public class UpdateDissServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7558928280331076062L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("dissertation_id"));
		HttpSession session=req.getSession();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		Connection connection=DbUtil.getCon();
		Dissertation rdissertation=userCRUDDaoImpl.searchDissByid(id,connection);
		if (rdissertation!=null) {
			session.setAttribute("rdissertation",rdissertation);
			resp.sendRedirect("teacher_updateDiss.jsp");
		}
		
		DbUtil.Conclose(connection);
	}
	
}
