package com.solid.Liskov;

public class InhouseProduct extends Product{
	
	
	@Override
	public double getDiscount() {
		return this.applyDiscount();
	}
	public double applyDiscount() {
		discout = 1.5* discout;
		return discout;
	}
}
