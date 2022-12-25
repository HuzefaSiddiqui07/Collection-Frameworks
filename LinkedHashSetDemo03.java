package com.collectionframeworks.set.linkedhashset;

import java.util.ArrayList;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo03 {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(40);
		arrayList.add(30);
		arrayList.add(20);
		arrayList.add(10);
		arrayList.add("Shyam");
		
		System.out.println("print list" + arrayList);
		
		LinkedHashSet hs = new LinkedHashSet(arrayList);
		
		hs.add(50);
		hs.add("Ram");
		
		System.out.println("Add Element" + hs);

	}

}
