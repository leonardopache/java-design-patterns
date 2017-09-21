package com.pache.designpatterns.factorymethod.assignment;

import com.pache.designpatterns.factorymethod.interfaces.ImageReader;

class GifReader implements ImageReader {

	private DecodedImage decodedImage;
	
	public GifReader(String image) {
		decodedImage = new DecodedImage(image);
	}
	
	@Override
	public DecodedImage getDecodedImage() {
		return decodedImage;
	}

}
