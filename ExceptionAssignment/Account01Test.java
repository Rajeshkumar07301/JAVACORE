package com.rays.ExceptionAssignment;

public class Account01Test {

	public static void main(String[] args) throws MyException01 {
		Account01 a = new Account01();
		a.setBalance(1000);
		System.out.println(a.getBalance());
		try {
			a.Withdrawal(600);
		}catch(MyException01 e){
			System.out.println(e.getMessage());
			
		}

	
	}
}
