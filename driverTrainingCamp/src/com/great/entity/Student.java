package com.great.entity;

public class Student {
	private Teacher teacher;
	private School school;
	private int student_id;
	private int user_id;
	private int level_id;
	private int student_teva;
	private int student_seva;
	private int level_name;
	private String student_phone;
	private String student_name;
	private String student_sex;
	private String student_idnum;
	private String student_birth;
	private String student_date;
	private String student_adress;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Teacher teacher, School school, int student_id, int user_id, int level_id, int student_teva,
			int student_seva, int level_name, String student_phone, String student_name, String student_sex,
			String student_idnum, String student_birth, String student_date, String student_adress) {
		super();
		this.teacher = teacher;
		this.school = school;
		this.student_id = student_id;
		this.user_id = user_id;
		this.level_id = level_id;
		this.student_teva = student_teva;
		this.student_seva = student_seva;
		this.level_name = level_name;
		this.student_phone = student_phone;
		this.student_name = student_name;
		this.student_sex = student_sex;
		this.student_idnum = student_idnum;
		this.student_birth = student_birth;
		this.student_date = student_date;
		this.student_adress = student_adress;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getLevel_id() {
		return level_id;
	}

	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}

	public int getStudent_teva() {
		return student_teva;
	}

	public void setStudent_teva(int student_teva) {
		this.student_teva = student_teva;
	}

	public int getStudent_seva() {
		return student_seva;
	}

	public void setStudent_seva(int student_seva) {
		this.student_seva = student_seva;
	}

	public int getLevel_name() {
		return level_name;
	}

	public void setLevel_name(int level_name) {
		this.level_name = level_name;
	}

	public String getStudent_phone() {
		return student_phone;
	}

	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
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

}
