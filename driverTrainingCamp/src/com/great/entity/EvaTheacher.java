package com.great.entity;

public class EvaTheacher {
	private int evaluate_theacher_id;
	private int theacher_id;
	private int evaluate_id;
	private String evaluate_type;
	private String evaluate_theacher_content;
	private String evaluate_theacher_date;
	public EvaTheacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EvaTheacher(int evaluate_theacher_id, int theacher_id, int evaluate_id, String evaluate_type,
			String evaluate_theacher_content, String evaluate_theacher_date) {
		super();
		this.evaluate_theacher_id = evaluate_theacher_id;
		this.theacher_id = theacher_id;
		this.evaluate_id = evaluate_id;
		this.evaluate_type = evaluate_type;
		this.evaluate_theacher_content = evaluate_theacher_content;
		this.evaluate_theacher_date = evaluate_theacher_date;
	}
	public int getEvaluate_theacher_id() {
		return evaluate_theacher_id;
	}
	public void setEvaluate_theacher_id(int evaluate_theacher_id) {
		this.evaluate_theacher_id = evaluate_theacher_id;
	}
	public int getTheacher_id() {
		return theacher_id;
	}
	public void setTheacher_id(int theacher_id) {
		this.theacher_id = theacher_id;
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
	public String getEvaluate_theacher_content() {
		return evaluate_theacher_content;
	}
	public void setEvaluate_theacher_content(String evaluate_theacher_content) {
		this.evaluate_theacher_content = evaluate_theacher_content;
	}

	public String getEvaluate_theacher_date() {
		return evaluate_theacher_date;
	}
	public void setEvaluate_theacher_date(String evaluate_theacher_date) {
		this.evaluate_theacher_date = evaluate_theacher_date;
	}
	
}
