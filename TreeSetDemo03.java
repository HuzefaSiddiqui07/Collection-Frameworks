package com.collectionframeworks.set.sortedset.treeset;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo03 {

	public static void main(String[] args) {
		
		
		TreeSet<String> ts1 = new TreeSet<String>();
		
		ts1.add("Huzefa");
		ts1.add("sujit");
		ts1.add("AVESH");
		ts1.add("Priyanka");
		
		// System.out.println(ts1);
		
		TreeSet<String> ts2 = new TreeSet<String>();
		
		ts1.add("Mayuri");
		ts1.add("diksha");
		ts1.add("CHANDU");
		ts1.add("Jeevan");
		
		ts1.addAll(ts2);
		
		// System.out.println(ts1);
		
		// Use Iterator
		Iterator<String> itr = ts1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Use for each loop
//		for(String u : ts1) {
//			System.out.println(u);
//		}
	}

}
