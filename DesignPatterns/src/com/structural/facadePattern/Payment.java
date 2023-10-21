package com.structural.facadePattern;

public class Payment {

	public boolean processPayment(int orderId) {
		System.out.println("Payment Done");
		return true;
	}
}
