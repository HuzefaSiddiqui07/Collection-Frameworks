package com.collectionframeworks.map.setmap.hashmap;

import java.util.HashMap;

public class EmployeeMainClass {

	public static void main(String[] args) {
		
		HashMap<Employee , String> hm = new HashMap<Employee , String>();
		
		// Create an Object of Employee Class
		Employee e = new Employee();
		
		// Set Values
		e.setEmpId("10");
		e.setEmpName("Huzefa");
		e.setEmpSalary("15000");
		
		// Get Values
		hm.put(e , e.getEmpId());
		System.out.println(hm.get(e));
		
		hm.put(e , e.getEmpName());
		System.out.println(hm.get(e));
		
		hm.put(e , e.getEmpSalary());
		System.out.println(hm.get(e));

	}

}
