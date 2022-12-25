package com.collectionframeworks.list.vector;

import java.util.Vector;

public class VectorDemo03 {

	public static void main(String[] args) {
		
		// Generic (String) 01
		Vector<String> v1 = new Vector<String>();
		
		v1.add("Huzefa");
		v1.add("priyanka");
		v1.add("MAYURI");
		v1.add("Sujit");
		v1.add("Sujit");
		
//		while(v1.contains("Sujit")) {
//			v1.remove("Sujit");
//		}
		
		// Generic (String) 02
	 Vector<String> v2 = new Vector<String>();
	 
	 v2.add("10");
	 v2.add("20");
	 v2.add("30");
	 
	// v1.addAll(v2); // Vector v2 Copy in Vector v1
	 v2.addAll(v1); // Vector v1 Copy in Vector v2
	 
		// System.out.println("Vector v2 Copy in Vector v1 >>> " + v1);
		System.out.println("Vector v1 Copy in Vector v2 >>> " + v2);
		
		// System.out.println("Vector v1 Size >>> " + v1.size());
		System.out.println("Vector v2 Size >>> " + v2.size());
		
		// System.out.println("Vector v1 Capacity >>> " + v1.capacity());
		System.out.println("Vector v2 Capacity >>> " + v2.capacity());
		
		// System.out.println("Index of v1 >>> " + v1.get(2));
		System.out.println("Index of v2 >>> " + v2.get(2));

	}

}
