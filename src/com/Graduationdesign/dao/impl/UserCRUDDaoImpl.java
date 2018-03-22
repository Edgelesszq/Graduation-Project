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
		else if (t instanceof Teacher) {
			 Teacher teacher=(Teacher) t;
				String sql="select * from teacher where teacher_username=? and teacher_userpassword=?";
				Teacher retteacher = null;
				try {
					PreparedStatement pStatement=con.prepareStatement(sql);
					pStatement.setString(1,teacher.getTeacher_username());
					pStatement.setString(2, teacher.getTeacher_password());
					ResultSet rSet=pStatement.executeQuery();
					while(rSet.next()) {
						retteacher=new Teacher();
						retteacher.setTeacher_name(rSet.getString("teacher_name"));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return retteacher;
		} 
		else if (t instanceof Manager) {
			Manager manager=(Manager) t;
			String sql="select * from manager where manager_username=? and manager_userpassword=?";
			Manager retmanager = null;
			try {
				PreparedStatement pStatement=con.prepareStatement(sql);
				pStatement.setString(1,manager.getManager_username());
				pStatement.setString(2, manager.getManager_password());
				ResultSet rSet=pStatement.executeQuery();
				while(rSet.next()) {
					retmanager=new Manager();
					retmanager.setManager_name(rSet.getString("manager_name"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return retmanager;
		}
		else if (t.equals(aManager)) {
			return null;
		}
		// TODO Auto-generated method stub
		else {
			return null;
		}
	}
	public Object delete(Object t, Connection con) {
		if(t instanceof Student) {
			Student student=(Student)t;
		}
		return null;
	}
	public Object change(Object t, Connection con) {
		return null;
	}
	public Object add(Object t, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

}
