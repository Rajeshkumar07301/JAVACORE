package com.rays.Collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		List a = new LinkedList ();
		a.add(22);
		a.add(36.66);
		a.add("Rajesh");
		a.add("Sakwar ji");
//		a.clear();
		a.add('A');
		
		System.out.println(a);
		
		List l = new ArrayList<>();
		l.add(25);
		l.add(22.55);
		l.add("Harry");
		l.add("Potter ji");
		l.add('H');
//		l.addAll(a);
		System.out.println(l.size());
		 
		System.out.println(l);
		
		List b = new  ArrayList<>();
		b.add(24);
		b.add(44.25);
		b.add("Raj");
		b.add("Shakya");
		b.add('R');
		b.addAll(a);
		b.add(l);
		System.out.println(b);
		System.out.println(b.contains(24));
		System.out.println(b.containsAll(b));
		System.out.println(b.isEmpty());
		
		List c = new ArrayList<>();
		System.out.println(c.isEmpty());
		
		List d = new ArrayList<>();
		d.add(28);
		d.add(88.01);
		d.add("String");
		d.add("Khali hai ji");
		d.add("...l.");
		d.add('&');
		
//		d.remove(index number);
		System.out.println(d);
		

	}

}
