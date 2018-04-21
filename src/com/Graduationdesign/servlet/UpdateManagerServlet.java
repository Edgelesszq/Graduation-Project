package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.util.DbUtil;

public class UpdateManagerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8103005522184621933L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		Connection con=DbUtil.getCon();
		if(req.getSession().getAttribute("manager")==null) {
			resp.sendRedirect("login.jsp");
		}
		else {
			Manager manager1=(Manager) req.getSession().getAttribute("manager");
			String manager_name= req.getParameter("manager_name");
			String manager_password= req.getParameter("manager_password");
			Manager manager=new Manager(manager1.getId(),manager_password,manager_name);
			
			int row=userCRUDDaoImpl.updateManagerInfo(con, manager);
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
