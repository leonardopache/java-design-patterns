package com.pache.designpatterns.facade.assignment;

import java.util.Date;

public class FlightBooker {
	public void getFlightsFor(Date from, Date to) { 
		// returns flights available in the particular date
		System.out.println(String.format("return list de Flight from %s to %s",from.toString(), to.toString()));
	}
}
