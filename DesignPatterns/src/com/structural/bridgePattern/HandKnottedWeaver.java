package com.structural.bridgePattern;

public class HandKnottedWeaver extends Weaver {
	WeaveCost weaveCost; 
	public HandKnottedWeaver(WeaveCost weaveCost) {
		this.weaveCost = weaveCost;
	}

	@Override
	public double weave(Rug rug) {
		// TODO Auto-generated method stub
		return weaveCost.cost(rug);
	}

}
