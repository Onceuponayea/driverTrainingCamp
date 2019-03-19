package com.great.entity;

public class RoleMenu {
	private int rolemenu_id;
	private int menu_id;
	private int role_id;
	
	
	public RoleMenu() {
		super();
	}
	public RoleMenu(int rolemenu_id, int menu_id, int role_id) {
		super();
		this.rolemenu_id = rolemenu_id;
		this.menu_id = menu_id;
		this.role_id = role_id;
	}
	public int getRolemenu_id() {
		return rolemenu_id;
	}
	public void setRolemenu_id(int rolemenu_id) {
		this.rolemenu_id = rolemenu_id;
	}
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	

}
