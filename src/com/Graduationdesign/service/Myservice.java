package com.Graduationdesign.service;

import java.util.List;

import com.Graduationdesign.entity.Academy;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Dissertation;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;

public interface Myservice {

	
	 <T> T loginService(T t);
	 List<Academy> searchAllAcademy();
	 List<Manager> searchALlService(int currentpages);
	 List<AcademyManager> searchAllAcademy(int currentpages);
	 List<Teacher> searchAllTeacher(int currentpages);
	 List<Student> searchAllStudent(int currentpages);
	 Integer quantityAddStudent();
	 
	 //查询总数
	 int search_all_manager_Num();
	 int search_all_Amanager_Num();
	 int search_all_teacher_Num();
	 int search_all_student_Num();
	 //添加学院
	 int addAcademy(Academy academy);
	 
	
	 
}
