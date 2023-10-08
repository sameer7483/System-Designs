package com.creational.builderPattern;

import java.util.List;

public class Rug {

	public String id;
	public String type;
	public double rate;
	public List<String> composition;
	public String status;
	public double width;
	public double length;
	public String metric;
	public Rug(String id, String type, double rate, List<String> composition, String status, double width,
			double length, String metric) {
		super();
		this.id = id;
		this.type = type;
		this.rate = rate;
		this.composition = composition;
		this.status = status;
		this.width = width;
		this.length = length;
		this.metric = metric;
	}
	
}
