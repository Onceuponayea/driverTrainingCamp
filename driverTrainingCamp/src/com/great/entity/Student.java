package com.great.entity;

public class Student {
	private int student_id;
	private int teacher_id;
	private int user_id;
	private int subject_id;
	private int level_id;
	private String student_phone;
	private String student_name;
	private String student_sex;
	private String student_idnum;
	private String student_birth;
	private String student_date;
	private String student_adress;
	
	
	public Student() {
		super();
	}
	
	public Student(int student_id, int teacher_id, int user_id, int subject_id, int level_id, String student_phone,
			String student_name, String student_sex, String student_idnum, String student_birth, String student_date,
			String student_adress) {
		super();
		this.student_id = student_id;
		this.teacher_id = teacher_id;
		this.user_id = user_id;
		this.subject_id = subject_id;
		this.level_id = level_id;
		this.student_phone = student_phone;
		this.student_name = student_name;
		this.student_sex = student_sex;
		this.student_idnum = student_idnum;
		this.student_birth = student_birth;
		this.student_date = student_date;
		this.student_adress = student_adress;
	}

	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	public int getLevel_id() {
		return level_id;
	}
	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_sex() {
		return student_sex;
	}
	public void setStudent_sex(String student_sex) {
		this.student_sex = student_sex;
	}
	public String getStudent_idnum() {
		return student_idnum;
	}
	public void setStudent_idnum(String student_idnum) {
		this.student_idnum = student_idnum;
	}
	public String getStudent_birth() {
		return student_birth;
	}
	public void setStudent_birth(String student_birth) {
		this.student_birth = student_birth;
	}
	public String getStudent_date() {
		return student_date;
	}
	public void setStudent_date(String student_date) {
		this.student_date = student_date;
	}
	public String getStudent_adress() {
		return student_adress;
	}
	public void setStudent_adress(String student_adress) {
		this.student_adress = student_adress;
	}

	public String getStudent_phone() {
		return student_phone;
	}

	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}
	
	
	
	
	

}
