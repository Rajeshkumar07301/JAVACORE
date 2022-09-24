package com.rays.ConcurrencyThreads;

public class HelloWithThread extends Thread {
	private String name = null;
	
	public HelloWithThread(String n) {
		name = n;
	}
	public void run () {
		for (int i = 0; i < 50; i++) {
			System.out.println(i+name);
			
			
		}
	}

}
