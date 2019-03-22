package com.great.entity;

public class Choose {

	private int choose_id;
	private String choose_name;
	private String choose_true;
	private String choose_image;

	public Choose() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Choose(int choose_id, String choose_name, String choose_true, String choose_image) {
		super();
		this.choose_id = choose_id;
		this.choose_name = choose_name;
		this.choose_true = choose_true;
		this.choose_image = choose_image;
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

	public String getChoose_true() {
		return choose_true;
	}

	public void setChoose_true(String choose_true) {
		this.choose_true = choose_true;
	}

	public String getChoose_image() {
		return choose_image;
	}

	public void setChoose_image(String choose_image) {
		this.choose_image = choose_image;
	}

}
