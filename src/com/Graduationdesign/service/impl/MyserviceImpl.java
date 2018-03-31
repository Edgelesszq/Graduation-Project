package com.Graduationdesign.service.impl;

import java.sql.Connection;
import java.util.List;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.util.DbUtil;
import com.Graduationdesign.service.*;

public class MyserviceImpl implements Myservice {
    Connection con=null;
    UserCRUDDaoImpl userCRUDDaoImpl=null;
    
    
	@SuppressWarnings("unchecked")
	public <T> T loginService(T t) {

		if(t instanceof Student)
			{
			    Student tStudent=(Student) t;
				con=DbUtil.getCon();
				userCRUDDaoImpl=new UserCRUDDaoImpl();
				Student result=(Student) userCRUDDaoImpl.search(tStudent, con);
				DbUtil.Conclose(con);
				return (T) result;
			}
		else if(t instanceof Teacher)
		{
		    Teacher tteacher=(Teacher) t;
			con=DbUtil.getCon();
			userCRUDDaoImpl=new UserCRUDDaoImpl();
			Teacher result=(Teacher) userCRUDDaoImpl.search(tteacher, con);
			DbUtil.Conclose(con);
			return (T) result;
		}
		else if(t instanceof Manager)
		{
			Manager tmanager=(Manager) t;
			con=DbUtil.getCon();
			userCRUDDaoImpl=new UserCRUDDaoImpl();
			Manager result=(Manager) userCRUDDaoImpl.search(tmanager, con);
			DbUtil.Conclose(con);
			return (T) result;
		}
		else if(t instanceof AcademyManager)
		{
			AcademyManager amanager=(AcademyManager) t;
			con=DbUtil.getCon();
			userCRUDDaoImpl=new UserCRUDDaoImpl();
			AcademyManager result=(AcademyManager) userCRUDDaoImpl.search(amanager, con);
			DbUtil.Conclose(con);
			return (T) result;
		}
		return t;
	}


	@SuppressWarnings("unused")
	public List<Manager> searchALlService() {
		Manager inmanager = null;
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		List<Manager> managerlist=userCRUDDaoImpl.search_allmanager(con, 1);
		DbUtil.Conclose(con);
		return managerlist;
	}


	public List<AcademyManager> searchAllAcademy() {
		AcademyManager inmanager = null;
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		List<AcademyManager> academyManagerlist=userCRUDDaoImpl.search_allmanager(con, 2);
		DbUtil.Conclose(con);
		return academyManagerlist;
		
	}


	public List<Teacher> searchAllTeacher() {
		// TODO Auto-generated method stub
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		List<Teacher> teachers=userCRUDDaoImpl.search_allmanager(con,3);
		DbUtil.Conclose(con);
		return teachers;
	}


	public List<Student> searchAllStudent() {
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		List<Student> students=userCRUDDaoImpl.search_allmanager(con,4);
		DbUtil.Conclose(con);
		return students;
	}


	public Integer quantityAddStudent() {
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		return 0;
	}
}
