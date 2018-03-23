package com.Graduationdesign.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.service.LoginService;
import com.Graduationdesign.service.impl.LoginServiceImpl;

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
		AcademyManager aManager=null;
		Manager manager=null;
		LoginServiceImpl loginServiceImpl=new LoginServiceImpl();;
		String username=req.getParameter("login_username");
		String password=req.getParameter("login_password");
		String type=req.getParameter("login_type");

		if(type.equals("login_student")) {
			student=new Student(username,password);
			
			Student reStudent=loginServiceImpl.loginService(student);
			if (reStudent!=null) {
				System.out.println("chenggong");
				session.setAttribute("student", reStudent);
				resp.sendRedirect("main_student.jsp");
			}
		}
		else if (type.equals("login_teacher")){
			teacher=new Teacher(username,password);

			Teacher reteacher=loginServiceImpl.loginService(teacher);
			if (reteacher!=null) {
				System.out.println("chenggong");
				session.setAttribute("teacher", reteacher);
				resp.sendRedirect("main_teacher.jsp");
			}
		}
		else if (type.equals("login_manager")){
			manager=new Manager(username,password);

			Manager remanager=loginServiceImpl.loginService(manager);
			if (remanager!=null) {
				System.out.println("chenggong");
				session.setAttribute("manager", remanager);
				resp.sendRedirect("mian_manager.jsp");
			}
		}
		else if (type.equals("login_amanager")){
			aManager=new AcademyManager(username,password);

			AcademyManager remanager=loginServiceImpl.loginService(aManager);
			if (aManager!=null) {
				System.out.println("chenggong");
				session.setAttribute("amanager", remanager);
				resp.sendRedirect("main_amanager.jsp");
			}
		}
		else{
			System.out.println("tianla");
		}
	}


	

}
