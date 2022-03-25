package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration999")
public class Passenger {
	
	@Id
	@Column(name="passengerId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long passengerId;
	@Column(name="title")
	private String title; 
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="cpassword")
	private String cPassword;
	@Column(name="dob")
	private String dob;
	@Column(name="phoneno")
	private long phoneNo;
	public long getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(long passengerId) {
		this.passengerId = passengerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", title=" + title + ", firstName=" + firstName + ", lastName="
				+ lastName + ", userName=" + userName + ", password=" + password + ", cPassword=" + cPassword + ", dob="
				+ dob + ", phoneNo=" + phoneNo + "]";
	}
	public Passenger(long passengerId, String title, String firstName, String lastName, String userName,
			String password, String cPassword, String dob, long phoneNo) {
		super();
		this.passengerId = passengerId;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.cPassword = cPassword;
		this.dob = dob;
		this.phoneNo = phoneNo;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
