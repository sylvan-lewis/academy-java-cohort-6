package com.bptn.course._07_oop;

public class Employee {
	
	//instance variables
	//name, employeeId and age
	
	private String name;
	private int employeeId;
	private int age;
	
	//constructors
	
	//default constructor
	public Employee() {
		this.name ="Sylvan";
		this.employeeId = 100;
		this.age = 24;
		
	}
	
	//Parameterized constructor 2 parameters
	public Employee(String n, int e) {
		name = n;
		employeeId = e;
	}
	
	//parameterized constructor with 3 parameters
	public Employee(String name, int employeeId, int age) {
		
		this(name, employeeId); //this is trying to call the constructor Employee (String name, int employeeId) with 2 parameters
		
		this.age = age;
		
	}
	
	//methods
	public void printInfo() {
		System.out.println("Employee name: "+ this.name + " EmployeeId: "+ this.employeeId + " age: "+ this.age);
	}
	public static void main(String[] args) {
		
		
		//create objects from this class
		Employee e1= new Employee();
		e1.printInfo();
		
		Employee e2= new Employee("John Doe", 1234);
		e2.printInfo();
		
		Employee e3= new Employee("Jane Smith", 5678, 30);
		e3.printInfo();
		
	}

}


//this keyword is used to point to the current instance variable - if you have instance variables, local variable or parameter variable same name

