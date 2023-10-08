package com.creational.abstractFactoryPattern;

public class ItemFactory {

	public static Item getItem(String type) {
		if("Rug".equalsIgnoreCase(type)) {
			return RugFactory.getRug("Handknotted");
		}
		else if("Cushion".equalsIgnoreCase(type)) {
			return CushionFactory.getCushion("Sofa");
		}
		else
			return null;
			
	}
}
