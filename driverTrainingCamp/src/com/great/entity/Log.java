package com.great.entity;

public class Log {
	
	private int log_id;
	private String log_detail;
	private String log_date;
	private String log_type;
	
	public Log() {
		super();
	}
	public Log(int log_id, String log_detail, String log_date, String log_type) {
		super();
		this.log_id = log_id;
		this.log_detail = log_detail;
		this.log_date = log_date;
		this.log_type = log_type;
	}
	public int getLog_id() {
		return log_id;
	}
	public void setLog_id(int log_id) {
		this.log_id = log_id;
	}
	public String getLog_detail() {
		return log_detail;
	}
	public void setLog_detail(String log_detail) {
		this.log_detail = log_detail;
	}
	public String getLog_date() {
		return log_date;
	}
	public void setLog_date(String log_date) {
		this.log_date = log_date;
	}
	public String getLog_type() {
		return log_type;
	}
	public void setLog_type(String log_type) {
		this.log_type = log_type;
	}
	
}
