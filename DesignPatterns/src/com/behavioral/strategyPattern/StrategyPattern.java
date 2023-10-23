package com.behavioral.strategyPattern;

public class StrategyPattern {

	public static void main(String[] args) {
		Weaver w1 = new KnottedWeaver(new TurkishKnots());
		Weaver w2 = new KnottedWeaver(new PersianKnots());
		Weaver w3 = new TuftedWeaver(new Tufts());
		w1.weave();
		w2.weave();
		w3.weave();
	}
}
