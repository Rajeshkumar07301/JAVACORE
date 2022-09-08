package com.rays.ExceptionAssignment;

public class Assgi1 {

	public static void main(String[] args) {
		try {
			try {
				double div = 50/0;
				System.out.println(div);
				
			}catch(ArithmeticException e){
				System.err.println("you cannot divide by zero");
			}	
			String s =null;
			System.out.println(s.length());
			
		}catch(NullPointerException e){
			System.err.println("String khali hai");
			try {
				double div = 50/0;
				System.out.println(div);
				
			}catch(ArithmeticException e1){
				System.err.println("you cannot divide by e1 zero");
			}
			finally {
				System.out.println("I am Shakya");
				try {
					double div = 50/0;
					System.out.println(div);
					
				}catch(ArithmeticException e2){
					System.err.println("you cannot divide by e2 zero");
				}	
			}
			}
		}	
	}


