package com.structural.adapterPattern;

public class AdapterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice inv = new InvoiceImpl();
		CurrencyConvertorAdapter adp = new CurrencyConvertorAdapterImpl(inv);
		System.out.println(adp.getTotalAreaInCm2());
		System.out.println(adp.getTotalPriceInRs());

	}

}
