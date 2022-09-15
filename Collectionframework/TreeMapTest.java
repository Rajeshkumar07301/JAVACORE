package com.rays.Collectionframework;

import java.util.*;

public class TreeMapTest {
	public static void main(String[]args) {
		TreeMap map = new TreeMap<>();
		map.put(3, "Gopal");
		map.put(1, "Madhava");
		map.put(2, "Hari");
		map.put(4, "Krishna");
		
		for (Object k : map.keySet()) {
			System.out.println(k + " = " + map.get(k));
			
		}
	}

}
