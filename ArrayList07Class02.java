// 7. create the arraylist for user defined type for employee

package com.collection.list.arraylist02;

import java.util.*;

public class ArrayList07Class02 {

	public static void main(String[] args) {
		
		// User-Defined Employee Class
		
		// Create an Object of ArrayList
	 ArrayList<Employee07> al = new ArrayList<Employee07>();
	 
	 al.add(new Employee07(20, "Huzefa", 25000));
	 al.add(new Employee07(30, "Avesh", 30000));
	 
	 // By Using Iterator
	 Iterator<Employee07> itr = al.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 
	 // Use For-Each Loop
	 for(Employee07 e : al) {
		 System.out.println(e);
	 }
	 
	}

}
