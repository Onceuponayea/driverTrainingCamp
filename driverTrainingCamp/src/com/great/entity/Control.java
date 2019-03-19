package com.great.entity;

public class Control {
	private int control_id;
	private int user_id;
	private String control_name;
	private String control_state;
	private String control_detail;
	
	public Control() {
		super();
	}

	public Control(int control_id, int user_id, String control_name, String control_state, String control_detail) {
		super();
		this.control_id = control_id;
		this.user_id = user_id;
		this.control_name = control_name;
		this.control_state = control_state;
		this.control_detail = control_detail;
	}

	public int getControl_id() {
		return control_id;
	}

	public void setControl_id(int control_id) {
		this.control_id = control_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getControl_name() {
		return control_name;
	}

	public void setControl_name(String control_name) {
		this.control_name = control_name;
	}

	public String getControl_state() {
		return control_state;
	}

	public void setControl_state(String control_state) {
		this.control_state = control_state;
	}

	public String getControl_detail() {
		return control_detail;
	}

	public void setControl_detail(String control_detail) {
		this.control_detail = control_detail;
	}
	
	
}
