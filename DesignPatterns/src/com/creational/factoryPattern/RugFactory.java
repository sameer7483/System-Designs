package com.creational.factoryPattern;

public class RugFactory {
	
	public static Rug getRug(String type) {
		if("HandKnotted".equalsIgnoreCase(type))
			return new HandKnotted();
		else if("HandTufted".equalsIgnoreCase(type))
			return new HandTufted();
		else
			return null;
	}

}
