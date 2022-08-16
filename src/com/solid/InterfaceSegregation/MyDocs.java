package com.solid.InterfaceSegregation;

public class MyDocs  {
	public static void main(String ...args) {
		IScan p=new HpPrinter();
		IScan s=new CanonScaner();
		p.scan();
		s.scan();
	}
}
