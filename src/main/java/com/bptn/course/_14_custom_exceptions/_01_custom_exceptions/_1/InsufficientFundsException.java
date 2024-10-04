package com.bptn.course._14_custom_exceptions._01_custom_exceptions._1;


// Can often extend either exception class or RuntimeException class
public class InsufficientFundsException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

	

}
