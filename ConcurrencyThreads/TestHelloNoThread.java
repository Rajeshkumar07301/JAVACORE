package com.rays.ConcurrencyThreads;

public class TestHelloNoThread {

	public static void main(String[] args) {
		
		HelloWithThread t1 = new HelloWithThread("Ram");
		t1.run();
		HelloWithThread t2 = new HelloWithThread("Shyam");
		t2.run();

		

	}

}
