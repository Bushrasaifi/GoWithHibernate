package com.rays.pojo;

public class Admin {

	private int aid;
	private String aname;
	private String dob;
	private String mobile;
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Admin(String aname, String dob, String mobile) {
		super();
		this.aname = aname;
		this.dob = dob;
		this.mobile = mobile;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
