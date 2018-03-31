package com.Graduationdesign.entity;

public class Teacher {
private int teacher_id;
private String teacher_username;
private String teacher_password;
private String teacher_name;




public Teacher(String teacher_username, String teacher_password) {
	super();
	this.teacher_username = teacher_username;
	this.teacher_password = teacher_password;
}
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
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

}
