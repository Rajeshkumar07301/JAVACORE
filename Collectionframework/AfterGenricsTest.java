package com.rays.Collectionframework;

import java.util.*;

public class AfterGenricsTest {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Rahul");
		l.add("Siya");
		l.add("Sunil");
		l.add("Shivani");
		
		Iterator<String> it = l.iterator();
		
		while (it.hasNext()) {
			String obj = (String) it.next();
			System.out.println(obj);
		}
		ArrayList<Integer> L = new ArrayList<Integer>();
		L.add(88);
		L.add(44);
		L.add(33);
		L.add(99);
		
		SortByInt SortByInt = new SortByInt ();
		Collections.sort(L);
		
		Iterator<Integer> It = L.iterator();
		while (It.hasNext()) {
			Integer integer = (Integer) It.next();
			System.out.println(integer);
			
		}

	}

}
