package com.Graduationdesign.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.Dissertation;
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.util.DbUtil;

public class GlDissertationServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8486868558742845812L;

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
			
				
				
				Connection con=DbUtil.getCon();
				UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
				List<Dissertation> reDissertations=userCRUDDaoImpl.searchteacherDiss(teacher1.getTeacher_id(), con);
				DbUtil.Conclose(con);
				if(reDissertations!=null) {
					session.setAttribute("reDissertations", reDissertations);
					resp.sendRedirect("teacher_glDiss.jsp");
				}
				else {
					resp.sendRedirect("fail.jsp");
				}
			}
			
		}
	}
	

