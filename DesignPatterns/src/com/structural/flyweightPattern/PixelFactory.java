package com.structural.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class PixelFactory {

	public static Map<Integer, PixelInterface> pixels = new HashMap<>();;
	
	public static PixelInterface getPixel(int pixel) {
		if(pixels.containsKey(pixel)) {
			return pixels.get(pixel);
		}
		else {
			PixelInterface pix;
			if(pixel == 1) {
				 pix = new Pixel(1);
			}
			else {
				pix = new Pixel(0);	
			}
			pixels.put(pixel, pix);
			return pix;
		}
	}
}
