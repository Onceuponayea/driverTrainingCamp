package com.great.entity;

public class Examarr {
	private int examarr_id;
	private int level_id;
	private String examarr_date;
	private String examarr_site;
	
	public Examarr() {
		super();
	}
	
	public Examarr(int examarr_id, int level_id, String examarr_date, String examarr_site) {
		super();
		this.examarr_id = examarr_id;
		this.level_id = level_id;
		this.examarr_date = examarr_date;
		this.examarr_site = examarr_site;
	}
	
	public int getExamarr_id() {
		return examarr_id;
	}
	public void setExamarr_id(int examarr_id) {
		this.examarr_id = examarr_id;
	}
	public int getLevel_id() {
		return level_id;
	}
	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}
	public String getExamarr_date() {
		return examarr_date;
	}
	public void setExamarr_date(String examarr_date) {
		this.examarr_date = examarr_date;
	}
	public String getExamarr_site() {
		return examarr_site;
	}
	public void setExamarr_site(String examarr_site) {
		this.examarr_site = examarr_site;
	}
	
}
