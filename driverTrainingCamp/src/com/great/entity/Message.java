package com.great.entity;

public class Message {
	private int message_id;
	private String message_time;
	private String message_content;
	
	public Message() {
		super();
	}
	public Message(int message_id, String message_time, String message_content) {
		super();
		this.message_id = message_id;
		this.message_time = message_time;
		this.message_content = message_content;
	}
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	public String getMessage_time() {
		return message_time;
	}
	public void setMessage_time(String message_time) {
		this.message_time = message_time;
	}
	public String getMessage_content() {
		return message_content;
	}
	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}
	
	

}
