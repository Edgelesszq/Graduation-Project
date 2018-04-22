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
import com.Graduationdesign.entity.Dissertation;
import com.Graduationdesign.util.DbUtil;

public class SearchAllDissertationYesServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
        UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		
		HttpSession session=req.getSession();
		if(session.getAttribute("amanager")==null) {
			resp.sendRedirect("login.jsp");
		}
		else {
			AcademyManager amManager=(AcademyManager) session.getAttribute("amanager");
	
			Connection con=DbUtil.getCon();
			 @SuppressWarnings("unchecked")
			List<Dissertation> resultD=userCRUDDaoImpl.searchYesDissbyAcademy_id(amManager.getAmanager_id(),con, 2);			
			DbUtil.Conclose(con);

		   
	        if(resultD!=null) {
	        	req.setAttribute("resultND",resultD);
	 	       req.getRequestDispatcher("amanager_eva.jsp").forward(req, resp);
	        }
	        else {
				resp.sendRedirect("fail.jsp");
			}
	       
		}
		
	}

}
