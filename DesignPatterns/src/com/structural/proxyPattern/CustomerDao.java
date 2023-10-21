package com.structural.proxyPattern;

import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

	public List<String> getCustomers() {
		List<String> customers= populateCustomer();
		return customers;
	}
	
	private List<String> populateCustomer(){
		List<String> customers= new ArrayList<>();
		customers.add("cust1");
		customers.add("cust2");
		customers.add("cust3");
		customers.add("cust4");
		return customers;
		
	}
}
