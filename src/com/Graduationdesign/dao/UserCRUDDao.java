package com.Graduationdesign.dao;

import java.security.Permission;
import java.sql.Connection;
import java.util.List;

import javax.swing.text.StyledDocument;

import com.Graduationdesign.entity.Academy;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Class;
import com.Graduationdesign.entity.Dissertation;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Profession;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;

public interface UserCRUDDao<T, E> {
     T search(T t,Connection con);
     T delete(T t,Connection con);
     T change(T t,Connection con);
     //添加各种用户信息
     Integer add(T t,Connection con);
     //查询全部各种状态论文题目
     List<E> search_all(Integer integer,Connection con);
     //老师添加论文
     Integer add_dissertation(Dissertation dissertation,Connection con);
     //修改论文 
     Integer update_dissertation(Dissertation dissertation,Connection connection,int type);
     //学生选课
     Integer select_dissertation(Student student,Connection con);
     
     //连表查询（学生表）
     Integer update_dissertation_bystudent(Student student,Connection con);
     //查询每个学生的选题情况
     List<Dissertation> Inquire_allstudent(Connection con);
     //查询单个学生的选课情况  或者    单个老师的出题情况
     Dissertation inDissertation_onestudent(Connection con,T t);
     //查询所有用户信息
     List<E> searchAllUser(Connection con,int type,int page);
     //查询各个表的总数
     int searchAllnum(Connection con,int type);
     //根据学生姓名查询学生信息
     List<Student> searchByStudentName(Connection con,Student student,int type);
     //添加学院
     int addAcademy(Academy academy,Connection con);
     //添加专业
     int  addProfession(Profession profession,Connection con);
     //添加班级
     int addClass(Class class1,Connection con);
     //查询对应学院的专业
     Profession searchPBA();
     //查询对应专业的班级
     Class searchCBP();
     //查询所有学院
     List<Academy> searchAllAcademy(Connection con);
     //查询所有专业
     List<Profession> searchAllProfession(Connection con);
     //查询某个学院对应的专业
     List<Profession> searchAllProfessionbyAcademy(Connection con,Academy academy);
     //查询所有班级
     List<Class> searchAllclass(Connection con);
     //查询某个专业对应的班级
     List<Class>   searchclassbyProfession(Connection con,Profession profession);
     //查询所有某个学院的的所有学生
     List<Student>  searchAllStuFAcademy(Connection con,Academy academy);
     //查询所有某个专业的所有学生
     List<Student> searchAllStuFProfession(Connection con,Profession profession);
     //查询所有某个班级的所有学生
     List<Student> searchAllStuFClass(Connection con,Class class1);
     //根据类型删除某个管理员用户
     Integer deleteManagerbyType(Connection con,int type,Manager manager);
     //根据类型删除某个学院管理员用户
     Integer deleteAmanagerbyType(Connection con,int type,AcademyManager aManager);
     //根据类型删除某个老师用户
     Integer deleteTeacherbyType(Connection con,int type,Teacher teacher);
     //根据类型删除某个学生用户
     Integer deleteStudentbyType(Connection con,int type,Student student);
     //学生修改个人信息
     Integer updateStudentInfo(Connection con,Student student);
     //老师修改个人信息
     Integer updateTeacherInfo(Connection con,Teacher teacher);
     //管理员修改个人信息
     Integer updateManagerInfo(Connection con,Manager manager);
     //学院管理员修改个人信息
     Integer updateAmanagerInfo(Connection con,AcademyManager amanager);
    
     //查询某专业的所有论文
     List<Dissertation> searchAllDissertationByAcademy(Connection con,int pages,int id);
     //查询某专业的所有论文数目
     int searchAllDissertationNumByAcademy(Connection con,int id);
     //根据id 删除dissertation
     int deleteDissertationByid(int id,Connection con);
     //查询已通过审核题目
     List<Dissertation> searchYesDissbyAcademy_id(int id,Connection con,int status);
     //根据id查询题目信息
     Dissertation searchDissByid(int id,Connection con);
     //审核通过
     int EvaYes(int id,Connection con);
     //审核驳回
     int EvaNo(int id,Connection con);
     //根据学院id查找各自学院的老师
     List<Teacher> searchTeacherByAcademyId(int id,Connection con);
     //根据老师id删除老师
     int deleteTeacherByTeacherId(int teacherId,Connection con);
     //学院添加老师
     int addTeacherByAcademyId(int AcademyId,Connection con,Teacher iteacher);
     //学院添加专业
     int addProfesionByAcademy(int AcademyId,Connection con,Profession iProfession);
     //专业添加班级
     int addClassByProfession(int profeId,Connection con,Class isClass);
     //根据班级添加学生
     int addStudentbyClass(int ClassId,Connection con,Student isStudent);
     //根据学院查找所有的专业
     List<Profession> searchProfessionByAcademy(int Academyid,Connection con);
     //根据专业查找所有班级
     List<Class>   searchClassByProfession(int ProfessID,Connection con);
     //根据班级查找所有学生
     List<Student> searchStudentByClass(int ClassId,Connection con);
     
     
    
     
 
}