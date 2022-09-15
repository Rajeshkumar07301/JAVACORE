package com.rays.Collectionframework;

import java.util.LinkedList;
import java.util.List;

public class EqualsTest {

	public static void main(String[] args) {
		List l = new LinkedList<>();
		l.add("Java");
		l.add("Java");
		l.add("Hello");
		
		List l2 = new LinkedList<>();
		l2.add("Java");
		l2.add("Java");
//		l2.add("java");
		l2.add("Hello");
//		l2.add("hello");
		System.out.println(l.equals(l2));
		

	}

}
