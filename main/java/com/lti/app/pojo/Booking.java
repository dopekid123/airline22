package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookflight999")
public class Booking {
	//ManyToOne using PassengerId
	@Id
	@Column(name="pnrno")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pnrNo; 
	@Column(name="customername")
	private String customerName;
	@Column(name="gender")
	private String gender;
	@Column(name="age")
	private String age;
	@Column(name="phoneno")
	private String phoneNo;
	
	@ManyToOne
	@JoinColumn(name="passengerId")
	private Passenger pn;
	
	@ManyToOne
	@JoinColumn(name="flightNo")
	private Flight fn;

	public long getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Passenger getPn() {
		return pn;
	}

	public void setPn(Passenger pn) {
		this.pn = pn;
	}

	public Flight getFn() {
		return fn;
	}

	public void setFn(Flight fn) {
		this.fn = fn;
	}

	@Override
	public String toString() {
		return "Booking [pnrNo=" + pnrNo + ", customerName=" + customerName + ", gender=" + gender + ", age=" + age
				+ ", phoneNo=" + phoneNo + ", pn=" + pn + ", fn=" + fn + "]";
	}

	public Booking(long pnrNo, String customerName, String gender, String age, String phoneNo, Passenger pn,
			Flight fn) {
		super();
		this.pnrNo = pnrNo;
		this.customerName = customerName;
		this.gender = gender;
		this.age = age;
		this.phoneNo = phoneNo;
		this.pn = pn;
		this.fn = fn;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
}
