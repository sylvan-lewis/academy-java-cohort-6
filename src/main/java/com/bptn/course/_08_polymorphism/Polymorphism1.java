package com.bptn.course._08_polymorphism;

//Parent class
class Animal {

	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//Sub class
class Dog extends Animal {
	// has its own methods
	@Override
	void makeSound() {
		System.out.println("Bark");
		System.out.println("Woof");
		System.out.println("Grr");
	}
}
	// It can also have its own methods
	//class Cat extends Animal {
		// has its own methods
		//@Override
		//void makeSound() {
			//System.out.println("Meow");
			//System.out.println("Rrrrrr");
			//System.out.println("Purr");
		//}	
//}

public class Polymorphism1 {

	public static void main(String[] args) {

		// create an object of Animal class
		Animal a1 = new Animal();
		a1.makeSound();

		// create an object from Dog class
		Dog d1 = new Dog();
		d1.makeSound();

		// create an object from Dog class
		//Cat d1 = new Cat();
		//d1.makeSound();
	}

}

//major key takeaways
//Method overriding
//1. Scenario - when the subclass decides to override an existing method in the parent class
//2. Name of the method, return type of the method and number of parameters in the overridden method be the same
//3. By convention, the overridden method has @override annotation above its method signature, this should be followed to represent overriden methods
//
