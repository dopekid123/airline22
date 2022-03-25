package com.lti.app.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Booking;
import com.lti.app.pojo.Flight;
import com.lti.app.pojo.Passenger;

@Repository
public class BookingDAOImpl implements BookingDAO{

	@Autowired
	EntityManager eMan;

	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		eMan.persist(booking);
		Booking obj=eMan.find(Booking.class, booking.getPnrNo());
		return obj;
	}

	@Override
	public List<Booking> getBooking() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from Booking").getResultList();
	}

	@Override
	public boolean cancelFlight(long pnrNo) {
		Booking obj=eMan.find(Booking.class, pnrNo);
		eMan.remove(obj);
		return true;
	}
	
////	@SuppressWarnings("unchecked")
//	@Override
//	public List<Booking> searchById(long passengerId) {
//		// TODO Auto-generated method stub
//		Query qry2=eMan.createQuery("from Flight v where v.passengerId=?1");
//		qry2.setParameter(1, passengerId);
//		
//		list=(ArrayList<Booking>) qry2.getResultList();
//		return list ;
//	}
	@Override
	public Booking searchById(Passenger passengerId){
		Booking list = null;
		Query qry2=eMan.createQuery("from Flight v where v.passengerId=?1");
		qry2.setParameter(1, passengerId);
//		
		list=(Booking) qry2.getResultList();
		return list ;
	}
	
	

}
