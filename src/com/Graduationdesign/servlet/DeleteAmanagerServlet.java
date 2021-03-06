package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.util.DbUtil;

public class DeleteAmanagerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String type=req.getParameter("type_option");
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		if(type.equals("type_id")) {
			int amanager_id=Integer.parseInt(req.getParameter("amanager_type"));
			AcademyManager aManager=new AcademyManager(amanager_id);

			int row=userCRUDDaoImpl.deleteAmanagerbyType(con, 1, aManager);
			DbUtil.Conclose(con);

			if (row!=0) {
				resp.sendRedirect("Success.jsp");
			}
			else {
				resp.sendRedirect("fail.jsp");
			}
		}
		else {
			String amanager_username=req.getParameter("amanager_type");

			AcademyManager aManager=new AcademyManager(amanager_username);
			int row=userCRUDDaoImpl.deleteAmanagerbyType(con, 2, aManager);
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
