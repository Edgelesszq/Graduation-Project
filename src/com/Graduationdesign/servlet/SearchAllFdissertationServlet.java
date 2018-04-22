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
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.service.impl.MyserviceImpl;
import com.Graduationdesign.util.DbUtil;

public class SearchAllFdissertationServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		
		HttpSession session=req.getSession();
		if(session.getAttribute("amanager")==null) {
			resp.sendRedirect("login.jsp");
		}
		else {
			AcademyManager amManager=(AcademyManager) session.getAttribute("amanager");
			int currentpage=1;
			if(req.getParameter("page")!=null) {
				currentpage=Integer.parseInt(req.getParameter("page"));//对当前页码进行有效赋值
			}
			Connection con=DbUtil.getCon();
			 @SuppressWarnings("unchecked")
			List<Dissertation> resultD=userCRUDDaoImpl.searchAllDissertationByAcademy(con, currentpage, amManager.getAmanager_id());
			int count=userCRUDDaoImpl.searchAllDissertationNumByAcademy(con, amManager.getAmanager_id());
			
			DbUtil.Conclose(con);
			int pages;
			if(count%Dissertation.PAGE_SIZE==0) {
				pages=count/Dissertation.PAGE_SIZE;
			}
			else {
				pages=count/Dissertation.PAGE_SIZE+1;
			}
			StringBuffer sBuffer=new StringBuffer();
			for(int i=1;i<=pages;i++) {
				if(i==currentpage)
				{
					sBuffer.append("["+i+"]");
					
				}
				else {
					sBuffer.append("<a href='searchAllDissertation?page="+i+"'>"+i+"</a>");
				}
				sBuffer.append(" ");
				
			}
			req.setAttribute("bar", sBuffer.toString());
			
		
		   
	        if(resultD!=null) {
	        	req.setAttribute("resultD",resultD);
	 	       req.getRequestDispatcher("amanager_eva.jsp").forward(req, resp);
	        }
	        else {
				resp.sendRedirect("fail.jsp");
			}
	       
		}
		
	}

}
