package com.pache.designpatterns.factorymethod.assignment;

public class DecodedImage {

	private String image;
	
	public DecodedImage(String image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "Image Decoded:["+image+"]";
	}
}
