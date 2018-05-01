package com.Graduationdesign.dao.impl;

import java.security.Permission;
import java.security.Permissions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Graduationdesign.dao.UserCRUDDao;
import com.Graduationdesign.entity.Academy;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Class;
import com.Graduationdesign.entity.Dissertation;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Profession;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;
import com.mysql.jdbc.RowData;



@SuppressWarnings("rawtypes")
public class UserCRUDDaoImpl implements UserCRUDDao{
      private Student student;
      private Teacher teacher;
      private Manager manager;
      private AcademyManager amanager;
	  private Dissertation dissertation;
	  private Academy academy;
	  private Profession profession;
	  private Class aClass;
	 private  PreparedStatement pStatement;
	  private ResultSet resultSet;
	  
	  private List<Student> listStudent;
	  private List<Academy> academies;
	  private List<Profession> professions;
	  private List<Class> cList;
	
	  private final static int type_manager=1;
	  private final static int type_amanager=2;
      private final static int type_teacher=3;
	  private final static int type_student=4;
	  private final static int type_academy=5;
	  private final static int type_permission=6;
	  private final static int type_class=7;
	  private final static int type_Dissertation=8;
	  
	  
	  private final static int type_student_name=1;
	  private final static int type_student_username=2;

			  

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
					retmanager.setId(rSet.getInt("manager_id"));
					retmanager.setManager_name(rSet.getString("manager_name"));
					retmanager.setManager_username(rSet.getString("manager_username"));
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
					retamanager.setAmanager_id(rSet.getInt("amanager_id"));
					retamanager.setAmanager_username(rSet.getString("amanager_username"));
					retamanager.setAmanager_password(rSet.getString("amanager_password"));
					retamanager.setAmanager_name(rSet.getString("amanager_name"));
					retamanager.setAcademy_id(rSet.getInt("academy_id"));
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
	public Integer add(Object t, Connection con) {
	int rSet=0;
	if(t instanceof Manager) {
		manager=(Manager) t;
		String sql="Insert into manager(manager_username,manager_password,manager_name) values(?,?,?)";
		try {
			pStatement=con.prepareStatement(sql);
			pStatement.setString(1, manager.getManager_username());
			pStatement.setString(2, manager.getManager_password());
			pStatement.setString(3, manager.getManager_name());
			rSet=pStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rSet;
	}
	if (t instanceof AcademyManager) {
		 amanager=(AcademyManager) t;
		 
		String sql="Insert into amanager(amanager_username,amanager_password,amanager_name,academy_id) values(?,?,?,?)";
		PreparedStatement pStatement;
		try {
			pStatement = con.prepareStatement(sql);
			pStatement.setString(1,amanager.getAmanager_username());
			pStatement.setString(2,amanager.getAmanager_password());
			pStatement.setString(3, amanager.getAmanager_name());
			pStatement.setInt(4, amanager.getAcademy_id());
			rSet=pStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rSet;
	}
	else if (t instanceof Teacher) {
		 teacher=(Teacher) t;
		String sql="Insert into teacher(teacher_username,teacher_password,teacher_name,academy_id) values(?,?,?,?)";
		PreparedStatement pStatement;
		try {
			pStatement = con.prepareStatement(sql);
			pStatement.setString(1,teacher.getTeacher_username());
			pStatement.setString(2,teacher.getTeacher_password());
			pStatement.setString(3, teacher.getTeacher_name());
			pStatement.setInt(4, teacher.getAcademy_id());

			 rSet=pStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rSet;
	}
	else if (t instanceof Student) {
		 student=(Student) t;
		String sql="Insert into student(student_username,student_password,student_name,class_id) values(?,?,?,?)";
		PreparedStatement pStatement;
		try {
			pStatement = con.prepareStatement(sql);
			pStatement.setString(1,student.getStudent_username());
			pStatement.setString(2,student.getStudent_password());
			pStatement.setString(3, student.getStudent_name());
			pStatement.setInt(4,student.getClass_id());
			rSet=pStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return rSet;	
	}
	return rSet;
	
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
				pStatement.setInt(1, teacher.getTeacher_id());
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
	@SuppressWarnings("static-access")
	public List searchAllUser(Connection con, int type,int page) {
		String sql1="select * from manager order by manager_id desc limit ?,?";
		String sql2="select * from amanager order by amanager_id desc limit ?,?";
		String sql3="select * from teacher order by teacher_id desc limit ?,?";
		String sql4="select * from student order by student_id desc limit ?,?";
		PreparedStatement pStatement;
		if (type==type_manager) {
			try {
				List<Manager> mList=new ArrayList<Manager>();
				pStatement=con.prepareStatement(sql1);
				pStatement.setInt(1,(page-1)*Manager.PAGE_SIZE);
				pStatement.setInt(2, Manager.PAGE_SIZE);
				ResultSet resultSet=pStatement.executeQuery();
				while(resultSet.next()) {
					manager=new Manager();
					manager.setId(resultSet.getInt("manager_id"));
					manager.setManager_username(resultSet.getString("manager_username"));
					manager.setManager_password(resultSet.getString("manager_password"));
					manager.setManager_name(resultSet.getString("manager_name"));
					mList.add(manager);
					
				}
				return mList;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if (type==type_amanager) {
			try {
				List<AcademyManager> amList=new ArrayList<AcademyManager>();
				pStatement=con.prepareStatement(sql2);
				pStatement.setInt(1,(page-1)*amanager.PAGE_SIZE);
				pStatement.setInt(2, amanager.PAGE_SIZE);
				ResultSet resultSet=pStatement.executeQuery();
				while(resultSet.next()) {
					amanager=new AcademyManager();
					amanager.setAmanager_id(resultSet.getInt("amanager_id"));
					amanager.setAmanager_username(resultSet.getString("amanager_username"));
					amanager.setAmanager_password(resultSet.getString("amanager_password"));
					amanager.setAmanager_name(resultSet.getString("amanager_name"));
					amList.add(amanager);
					
				}
				return amList;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if (type==type_teacher) {
			try {
				List<Teacher> aTeachers=new ArrayList<Teacher>();
				pStatement=con.prepareStatement(sql3);
				pStatement.setInt(1,(page-1)*teacher.PAGE_SIZE);
				pStatement.setInt(2, teacher.PAGE_SIZE);
				ResultSet resultSet=pStatement.executeQuery();
				while(resultSet.next()) {
					teacher=new Teacher();
					teacher.setTeacher_id(resultSet.getInt("teacher_id"));
					teacher.setTeacher_username(resultSet.getString("teacher_username"));
					teacher.setTeacher_username(resultSet.getString("teacher_password"));
					teacher.setTeacher_name(resultSet.getString("teacher_name"));
					aTeachers.add(teacher);
					
				}
				return aTeachers;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if (type==type_student) {
			try {
				List<Student> students=new ArrayList<Student>();
				pStatement=con.prepareStatement(sql4);
				pStatement.setInt(1,(page-1)*teacher.PAGE_SIZE);
				pStatement.setInt(2, teacher.PAGE_SIZE);
				ResultSet resultSet=pStatement.executeQuery();
				while(resultSet.next()) {
					student=new Student();
					student.setStudent_id(resultSet.getInt("student_id"));
					student.setStudent_username(resultSet.getString("student_username"));
					student.setStudent_password(resultSet.getString("student_password"));
					student.setStudent_name(resultSet.getString("student_name"));
					students.add(student);
					
				}
				return students;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return null;
	}
	public int searchAllnum(Connection con, int type) {
		String sql1="select count(*) from manager";
		String sql2="select count(*) from amanager";
		String sql3="select count(*) from teacher";
		String sql4="select count(*) from student";
		int count=0;
		if(type==type_manager) {
			try {
				PreparedStatement pStatement=con.prepareStatement(sql1);
				ResultSet rSet=pStatement.executeQuery();
				while(rSet.next()) {
					count=rSet.getInt(1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
		}
		else if(type==type_amanager) {
			PreparedStatement pStatement;
			try {
				pStatement = con.prepareStatement(sql2);
				ResultSet rSet=pStatement.executeQuery();
				while(rSet.next()) {
					count=rSet.getInt(1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
			
		}
		else if(type==type_teacher) {
			PreparedStatement pStatement;
			try {
				pStatement = con.prepareStatement(sql3);
				ResultSet rSet=pStatement.executeQuery();
				while(rSet.next()) {
					count=rSet.getInt(1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
			
		}
		else if(type==type_student) {
			PreparedStatement pStatement;
			try {
				pStatement = con.prepareStatement(sql4);
				ResultSet rSet=pStatement.executeQuery();
				while(rSet.next()) {
					count=rSet.getInt(1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
			
		}
		
		return 0;
	}
	public List searchByStudentName(Connection con, Student student,int type) {
		String sql1="select * from student where student_name like ?";//根据学生名字模糊查询
		String sql2="select * from student where student_username like ?";//根据学生的username模糊 查询
		if(type==type_student_name) {
			
		
		try {
			PreparedStatement pStatement=con.prepareStatement(sql1);
			pStatement.setString(1,"%"+student.getStudent_name()+"%");
			ResultSet rSet=pStatement.executeQuery();
			while(rSet.next()){
				student=new Student();
				student.setClass_id(rSet.getInt("student_id"));
				student.setStudent_name(rSet.getString("student_name"));
				student.setStudent_username(rSet.getString("student_username"));
				student.setStudent_password(rSet.getString("student_password"));
				student.setClass_id(rSet.getInt("class_id"));
				listStudent=new ArrayList<Student>();
				listStudent.add(student);
				
				
			}
			return listStudent;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else if(type==type_student_username) {
			
			
			try {
				PreparedStatement pStatement=con.prepareStatement(sql1);
				pStatement.setString(1,"%"+student.getStudent_username()+"%");
				ResultSet rSet=pStatement.executeQuery();
				while(rSet.next()){
					student=new Student();
					student.setClass_id(rSet.getInt("student_id"));
					student.setStudent_name(rSet.getString("student_name"));
					student.setStudent_username(rSet.getString("student_username"));
					student.setStudent_password(rSet.getString("student_password"));
					student.setClass_id(rSet.getInt("class_id"));
					listStudent=new ArrayList<Student>();
					listStudent.add(student);
					
					
				}
				return listStudent;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		return null;
	}
	public int addAcademy(Academy academy, Connection con) {
		int i=0;
		String sql="insert into academy(academy_id,academy_name) values(?,?)";
		try {
			
			PreparedStatement pStatement=con.prepareStatement(sql);
			pStatement.setInt(1,academy.getAcademy_id());
			pStatement.setString(2,academy.getAcademy_name());
			i=pStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
	public int addProfession(Profession profession, Connection con) {
		int i=0;
		String sql="insert into ";
		try {
			
			PreparedStatement pStatement=con.prepareStatement(sql);
			pStatement.setString(1,"");
			ResultSet rSet=pStatement.executeQuery();
			while (rSet.next()) {
				
				i++;
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public int addClass(Class class1, Connection con) {
		int i=0;
		String sql="insert into ";
		try {
			
			PreparedStatement pStatement=con.prepareStatement(sql);
			pStatement.setString(1,"");
			ResultSet rSet=pStatement.executeQuery();
			while (rSet.next()) {
				
				i++;
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public Profession searchPBA() {
		return null;
	}
	public Class searchCBP() {
		// TODO Auto-generated method stub
		return null;
	}
	public List searchAllAcademy(Connection con) {
			String sql="select * from academy";
			List<Academy> academies = null;
			Academy reacademy=null;
			try {
				PreparedStatement pStatement=con.prepareStatement(sql);
				ResultSet resultSet=pStatement.executeQuery();
				academies=new ArrayList<Academy>();
				while(resultSet.next()) {
					reacademy=new Academy();
					
					reacademy.setAcademy_id(resultSet.getInt("academy_id"));
					reacademy.setAcademy_name(resultSet.getString("academy_name"));
					academies.add(reacademy);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return academies;
		
		
	}
	public List searchAllProfession(Connection con) {
		String sql="select * from profession";
		professions=new ArrayList<Profession>();
		try {
			
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			ResultSet rSet=preparedStatement.executeQuery();
			while(rSet.next()) {
		    profession=new Profession();
			profession.setProfession_id(rSet.getInt("profession_id"));
			profession.setProfession_name(rSet.getString("profession_name"));	
			profession.setAcademy_id(rSet.getInt("academy_id"));
			professions.add(profession);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return professions;
	}
	public List searchAllProfessionbyAcademy(Connection con, Academy academy) {
		String sql="select * from profession where academy_id=?";
		try {
			 pStatement=con.prepareStatement(sql);
			pStatement.setInt(1,academy.getAcademy_id());
			professions=new ArrayList<Profession>();
			 resultSet=pStatement.executeQuery();
			 while(resultSet.next()) {
				    profession=new Profession();
					profession.setProfession_id(resultSet.getInt("profession_id"));
					profession.setProfession_name(resultSet.getString("profession_name"));	
					profession.setAcademy_id(resultSet.getInt("academy_id"));
					professions.add(profession);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return professions;
	}
	public List searchAllclass(Connection con) {
		String sql="select * from class";
		cList=new ArrayList<Class>();
		try {
			
			pStatement=con.prepareStatement(sql);
			 resultSet=pStatement.executeQuery();
			 while(resultSet.next()) {
				 aClass=new Class();
				 aClass.setClass_id(resultSet.getInt("class_id"));
				 aClass.setClass_name(resultSet.getString("class_name"));
				 aClass.setProfession_id(resultSet.getInt("profession_id"));
				 cList.add(aClass);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cList;
	}
	public List searchclassbyProfession(Connection con, Profession profession) {
		String sql="select * from class where profession_id=?";
		cList=new ArrayList<Class>();
		try {
			 
		      pStatement=con.prepareStatement(sql);
		      pStatement.setInt(1, profession.getProfession_id());
		      resultSet=pStatement.executeQuery();
		      while(resultSet.next()) {
		    	  aClass=new Class();
		    	  aClass.setClass_id(resultSet.getInt("class_id"));
				 aClass.setClass_name(resultSet.getString("class_name"));
			     aClass.setProfession_id(resultSet.getInt("profession_id"));
			      cList.add(aClass);
		      }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cList;
	}
	public List searchAllStuFAcademy(Connection con, Academy academy) {
		String sql="select * from student where class_id in(select class_id from class where profession_id in(select profession_id from profession where academy_id in(select academy_id from academy where academy_id=?)))";
		listStudent=new ArrayList<Student>();
		try {
			pStatement=con.prepareStatement(sql);
			pStatement.setInt(1, academy.getAcademy_id());
			resultSet=pStatement.executeQuery();
			while(resultSet.next()) {
				student=new Student();
				student.setClass_id(resultSet.getInt("student_id"));
				student.setStudent_name(resultSet.getString("student_name"));
				student.setStudent_username(resultSet.getString("student_username"));
				student.setStudent_password(resultSet.getString("student_password"));
				student.setClass_id(resultSet.getInt("class_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listStudent;
	}
	public List searchAllStuFProfession(Connection con, Profession profession) {
		String sql="SELECT * FROM student WHERE class_id IN(SELECT class_id FROM class WHERE profession_id=1)";
		listStudent=new ArrayList<Student>();
		try {
			pStatement=con.prepareStatement(sql);
			pStatement.setInt(1, profession.getProfession_id());
			resultSet=pStatement.executeQuery();
			while(resultSet.next()) {
				student=new Student();
				student.setClass_id(resultSet.getInt("student_id"));
				student.setStudent_name(resultSet.getString("student_name"));
				student.setStudent_username(resultSet.getString("student_username"));
				student.setStudent_password(resultSet.getString("student_password"));
				student.setClass_id(resultSet.getInt("class_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listStudent;
	}
	public List searchAllStuFClass(Connection con, Class class1) {
		String sql="select * from student where class_id=?";
		
		listStudent=new ArrayList<Student>();
		try {
			pStatement=con.prepareStatement(sql);
			pStatement.setInt(1, class1.getClass_id());
			resultSet=pStatement.executeQuery();
			while(resultSet.next()) {
				student=new Student();
				student.setClass_id(resultSet.getInt("student_id"));
				student.setStudent_name(resultSet.getString("student_name"));
				student.setStudent_username(resultSet.getString("student_username"));
				student.setStudent_password(resultSet.getString("student_password"));
				student.setClass_id(resultSet.getInt("class_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listStudent;
	}
	public Integer deleteManagerbyType(Connection con, int type, Manager manager) {
		String sql1="delete from manager where manager_id=?";
		String sql2="delete from manager where manager_username=?";
		int row=0;
		if(type==1) {
			try {
				pStatement=con.prepareStatement(sql1);
				pStatement.setInt(1,manager.getId());
			     row=pStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return row;
		}
		else {
			try {
				pStatement=con.prepareStatement(sql1);
				pStatement.setString(2,manager.getManager_username());
			      row=pStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return row;
		}
		
		
		
	}
	public Integer deleteAmanagerbyType(Connection con, int type, AcademyManager aManager) {
		String sql1="delete from amanager where amanager_id=?";
		String sql2="delete from amanager where amanager_username=?";
		int row=0;
		if(type==1) {
			try {
				pStatement=con.prepareStatement(sql1);
				pStatement.setInt(1,aManager.getAmanager_id());
			     row=pStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return row;
		}
		else {
			try {
				pStatement=con.prepareStatement(sql1);
				pStatement.setString(1,aManager.getAmanager_username());
			      row=pStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return row;
		}
	}
	public Integer deleteTeacherbyType(Connection con, int type, Teacher teacher) {
		String sql1="delete from teacher where teacher_id=?";
		String sql2="delete from teacher where teacher_username=?";
		int row=0;
		if(type==1) {
			try {
				pStatement=con.prepareStatement(sql1);
				pStatement.setInt(1,teacher.getTeacher_id());
			     row=pStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return row;
		}
		else {
			try {
				pStatement=con.prepareStatement(sql1);
				pStatement.setString(2,teacher.getTeacher_name());
			      row=pStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return row;
		}
	}
	public Integer deleteStudentbyType(Connection con, int type, Student student) {
		String sql1="delete from student where student_id=?";
		String sql2="delete from student where student_username=?";
		int row=0;
		if(type==1) {
			try {
				pStatement=con.prepareStatement(sql1);
				pStatement.setInt(1,student.getStudent_id());
			    row=pStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return row;
		}
		else {
			try {
				pStatement=con.prepareStatement(sql1);
				pStatement.setString(2,student.getStudent_username());
			    row=pStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return row;
		}
	}
	public Integer updateStudentInfo(Connection con, Student student) {
		String sql="update student set student_name=? , student_password=? where student_id=?";
		int row=0;
		try {
			pStatement=con.prepareStatement(sql);
			pStatement.setString(1,student.getStudent_name());
			pStatement.setString(2, student.getStudent_password());
			pStatement.setInt(3, student.getStudent_id());
			row=pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
	public Integer updateTeacherInfo(Connection con, Teacher teacher) {
		String sql="update student set teacher_name=? , teacher_password=? where teacher_id=?";
		String sql2="update student set teacher_name=? where teacher_id=?";

		String sql3="update student set teacher_name=? where teacher_id=?";

		if(teacher.getTeacher_password()==""&&teacher.getTeacher_name()!=null) {
			return 0;
		}
		else if(teacher.getTeacher_name()==""){
			return 0;
		}
		else {
			int row=0;
			try {
				pStatement=con.prepareStatement(sql);
				pStatement.setString(1,student.getStudent_name());
				pStatement.setInt(2, student.getStudent_id());
				row=pStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return row;
		}
		}
		
	public Integer updateManagerInfo(Connection con, Manager manager) {
		String sql="update manager set manager_password=?,manager_name=? where manager_id=?";
		String sql2="update manager set manager_password=? where manager_id=?";
		String sql3="update manager set manager_name=? where manager_id=?";
        if(manager.getManager_name()==""&&manager.getManager_password()!="") {
        	int row=0;
    		try {
    			pStatement=con.prepareStatement(sql2);
    			pStatement.setString(1,manager.getManager_password());
    			
    			pStatement.setInt(2, manager.getId());
    			row=pStatement.executeUpdate();
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		return row;
        }
        else if(manager.getManager_name()!=""&&manager.getManager_password()=="") {
        	int row=0;
    		try {
    			pStatement=con.prepareStatement(sql3);
    			
    			pStatement.setString(1,manager.getManager_name());
    			pStatement.setInt(2, manager.getId());
    			row=pStatement.executeUpdate();
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		return row;
        }
        else {
		int row=0;
		try {
			pStatement=con.prepareStatement(sql);
			pStatement.setString(1,manager.getManager_password());
			pStatement.setString(2,manager.getManager_name());
			pStatement.setInt(3, manager.getId());
			row=pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
        }
	}
	public Integer updateAmanagerInfo(Connection con, AcademyManager amanager) {
		String sql="update amanager set amanager_password=?,amanager_name=? where amanager_id=?";
		String sql2="update amanager set amanager_password=? where amanager_id=?";
		String sql3="update amanager set amanager_name=? where amanager_id=?";
        if(amanager.getAmanager_name()==""&&amanager.getAmanager_password()!="") {
        	int row=0;
    		try {
    			pStatement=con.prepareStatement(sql2);
    			pStatement.setString(1,amanager.getAmanager_password());
    			
    			pStatement.setInt(2, amanager.getAmanager_id());
    			row=pStatement.executeUpdate();
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		return row;
        }
        else if(amanager.getAmanager_name()!=""&&amanager.getAmanager_password()=="") {
        	int row=0;
    		try {
    			pStatement=con.prepareStatement(sql3);
    			
    			pStatement.setString(1,amanager.getAmanager_name());
    			pStatement.setInt(2, amanager.getAmanager_id());
    			row=pStatement.executeUpdate();
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		return row;
		}
        else {
        	int row=0;
    		try {
    			pStatement=con.prepareStatement(sql);
    			pStatement.setString(1,amanager.getAmanager_password());
    			pStatement.setString(2,amanager.getAmanager_name());
    			pStatement.setInt(3, amanager.getAmanager_id());
    			row=pStatement.executeUpdate();
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		return row;
		}
		
	}
	
	public List searchAllDissertationByAcademy(Connection con, int pages,int id) {
		String sql1="select * from dissertation where teacher_id=(select teacher_id from teacher where academy_id=?) order by dissertation_id desc limit ?,?";
		List<Dissertation> mList=new ArrayList<Dissertation>();
		try {
			
			pStatement=con.prepareStatement(sql1);
			pStatement.setInt(1, id);
			pStatement.setInt(2,(pages-1)*Dissertation.PAGE_SIZE);
			pStatement.setInt(3, Dissertation.PAGE_SIZE);
			ResultSet resultSet=pStatement.executeQuery();
			while(resultSet.next()) {
				dissertation=new Dissertation();
				dissertation.setId(resultSet.getInt("dissertation_id"));
				dissertation.setDis_title(resultSet.getString("dissertation_title"));
				dissertation.setTeacher_id(resultSet.getInt("teacher_id"));
				dissertation.setStatus(resultSet.getInt("dissertation_status"));
				mList.add(dissertation);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mList;
	}
	public int searchAllDissertationNumByAcademy(Connection con, int id) {
		int count = 0;
		String sql5="select count(*) from dissertation where teacher_id=(select teacher_id from teacher where academy_id=?)";
		
			PreparedStatement pStatement;
			try {
				pStatement = con.prepareStatement(sql5);
				pStatement.setInt(1, id);
				ResultSet rSet=pStatement.executeQuery();
				while(rSet.next()) {
					count=rSet.getInt(1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
		}
	public int deleteDissertationByid(int id, Connection con) {
		String sql="delete from dissertation where dissertation_id=?";
		int row=0;
		try {
			pStatement=con.prepareStatement(sql);
			pStatement.setInt(1, id);
			row=pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
	public List searchYesDissbyAcademy_id(int id, Connection con,int status) {
		String sql="select * from dissertation where teacher_id=(select teacher_id from teacher where academy_id=?) and dissertation_status=?";
		List<Dissertation> mList=new ArrayList<Dissertation>();
		try {
			pStatement=con.prepareStatement(sql);
			pStatement.setInt(1, id);
			pStatement.setInt(2, status);
			ResultSet resultSet=pStatement.executeQuery();
			while(resultSet.next()) {
				dissertation=new Dissertation();
				dissertation.setId(resultSet.getInt("dissertation_id"));
				dissertation.setDis_title(resultSet.getString("dissertation_title"));
				dissertation.setTeacher_id(resultSet.getInt("teacher_id"));
				dissertation.setStatus(resultSet.getInt("dissertation_status"));
				mList.add(dissertation);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mList;
	}
	public Dissertation searchDissByid(int id, Connection con) {
		String sql="select * from dissertation where dissertation_id=?";
		
		try {
			dissertation=new Dissertation();
			pStatement=con.prepareStatement(sql);
			pStatement.setInt(1, id);
			resultSet=pStatement.executeQuery();
			while(resultSet.next()) {
				
				dissertation.setId(resultSet.getInt("dissertation_id"));
				dissertation.setDis_title(resultSet.getString("dissertation_title"));
				dissertation.setDis_context(resultSet.getString("dissertation_context"));
				dissertation.setTeacher_id(resultSet.getInt("teacher_id"));
				dissertation.setStatus(resultSet.getInt("dissertation_status"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dissertation;
	}
	
}

	
	
	
   


