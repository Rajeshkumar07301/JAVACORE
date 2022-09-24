package com.rays.ExceptionHandling;

public class RuntimeException extends Throwable{

	public static void main(String[] args) {
		String name ="Vijay";
		try {
			System.out.println("length of name is "+name.length());
			System.out.println("Charter at 7 position is !!");
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti hai");
		}
	finally {
			System.out.println("Shakya hu me");
		}

	}

}
