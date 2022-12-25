package com.collectionframeworks.list.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo01 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		for(int i=1; i<=10; i++) {
			
			// v.add(i);
			v.addElement(i);
		}
		
		// System.out.println(v);
		
		// Use Iterator
		Iterator itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
