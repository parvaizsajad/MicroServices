package com.user.Entities;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Long user_id;
	private String name;
	private String phone;
	
	List<Contact> contacts=new ArrayList<>();
	
	
	public User(Long user_id, String name, String phone, List<Contact> contacts) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}

	public User(Long user_id, String name, String phone) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", phone=" + phone + ", contacts=" + contacts + "]";
	}
	
	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
  
}
