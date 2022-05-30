package com.data.dataOrganizer.java;

public class totalCalculation {
	
	public totalCalculation(double towingFee, double mileageFee) {
		total(towingFee, mileageFee);
	}
	
	public double total(double towingFee, double mileageFee) {
		double total;
		
		total = towingFee + mileageFee;
		
		return total;
	}
}
