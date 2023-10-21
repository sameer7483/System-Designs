package com.structural.proxyPattern;

import java.util.ArrayList;
import java.util.List;

public class Proxy {
	
	CustomerDao customerDao;
	
	public Proxy(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public List<String> getCustomers(String role)
	{
		List<String> customers = new ArrayList<>();
		if("WRITE".equalsIgnoreCase(role)) {
			customers = customerDao.getCustomers();
		}
		return customers;
	}
}
