package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="allflight999")
public class Flight {
	
	@Id
	@Column(name="flightno")
	private String flightNo;
	@Column(name="flightname")
	private String flightName;
	@Column(name="fromdept")
	private String fromDept;
	@Column(name="toarrive")
	private String toArrive;
	@Column(name="depart")
	private String depart;
	@Column(name="arrival")
	private String arrival;
	@Column(name="flightecoprice")
	private String flightEcoPrice;
	@Column(name="flightbusprice")
	private String flightBusPrice ;
	@Column(name="duration")
	private long duration;
	@Column(name="cabin")
	private String cabin;
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFromDept() {
		return fromDept;
	}
	public void setFromDept(String fromDept) {
		this.fromDept = fromDept;
	}
	public String getToArrive() {
		return toArrive;
	}
	public void setToArrive(String toArrive) {
		this.toArrive = toArrive;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getFlightEcoPrice() {
		return flightEcoPrice;
	}
	public void setFlightEcoPrice(String flightEcoPrice) {
		this.flightEcoPrice = flightEcoPrice;
	}
	public String getFlightBusPrice() {
		return flightBusPrice;
	}
	public void setFlightBusPrice(String flightBusPrice) {
		this.flightBusPrice = flightBusPrice;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", flightName=" + flightName + ", fromDept=" + fromDept + ", toArrive="
				+ toArrive + ", depart=" + depart + ", arrival=" + arrival + ", flightEcoPrice=" + flightEcoPrice
				+ ", flightBusPrice=" + flightBusPrice + ", duration=" + duration + ", cabin=" + cabin + "]";
	}
	public Flight(String flightNo, String flightName, String fromDept, String toArrive, String depart, String arrival,
			String flightEcoPrice, String flightBusPrice, long duration, String cabin) {
		super();
		this.flightNo = flightNo;
		this.flightName = flightName;
		this.fromDept = fromDept;
		this.toArrive = toArrive;
		this.depart = depart;
		this.arrival = arrival;
		this.flightEcoPrice = flightEcoPrice;
		this.flightBusPrice = flightBusPrice;
		this.duration = duration;
		this.cabin = cabin;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	

}
