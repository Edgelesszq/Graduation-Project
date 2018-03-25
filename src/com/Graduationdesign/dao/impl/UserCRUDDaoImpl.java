package com.Graduationdesign.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Graduationdesign.dao.UserCRUDDao;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Dissertation;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;



@SuppressWarnings("rawtypes")
public class UserCRUDDaoImpl implements UserCRUDDao{
      private Student student;
      private Teacher teacher;
      private Manager manager;
      private AcademyManager amanager;
	  private Dissertation dissertation;

	public  Object search(Object t, Connection con) {
		
		if (t instanceof Student) {
			  student=(Student) t;
			String sql="select * from student where student_username=? and student_password=?";
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
			  teacher=(Teacher) t;
				String sql="select * from teacher where teacher_username=? and teacher_password=?";
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
			 manager=(Manager) t;
			String sql="select * from manager where manager_username=? and manager_password=?";
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
		else if (t instanceof AcademyManager) {
			 amanager=(AcademyManager) t;
			String sql="select * from amanager where amanager_username=? and amanager_password=?";
			AcademyManager retamanager = null;
			try {
				PreparedStatement pStatement=con.prepareStatement(sql);
				pStatement.setString(1,amanager.getAmanager_username());
				pStatement.setString(2, amanager.getAmanager_password());
				ResultSet rSet=pStatement.executeQuery();
				while(rSet.next()) {
					retamanager=new AcademyManager();
					retamanager.setAmanager_name(rSet.getString("amanager_name"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return retamanager;
		}
		// TODO Auto-generated method stub
		else {
			return null;
		}
	}
	public Object delete(Object t, Connection con) {
		if(t instanceof Student) {
			Student student=(Student)t;
			String sql="";
			PreparedStatement pStatement;
			try {
				pStatement = con.prepareStatement(sql);
				pStatement.setString(1,student.getStudent_name());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
	}
	public Object change(Object t, Connection con) {
		if(t instanceof Student) {
		 student=(Student) t;
			String sql="update student set student_password=? where student_username=?";
			try {
				PreparedStatement pStatement=con.prepareStatement(sql);
				pStatement.setString(1, student.getStudent_password());
				pStatement.setString(2, student.getStudent_username());
				ResultSet rSet=pStatement.executeQuery();
				while(rSet!=null) {
					return true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if (t instanceof Teacher) {
			 teacher=(Teacher) t;
				String sql="update teacher set teacher_password=? where teacher_username=?";
				try {
					PreparedStatement pStatement=con.prepareStatement(sql);
					pStatement.setString(1, teacher.getTeacher_password());
					pStatement.setString(2, teacher.getTeacher_username());
					ResultSet rSet=pStatement.executeQuery();
					while(rSet!=null) {
						return true;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		else if (t instanceof AcademyManager) {
			 amanager=(AcademyManager) t;
				String sql="update amanager set amanager_password=? where amanager_username=?";
				try {
					PreparedStatement pStatement=con.prepareStatement(sql);
					pStatement.setString(1, amanager.getAmanager_password());
					pStatement.setString(2, amanager.getAmanager_username());
					ResultSet rSet=pStatement.executeQuery();
					while(rSet!=null) {
						return true;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		else if (t instanceof Manager) {
			 manager=(Manager) t;
				String sql="update manager set manager_password=? where manager_username=?";
				try {
					PreparedStatement pStatement=con.prepareStatement(sql);
					pStatement.setString(1, manager.getManager_password());
					pStatement.setString(2, manager.getManager_username());
					ResultSet rSet=pStatement.executeQuery();
					while(rSet!=null) {
						return true;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		return false;
	}
	public Object add(Object t, Connection con) {
	if (t instanceof AcademyManager) {
		 amanager=(AcademyManager) t;
		String sql="Insert into manager(manager_username,manager_password,manager_name) values(?,?,?)";
		PreparedStatement pStatement;
		try {
			pStatement = con.prepareStatement(sql);
			pStatement.setString(1,amanager.getAmanager_username());
			pStatement.setString(2,amanager.getAmanager_password());
			pStatement.setString(3, amanager.getAmanager_name());
			ResultSet rSet=pStatement.executeQuery();
			if (rSet!=null) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	else if (t instanceof Teacher) {
		 teacher=(Teacher) t;
		String sql="Insert into teacher(teacher_username,teacher_password,teacher_name) values(?,?,?)";
		PreparedStatement pStatement;
		try {
			pStatement = con.prepareStatement(sql);
			pStatement.setString(1,teacher.getTeacher_username());
			pStatement.setString(2,teacher.getTeacher_password());
			pStatement.setString(3, teacher.getTeacher_name());
			ResultSet rSet=pStatement.executeQuery();
			if (rSet!=null) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	else if (t instanceof Student) {
		 student=(Student) t;
		String sql="Insert into student(student_username,student_password,student_name) values(?,?,?)";
		PreparedStatement pStatement;
		try {
			pStatement = con.prepareStatement(sql);
			pStatement.setString(1,student.getStudent_username());
			pStatement.setString(2,student.getStudent_password());
			pStatement.setString(3, student.getStudent_name());
			ResultSet rSet=pStatement.executeQuery();
			if (rSet!=null) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	return false;	
	}
	public List search_all(Integer t,Connection con) {
		
			String sql="select * from dissertation where dissertation_status=?";
			List<Dissertation> list=new ArrayList<Dissertation>();

			try {
				Dissertation dissertation=null;
				PreparedStatement pStatement=con.prepareStatement(sql);
				pStatement.setInt(1,t);
				ResultSet rSet=pStatement.executeQuery();
				while(rSet.next()) {
					dissertation=new Dissertation();
					dissertation.setId(rSet.getInt("id"));
					dissertation.setDis_title(rSet.getString("dissertation_title"));
					dissertation.setDis_context(rSet.getString("dissertation_context"));
					list.add(dissertation);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
	public Integer add_dissertation(Dissertation dissertation,Connection con) {
		String sql="insert into dissertation(dissertation_title,dissertation_context,teacher_id) values(?,?,?)";
		Integer result = null;
		try {
			PreparedStatement pStatement=con.prepareStatement(sql);
			pStatement.setString(1, dissertation.getDis_title());
			pStatement.setString(2, dissertation.getDis_context());
		    pStatement.setInt(3, dissertation.getTeacher_id());
            result=pStatement.executeUpdate();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public Integer update_dissertation(Dissertation dissertation, Connection con,int type) {
		String sql="update dissertation set dissertation_title=? where id=?";//根据id 修改论文题目
		String sql2="update dissertation set dissertation_title=? and dissertation_context=? where id=?";//根据id修改题目和内容
		String sql3="update dissertation set dissertation_context where id=?";//根据id修改论文内容
		Integer result=null;
		try {
			if(type==1) {
				PreparedStatement pStatement=con.prepareStatement(sql);
				pStatement.setString(1, dissertation.getDis_title());
				pStatement.setInt(2, dissertation.getId());
				result=pStatement.executeUpdate();
				
			}
			else if(type==2){
				PreparedStatement pStatement=con.prepareStatement(sql2);
				pStatement.setString(1, dissertation.getDis_title());
				pStatement.setString(2, dissertation.getDis_context());
				pStatement.setInt(3, dissertation.getId());
				result=pStatement.executeUpdate();
			}
			else if(type==3){
				PreparedStatement pStatement=con.prepareStatement(sql3);
				pStatement.setString(1, dissertation.getDis_context());
				pStatement.setInt(2, dissertation.getId());
				result=pStatement.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		return result;
	}
	public Integer update_dissertation_bystudent(Student student, Connection con) {
		String sql="";
		return null;
	}
	public Integer select_dissertation(Student student, Connection con) {
        String sql="update into dissertation(dissertation_status,student_id) values(0,?)";
        Integer result=null;
        try {
			PreparedStatement pStatement=con.prepareStatement(sql);
			pStatement.setInt(1,student.getStudent_id());
			result=pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public List Inquire_allstudent(Connection con) {
		String sql="select * from dissertation";
		List<Dissertation> resultlist=null;
		try {
			PreparedStatement pStatement=con.prepareStatement(sql);
			ResultSet rSet=pStatement.executeQuery();
			resultlist=new ArrayList<Dissertation>();

			while(rSet.next()) {
				dissertation=new Dissertation();
				dissertation.setId(rSet.getInt("id"));
				dissertation.setTeacher_id(rSet.getInt("teacher_id"));
				dissertation.setStudent_id(rSet.getInt("student_id"));
				dissertation.setDis_title(rSet.getString("dissertation_title"));
				dissertation.setDis_context(rSet.getString("dissertation_context"));
				resultlist.add(dissertation);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultlist;
	}
	public Dissertation inDissertation_onestudent(Connection con, Object t) {
		
		if (t instanceof Student) {
	        Student student=(Student) t;
	        String sql="select * from dissertation where student_id=?";
	        PreparedStatement pStatement=null;
	      try {
			 pStatement= con.prepareStatement(sql);
			 pStatement.setInt(1,student.getStudent_id());
			 ResultSet rset=pStatement.executeQuery();
			 while(rset.next()) {
				 dissertation=new Dissertation();
				 dissertation.setDis_title(rset.getString("dissertation_title"));
				 dissertation.setDis_context(rset.getString("dissertation_context"));
				 dissertation.setTeacher_id(rset.getInt("teacher_id"));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return dissertation;

		}
		else if(t instanceof Teacher){
			Teacher teacher=(Teacher) t;
			String sql="select * from dissertation where teacher_id=?";
	        PreparedStatement pStatement=null;
	        
	        try {
				pStatement=con.prepareStatement(sql);
				pStatement.setString(1, teacher.getTeacher_id());
				ResultSet rSet=pStatement.executeQuery();
				while(rSet.next()) {
					dissertation=new Dissertation();
					dissertation.setDis_title(rSet.getString("dissertation_title"));
					dissertation.setDis_context(rSet.getString("dissertation_context"));
					dissertation.setStatus(rSet.getInt("dissertation_status"));
					dissertation.setStudent_id(rSet.getInt("student_id"));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return dissertation;

		}
		return null;
	}
    

}
