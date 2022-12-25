package com.collectionframeworks.set.hashset;

import java.util.HashSet;


public class HashSetDemo01 {

	public static void main(String[] args) {
		
		HashSet hashSet = new HashSet();
		
		hashSet.add(10);
		hashSet.add(null);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add("sujit");
		hashSet.add(10); // Duplicates are not allowed
		hashSet.add("Mayuri");
		
		 System.out.println(hashSet);
		
		// Use for each loop
//		for(Object a : hashSet) {
//			System.out.println(a);
		//}
		
		
  }

}
