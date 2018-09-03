package com.rays.pojo;

public class User {
	private int uid;
	private String fname;
	private String lname;
	private String dob;
	private String email;
	
	public User() {
		// TODO Auto-generated constructor stub				
	}

	public User(String fname, String lname, String dob, String email) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.email = email;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
