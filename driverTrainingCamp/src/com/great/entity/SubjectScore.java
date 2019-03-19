package com.great.entity;

public class SubjectScore {
	private int subject_id;

	private int subjectA_score;
	private int subjectB_score;
	private int subjectC_score;
	private int subjectD_score;
	private int subjectA_count;
	private int subjectB_count;
	private int subjectC_count;
	private int subjectD_count;

	public SubjectScore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubjectScore(int subject_id, int subjectA_score, int subjectB_score, int subjectC_score, int subjectD_score,
			int subjectA_count, int subjectB_count, int subjectC_count, int subjectD_count) {
		super();
		this.subject_id = subject_id;
		this.subjectA_score = subjectA_score;
		this.subjectB_score = subjectB_score;
		this.subjectC_score = subjectC_score;
		this.subjectD_score = subjectD_score;
		this.subjectA_count = subjectA_count;
		this.subjectB_count = subjectB_count;
		this.subjectC_count = subjectC_count;
		this.subjectD_count = subjectD_count;
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public int getSubjectA_score() {
		return subjectA_score;
	}

	public void setSubjectA_score(int subjectA_score) {
		this.subjectA_score = subjectA_score;
	}

	public int getSubjectB_score() {
		return subjectB_score;
	}

	public void setSubjectB_score(int subjectB_score) {
		this.subjectB_score = subjectB_score;
	}

	public int getSubjectC_score() {
		return subjectC_score;
	}

	public void setSubjectC_score(int subjectC_score) {
		this.subjectC_score = subjectC_score;
	}

	public int getSubjectD_score() {
		return subjectD_score;
	}

	public void setSubjectD_score(int subjectD_score) {
		this.subjectD_score = subjectD_score;
	}

	public int getSubjectA_count() {
		return subjectA_count;
	}

	public void setSubjectA_count(int subjectA_count) {
		this.subjectA_count = subjectA_count;
	}

	public int getSubjectB_count() {
		return subjectB_count;
	}

	public void setSubjectB_count(int subjectB_count) {
		this.subjectB_count = subjectB_count;
	}

	public int getSubjectC_count() {
		return subjectC_count;
	}

	public void setSubjectC_count(int subjectC_count) {
		this.subjectC_count = subjectC_count;
	}

	public int getSubjectD_count() {
		return subjectD_count;
	}

	public void setSubjectD_count(int subjectD_count) {
		this.subjectD_count = subjectD_count;
	}

}
