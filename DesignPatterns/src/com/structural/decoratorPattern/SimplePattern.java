package com.structural.decoratorPattern;

public class SimplePattern extends Pattern{

	BaseRug baseRug;
	
	public SimplePattern(BaseRug baseRug) {
		this.baseRug = baseRug;
	}

	@Override
	public int days() {
		
		return (int)(baseRug.days() + 2);
	}

}
