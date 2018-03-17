package com.Graduationdesign.entity;

public class Student {
     private String student_username;
     private String student_password;
     private String student_name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String student_username, String student_password) {
		super();
		this.student_username = student_username;
		this.student_password = student_password;
	}
	public String getStudent_username() {
		return student_username;
	}
	public void setStudent_username(String student_username) {
		this.student_username = student_username;
	}
	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	
     
}
