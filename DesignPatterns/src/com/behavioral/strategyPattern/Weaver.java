package com.behavioral.strategyPattern;

public class Weaver {
	Knots knots;
	public Weaver(Knots knots) {
		this.knots = knots;
	}
	
	public void weave() {
		knots.weave();
	}
}
