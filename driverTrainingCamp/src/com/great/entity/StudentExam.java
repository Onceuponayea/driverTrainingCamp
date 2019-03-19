package com.great.entity;

public class StudentExam {
	
	private int studentexam_id;
	private int examarr_id;
	private int student_id;
	
	public StudentExam() {
		super();
	}

	public StudentExam(int studentexam_id, int examarr_id, int student_id) {
		super();
		this.studentexam_id = studentexam_id;
		this.examarr_id = examarr_id;
		this.student_id = student_id;
	}

	public int getStudentexam_id() {
		return studentexam_id;
	}

	public void setStudentexam_id(int studentexam_id) {
		this.studentexam_id = studentexam_id;
	}

	public int getExamarr_id() {
		return examarr_id;
	}

	public void setExamarr_id(int examarr_id) {
		this.examarr_id = examarr_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	
	

}
