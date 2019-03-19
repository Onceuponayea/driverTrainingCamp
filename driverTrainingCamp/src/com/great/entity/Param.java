package com.great.entity;

public class Param {

	private int param_id;
	private String param_title;
	private String param_detail;
	
	public Param() {
		super();
	}
	public Param(int param_id, String param_title, String param_detail) {
		super();
		this.param_id = param_id;
		this.param_title = param_title;
		this.param_detail = param_detail;
	}
	public int getParam_id() {
		return param_id;
	}
	public void setParam_id(int param_id) {
		this.param_id = param_id;
	}
	public String getParam_title() {
		return param_title;
	}
	public void setParam_title(String param_title) {
		this.param_title = param_title;
	}
	public String getParam_detail() {
		return param_detail;
	}
	public void setParam_detail(String param_detail) {
		this.param_detail = param_detail;
	}
	
}
