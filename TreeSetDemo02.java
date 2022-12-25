package com.collectionframeworks.set.sortedset.treeset;

import java.util.TreeSet;

public class TreeSetDemo02 {

	public static void main(String[] args) {
		
		// Generic (integer)
  TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(47);
		ts.add(40);
		ts.add(-6);
		ts.add(57);
		ts.add(53);
		
		// System.out.println(ts);
		
		for(int s : ts) {
			System.out.println(s);
		}

	}

}
