package com.bptn.course._09_abstraction;

//Abstraction using interface (After Java 8)

//From Java 8-Interfaces can support abstract methods, default methods and static methods

interface Operations {

	void draw();// Abstract method- has no implementation

	// default method- has some implamentation
	default int add(int a, int b) {
		return a + b;
	}

	// static method
	static double getRandomNumber() {
		return Math.random();
	}
}
// sub class- create a sub class that implements the Operations interface
	//if operations goes like this operations,11,22 it can have multiple interfaces
	class Calculator implements Operations {

	@Override
	public void draw() {

		System.out.println("Draw method implemented by Calculator Class");

	}

	// compiler always enforces the sub class to implement or override the m
}

public class Abstraction3 {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.draw();

		int result = c1.add(2, 3);

		System.out.println("The result is: " + result);

		System.out.println("The random number is: " + Operations.getRandomNumber());

	}

}
//major key takeaways
//1. interface cannot be instantiated
//2. Abstract methods in the interface is implemented using a subclass
//interfaces support multiple inheritance-- subclass can implement multiple interfaces

//interface cannot have instance variables
//interface cannot have constructors
//it can consist of constants

