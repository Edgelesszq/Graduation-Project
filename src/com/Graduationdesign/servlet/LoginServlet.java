package com.Graduationdesign.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.service.LoginService;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession();
		Student student=null;
		Teacher teacher=null;
		String username=req.getParameter("login_username");
		String password=req.getParameter("login_password");
		String type=req.getParameter("login_type");

		if(type.equals("login_student")) {
			student=new Student(username,password);
			Student reStudent=LoginService.LoginService(student);
			if (reStudent!=null) {
				System.out.println("chenggong");
				session.setAttribute("student", reStudent);
				resp.sendRedirect("main_student.jsp");
			}
		}
		else {
			System.out.println("tianla");
		}
	}


	

}
