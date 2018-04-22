package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.util.DbUtil;

public class UpdateAmanagerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		Connection con=DbUtil.getCon();
		if(req.getSession().getAttribute("amanager")==null) {
			resp.sendRedirect("login.jsp");
		}
		else {
			AcademyManager aManager1=(AcademyManager) req.getSession().getAttribute("amanager");
			String amanager_name= req.getParameter("amanager_name");
			String amanager_password= req.getParameter("amanager_password");
			AcademyManager amanager=new AcademyManager(aManager1.getAmanager_id(),amanager_name,amanager_password);
			
			int row=userCRUDDaoImpl.updateAmanagerInfo(con, amanager);
			DbUtil.Conclose(con);
			if(row!=0) {
				resp.sendRedirect("Success.jsp");
			}
			else {
				resp.sendRedirect("fail.jsp");
			}	
		}
	}

}
