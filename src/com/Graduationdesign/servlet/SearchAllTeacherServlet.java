package com.Graduationdesign.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.service.impl.MyserviceImpl;

public class SearchAllTeacherServlet extends HttpServlet {

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
            List<Teacher> reTeachers=myserviceImpl.searchAllTeacher();
            session.setAttribute("reTeachers",reTeachers);
            resp.sendRedirect("manager_management_teacher.jsp");
          
			
	}
	

}
