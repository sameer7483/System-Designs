package com.structural.adapterPattern;

public class CurrencyConvertorAdapterImpl implements CurrencyConvertorAdapter{
	Invoice inv;
	public CurrencyConvertorAdapterImpl(Invoice inv){
		this.inv = inv;
	}
	@Override
	public double getTotalAreaInCm2() {
		
		return inv.getTotalArea()*10000;
	}

	@Override
	public double getTotalPriceInRs() {
		return inv.getTotalPrice()*80;
	}

}
