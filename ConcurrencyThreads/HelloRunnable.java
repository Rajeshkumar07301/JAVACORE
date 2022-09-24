package com.rays.ConcurrencyThreads;

public class HelloRunnable implements Runnable{
	private String name;
	
	public HelloRunnable( String n) {
		name = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException x) {
				
			}
			System.out.println(i + "#" + name);
			
		}
		
	}

}
