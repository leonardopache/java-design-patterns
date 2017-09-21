package com.pache.designpatterns.factorymethod;

import org.junit.Assert;
import org.junit.Test;

import com.pache.designpatterns.factorymethod.assignment.FactoryMethodReader;
import com.pache.designpatterns.factorymethod.interfaces.ImageReader;

public class FactoryMethodPatternTest {
	
	@Test
	public void factoryTest() {
		String image = "image.jpeg";
		ImageReader imageReader = FactoryMethodReader.getImageReader(image);
		
		Assert.assertNotNull(imageReader);
	}
	
	@Test
	public void decodedReaderTest() {
		String image = "image.gif";
		ImageReader imageReader = FactoryMethodReader.getImageReader(image);
		
		Assert.assertEquals("Image Decoded:[image.gif]", imageReader.getDecodedImage().toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void factoryFormatNotDefinedTest() {
		String image = "image.png";
		ImageReader imageReader = FactoryMethodReader.getImageReader(image);
		
		Assert.assertNull(imageReader);
	}
}
