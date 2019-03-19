package com.great.entity;

public class CarState {
	
	private int carstate_id;
	private String carstate_name;
	
	public CarState() {
		super();
	}
	
	public CarState(int carstate_id, String carstate_name) {
		super();
		this.carstate_id = carstate_id;
		this.carstate_name = carstate_name;
	}
	public int getCarstate_id() {
		return carstate_id;
	}
	public void setCarstate_id(int carstate_id) {
		this.carstate_id = carstate_id;
	}
	public String getCarstate_name() {
		return carstate_name;
	}
	public void setCarstate_name(String carstate_name) {
		this.carstate_name = carstate_name;
	}
	
}
