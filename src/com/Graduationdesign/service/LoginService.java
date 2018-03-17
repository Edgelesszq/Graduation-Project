package com.Graduationdesign.service;

import java.sql.Connection;

import com.Graduationdesign.dao.impl.UserCRUDDaoImpl;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.util.DbUtil;

public class LoginService {
    @SuppressWarnings("unused")
	static UserCRUDDaoImpl userCRUDDaoImpl;
    static Connection con;
	@SuppressWarnings("unused")
	public static Student LoginService(Student student) {
		con=DbUtil.getCon();
		userCRUDDaoImpl=new UserCRUDDaoImpl();
		Student result=(Student) userCRUDDaoImpl.search(student, con);
		DbUtil.Conclose(con);
		return result;
    }
}
