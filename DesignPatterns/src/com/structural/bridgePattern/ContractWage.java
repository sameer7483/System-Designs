package com.structural.bridgePattern;

public class ContractWage implements WeaveCost{

	@Override
	public double cost(Rug rug) {
		return rug.estimatedDays * 450;
	}

}
