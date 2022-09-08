package com.rays.ExceptionHandling;

public class TestException2 {
	public static void main(String[] args) {
		
		try {
			double div = 50/3;
			System.out.println(div);
			String s ="java";
			System.out.println(s.length());
			
		}catch(ArithmeticException e){
			System.err.println("you cannot divide by zero");
		}catch (NullPointerException e) {
			System.out.println("String khali hai");
		}finally {
			System.out.println("I am Shakya");
		}
		}	
// If first condition div = 50/int.Then print sout(div) switch next condition and-
//-print NullPointerException catch then print finally and exit.
// if condition div = 50/0. then print ArithmeticException catch,then print -
// -finally and exit.
//If condition div = 50/int and String s ="java".Then print sout(div) and -
//	sout (s.length),print finally and exit.
}
