package com.Graduationdesign.entity;

public class AcademyManager {
	public static final int PAGE_SIZE=10;
	  private int amanager_id;
     private String amanager_name;
     private String amanager_username;
     private String amanager_password;
     private int academy_id;
	public AcademyManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AcademyManager(String amanager_username) {
		super();
		this.amanager_username = amanager_username;
	}

	public AcademyManager(int amanager_id) {
		super();
		this.amanager_id = amanager_id;
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
	public int getAmanager_id() {
		return amanager_id;
	}
	public void setAmanager_id(int amanager_id) {
		this.amanager_id = amanager_id;
	}
	public int getAcademy_id() {
		return academy_id;
	}
	public void setAcademy_id(int academy_id) {
		this.academy_id = academy_id;
	}
	public AcademyManager(int amanager_id, String amanager_name, String amanager_username, String amanager_password,
			int academy_id) {
		super();
		this.amanager_id = amanager_id;
		this.amanager_name = amanager_name;
		this.amanager_username = amanager_username;
		this.amanager_password = amanager_password;
		this.academy_id = academy_id;
	}



	public AcademyManager(int amanager_id, String amanager_name, String amanager_password) {
		super();
		this.amanager_id = amanager_id;
		this.amanager_name = amanager_name;
		this.amanager_password = amanager_password;
	}

	public AcademyManager(String amanager_name, String amanager_username, String amanager_password, int academy_id) {
		super();
		this.amanager_name = amanager_name;
		this.amanager_username = amanager_username;
		this.amanager_password = amanager_password;
		this.academy_id = academy_id;
	}

	public AcademyManager(int amanager_id, String amanager_username) {
		super();
		this.amanager_id = amanager_id;
		this.amanager_username = amanager_username;
	}
	
	
	
     
}
