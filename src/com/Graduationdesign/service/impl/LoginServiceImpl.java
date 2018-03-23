package com.Graduationdesign.service.impl;

import java.sql.Connection;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;
import com.Graduationdesign.util.DbUtil;
import com.Graduationdesign.service.*;

public class LoginServiceImpl implements LoginService {
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
}
