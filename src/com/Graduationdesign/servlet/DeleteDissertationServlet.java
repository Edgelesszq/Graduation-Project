package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.util.DbUtil;

public class DeleteDissertationServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8752341209100499301L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int dissertation_id=Integer.parseInt(req.getParameter("dissertation_id"));
		int dissertation_status=Integer.parseInt(req.getParameter("dissertation_status"));
		if(dissertation_status==1) {
			UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
			Connection con=DbUtil.getCon();
			int row=userCRUDDaoImpl.deleteDissertationByid(dissertation_id,con);
			DbUtil.Conclose(con);
			if(row==0) {
				resp.sendRedirect("fail.jsp");
			}
			else {
				resp.sendRedirect("searchAllDissertation");
			}
		}
		else {
			resp.sendRedirect("fail.jsp");
		}
	}

}
