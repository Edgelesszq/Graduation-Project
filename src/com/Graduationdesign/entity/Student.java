package com.Graduationdesign.entity;

public class Student {
	public static final int PAGE_SIZE=10;

	private int student_id;
     private String student_username;
     private String student_password;
     private String student_name;
     private int class_id;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int student_id, String student_username, String student_password, String student_name,
			int class_id) {
		super();
		this.student_id = student_id;
		this.student_username = student_username;
		this.student_password = student_password;
		this.student_name = student_name;
		this.class_id = class_id;
	}
	
	public Student(int student_id, String student_password, String student_name) {
		super();
		this.student_id = student_id;
		this.student_password = student_password;
		this.student_name = student_name;
	}
	public Student(String student_username, String student_password) {
		super();
		this.student_username = student_username;
		this.student_password = student_password;
	}
	
	public Student(String student_username, String student_password, String student_name, int class_id) {
		super();
		this.student_username = student_username;
		this.student_password = student_password;
		this.student_name = student_name;
		this.class_id = class_id;
	}
	public Student(int student_id, String student_username) {
		super();
		this.student_id = student_id;
		this.student_username = student_username;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
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
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public static int getPageSize() {
		return PAGE_SIZE;
	}
	
	
	
     
}
