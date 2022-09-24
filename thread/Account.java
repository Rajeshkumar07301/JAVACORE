package com.rays.thread;

public class Account {

	private int balance = 0;

	public int getBalance() {

		return balance;
	}

	public void setBalance(int balance) {

		this.balance = balance;
	}

	public synchronized void deposite(String msg, int amount) throws Exception {

		Thread.sleep(200);

		int total = getBalance() + amount;

		setBalance(total);

		System.out.println(msg + " balance " + getBalance());

	}

}
