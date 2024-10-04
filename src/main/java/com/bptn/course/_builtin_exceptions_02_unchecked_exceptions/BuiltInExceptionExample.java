package com.bptn.course._builtin_exceptions_02_unchecked_exceptions;

public class BuiltInExceptionExample {

	//create a method - which checks if the number is positive or negative
	// throws- always comes in the method signature
	
	public static void checkPositive(int number) throws IllegalArgumentException{
		
		if(number<0) {
			throw new IllegalArgumentException("The number has to be positive");
	
		}
		System.out.println("The number is positive");
	}
	
	public static void main(String[] args) {

		try {
			checkPositive(10);//this call is expected to be fine
			checkPositive(-10);//this call is expected to be thrown
		}
		catch(IllegalArgumentException e) {
			
			System.out.println("Caught an exception: "+ e.getMessage());
			
		}

	}
	//IllegalArgumentException is a sub class of RunTimeException
	//RunTimeException is a sub class of Exception
	// throws always comes in a method signature to declare that method can throw one or more exceptions
	//throws is optional in a case of unchecked exception
	//throws is used in case of checked exception
	//throw is used explicitly within a method or block of code
	//throw creates an instance of Exception or sub class it tries to signal the program that something has gone wrong
	
	
	
	
	
	

}
