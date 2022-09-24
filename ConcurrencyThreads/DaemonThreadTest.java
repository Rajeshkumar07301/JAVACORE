package com.rays.ConcurrencyThreads;

public class DaemonThreadTest {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		DaemonThread t = new DaemonThread();
		t.setDaemon(true);
		t.start();
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException x) {
			
		}
		System.out.println("Leaving main method");
		System.out.println("Now JVM will exit");

	}

}
