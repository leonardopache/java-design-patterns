package com.pache.designpatterns.observer.interfaces;

public interface Subject {

	void register(Observer observer);

	void notifyObservers(String value);

	void unregister(Observer observer);
	
	
}
