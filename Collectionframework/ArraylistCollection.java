package com.rays.Collectionframework;

import java.util.ArrayList;

public class ArraylistCollection {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("one");
		a.add("Two");
		a.add("Three");
		
		Integer i = new Integer (4);
		a.add(i);
		
		Integer value =  (Integer) a.get(3);
		System.out.println("Index#3 value = "+ value);
		
		
		
		 
		

	}

}
