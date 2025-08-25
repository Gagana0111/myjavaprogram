package com.tnsif.polymorphism;

public class CardPayment extends Payment {
	@Override
	void makepayment() {
		System.out.println("payment made by credit/debit card");
	}

}
