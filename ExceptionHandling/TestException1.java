package com.rays.ExceptionHandling;

public class TestException1 {
	public static void main(String[] args) {
		
	try {
		double div = 50/3;
		System.out.println(div);
//    If condition div = 50/0. Then print ArithmeticException catch and exit.
//	 If  condition div = 50/int. Then print sout(div) and switch to next condition.
		String s =null;
		System.out.println(s.length());
// 	 If	condition String s = null. Then print NullPointerException catch and exit.
//		condition String s = "java" .Then print sout(s.length)and exit.
	}catch(ArithmeticException e){
		System.err.println("you cannot divide by zero");
	}
	catch (NullPointerException e) {
		System.out.println("String khali hai");
	}
	}	
}
