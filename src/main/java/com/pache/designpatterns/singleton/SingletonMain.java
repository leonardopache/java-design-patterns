/**
 * 
 */
package com.pache.designpatterns.singleton;

import com.pache.designpatterns.singleton.assignment.SingletonResource;

/**
 * Singleton Patterns
 * One particular class has a single and unique instance providing a global
 * point of access. 
 * 
 * @author lpache
 */
public class SingletonMain {

	public static void main(String[] args) {
		SingletonResource singleton1 = SingletonResource.getResource();
		SingletonResource singleton2 = SingletonResource.getResource();
		
		System.out.println(singleton1 + " s1 == s2 " + singleton2);

	}

}
