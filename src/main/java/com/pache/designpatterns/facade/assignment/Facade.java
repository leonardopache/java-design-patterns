package com.pache.designpatterns.facade.assignment;

import java.util.Date;

public class Facade {
	private HotelBooker hotelBooker;
	private FlightBooker flightBooker;

	public Facade() {
		hotelBooker = new HotelBooker();
		flightBooker = new FlightBooker();
	}
	
	public void getFlightsAndHotels(Date from, Date to) {
		flightBooker.getFlightsFor(from, to);
		hotelBooker.getHotelNamesFor(from, to); 
		// process and return
	}

}
