package com.rays.thread;

public class Racing extends Thread {

	public static Account data = new Account();

	String name = null;

	public Racing(String name) {

		this.name = name;
	}

	public void run() {

		for (int i = 1; i <= 10; i++) {

			try {
				data.deposite(name, 100);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
