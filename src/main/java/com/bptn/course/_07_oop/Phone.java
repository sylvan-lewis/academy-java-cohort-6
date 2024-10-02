package com.bptn.course._07_oop;

public class Phone {
	
//declare instance variables - properties/attributes
//weight, height, width, color
	

	private int weight;
	private int height;
	private int width;
	private String color;
	//After instance variable constructor created
	//has the same name as the ClassName (Phone)
	//does not have any return type
	//default constructor - does not have parameter passed
	public Phone() {
		
		//default values
		weight= 150;
		height= 140;
		width= 70;
		color = "Black";
	}
	
	
	
	
	//Parameterized constructor = which has parameters
	public Phone(int w, int h, int wi, String c) {
		weight =w;
		height =h;
		width =wi;
		color =c;
	}
	//2nd parameterized consctructor - which has 3 paraemters passed
	public Phone(int w, int h, int wi) {
		weight =w;
		height =h;
		width =wi;
	}
	
	//declare instance methods - behavior/functionality
	public void makePhoneCall() {
		System.out.println("Make a phone call");
		}
	public void sendTextMessage() {
		System.out.println("Send a text message");
	}
	

	public static void main(String[] args) {

		//Create an object of the Phone class using default constructor
		Phone myObj1 = new Phone();
		
		System.out.println("Default Phone: "+ "Weight: " + myObj1.weight + " Height: " + myObj1.height + " Width: " + myObj1.width + " Color: "+ myObj1.color);
		
		Phone myObj2 = new Phone(40, 30, 77, "Purple");
				
		System.out.println("Custom Phone: "+ "Weight: " + myObj2.weight + " Height: " + myObj2.height + " Width: " + myObj2.width + " Color: "+ myObj2.color);
	
		Phone myObj3 = new Phone(99, 55, 73);
		
		System.out.println("Custom Phone: "+ "Weight: " + myObj3.weight + " Height: " + myObj3.height + " Width: " + myObj3.width + " Color: "+ myObj3.color);
	
	}
	
}

//Instance variables are always declared as private - because we want to encapsulate this from being accessed from another class

//Instance methods are always declared as public because we want it to be accessible

//We can have many paramerterized constructors which can have the same name but different number of parameters
//We can only have 1 default constructor within a class
//If we do not have any contructors at all - java automatically created a default constructor by setting default values

