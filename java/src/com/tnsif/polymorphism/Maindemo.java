package com.tnsif.polymorphism;

public class Maindemo {

	public static void main(String[] args) {
		Payment p;
		p=new Upipayment();
		p.makepayment();
		
		p=new CardPayment();
		p.makepayment();
		// TODO Auto-generated method stub

	}

}
