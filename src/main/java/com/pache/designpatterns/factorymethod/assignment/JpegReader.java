package com.pache.designpatterns.factorymethod.assignment;

import com.pache.designpatterns.factorymethod.interfaces.ImageReader;

class JpegReader implements ImageReader {
	
	private DecodedImage decodedImage;

	public JpegReader(String image) {
		decodedImage = new DecodedImage(image);
	}
	
	@Override
	public DecodedImage getDecodedImage() {
		return decodedImage;
	}

}
