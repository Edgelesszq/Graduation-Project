package com.Graduationdesign.dao;

import java.sql.Connection;
import java.util.List;

import com.Graduationdesign.entity.Dissertation;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;

public interface UserCRUDDao<T, E> {
     T search(T t,Connection con);
     T delete(T t,Connection con);
     T change(T t,Connection con);
     T add(T t,Connection con);
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
     List<E> searchAllUser(Connection con,int type);
 
}