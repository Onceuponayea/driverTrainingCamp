package com.great.entity;

public class SubjectTime {
	private int subject_time_id;
	private int level_id;
	private int student_id;
	private int subject_time_sum;
	private String subject_time_date;

	public SubjectTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubjectTime(int subject_time_id, int level_id, int student_id, int subject_time_sum,
			String subject_time_date) {
		super();
		this.subject_time_id = subject_time_id;
		this.level_id = level_id;
		this.student_id = student_id;
		this.subject_time_sum = subject_time_sum;
		this.subject_time_date = subject_time_date;
	}

	public int getSubject_time_id() {
		return subject_time_id;
	}

	public void setSubject_time_id(int subject_time_id) {
		this.subject_time_id = subject_time_id;
	}

	public int getLevel_id() {
		return level_id;
	}

	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getSubject_time_sum() {
		return subject_time_sum;
	}

	public void setSubject_time_sum(int subject_time_sum) {
		this.subject_time_sum = subject_time_sum;
	}

	public String getSubject_time_date() {
		return subject_time_date;
	}

	public void setSubject_time_date(String subject_time_date) {
		this.subject_time_date = subject_time_date;
	}

}
