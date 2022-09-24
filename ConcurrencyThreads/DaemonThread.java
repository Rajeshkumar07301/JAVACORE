package com.rays.ConcurrencyThreads;

public class DaemonThread extends Thread{
	public void run() {
		System.out.println("Daemon T started "+ Thread.currentThread());
//		infinite loop wake in every 500milisecond;
		while(true) {
			try {
				Thread.sleep(500);
				System.out.println("Daemon T: Woke up again");
			}catch(InterruptedException x) {
				
			}
			
		}
	}

}
