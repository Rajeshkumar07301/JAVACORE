package com.rays.Collectionframework;

import java.util.*;

public class BeforeGenericTest {

	public static void main(String[] args) {
//		Before Generic.,,,,
		ArrayList l = new ArrayList();
		l.add("Ajay");
		l.add("Riya");
		l.add("Anuj");
		l.add("Gopal");
		l.add("Sonam");
		
		System.out.println(l);
		
//		String str = (String) l.get(0);
//		System.out.println(str);
		
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}

	}

}
