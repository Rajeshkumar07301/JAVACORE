package com.rays.ConcurrencyThreads;

public class PrioritySetGet extends Thread {
	private String name;
	public PrioritySetGet(String n) {
	     name = n;
	}
	public void  run() {
		for (int i = 1; i <=50; i++) {
			System.out.println(i+name);
			
		}
	}

	}
