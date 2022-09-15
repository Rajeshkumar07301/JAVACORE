package com.rays.Collectionframework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterFace {

	public static void main(String[] args) {
		Map m = new HashMap<>();
		m.put(1, "Hari");
		m.put(2, "Shiva");
		m.put(3, "Govind");
		m.put(4, "Hari");
		
		boolean n = m.containsKey(2);
		System.out.println(m.size());
		System.out.println(m);
		System.out.println(m.get(2));
		System.out.println(n);
		System.out.println(m.containsValue("Hari"));
		System.out.println(m.entrySet());
		System.out.println(m.remove(1));
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		System.out.println("<===========================>");
		
		Map w = new Hashtable();
		w.put(1, "Hari");
		w.put(2, "Shiva");
		w.put(3, "Govind");
		w.put(4, "Hari");
		
		
		
		

	}

}
