package com.bptn.course._09_abstraction;

//Abstraction using abstract class

//Abstract class- its a class that cannot be instantiated- it cannot be used to create objects

abstract class Shape {

	// Abstract method --> a method which has no implementation
	abstract void draw();

	abstract void print();

	// normal methods- which has an implementation
	void moveTo(int x, int y) {
		System.out.println("Move to: " + x + y);
	}
}

//Sub class(child class) extends Shape class
class Circle extends Shape {

	@Override
	void draw() {

		System.out.println("Draw a circle");

	}

	@Override
	void print() {
		System.out.println("Print a circle");

	}

}

class Rectangle extends Shape {

	@Override
	void draw() {

		System.out.println("Draw a rectangle");

	}

	@Override
	void print() {
		System.out.println("Print a rectangle");

	}

}

public class Abstraction1 {

	public static void main(String[] args) {

		// Create objects from circle class
		Circle c1 = new Circle();
		// this is an implemented method
		c1.draw();
		c1.print();

		// this is an inherited method from Shape class
		c1.moveTo(2, 3);

		// Create objects from rectangle class
		Rectangle r1 = new Rectangle();
		// this is an implemented method
		r1.draw();
		r1.print();

		// this is an inherited method from Shape class
		r1.moveTo(4, 5);

	}

}

//major key-takeaways
//1. Abstract class its a class that cannot be instantiated- it cannot be used to create objects
//2. It consists of abstract methods and normal methods
//3. The sub class is going to implement the abstract methods from the abstract class
//4. When a sub class implements the abstract methods from the abstract class it should follow the ruels of overriding
