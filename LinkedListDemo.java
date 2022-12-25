package com.collectionframeworks.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(40);
		linkedList.add(30);
		linkedList.add(20);
		linkedList.addFirst(70);
		linkedList.addLast(80);
		
		System.out.println(linkedList);
		
		//int a = linkedList.get(3); // Unboxing
		// System.out.println("3rd index is >>> " + a);
		
		// Iterator<Integer> itr = linkedList.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println("" + itr.next());
//		}
		
		// Using For Each Loop
		for(int t : linkedList) {
			System.out.println(t);
		}
		

	}

}
