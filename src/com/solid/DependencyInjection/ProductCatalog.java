package com.solid.DependencyInjection;

import java.util.List;

public class ProductCatalog {
	private List<String> products;
	public ProductCatalog(ProductRepository productRepository) {
		products=productRepository.getAllProductName();
	}
	public List<String> listAllProducts() {
		return products;
	}
}