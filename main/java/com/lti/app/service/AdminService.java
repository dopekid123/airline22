package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Admin;

public interface AdminService {

	public boolean addFlight(Admin admin);
	public List<Admin> getFlight();
	
	public boolean deleteFlight(String flightNo);
	
	public Admin findFlight(String flightNo);
	public boolean updateFlight(Admin admin);
}
