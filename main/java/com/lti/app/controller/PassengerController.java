package com.lti.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.pojo.Passenger;
import com.lti.app.service.PassengerService;

@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class PassengerController {
	
	@Autowired
	PassengerService vService;
	
	@PostMapping("/passenger")
	public boolean addUser(@RequestBody Passenger passenger)
	{
		System.out.println(passenger);
		return vService.addUser(passenger);
	}
	
	@GetMapping("/passenger")
	public List<Passenger> getUser()
	{
		return vService.getUser();
	}
	
	@PutMapping("/passenger")
	public boolean updateUser(@RequestBody  Passenger passenger)
	{
		return vService.updateUser(passenger);
	}
	
	@GetMapping("/passenger/{passengerId}")
	public Passenger findUser(@PathVariable("passengerId") long passengerId)
	{
		return vService.findUser(passengerId);
	}
	
@GetMapping("/passenger/{title}/{userName}/{password}")
	
	public boolean validateLogin(@PathVariable("title")String title,@PathVariable("userName") String userName,@PathVariable("password") String password)
	{
		//System.out.println(userName);
		//System.out.println(title);
//		vService.validateLogin(title,userName, password);
//		vService.findId(userName).getPassengerId();
//		return vService.findId(userName).getPassengerId();
	return vService.validateLogin(title, userName, password);
		
	}
 



}
