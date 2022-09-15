package com.rays.Collectionframework;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class ConBlockingQueue {
	public static void main(String[] args) {
		
	
	ArrayBlockingQueue<Integer> L = new ArrayBlockingQueue<Integer>(10);
	L.add(1);
	L.add(2);
	L.add(3);
	L.add(4);
	L.add(5);
	L.add(6);
	L.add(7);
	L.add(8);
	L.add(9);
	L.add(10);

	Iterator<Integer> It = L.iterator();

	while (It.hasNext()) {
		Integer integer = (Integer) It.next();
		System.out.println(integer);

	}

	
	}

	}


