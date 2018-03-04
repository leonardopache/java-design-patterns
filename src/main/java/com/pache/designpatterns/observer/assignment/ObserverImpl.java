package com.pache.designpatterns.observer.assignment;

import java.util.logging.Level;

import com.pache.designpatterns.observer.interfaces.Observer;
import com.pache.utils.LoggerUtils;

public class ObserverImpl implements Observer {
	
	private String value;

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		String str = String.format("Class '%s' updated with value = %s", this.getClass().getSimpleName(), value);
		LoggerUtils.getLogger(this.getClass()).log(Level.INFO, str);
		this.value = value;
	}

	@Override
	public void update(String value) {
		this.setValue(value);
	}

}
