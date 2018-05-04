package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.util.DbUtil;

public class ChooseServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7399596422498543289L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		int diss_id=Integer.parseInt(req.getParameter("dissertation_id"));
		int diss_status=Integer.parseInt(req.getParameter("dissertation_status"));
		if(session.getAttribute("student")==null) {
			resp.sendRedirect("login.jsp");
		}
		else {
			if(diss_status==3) {
				resp.sendRedirect("fail.jsp");
			}
			else if(diss_status==2){
				Student rstudent=(Student) session.getAttribute("student");
				UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
				Connection connection=DbUtil.getCon();
				int rrow=userCRUDDaoImpl.chooseDissbyStudent(rstudent.getStudent_id(), diss_id, connection,1);
				int rrow2=userCRUDDaoImpl.chooseDissbyStudent(rstudent.getStudent_id(), diss_id, connection,2);

				DbUtil.Conclose(connection);
				if(rrow==0||rrow2==0) {
					resp.sendRedirect("fail.jsp");
				}
				else if(rrow!=0||rrow2!=0) {
					resp.sendRedirect("Success.jsp");
				}
			}
			else {
				resp.sendRedirect("Success.jsp");
			}
			
			
		}
	}

}
