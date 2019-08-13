package com.phonebook.model;

public class Contact {
	
	private int id;
	private String first_name;
	private String last_name;
	private int phonenumber;
	private String email;
	private int user_id;
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", phonenumber="
				+ phonenumber + ", email=" + email + ", user_id=" + user_id + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
