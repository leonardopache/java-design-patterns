package com.pache.designpatterns.facade;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import com.pache.designpatterns.facade.assignment.Facade;

public class FacePatternTest {

	@Test
	public void facedeTest() {
		Calendar to = Calendar.getInstance();
		to.add(Calendar.MONTH, 1);
		to.getTime();
		Calendar from = Calendar.getInstance();

		try {
			Facade facade = new Facade();
			facade.getFlightsAndHotels(from.getTime(), to.getTime());
		} catch (Exception e) {
			Assert.fail(e.toString());
		}
	}
}
