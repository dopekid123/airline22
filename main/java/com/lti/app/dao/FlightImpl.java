package com.lti.app.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Flight;

@Repository
public class FlightImpl implements FlightDAO {

	@Autowired
	EntityManager eMan;
	
	List<Flight> list=new ArrayList<>();

	@Override
	public List<Flight> getFlightSelect() {
		
		//return eMan.createQuery("from Flight").getResultList() ;
		return list;
	}

	@Override
	public boolean addFlightSelect(Flight flight) {
		// TODO Auto-generated method stub
		eMan.persist(flight);
		return true;
		
		
	}


	@Override
	public List<Flight> searchFlight(String fromDept, String toArrive, String depart,
			String arrival) {
		// TODO Auto-generated method stub
		Query qry2=eMan.createQuery("from Flight v where v.fromDept=?1 and v.toArrive=?2 and v.depart=?3 and v.arrival=?4");
		qry2.setParameter(1,fromDept);
		qry2.setParameter(2,toArrive);
		qry2.setParameter(3,depart);
		qry2.setParameter(4,arrival);
		
		//List<Flight> res=qry2.getResultList();
		list=(ArrayList<Flight>) qry2.getResultList();
		return list;
	}

	
	
	

	
}
