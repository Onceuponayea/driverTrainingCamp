package com.great.entity;

public class SubjectScore {
	private int subject_score_id;

	private int student_id;
	private int level_id;
	private int subject_score;
	private int subject_score_date;

	public SubjectScore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubjectScore(int subject_score_id, int student_id, int level_id, int subject_score, int subject_score_date) {
		super();
		this.subject_score_id = subject_score_id;
		this.student_id = student_id;
		this.level_id = level_id;
		this.subject_score = subject_score;
		this.subject_score_date = subject_score_date;
	}

	public int getSubject_score_id() {
		return subject_score_id;
	}

	public void setSubject_score_id(int subject_score_id) {
		this.subject_score_id = subject_score_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getLevel_id() {
		return level_id;
	}

	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}

	public int getSubject_score() {
		return subject_score;
	}

	public void setSubject_score(int subject_score) {
		this.subject_score = subject_score;
	}

	public int getSubject_score_date() {
		return subject_score_date;
	}

	public void setSubject_score_date(int subject_score_date) {
		this.subject_score_date = subject_score_date;
	}

}
