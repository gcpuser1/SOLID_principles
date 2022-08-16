package com.solid.DependencyInjection;

public class EcommerceApplication {
	public static void main(String ... args) {
		// Here we are injecting the dependencies to Product catalog class 
		ProductRepository productRepository= ProductFactory.create();
		ProductCatalog productCatalog=new ProductCatalog(productRepository);
		productCatalog.listAllProducts();
	}
}
