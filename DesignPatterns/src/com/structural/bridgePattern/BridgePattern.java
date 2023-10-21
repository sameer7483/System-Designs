package com.structural.bridgePattern;

public class BridgePattern {

	public static void main(String[] args) {
		// The intent of this pattern is to decouple abstraction 
		// from implementation for them to scale independently
		Rug rug = new Rug();
		rug.estimatedDays = 10;
		HandKnottedWeaver hkw = new HandKnottedWeaver(new DailyWage());
		System.out.println(hkw.weave(rug));
		HandKnottedWeaver hkw2 = new HandKnottedWeaver(new ContractWage());
		System.out.println(hkw2.weave(rug));
	}

}
