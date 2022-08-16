package com.solid.Open;

public class InsurencePremiumDiscountCalculator {
	public int CalculatePermiumDiscoutPercent(CustomerProfile profile) {
		if(profile.isLoyalCustomer())
		   return 20;
		return 0;
	}
}
