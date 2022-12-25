package com.collection.list.arraylist02;

public class Employee07 {
	
	// Declare
	
	int id;
	String name;
    int salary;
    
    // Create Parameterized Constructor
	public Employee07(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
 }
