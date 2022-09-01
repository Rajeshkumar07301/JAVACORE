package com.rays.OPPAssignment;

public class AccSGTest {

	public static void main(String[] args) {
		AccSG s = new AccSG();
		s.setNumber("12345678910");
		s.setAccountType("Saving Account");
		s.setBalance(5000);
		s.deposite(1000);
		s.withdrawal(500);
		s.fundtransfer(1000);
		s.paybill(0);
		System.out.println("number :"+s.getNumber());
		System.out.println("AccountType :"+s.getAccountType());
		System.out.println("balance :"+s.getBalance());
	}

}
