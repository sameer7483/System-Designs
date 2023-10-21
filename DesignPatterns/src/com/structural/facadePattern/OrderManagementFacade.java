package com.structural.facadePattern;

import java.util.List;

public class OrderManagementFacade {
	Order order;
	Invoice invoice;
	Payment payment;
	Notification notification;
	
	public OrderManagementFacade() {
		order = new Order();
		invoice = new Invoice();
		payment = new Payment();
		notification = new Notification();
	}
	
	public boolean placeOrder(List<String> itemIds) {
		int orderId = order.createOrder(itemIds);
		invoice.createInvoice(orderId);
		payment.processPayment(orderId);
		notification.sentNotification(0, orderId);
		return true;
	}
}
