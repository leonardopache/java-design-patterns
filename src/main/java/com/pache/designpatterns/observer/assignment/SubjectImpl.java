package com.pache.designpatterns.observer.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import com.pache.designpatterns.observer.interfaces.Observer;
import com.pache.designpatterns.observer.interfaces.Subject;
import com.pache.utils.LoggerUtils;

public class SubjectImpl implements Subject {
	
	private String value;
	private List<Observer> listOfObservers = new ArrayList<>();

	public SubjectImpl() {
		LoggerUtils.getLogger(SubjectImpl.class).log(Level.INFO, "Initialize subject value with 'Initial'");
		setValue("Initial");
	}
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
		this.notifyObservers(this.value);
	}

	@Override
	public void notifyObservers(String value) {
		for (Observer observer : listOfObservers) {
			observer.update(value);
		}
	}
	@Override
	public void register(Observer observer) {
		listOfObservers.add(observer);
	}
	
	@Override
	public void unregister(Observer observer) {
		listOfObservers.remove(observer);
	}
}
