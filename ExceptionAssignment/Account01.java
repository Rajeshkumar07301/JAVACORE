package com.rays.ExceptionAssignment;

public class Account01 {
	private double balance;
	
	public Account01() {
		// TODO Auto-generated constructor stub
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void Withdrawal(double amount) throws MyException01 {
		double total = getBalance()-amount;
		if(total <500) {
			throw new MyException01();
		}else {
			setBalance(total);
			System.out.println("Balaance After Withdrawal = " + getBalance());
		}
	}

}
