package com.Graduationdesign.entity;

public class Dissertation {
	public static final int PAGE_SIZE=10;
	private int id;
	private String dis_title;
	private String dis_context;
	private int status;
	private int teacher_id;
	private int student_id;
	
	
	public Dissertation(String dis_title, String dis_context, int status, int teacher_id) {
		super();
		this.dis_title = dis_title;
		this.dis_context = dis_context;
		this.status = status;
		this.teacher_id = teacher_id;
	}
	
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
    


	public Dissertation(int id, String dis_title, String dis_context) {
		super();
		this.id = id;
		this.dis_title = dis_title;
		this.dis_context = dis_context;
	}

	public Dissertation(String dis_title, String dis_context) {
		super();
		this.dis_title = dis_title;
		this.dis_context = dis_context;
	}

	public Dissertation(int id, String dis_title, String dis_context, int status) {
		super();
		this.id = id;
		this.dis_title = dis_title;
		this.dis_context = dis_context;
		this.status = status;
	}
	public Dissertation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDis_title() {
		return dis_title;
	}
	public void setDis_title(String dis_title) {
		this.dis_title = dis_title;
	}
	public String getDis_context() {
		return dis_context;
	}
	public void setDis_context(String dis_context) {
		this.dis_context = dis_context;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	

}
