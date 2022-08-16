package com.solid.Liskov;

import java.util.ArrayList;
import java.util.List;

public class PricingUtil {


	
	public static void main(String ... args) {
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new InhouseProduct();
		List<Product> products=new ArrayList<>();
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
	for(Product p :		products ) {
		System.out.println(p.getDiscount());
	}
	}
}
