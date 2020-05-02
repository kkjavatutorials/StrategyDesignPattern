package com.kkjavatutorials.payment.impl;

import com.kkjavatutorials.payment.PaymentMethod;
import com.kkjavatutorials.shoppingcart.Shoppingcart;

public class PaypalPaymentMethod implements PaymentMethod {

	private String email;
	private String password;
	
	public PaypalPaymentMethod(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount+" is paid using Paypal");
	}

}
