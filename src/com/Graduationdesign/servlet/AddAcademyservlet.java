package com.Graduationdesign.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Graduationdesign.entity.Academy;
import com.Graduationdesign.service.impl.MyserviceImpl;

public class AddAcademyservlet extends HttpServlet{
    private Academy academy;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//org.apache.catalina.Session session=req.getSession();
		HttpSession session=req.getSession();
		int Academy_id=Integer.parseInt(req.getParameter("academy_id"));
		String Academy_name=req.getParameter("academy_name");
		academy=new Academy(Academy_id,Academy_name);
		MyserviceImpl myserviceImpl=new MyserviceImpl();
		int result= myserviceImpl.addAcademy(academy);
		if(result!=0) {
			session.setAttribute("addAcademyresult", result);	
			resp.sendRedirect("Success.jsp");
		}
		else {
			resp.sendRedirect("fail.jsp");		}
		
		
	}
     
}
