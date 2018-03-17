package com.Graduationdesign.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Graduationdesign.dao.UserCRUDDao;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;



@SuppressWarnings("rawtypes")
public class UserCRUDDaoImpl implements UserCRUDDao{
     
      private Teacher teacher;
      private Manager manager;
      private AcademyManager aManager;
	public  Object search(Object t, Connection con) {
		
		if (t instanceof Student) {
			 Student student=(Student) t;
			String sql="select * from student where student_username=? and student_userpassword=?";
			Student retstudent = null;
			try {
				PreparedStatement pStatement=con.prepareStatement(sql);
				pStatement.setString(1,student.getStudent_username());
				pStatement.setString(2, student.getStudent_password());
				ResultSet rSet=pStatement.executeQuery();
				while(rSet.next()) {
					retstudent=new Student();
					retstudent.setStudent_name(rSet.getString("student_name"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return retstudent;
 		}
		else if (t.equals(teacher)) {
			return null;
		} 
		else if (t.equals(manager)) {
			return null;
		}
		else if (t.equals(aManager)) {
			return null;
		}
		// TODO Auto-generated method stub
		else {
			return null;
		}
	}

}
