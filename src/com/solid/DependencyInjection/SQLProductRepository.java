package com.solid.DependencyInjection;

import java.util.List;

public class SQLProductRepository implements ProductRepository {
	private List<String> Products;
	public List<String> getAllProductName(){
		Products.add("Cocke");
		Products.add("Pizza");
		return Products;
	}
}
