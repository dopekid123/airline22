package com.lti.app.service;

import java.time.LocalDate;
import java.util.List;

import com.lti.app.pojo.Flight;

public interface FlightService {
	
	public boolean addFlightSelect(Flight flight);
	public List<Flight> getFlightSelect();
	
	public List<Flight> searchFlight(String fromDept,String toArrive,String depart,String arrival);
	
}
