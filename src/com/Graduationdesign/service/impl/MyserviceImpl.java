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


	@SuppressWarnings("unchecked")
	public List<Manager> searchALlService(int currentpages) {
		
		
		Manager inmanager = null;
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		List<Manager> managerlist=userCRUDDaoImpl.searchAllUser(con, 1,currentpages);
		DbUtil.Conclose(con);
		return managerlist;
	}


	@SuppressWarnings("unchecked")
	public List<AcademyManager> searchAllAcademy(int currentpages) {
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		List<AcademyManager> academyManagerlist=userCRUDDaoImpl.searchAllUser(con, 2,currentpages);
		DbUtil.Conclose(con);
		return academyManagerlist;
		
	}


	@SuppressWarnings("unchecked")
	public List<Teacher> searchAllTeacher(int currentpages) {
		// TODO Auto-generated method stub
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		List<Teacher> teachers=userCRUDDaoImpl.searchAllUser(con,3,currentpages);
		DbUtil.Conclose(con);
		return teachers;
	}


	@SuppressWarnings("unchecked")
	public List<Student> searchAllStudent(int currentpages) {
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		List<Student> students=userCRUDDaoImpl.searchAllUser(con,4,currentpages);
		DbUtil.Conclose(con);
		return students;
	}


	public Integer quantityAddStudent() {
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		return 0;
	}


	public int search_all_manager_Num() {
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		int totalnum=userCRUDDaoImpl.searchAllnum(con,1);
		return totalnum;
	}


	public int search_all_Amanager_Num() {
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		int totalnum=userCRUDDaoImpl.searchAllnum(con,2);
		return totalnum;
	}


	public int search_all_teacher_Num() {
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		int totalnum=userCRUDDaoImpl.searchAllnum(con,3);
		return totalnum;
	}


	public int search_all_student_Num() {
		Connection con=DbUtil.getCon();
		UserCRUDDaoImpl userCRUDDaoImpl=new UserCRUDDaoImpl();
		int totalnum=userCRUDDaoImpl.searchAllnum(con,4);
		return totalnum;
	}
}
