package com.Graduationdesign.entity;

public class Teacher {
	public static final int PAGE_SIZE=10;

	private int teacher_id;
	private String teacher_username;
	private String teacher_password;
	private String teacher_name;
	private int academy_id;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int teacher_id, String teacher_username, String teacher_password, String teacher_name,
			int academy_id) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_username = teacher_username;
		this.teacher_password = teacher_password;
		this.teacher_name = teacher_name;
		this.academy_id = academy_id;
	}
	public Teacher(String teacher_username, String teacher_password) {
		super();
		this.teacher_username = teacher_username;
		this.teacher_password = teacher_password;
	}
	
	public Teacher(int teacher_id, String teacher_username) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_username = teacher_username;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_username() {
		return teacher_username;
	}
	public void setTeacher_username(String teacher_username) {
		this.teacher_username = teacher_username;
	}
	public String getTeacher_password() {
		return teacher_password;
	}
	public void setTeacher_password(String teacher_password) {
		this.teacher_password = teacher_password;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public int getAcademy_id() {
		return academy_id;
	}
	public void setAcademy_id(int academy_id) {
		this.academy_id = academy_id;
	}
	public static int getPageSize() {
		return PAGE_SIZE;
	}
	public Teacher(String teacher_username, String teacher_password, String teacher_name, int academy_id) {
		super();
		this.teacher_username = teacher_username;
		this.teacher_password = teacher_password;
		this.teacher_name = teacher_name;
		this.academy_id = academy_id;
	}
	public Teacher(int teacher_id, String teacher_password, String teacher_name) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_password = teacher_password;
		this.teacher_name = teacher_name;
	}




	

}
