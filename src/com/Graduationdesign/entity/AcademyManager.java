package com.Graduationdesign.entity;

public class AcademyManager {
     private String amanager_name;
     private String amanager_username;
     private String amanager_password;
	public AcademyManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AcademyManager(String amanager_username, String amanager_password) {
		super();
		this.amanager_username = amanager_username;
		this.amanager_password = amanager_password;
	}
	public String getAmanager_name() {
		return amanager_name;
	}
	public void setAmanager_name(String amanager_name) {
		this.amanager_name = amanager_name;
	}
	public String getAmanager_username() {
		return amanager_username;
	}
	public void setAmanager_username(String amanager_username) {
		this.amanager_username = amanager_username;
	}
	public String getAmanager_password() {
		return amanager_password;
	}
	public void setAmanager_password(String amanager_password) {
		this.amanager_password = amanager_password;
	}
     
}
