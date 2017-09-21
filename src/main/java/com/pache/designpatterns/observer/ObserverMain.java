/**
 * 
 */
package com.pache.designpatterns.observer;

import com.pache.designpatterns.observer.assignment.ObserverImpl;
import com.pache.designpatterns.observer.assignment.SubjectImpl;
import com.pache.designpatterns.observer.interfaces.Observer;

/**
 * Observer Patterns sample.
 * 
 * This is a OneToMany patterns where many objects are observing one particular object subject. 
 * 
 * @author lpache
 */
public class ObserverMain {

	public static void main(String[] args) {
		SubjectImpl subject = new SubjectImpl();
		Observer observer1 = new ObserverImpl();
		Observer observer2 = new ObserverImpl();
		Observer observer3 = new ObserverImpl();
		
		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);
		
		subject.setValue("Updated!");
		
		subject.unregister(observer1);
		subject.unregister(observer2);
		subject.unregister(observer3);
	}

}
