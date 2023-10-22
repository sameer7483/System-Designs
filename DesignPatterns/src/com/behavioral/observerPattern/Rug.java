package com.behavioral.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Rug extends Observee{

	String status;
	List<Observer> observers = new ArrayList<>();
	
	public boolean addObserver(Observer obs) {
		observers.add(obs);
		return true;
	}
	public boolean setStatus(String status) {
		this.status = status;
		notifyChange();
		return true;
		
	}
	@Override
	public boolean removeObserver(Observer obs) {
		observers.remove(obs);
		return true;
	}
	@Override
	public boolean notifyChange() {
		for(Observer obs : observers) {
			obs.notifyChange(this);
		}
		return true;
	}
}
