package com.pache.designpatterns.factorymethod.assignment;

import com.pache.designpatterns.factorymethod.interfaces.ImageReader;

public class FactoryMethodReader {

	private FactoryMethodReader() {
	}
	
	public static ImageReader getImageReader(String image) {
		String format = image.substring(image.indexOf('.') + 1, (image.length()));
		switch (format) {
		case "gif":
			return new GifReader(image);
		case "jpeg":
			return new JpegReader(image);
		default:
			throw new IllegalArgumentException("Format not defined!"+ format);
		}
	}

}
