package com.lti.app.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.dao.FlightDAO;
import com.lti.app.pojo.Flight;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightDAO vdao;
	
	@Override
	public List<Flight> getFlightSelect() {
		// TODO Auto-generated method stub
		return vdao.getFlightSelect();
	}

	@Override
	public boolean addFlightSelect(Flight flight) {
		// TODO Auto-generated method stub
		return vdao.addFlightSelect(flight);
	}

	@Override
	public List<Flight> searchFlight(String fromDept, String toArrive, String depart, String arrival) {
		// TODO Auto-generated method stub
		return vdao.searchFlight(fromDept, toArrive, depart, arrival);
	}

	

	

	

}
