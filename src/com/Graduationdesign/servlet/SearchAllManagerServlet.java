package com.Graduationdesign.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.service.impl.MyserviceImpl;

public class SearchAllManagerServlet extends HttpServlet {

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
		 myserviceImpl=new MyserviceImpl();
		HttpSession session=req.getSession();
		int currentpage=1;
		if(req.getParameter("page")!=null) {
			currentpage=Integer.parseInt(req.getParameter("page"));//对当前页码进行有效赋值
		}
		 List<Manager> resultmanagers=myserviceImpl.searchALlService(currentpage);
		int count=myserviceImpl.search_all_manager_Num();
		int pages;
		if(count%Manager.PAGE_SIZE==0) {
			pages=count/Manager.PAGE_SIZE;
		}
		else {
			pages=count/Manager.PAGE_SIZE+1;
		}
		StringBuffer sBuffer=new StringBuffer();
		for(int i=1;i<=pages;i++) {
			if(i==currentpage)
			{
				sBuffer.append("["+i+"]");
				
			}
			else {
				sBuffer.append("<a href='allManager?page="+i+"'>"+i+"</a>");
			}
			sBuffer.append(" ");
			
		}
		req.setAttribute("bar", sBuffer.toString());
		
	
	   
           
        req.setAttribute("resultmanagers",resultmanagers);
        req.getRequestDispatcher("manager_management_manager.jsp").forward(req, resp);
       // resp.sendRedirect("manager_management_manager.jsp");
          
			
	}
	

}
