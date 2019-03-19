package com.great.entity;

public class UserState {
	
	private int userstate_id;
	private String userstate_name;
	
	
	public UserState() {
		super();
	}


	public UserState(int userstate_id, String userstate_name) {
		super();
		this.userstate_id = userstate_id;
		this.userstate_name = userstate_name;
	}


	public int getUserstate_id() {
		return userstate_id;
	}


	public void setUserstate_id(int userstate_id) {
		this.userstate_id = userstate_id;
	}


	public String getUserstate_name() {
		return userstate_name;
	}


	public void setUserstate_name(String userstate_name) {
		this.userstate_name = userstate_name;
	}
	
	
}
