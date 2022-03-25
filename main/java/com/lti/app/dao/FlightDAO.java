package com.lti.app.dao;

import java.time.LocalDate;
import java.util.*;

import com.lti.app.pojo.Flight;

public interface FlightDAO {
	
	public boolean addFlightSelect(Flight flight);
	public List<Flight> getFlightSelect();
	
	public List<Flight> searchFlight(String fromDept,String toArrive,String depart,String arrival);
	
	

}
