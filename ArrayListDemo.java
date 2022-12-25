package com.collection.list.arraylist01;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Create an Object of ArrayList Class
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(20);
		
		arrayList.add("Huzefa");
		
		arrayList.add(10);
		
		arrayList.add(10); // Java ArrayList class can contain duplicate elements
		
		// arrayList.remove(1); // passing the index value here, ram will be removed from list.
		
		arrayList.add(null); // Null insertion is possible.(we can add n number of null values in arrayList)
		
		arrayList.add(null);
		
		
		System.out.println(arrayList);
	}

}
