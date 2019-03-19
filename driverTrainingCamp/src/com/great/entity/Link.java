package com.great.entity;

public class Link {
	private int link_id;
	private String link_name;
	private String link_url;
	
	public Link() {
		super();
	}

	public Link(int link_id, String link_name, String link_url) {
		super();
		this.link_id = link_id;
		this.link_name = link_name;
		this.link_url = link_url;
	}

	public int getLink_id() {
		return link_id;
	}

	public void setLink_id(int link_id) {
		this.link_id = link_id;
	}

	public String getLink_name() {
		return link_name;
	}

	public void setLink_name(String link_name) {
		this.link_name = link_name;
	}

	public String getLink_url() {
		return link_url;
	}

	public void setLink_url(String link_url) {
		this.link_url = link_url;
	}
}
