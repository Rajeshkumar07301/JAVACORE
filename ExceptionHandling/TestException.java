package com.rays.ExceptionHandling;

public class TestException {
	public static void main(String[] args) {
		
		try {
			double div = 50/3;
//			double div = 50/0;
			System.out.println(div);
			
		}catch(ArithmeticException e){
			System.err.println("you cannot divide by zero");
		}	
	}

}
