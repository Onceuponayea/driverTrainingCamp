package com.great.entity;

public class User {
	private int user_id;
	private int userstate_id;
	private int role_id;
	private String user_account;
	private String user_pwd;
	
	
	public User() {
		super();
	}
	public User(int user_id, int userstate_id, int role_id, String user_account, String user_pwd) {
		super();
		this.user_id = user_id;
		this.userstate_id = userstate_id;
		this.role_id = role_id;
		this.user_account = user_account;
		this.user_pwd = user_pwd;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getUserstate_id() {
		return userstate_id;
	}
	public void setUserstate_id(int userstate_id) {
		this.userstate_id = userstate_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	
	

}
