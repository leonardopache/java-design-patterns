/**
 * 
 */
package com.pache.designpatterns.facade;

import java.util.Calendar;

import com.pache.designpatterns.facade.assignment.Facade;

/**
 * Facade Patterns sample.
 * 
 * This is a structural pattern, supports loose coupling and defines a
 * higher-level interface that makes the subsystem easier to use.
 * 
 * @author lpache
 */
public class FacadeMain {

	public static void main(String[] args) {
		Calendar to = Calendar.getInstance();
		to.add(Calendar.MONTH, 1);
		to.getTime();
		Calendar from = Calendar.getInstance();

		Facade facade = new Facade();
		facade.getFlightsAndHotels(from.getTime(), to.getTime());
	}

}
