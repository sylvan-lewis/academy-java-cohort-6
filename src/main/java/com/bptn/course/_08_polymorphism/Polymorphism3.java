package com.bptn.course._08_polymorphism;

public class Polymorphism3 {
	
	void print(int integer) {
		
		System.out.println("Printing an integer: "+ integer);
	}

	void print(String s) {
		System.out.println("Printing a string: "+ s);
	}
	
	int print(int a, int b){
		
		return a+b;
	}
	
	double print(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		
		Polymorphism3 p1 = new Polymorphism3();
		p1.print(5);
		
		p1.print("Hello World");
		
		System.out.println("Sum of two integers: " + p1.print(2,3));
		
		System.out.println("Sum of two doubles: " + p1.print(2.0,3.0));
	}

}

//Major key takeaways

//Method overloading- compile time polymorphism
//1. It occurs within the same class and no inheritance is required
//2. method names should be the same
//3 it can have different return type
//4. it can have different type of parameters
//5. static method can be overloaded


