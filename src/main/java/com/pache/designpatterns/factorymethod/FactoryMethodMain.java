/**
 * 
 */
package com.pache.designpatterns.factorymethod;

import com.pache.designpatterns.factorymethod.assignment.FactoryMethodReader;
import com.pache.designpatterns.factorymethod.interfaces.ImageReader;

/**
 * Factory Method Patterns sample.
 * 
 * This is a creational pattern that uses factory methods to deal with the problem of creating objects.
 * 
 * @author lpache
 *
 */
public class FactoryMethodMain {

	public static void main(String[] args) {
		String image = "image.gif";
		ImageReader imageReader = FactoryMethodReader.getImageReader(image);
		
		imageReader.getDecodedImage().toString();
	}

}
