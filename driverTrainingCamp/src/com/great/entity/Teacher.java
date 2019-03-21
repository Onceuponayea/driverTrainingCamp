package com.great.entity;

import java.util.List;

public class Teacher {

	private School school;
	private int teacher_id;
	private int user_id;
	private int teacher_state;
	private String teacher_name;
	private String teacher_sex;
	private String teacher_phone;
	private String teacher_birth;
	private String teacher_img;
	private String teacher_intruduce;
	private List<Student> students;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(School school, int teacher_id, int user_id, String teacher_name, String teacher_sex,
			String teacher_phone, int teacher_state, String teacher_birth, String teacher_img, String teacher_intruduce,
			List<Student> students) {
		super();
		this.school = school;
		this.teacher_id = teacher_id;
		this.user_id = user_id;
		this.teacher_name = teacher_name;
		this.teacher_sex = teacher_sex;
		this.teacher_phone = teacher_phone;
		this.teacher_state = teacher_state;
		this.teacher_birth = teacher_birth;
		this.teacher_img = teacher_img;
		this.teacher_intruduce = teacher_intruduce;
		this.students = students;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
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
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_sex() {
		return teacher_sex;
	}
	public void setTeacher_sex(String teacher_sex) {
		this.teacher_sex = teacher_sex;
	}
	public String getTeacher_phone() {
		return teacher_phone;
	}
	public void setTeacher_phone(String teacher_phone) {
		this.teacher_phone = teacher_phone;
	}
	public int getTeacher_state() {
		return teacher_state;
	}
	public void setTeacher_state(int teacher_state) {
		this.teacher_state = teacher_state;
	}
	public String getTeacher_birth() {
		return teacher_birth;
	}
	public void setTeacher_birth(String teacher_birth) {
		this.teacher_birth = teacher_birth;
	}
	public String getTeacher_img() {
		return teacher_img;
	}
	public void setTeacher_img(String teacher_img) {
		this.teacher_img = teacher_img;
	}
	public String getTeacher_intruduce() {
		return teacher_intruduce;
	}
	public void setTeacher_intruduce(String teacher_intruduce) {
		this.teacher_intruduce = teacher_intruduce;
	}
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
