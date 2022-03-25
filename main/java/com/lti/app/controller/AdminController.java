package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.Admin;
import com.lti.app.pojo.Booking;
import com.lti.app.service.AdminService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class AdminController {
	
	@Autowired
	AdminService vService;
	
	@GetMapping("/addFlight")
	public List<Admin> getBooking()
	{
		return vService.getFlight();
	}

	@PostMapping("/addFlight")
	public boolean addBooking(@RequestBody Admin admin)
	{
		System.out.println("123");
		return vService.addFlight(admin);
	}

	@DeleteMapping("/addFlight/{flightNo}")
	public boolean deleteFlight(@PathVariable("flightNo") String flightNo)
	
	{
		//System.out.println(flightNo);
		return vService.deleteFlight(flightNo);
	}
	
	@PutMapping("/addFlight")
	public boolean updateFlight(@RequestBody Admin admin)
	{
		return vService.updateFlight(admin);
	}
	
	@GetMapping("/addFlight/{flightno}")
	public Admin findFlight(@PathVariable("flightno") String flightNo)
	{
		System.out.println(flightNo);
		return vService.findFlight(flightNo);
	}
}
