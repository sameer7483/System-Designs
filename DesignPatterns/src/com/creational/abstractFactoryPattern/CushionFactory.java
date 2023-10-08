package com.creational.abstractFactoryPattern;

public class CushionFactory {
	public static Cushion getCushion(String type) {
		if("Floor".equalsIgnoreCase(type)) {
			return new FloorCushion();
		}
		else if("Sofa".equalsIgnoreCase(type)) {
			return new SofaCushion();
		}
		else 
			return null;
	}
}
