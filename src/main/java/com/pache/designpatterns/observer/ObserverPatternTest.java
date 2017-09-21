package com.pache.designpatterns.observer;

import org.junit.Before;
import org.junit.Test;

import com.pache.designpatterns.observer.assignment.ObserverImpl;
import com.pache.designpatterns.observer.assignment.SubjectImpl;
import com.pache.designpatterns.observer.interfaces.Observer;

public class ObserverPatternTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ObserverTest() {
		SubjectImpl subject = new SubjectImpl();
		Observer observer = new ObserverImpl();
		
		subject.register(observer);
		subject.setValue("Updated!");
		subject.unregister(observer);
	}

}
