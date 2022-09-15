package com.rays.Collectionframework;

import java.util.*;

public class TheListInterface {

	public static void main(String[] args) {
          List l = new LinkedList();
          l.add(11);
          l.add(55);
          l.add(88);
          l.add(44);
          l.add(99);
          l.add(22);
          l.add(33);
          l.add(44);
          l.add(66);
          l.add(77);
          
          System.out.println(l);
          System.out.println(l.contains(22));
          System.out.println(l.containsAll(l));
          System.out.println(l.isEmpty());
          System.out.println(l);
		
			}

}
