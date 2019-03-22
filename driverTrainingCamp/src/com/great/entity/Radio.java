package com.great.entity;

public class Radio {
	private int radio_id;
	private String radio_title;
	private String radio_optionA;
	private String radio_optionB;
	private String radio_optionC;
	private String radio_optionD;
	private String radio_answer;
	private String radio_image;

	public Radio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Radio(int radio_id, String radio_title, String radio_optionA, String radio_optionB, String radio_optionC,
			String radio_optionD, String radio_answer, String radio_image) {
		super();
		this.radio_id = radio_id;
		this.radio_title = radio_title;
		this.radio_optionA = radio_optionA;
		this.radio_optionB = radio_optionB;
		this.radio_optionC = radio_optionC;
		this.radio_optionD = radio_optionD;
		this.radio_answer = radio_answer;
		this.radio_image = radio_image;
	}

	public int getRadio_id() {
		return radio_id;
	}

	public void setRadio_id(int radio_id) {
		this.radio_id = radio_id;
	}

	public String getRadio_title() {
		return radio_title;
	}

	public void setRadio_title(String radio_title) {
		this.radio_title = radio_title;
	}

	public String getRadio_optionA() {
		return radio_optionA;
	}

	public void setRadio_optionA(String radio_optionA) {
		this.radio_optionA = radio_optionA;
	}

	public String getRadio_optionB() {
		return radio_optionB;
	}

	public void setRadio_optionB(String radio_optionB) {
		this.radio_optionB = radio_optionB;
	}

	public String getRadio_optionC() {
		return radio_optionC;
	}

	public void setRadio_optionC(String radio_optionC) {
		this.radio_optionC = radio_optionC;
	}

	public String getRadio_optionD() {
		return radio_optionD;
	}

	public void setRadio_optionD(String radio_optionD) {
		this.radio_optionD = radio_optionD;
	}

	public String getRadio_answer() {
		return radio_answer;
	}

	public void setRadio_answer(String radio_answer) {
		this.radio_answer = radio_answer;
	}

	public String getRadio_image() {
		return radio_image;
	}

	public void setRadio_image(String radio_image) {
		this.radio_image = radio_image;
	}

}
