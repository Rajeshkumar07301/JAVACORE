package com.rays.Collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Collection2Test {

	public static void main(String[] args) {
      Collection c = new LinkedList();
      c.add(12);
      c.add(33.3);
      c.add("Raj");
      c.add('d');
       System.out.println(c);
       System.out.println("length of Collection :"+ c.size());
       
       for(Object ele : c) {
    	   System.out.println(ele);
       }
       Object[] oArray =c.toArray();
       for(Object ele : oArray) {
    	   String s = (String) ele;
    	   System.out.println(s);
       }
       
//     Collection Interface.........
       ArrayList name = new ArrayList();
       for (int i = 0; i < 10; i++) {
    	   name.add("No #" + i);	
	}
       System.out.println("Name =" + name.size());
       
       Object o = name.get(0);
       String names = (String) o;
       System.out.println("First Name is " +name);

	}

}
