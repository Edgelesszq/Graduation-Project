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

public class AddManagerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException {
		HttpSession session=req.getSession(true);
		if(session.getAttribute("manager")==null)
			{
			resp.sendRedirect("login.jsp");
			}
		
				
	else{
			Manager manager1 =(Manager) session.getAttribute("manager");
			System.out.println(manager1.toString());
				if (manager1.getManager_username().equals("root")) {
				String manager_username=req.getParameter("manager_username");
				String manager_password=req.getParameter("manager_password");
				String manager_name=req.getParameter("manager_name");
				
				Connection con=DbUtil.getCon();
				Manager manager=new Manager(manager_username,manager_password,manager_name);
				UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
				int row=userCRUDDaoImpl.add(manager, con);
				DbUtil.Conclose(con);
				if(row!=0) {
					resp.sendRedirect("Success.jsp");
				}
				else {
					resp.sendRedirect("fail.jsp");
				}
			}
				else {
				resp.sendRedirect("fail.jsp");
			}
		}
		
		
	}

}
