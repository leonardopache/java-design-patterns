package com.pache.designpatterns.observer.assignment;

import com.pache.designpatterns.observer.interfaces.Observer;

public class ObserverImpl implements Observer {
	
	private String value;

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		System.out.println("Class '"+this.getClass().getSimpleName() +"' updated with value = "+ value);
		this.value = value;
	}

	@Override
	public void update(String value) {
		this.setValue(value);
	}

}
