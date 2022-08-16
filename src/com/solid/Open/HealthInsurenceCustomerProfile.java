package com.solid.Open;

import java.util.Random;

public class HealthInsurenceCustomerProfile implements CustomerProfile {
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}
}
