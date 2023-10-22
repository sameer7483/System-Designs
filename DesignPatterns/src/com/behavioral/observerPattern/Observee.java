package com.behavioral.observerPattern;

public abstract class Observee {
	public abstract boolean addObserver(Observer obs);
	public abstract boolean removeObserver(Observer obs);
	public abstract boolean notifyChange();

}
