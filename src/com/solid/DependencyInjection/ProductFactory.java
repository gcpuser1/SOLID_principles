package com.solid.DependencyInjection;

public class ProductFactory {
	public static ProductRepository create() {
		return new SQLProductRepository();
	}
}
