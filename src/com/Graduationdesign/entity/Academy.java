package com.Graduationdesign.entity;

public class Academy {
      private  int academy_id;
      private String academy_name;
	public Academy(int academy_id, String academy_name) {
		super();
		this.academy_id = academy_id;
		this.academy_name = academy_name;
	}
	public int getAcademy_id() {
		return academy_id;
	}
	public void setAcademy_id(int academy_id) {
		this.academy_id = academy_id;
	}
	public String getAcademy_name() {
		return academy_name;
	}
	public void setAcademy_name(String academy_name) {
		this.academy_name = academy_name;
	}
	public Academy() {
		super();
		// TODO Auto-generated constructor stub
	}
      
      
}
