/**
 * 
 */
package com.pache.designpatterns.singleton;

import java.util.logging.Level;

import com.pache.designpatterns.singleton.assignment.SingletonResource;
import com.pache.utils.LoggerUtils;

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
		
		String str = String.format("%s s1 == s2 %s",singleton1, singleton2);
		LoggerUtils.getLogger(SingletonMain.class).log(Level.INFO, str);
	}

}
