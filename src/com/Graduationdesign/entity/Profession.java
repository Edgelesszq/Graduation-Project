package com.Graduationdesign.entity;

public class Profession {
      private int profession_id;
      private String profession_name;
      private int academy_id;
	public Profession() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profession(int profession_id, String profession_name, int academy_id) {
		super();
		this.profession_id = profession_id;
		this.profession_name = profession_name;
		this.academy_id = academy_id;
	}
	public int getProfession_id() {
		return profession_id;
	}
	public void setProfession_id(int profession_id) {
		this.profession_id = profession_id;
	}
	public String getProfession_name() {
		return profession_name;
	}
	public void setProfession_name(String profession_name) {
		this.profession_name = profession_name;
	}
	public int getAcademy_id() {
		return academy_id;
	}
	public void setAcademy_id(int academy_id) {
		this.academy_id = academy_id;
	}
      
}
