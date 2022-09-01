package com.rays.OPPAssignment;

public class AccSG {

	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double amount) {

		double total = getBalance() + amount;

		setBalance(total);

		System.out.println("Balance After Deposite = " + getBalance());
	}

	public void withdrawal(double amount) {

		double total = getBalance() - amount;

		setBalance(total);

		System.out.println("Balance After withdrawal = " + getBalance());
	}
	public void fundtransfer(double amount) {

		double total = getBalance() - amount;

		setBalance(total);

		System.out.println("Balance After fundtransfer = " + getBalance());
	}
	//public void fundtransfer1(double amount) {

		//double total = getBalance() + amount;

		//setBalance(total);

		//System.out.println("Balance After fundtransfer1 = " + getBalance());
	//}
	public void paybill(double amount) {

		double total = getBalance() - amount;

		setBalance(total);

		System.out.println("Balance After paybill = " + getBalance());
	}
}