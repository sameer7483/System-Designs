package com.structural.bridgePattern;

public class DailyWage implements WeaveCost{

	@Override
	public double cost(Rug rug) {
		
		return rug.estimatedDays * 300;
	}

}
