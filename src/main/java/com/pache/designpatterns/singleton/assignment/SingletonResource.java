package com.pache.designpatterns.singleton.assignment;

public class SingletonResource {
	
	private static SingletonResource resource; 
	
	private SingletonResource() {}

	public static SingletonResource getResource() {
		// here we can be problem with thread safe. Use eager initialization
		// look for synchronized or Bill Pugh alternatives solutions.
		/** if(resource == null)
			resource = new SingletonResource();*/
		
		return resource;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+ "@" + Integer.toHexString(hashCode());
	}
}
