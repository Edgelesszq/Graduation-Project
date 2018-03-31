package com.Graduationdesign.service;

import java.util.List;

import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Dissertation;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;

public interface Myservice {

	
	 <T> T loginService(T t);
	 List<Manager> searchALlService( );
	 List<AcademyManager> searchAllAcademy();
	 List<Teacher> searchAllTeacher();
	 List<Student> searchAllStudent();
	 Integer quantityAddStudent();
}
