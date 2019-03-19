package com.great.entity;

public class SubjectTime {
	private int subject_time_id;
	private int level_id;
	private int student_id;
	private String subject_time_start;
	private String subject_time_end;
	private String subject_time_sum;

	public SubjectTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubjectTime(int subject_time_id, int level_id, int student_id, String subject_time_start,
			String subject_time_end, String subject_time_sum) {
		super();
		this.subject_time_id = subject_time_id;
		this.level_id = level_id;
		this.student_id = student_id;
		this.subject_time_start = subject_time_start;
		this.subject_time_end = subject_time_end;
		this.subject_time_sum = subject_time_sum;
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

	public String getSubject_time_start() {
		return subject_time_start;
	}

	public void setSubject_time_start(String subject_time_start) {
		this.subject_time_start = subject_time_start;
	}

	public String getSubject_time_end() {
		return subject_time_end;
	}

	public void setSubject_time_end(String subject_time_end) {
		this.subject_time_end = subject_time_end;
	}

	public String getSubject_time_sum() {
		return subject_time_sum;
	}

	public void setSubject_time_sum(String subject_time_sum) {
		this.subject_time_sum = subject_time_sum;
	}

}
