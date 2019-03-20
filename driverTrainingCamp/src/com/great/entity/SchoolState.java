package com.great.entity;

public class SchoolState {
    private int schoolstate_id;
    private String schoolstate_name;
    
    
	public  SchoolState() {
		super();
	}
	public SchoolState(int schoolstate_id, String schoolstate_name) {
		super();
		this.schoolstate_id = schoolstate_id;
		this.schoolstate_name = schoolstate_name;
	}
	public int getSchoolstate_id() {
		return schoolstate_id;
	}
	public void setSchoolstate_id(int schoolstate_id) {
		this.schoolstate_id = schoolstate_id;
	}
	public String getSchoolstate_name() {
		return schoolstate_name;
	}
	public void setSchoolstate_name(String schoolstate_name) {
		this.schoolstate_name = schoolstate_name;
	}
    
}
