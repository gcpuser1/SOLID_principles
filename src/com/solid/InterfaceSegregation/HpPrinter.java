package com.solid.InterfaceSegregation;

public class HpPrinter implements IPrint,IScan{

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
		System.out.println("Its HP scaner, your photo has been scaned");

	}

	@Override
	public void scanPhoto() {
		// TODO Auto-generated method stub
		System.out.println("Its HP scaner, your photo has been scaned");

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Its HP Printer, there are documents have been printed");

	}

	@Override
	public void getSpoolDetails() {
		// TODO Auto-generated method stub
		System.out.println("Its HP Printer, there are 2 jobs in the spool");

	}

}
