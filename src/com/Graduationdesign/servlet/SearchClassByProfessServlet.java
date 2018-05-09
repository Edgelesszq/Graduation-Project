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
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Profession;
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.util.DbUtil;

public class SearchClassByProfessServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8373606092158909385L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hSession=req.getSession();
		int profession_id=Integer.parseInt(req.getParameter("profession_id"));
		if(hSession.getAttribute("amanager")==null) {
			resp.sendRedirect("login.jsp");
		}
		else {
			AcademyManager aManager=(AcademyManager) hSession.getAttribute("amanager");
			
			UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
			Connection connection=DbUtil.getCon();
			//List<Teacher> tList=userCRUDDaoImpl.searchTeacherByAcademyId(aManager.getAcademy_id(), connection);
			//List<Profession> professions=userCRUDDaoImpl.searchProfessionByAcademy(aManager.getAcademy_id(), connection);
			Profession profession=new Profession();
			profession.setProfession_id(profession_id);
			List<com.Graduationdesign.entity.Class> cList=userCRUDDaoImpl.searchclassbyProfession(connection, profession);
			DbUtil.Conclose(connection);
		 hSession.setAttribute("cList", cList);
		    resp.sendRedirect("class.jsp");
		}
		
	
	}

}

