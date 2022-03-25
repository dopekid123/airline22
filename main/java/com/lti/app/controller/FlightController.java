package com.lti.app.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.Booking;
import com.lti.app.pojo.Flight;
import com.lti.app.service.FlightService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class FlightController {

	@Autowired
	FlightService vService;
	
	@GetMapping("/flightselect")
	public List<Flight> getFlight() 
	{
		System.out.println(vService.getFlightSelect());
		return vService.getFlightSelect();
	}
	
	@PostMapping("/flightselect")
	public boolean addFlight(@RequestBody Flight flight)
	{
		System.out.println(flight);
		return vService.addFlightSelect(flight);
	}
	
	@GetMapping("/flightselect/{fromDept}/{toArrive}/{depart}/{arrival}")
	public List<Flight> searchFlight(@PathVariable("fromDept") String fromDept,@PathVariable("toArrive") String toArrive,@PathVariable("depart") String depart,@PathVariable("arrival") String arrival)
	{
		//System.out.println(fromDept +"" +toArrive +"" +depart+"" +arrival);
		return vService.searchFlight(fromDept, toArrive, depart, arrival);
	}
	
	
	
	
}
