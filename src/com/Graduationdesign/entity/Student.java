package com.Graduationdesign.entity;

public class Student {
	public static final int PAGE_SIZE=10;

	private int student_id;
     private String student_username;
     private String student_password;
     private String student_name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int student_id) {
		super();
		this.student_id = student_id;
	}
	

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
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
