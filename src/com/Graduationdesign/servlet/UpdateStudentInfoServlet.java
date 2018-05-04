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
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.util.DbUtil;

public class UpdateStudentInfoServlet extends HttpServlet {

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
		if(req.getSession().getAttribute("student")==null) {
			resp.sendRedirect("login.jsp");
		}
		else {
			Student stduent1=(Student)req.getSession().getAttribute("student");
			String student_name= req.getParameter("student_name");
			String student_password= req.getParameter("student_password");
			//Teacher rteacher=new Teacher(teacher1.getTeacher_id(),teacher_password,teacher_name);
			
			int row=userCRUDDaoImpl.updateStudentInfo(stduent1.getStudent_id(), student_password, student_name, con);
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
