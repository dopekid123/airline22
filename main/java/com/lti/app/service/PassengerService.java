package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Passenger;

public interface PassengerService {
	public boolean addUser(Passenger passenger);
	public List<Passenger> getUser();
	
	public boolean validateLogin(String title,String userName,String password);
	public Passenger findId(String userName);
	
	public boolean updateUser(Passenger passenger);
	public Passenger findUser(long passengerId);

}
