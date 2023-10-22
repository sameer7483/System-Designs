package com.structural.FlyweightPattern;

public class FlyweightPattern {

	public static void main(String[] args) {
		// To avoid overflow of memory, try to make use of one object
		// for common properties, and distinct properties can be passed
		// in a method parameter
		PixelInterface pix1 = PixelFactory.getPixel(1);
		PixelInterface pix0 = PixelFactory.getPixel(0);
		for(int i=0;i<3;i++)
			pix1.display(0, i);
		System.out.println();
		for(int i=0;i<3;i++)
			pix0.display(1, i);
		System.out.println();
		for(int i=0;i<3;i++)
			pix1.display(2, i);
	}

}
