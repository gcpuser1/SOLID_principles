package com.solid.InterfaceSegregation;

public class CanonScaner implements IScan {

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("Its canon scaner, your document has been scaned");
	}

	@Override
	public void scanPhoto() {
		// TODO Auto-generated method stub
		System.out.println("Its canon scaner, your photo has been scaned");

	}

}
