package com.pache.designpatterns.facade.assignment;

import java.util.Date;

public class HotelBooker {
	public void getHotelNamesFor(Date from, Date to) { 
		// returns hotels available in the particular date
		System.out.println(String.format("return list de Hotel from %s to %s",from.toString(), to.toString()));
	}
}
