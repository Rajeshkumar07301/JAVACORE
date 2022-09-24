package com.rays.ConcurrencyThreads;

public class AccRaceCondition extends Thread{
	private int balance;

	public int getBalance() {
		try {
			Thread.sleep(200);
		}catch(InterruptedException x){
			
		}
		return balance;
		
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		}catch(InterruptedException x2) {
			
		}
		this.balance = balance;
	}
public synchronized void main(String[] args) {
	int bal = getBalance();
	int amt = 0;
	bal = bal + amt;
	setBalance(bal);
	String msg = null;
	System.out.println(msg+"new balance");
	
}
	

}
