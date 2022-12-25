/* 10 : Program for how insert the elements into list for type string and integer and iterate
  by using for each loop
 */

package com.collection.list.arraylist02;

import java.util.ArrayList;

public class ArrayList08 {

	public static void main(String[] args) {
	
		// Create an Object of ArrayList
		ArrayList arrayList = new ArrayList ();
		
		arrayList.add(50);
		arrayList.add(10);
		arrayList.add("Ram");
		
		// Use For-Each Loop
		for(Object obj : arrayList) {
			
			System.out.println(obj);
		}

	}

}
