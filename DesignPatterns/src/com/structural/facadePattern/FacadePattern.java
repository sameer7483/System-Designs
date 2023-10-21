package com.structural.facadePattern;

import java.util.Arrays;

public class FacadePattern {

	public static void main(String[] args) {
		// Hides the system complexity from the client
		// Ex: Client interact with facade and not dao
		// different from proxy in the sense that proxy handles 
		// access only to particular object, one proxy for one class
		OrderManagementFacade orderManagementFacade = new OrderManagementFacade();
		orderManagementFacade.placeOrder(Arrays.asList("abc"));
	}
}
