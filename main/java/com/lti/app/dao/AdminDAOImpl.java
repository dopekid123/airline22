package com.lti.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	EntityManager eMan;

	@Override
	public boolean addFlight(Admin admin) {
		// TODO Auto-generated method stub
		eMan.persist(admin);
		return true;
	}

	@Override
	public List<Admin> getFlight() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from Admin").getResultList();
	}

	

	@Override
	public boolean deleteFlight(String flightNo) {
		
		Admin obj=eMan.find(Admin.class, flightNo);
		eMan.remove(obj);
		return true;
	}

	@Override
	public Admin findFlight(String flightNo) {
		Admin obj=eMan.find(Admin.class, flightNo);
		return obj;
	}

	@Override
	public boolean updateFlight(Admin admin) {
		// TODO Auto-generated method stub
		eMan.merge(admin);
		return true;
	}
	
	
}
