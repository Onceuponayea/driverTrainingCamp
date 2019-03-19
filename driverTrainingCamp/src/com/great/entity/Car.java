package com.great.entity;

public class Car {
	private int car_id;
	private int school_id;
	private int teacher_id;
	private int carstate_id;
	private String car_date;
	private String car_idnum;
	
	public Car() {
		super();
	}
	
	public Car(int car_id, int school_id, int teacher_id, int carstate_id, String car_date, String car_idnum) {
		super();
		this.car_id = car_id;
		this.school_id = school_id;
		this.teacher_id = teacher_id;
		this.carstate_id = carstate_id;
		this.car_date = car_date;
		this.car_idnum = car_idnum;
	}
	
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public int getSchool_id() {
		return school_id;
	}
	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public int getCarstate_id() {
		return carstate_id;
	}
	public void setCarstate_id(int carstate_id) {
		this.carstate_id = carstate_id;
	}
	public String getCar_date() {
		return car_date;
	}
	public void setCar_date(String car_date) {
		this.car_date = car_date;
	}
	public String getCar_idnum() {
		return car_idnum;
	}
	public void setCar_idnum(String car_idnum) {
		this.car_idnum = car_idnum;
	}
	
}
