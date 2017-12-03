package com.pojo;

import javax.persistence.Entity;

@Entity
public class StudentPojo {
	private String fname;
	private String lname;
	private int mbile;
	private int pswrd;
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
	public int getMbile() {
		return mbile;
	}
	public void setMbile(int mbile) {
		this.mbile = mbile;
	}
	public int getPswrd() {
		return pswrd;
	}
	public void setPswrd(int pswrd) {
		this.pswrd = pswrd;
	}
	
	
	
	

}
