package com.great.entity;

public class School {
	private int school_id;
	private int user_id;
	private String school_name;
	private String school_phone;
	private String school_date;
	private String school_master;
	private String school_code;
	private String school_img;
	private String school_introduce;
	
	
	public School() {
		super();
	}
	public School(int school_id, int user_id, String school_name, String school_phone, String school_date,
			String school_master, String school_code, String school_img, String school_introduce) {
		super();
		this.school_id = school_id;
		this.user_id = user_id;
		this.school_name = school_name;
		this.school_phone = school_phone;
		this.school_date = school_date;
		this.school_master = school_master;
		this.school_code = school_code;
		this.school_img = school_img;
		this.school_introduce = school_introduce;
	}
	public int getSchool_id() {
		return school_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public String getSchool_name() {
		return school_name;
	}
	public String getSchool_phone() {
		return school_phone;
	}
	public String getSchool_date() {
		return school_date;
	}
	public String getSchool_master() {
		return school_master;
	}
	public String getSchool_code() {
		return school_code;
	}
	public String getSchool_img() {
		return school_img;
	}
	public String getSchool_introduce() {
		return school_introduce;
	}
	
	
	

}
