package com.contacts.Entities;

public class Contact {
	
	private Long contact_id;
	private String name;
	private String email;
	
	private Long user_id;
	

	public Long getContact_id() {
		return contact_id;
	}

	public void setContact_id(Long contact_id) {
		this.contact_id = contact_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Contact(Long contact_id, String name, String email, Long user_id) {
		super();
		this.contact_id = contact_id;
		this.name = name;
		this.email = email;
		this.user_id = user_id;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
