package com.pache.designpatterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import com.pache.designpatterns.singleton.assignment.SingletonResource;

public class SingletonPatternsTest {

	@Test
	public void test() {
		SingletonResource singleton1 = SingletonResource.getResource();
		SingletonResource singleton2 = SingletonResource.getResource();
		
		Assert.assertEquals(singleton1, singleton2);
	}

}
