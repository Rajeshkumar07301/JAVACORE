package com.rays.ExceptionAssignment;

public class Assgi3 {

	public static void main(String[] args) {
		try {
			double div = 50/0;
			
		}catch(ArithmeticException e){
			System.out.println("you cannot divide by zero");
			System.exit(0);
		}	
		finally {
		System.out.println("I am Shakya");
	}

}
}