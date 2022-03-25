package com.lti.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.dao.PassengerDAO;
import com.lti.app.pojo.Passenger;

@Service
@Transactional
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	PassengerDAO vdao;
	
	@Override
	public boolean addUser(Passenger passenger) {
		// TODO Auto-generated method stub
		return vdao.addUser(passenger);
	}

	@Override
	public List<Passenger> getUser() {
		// TODO Auto-generated method stub
		return vdao.getUser();
	}

	@Override
	public boolean updateUser(Passenger passenger) {
		// TODO Auto-generated method stub
		return vdao.updateUser(passenger);
	}

	@Override
	public Passenger findUser(long passengerId) {
		// TODO Auto-generated method stub
		return vdao.findUser(passengerId);
	}

	@Override
	public boolean validateLogin(String title, String userName, String password)
	{
		System.out.println(userName);
		return vdao.validateLogin(title,userName, password);
	}

	@Override
	public Passenger findId(String userName) {
		// TODO Auto-generated method stub
		return vdao.findId(userName);
	}
	

}
