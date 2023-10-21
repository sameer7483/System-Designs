package com.structural.proxyPattern;

import java.util.List;

public class ProxyPattern {
	//Use Case
	// 1. Access Control, 2. Caching, 3. Pre and Post Processing
	// Data Access Validation that I made for Member Search
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proxy proxy = new Proxy(new CustomerDao());
		List<String> customers = proxy.getCustomers("write");
		System.out.println(customers);
		customers = proxy.getCustomers("read");
		System.out.println(customers);
	}

}
