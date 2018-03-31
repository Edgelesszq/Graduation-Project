package com.Graduationdesign.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.service.impl.MyserviceImpl;

public class SearchAllAManagerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MyserviceImpl myserviceImpl = null;
		HttpSession session=req.getSession();
		
        myserviceImpl=new MyserviceImpl();
        List<AcademyManager> resultAcManager=myserviceImpl.searchAllAcademy();
        session.setAttribute("resultAcManager",resultAcManager);
        resp.sendRedirect("manager_management_academy.jsp");
          
			
	}
	

}
