package com.Graduationdesign.entity;

public class Manager {
	private String manager_username;
	private String manager_password;
	private String manager_name;
	public Manager(String manager_username, String manager_password) {
		super();
		this.manager_username = manager_username;
		this.manager_password = manager_password;
	}
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getManager_username() {
		return manager_username;
	}
	public void setManager_username(String manager_username) {
		this.manager_username = manager_username;
	}
	public String getManager_password() {
		return manager_password;
	}
	public void setManager_password(String manager_password) {
		this.manager_password = manager_password;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

}
