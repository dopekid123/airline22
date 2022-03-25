package com.lti.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.dao.AdminDAO;
import com.lti.app.pojo.Admin;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDAO vdao;
	
	@Override
	public boolean addFlight(Admin admin) {
		// TODO Auto-generated method stub
		return vdao.addFlight(admin);
	}

	@Override
	public List<Admin> getFlight() {
		// TODO Auto-generated method stub
		return vdao.getFlight();
	}


	@Override
	public boolean deleteFlight(String flightNo) {
		// TODO Auto-generated method stub
		
		return vdao.deleteFlight(flightNo);
	}

	@Override
	public Admin findFlight(String flightNo) {
		// TODO Auto-generated method stub
		return vdao.findFlight(flightNo);
	}

	@Override
	public boolean updateFlight(Admin admin) {
		// TODO Auto-generated method stub
		return vdao.updateFlight(admin);
	}
	
	
	

}
