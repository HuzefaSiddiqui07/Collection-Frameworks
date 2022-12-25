package com.collectionframeworks.list.vector;

import java.util.Vector;

public class VectorDemo02 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		System.out.println(v.capacity()); // Initial Capacity is 10
		
		for(int a=1; a<=10; a++) {
			v.addElement(a);
		}
		System.out.println(v.capacity()); // 10 Elements are Add Initial Capacity is Full
		v.addElement("J");
		System.out.println(v.capacity()); // New Capacity = 2*10 (Current Capacity)
		
		System.out.println(v);

	}

}
