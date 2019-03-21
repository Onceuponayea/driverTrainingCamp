package com.great.entity;

public class EvaSchool {
	private int evaluate_school_id;
	private int school_id;
	private int level_id;
	private int evaluate_id;
	private String evaluate_type;
	private String evaluate_school_content;
	private String evaluate_school_date;
	public EvaSchool() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EvaSchool(int evaluate_school_id, int school_id, int level_id, int evaluate_id, String evaluate_type,
			String evaluate_school_content, String evaluate_school_date) {
		super();
		this.evaluate_school_id = evaluate_school_id;
		this.school_id = school_id;
		this.level_id = level_id;
		this.evaluate_id = evaluate_id;
		this.evaluate_type = evaluate_type;
		this.evaluate_school_content = evaluate_school_content;
		this.evaluate_school_date = evaluate_school_date;
	}
	public int getEvaluate_school_id() {
		return evaluate_school_id;
	}
	public void setEvaluate_school_id(int evaluate_school_id) {
		this.evaluate_school_id = evaluate_school_id;
	}
	public int getSchool_id() {
		return school_id;
	}
	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}
	public int getLevel_id() {
		return level_id;
	}
	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}
	public int getEvaluate_id() {
		return evaluate_id;
	}
	public void setEvaluate_id(int evaluate_id) {
		this.evaluate_id = evaluate_id;
	}
	public String getEvaluate_type() {
		return evaluate_type;
	}
	public void setEvaluate_type(String evaluate_type) {
		this.evaluate_type = evaluate_type;
	}
	public String getEvaluate_school_content() {
		return evaluate_school_content;
	}
	public void setEvaluate_school_content(String evaluate_school_content) {
		this.evaluate_school_content = evaluate_school_content;
	}
	public String getEvaluate_school_date() {
		return evaluate_school_date;
	}
	public void setEvaluate_school_date(String evaluate_school_date) {
		this.evaluate_school_date = evaluate_school_date;
	}

	
}
