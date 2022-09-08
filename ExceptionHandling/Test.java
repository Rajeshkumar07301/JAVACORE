package com.rays.ExceptionHandling;

public class Test {

	public static void main(String[] args) {
		
	try {
	    String s = "Java";
//		String s = null;
		System.out.println(s.length());

	}catch(NullPointerException e){
		System.out.println("String khali hai");
	}finally {
		System.out.println("I am Shakya");
	}

}
}