package com.great.entity;

public class Crawler {
	private int crawler_id;
	private String crawler_title;
	private String crawler_url;
	
	public Crawler() {
		super();
	}
	public Crawler(int crawler_id, String crawler_title, String crawler_url) {
		super();
		this.crawler_id = crawler_id;
		this.crawler_title = crawler_title;
		this.crawler_url = crawler_url;
	}
	public int getCrawler_id() {
		return crawler_id;
	}
	public void setCrawler_id(int crawler_id) {
		this.crawler_id = crawler_id;
	}
	public String getCrawler_title() {
		return crawler_title;
	}
	public void setCrawler_title(String crawler_title) {
		this.crawler_title = crawler_title;
	}
	public String getCrawler_url() {
		return crawler_url;
	}
	public void setCrawler_url(String crawler_url) {
		this.crawler_url = crawler_url;
	}
	
	
}
