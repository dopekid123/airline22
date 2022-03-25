package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.Booking;
import com.lti.app.pojo.Passenger;
import com.lti.app.service.BookingService;
import com.lti.app.service.FlightService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class BookingController {
	
	@Autowired
	BookingService vService;
	
	@GetMapping("/booking")
	public List<Booking> getBooking()
	{
		return vService.getBooking();
	}

	@PostMapping("/booking")
	public Booking addBooking(@RequestBody Booking booking)
	{
		System.out.println(booking);
		return vService.addBooking(booking);
	}
	
	@DeleteMapping("/booking/{pnrNo}")
	public boolean cancelBooking(@PathVariable("pnrNo") long pnrNo)
	{
		
		return vService.cancelFlight(pnrNo);
	}
	

	@GetMapping("/booking/{passengerId}")

	public Booking searchById(@PathVariable("passengerId") Passenger passengerId)
	{
		
		System.out.println(vService.searchById(passengerId)+"dffwefewfew");
		return vService.searchById(passengerId);
	}
}
