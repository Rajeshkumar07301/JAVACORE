package com.rays.ConcurrencyThreads;

public class TestHelloThread {

	public static void main(String[] args) throws Exception {
		HelloThread t1 = new HelloThread ("Karan");
		HelloThread  t2 = new HelloThread ("Arjun");
		HelloThread t3 = new HelloThread ("Mere Karan Arjun Aayege");
		
		t1.start();
		t2.start();
		t3.start();
		
		for (int i = 0; i < 50; i++) {
			System.out.println("main");
			
		}

	}

}
