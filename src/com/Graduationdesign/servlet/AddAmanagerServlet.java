package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;import org.apache.catalina.startup.FailedContext;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.util.DbUtil;

public class AddAmanagerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int academy_id=Integer.parseInt(req.getParameter("academy_id"));
		String amanager_username=req.getParameter("amanager_username");
		String amanager_password=req.getParameter("amanager_password");
		String amanager_name=req.getParameter("amanager_name");
		
		Connection con=DbUtil.getCon();
		AcademyManager aManager=new AcademyManager(amanager_username,amanager_password,amanager_name,academy_id);
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		int row=userCRUDDaoImpl.add(aManager, con);
		DbUtil.Conclose(con);
		if(row!=0) {
			resp.sendRedirect("Success.jsp");
		}
		else {
			resp.sendRedirect("fail.jsp");
		}
	}

}
