package com.rays.ConcurrencyThreads;

public class HelloRunnableTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new HelloRunnable("Hare Krishna"));
		Thread t2 = new Thread(new HelloRunnable("Hare Rama"));
		
		t1.start();
		t2.start();
		
//		for (int i = 0; i < 500; i++) {
//			System.out.println("Main");
//			
//		}

	}

}
