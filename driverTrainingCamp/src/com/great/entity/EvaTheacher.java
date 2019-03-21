package com.great.entity;

public class EvaTheacher {
	private int evaluate_theacher_id;
	private int teacher_id;
	private int evaluate_id;
	private int level_id;
	private String evaluate_theacher_content;
	private String evaluate_theacher_date;
	public EvaTheacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EvaTheacher(int evaluate_theacher_id, int teacher_id, int evaluate_id, int level_id,
			String evaluate_theacher_content, String evaluate_theacher_date) {
		super();
		this.evaluate_theacher_id = evaluate_theacher_id;
		this.teacher_id = teacher_id;
		this.evaluate_id = evaluate_id;
		this.level_id = level_id;
		this.evaluate_theacher_content = evaluate_theacher_content;
		this.evaluate_theacher_date = evaluate_theacher_date;
	}
	public int getEvaluate_theacher_id() {
		return evaluate_theacher_id;
	}
	public void setEvaluate_theacher_id(int evaluate_theacher_id) {
		this.evaluate_theacher_id = evaluate_theacher_id;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public int getEvaluate_id() {
		return evaluate_id;
	}
	public void setEvaluate_id(int evaluate_id) {
		this.evaluate_id = evaluate_id;
	}
	public int getLevel_id() {
		return level_id;
	}
	public void setLevel_id(int level_id) {
		this.level_id = level_id;
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
