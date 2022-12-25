package com.collectionframeworks.map.setmap.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class StudentMainClass {

	public static void main(String[] args) {
		
	LinkedHashMap<Student , String> lhm = new LinkedHashMap<Student , String>();
	
	 // Create an Object of Student Class
	    Student std = new Student();
	
	     // Create Scanner Object
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Student Name >>>");
	std.stdName = scan.nextLine();
	
	System.out.println("Enter Student Id >>>");
	std.stdId = scan.next();
	
	System.out.println("Enter Student Fees >>>");
	std.stdFees = scan.next();
	
	//Set Values
//	std.setStdName(stdName);
//	std.setStdId(stdId);
//	std.setStdFees(stdFees);
	
	// Get Key & Value to Print on Console
	lhm.put(std, std.getStdId());
	System.out.println(lhm.get(std));
	
	lhm.put(std, std.getStdName());
	System.out.println(lhm.get(std));
	
	lhm.put(std, std.getStdFees());
	System.out.println(lhm.get(std));
	
	}

}
