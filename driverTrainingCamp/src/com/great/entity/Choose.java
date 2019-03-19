package com.great.entity;

public class Choose {

	private int choose_id;
	private String choose_name;
	private int choose_true;
	
	public Choose() {
		super();
	}

	public Choose(int choose_id, String choose_name, int choose_true) {
		super();
		this.choose_id = choose_id;
		this.choose_name = choose_name;
		this.choose_true = choose_true;
	}
	
	public int getChoose_id() {
		return choose_id;
	}
	public void setChoose_id(int choose_id) {
		this.choose_id = choose_id;
	}
	public String getChoose_name() {
		return choose_name;
	}
	public void setChoose_name(String choose_name) {
		this.choose_name = choose_name;
	}
	public int getChoose_true() {
		return choose_true;
	}
	public void setChoose_true(int choose_true) {
		this.choose_true = choose_true;
	}
	
	
}
