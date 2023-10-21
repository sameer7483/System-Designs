package com.structural.decoratorPattern;

public class ComplexPattern extends Pattern{
	BaseRug baseRug;
	
	public ComplexPattern(BaseRug baseRug) {
		this.baseRug = baseRug;
	}

	@Override
	public int days() {
		
		return (int)(baseRug.days() + baseRug.width/2 + baseRug.length/3);
	}

}
