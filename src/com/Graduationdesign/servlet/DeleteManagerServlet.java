package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.startup.FailedContext;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.util.DbUtil;

public class DeleteManagerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		Manager manager1=(Manager)session.getAttribute("manager");
		if(session.getAttribute("manager")==null) {
			resp.sendRedirect("login.jsp");
		}
		else if(session.getAttribute("manager").equals("root")){
			
			String type=req.getParameter("type_option");
			Connection con=DbUtil.getCon();
			UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
			if(type.equals("type_id")) {
				int manager_id=Integer.parseInt(req.getParameter("manager_type"));
				Manager manager=new Manager(manager_id);
				int row=userCRUDDaoImpl.deleteManagerbyType(con, 1, manager);
				DbUtil.Conclose(con);

				if (row!=0) {
					resp.sendRedirect("Success.jsp");
				}
				else {
					resp.sendRedirect("fail.jsp");
				}
			}
			else {
				String manager_username=req.getParameter("manager_type");
				Manager manager=new Manager(manager_username);
				int row=userCRUDDaoImpl.deleteManagerbyType(con, 2, manager);
				DbUtil.Conclose(con);

				if (row!=0) {
					resp.sendRedirect("Success.jsp");
				}
				else {
					resp.sendRedirect("fail.jsp");
				}
			}
		}
        else {
			resp.sendRedirect("fail.jsp");
		}
		
	}
       
}
