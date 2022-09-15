package com.rays.Collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.add(11);
		q.add(22);
		System.out.println(q);
		
		PriorityQueue p = new PriorityQueue<>();
		p.add(12);
		p.add(15);
		p.add(55);
		p.add(62);
		p.addAll(q);
		
		System.out.println(p);
		
		Deque d = new LinkedList();
		d.add(22);
		d.add(88.22);
		d.add("String");
		d.add('s');
		d.addFirst("raj");
		d.addLast("sakwar");
		
		System.out.println(d);
		d.add("rs");
		System.out.println(d.offer("rays"));
		System.out.println(d);
		System.out.println(d.poll());
		System.out.println(d);
		System.out.println(d.poll());
		System.out.println(d);
		System.out.println(d.peek());
		
		
		Queue a = new ArrayDeque<>();
		

	}

}
