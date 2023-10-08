package com.creational.builderPattern;

import java.util.List;

public class RugBuilder {
	public String id;
	public String type;
	public double rate;
	public List<String> composition;
	public String status;
	public double width;
	public double length;
	public String metric;	
	public RugBuilder id(String id) {
		this.id = id;
		return this;
	}
	public RugBuilder type(String type) {
		this.type = type;
		return this;
	}	
	public RugBuilder rate(double rate) {
		this.rate = rate;
		return this;
	}
	public RugBuilder status(String status) {
		this.status = status;
		return this;
	}
	public RugBuilder width(double width) {
		this.width = width;
		return this;
	}
	public RugBuilder length(double length) {
		this.length = length;
		return this;
	}
	public Rug build() {
		return new Rug(id, type, rate, composition, status, width, length, metric);
	}
}
