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
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.util.DbUtil;

public class AddDissertationServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(true);
		if(session.getAttribute("teacher")==null)
			{
			resp.sendRedirect("login.jsp");
			}
		
				
	else{
			Teacher teacher1 =(Teacher) session.getAttribute("teacher");
			//System.out.println(teacher1.toString());
			
				String dissertation_title=req.getParameter("dissertation_title");
				String dissertation_context=req.getParameter("dissertation_context");
				
				
				Connection con=DbUtil.getCon();
				Dissertation dissertation=new Dissertation(dissertation_title,dissertation_context);
				UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
				int row=userCRUDDaoImpl.addDissertation(dissertation, con,teacher1.getTeacher_id());
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
