package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Booking;
import com.lti.app.pojo.Flight;
import com.lti.app.pojo.Passenger;

public interface BookingService {
	
	public Booking addBooking(Booking booking);
	public List<Booking> getBooking();
	public boolean cancelFlight(long pnrNo);
	public Booking searchById(Passenger passengerId);

}
