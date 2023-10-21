package com.structural.facadePattern;

public class Notification {

	public boolean sentNotification(int userId, int orderId) {
		System.out.println("Notification Sent");
		return true;
	}
}
