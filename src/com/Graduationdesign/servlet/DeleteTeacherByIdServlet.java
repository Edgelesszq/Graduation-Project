package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.util.DbUtil;

public class DeleteTeacherByIdServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6379910176185820581L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hSession=req.getSession();
		int id=Integer.parseInt(req.getParameter("teacher_id"));
		if(hSession.getAttribute("amanager")==null) {
			resp.sendRedirect("login.jsp");
		}
		else {
		//	AcademyManager aManager=(AcademyManager) hSession.getAttribute("amanager");
			
			UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
			Connection connection=DbUtil.getCon();
			int row=userCRUDDaoImpl.deleteTeacherByTeacherId(id, connection);
			if(row==1) {
				resp.sendRedirect("Success.jsp");
			}
			else {
				resp.sendRedirect("fail.jsp");
			}
		    
		}
		
	}

}
