package com.great.entity;

public class Menu {

	private int menu_id;
	private int menu_pid;
	private String menu_name;
	private String menu_url;
	
	public Menu() {
		super();
	}
	public Menu(int menu_id, int menu_pid, String menu_name, String menu_url) {
		super();
		this.menu_id = menu_id;
		this.menu_pid = menu_pid;
		this.menu_name = menu_name;
		this.menu_url = menu_url;
	}
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public int getMenu_pid() {
		return menu_pid;
	}
	public void setMenu_pid(int menu_pid) {
		this.menu_pid = menu_pid;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getMenu_url() {
		return menu_url;
	}
	public void setMenu_url(String menu_url) {
		this.menu_url = menu_url;
	}
	
	
}
