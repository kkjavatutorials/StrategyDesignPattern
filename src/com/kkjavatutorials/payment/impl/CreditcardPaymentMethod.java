package com.kkjavatutorials.payment.impl;

import com.kkjavatutorials.payment.PaymentMethod;

public class CreditcardPaymentMethod implements PaymentMethod {

	private String cardHolderName;
	private String card;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditcardPaymentMethod(String cardHolderName, String card, String cvv, String dateOfExpiry) {
		super();
		this.cardHolderName = cardHolderName;
		this.card = card;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public String getCard() {
		return card;
	}

	public String getCvv() {
		return cvv;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}


	@Override
	public void pay(int amount) {
		System.out.println(amount +" is paid using debit card :"+card);
	}
}
