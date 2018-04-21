package com.Graduationdesign.entity;

public class Class {
	private int class_id;
	private String class_name;
	private int profession_id;
	public Class(int class_id, String class_name, int profession_id) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
		this.profession_id = profession_id;
	}
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public int getProfession_id() {
		return profession_id;
	}
	public void setProfession_id(int profession_id) {
		this.profession_id = profession_id;
	}
    
	
}
