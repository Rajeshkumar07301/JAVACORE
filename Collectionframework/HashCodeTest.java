package com.rays.Collectionframework;

import java.util.*;

public class HashCodeTest {

	public static void main(String[] args) {
		List l = new LinkedList<>();
		String s = "Java";
		String s1 = "Java";
		String s3 = "Hello";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("<++++++========++++++++>");
		l.add("Java");
		l.add("Java");
		l.add("Hello");
		System.out.println(l.hashCode());

	}

}
