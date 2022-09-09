package com.rays.ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println("length of name is "+name.length());
			System.out.println("Charter at 7th position "+name.charAt(6));
  	}catch(StringIndexOutOfBoundsException e) {
  		System.out.println("String abhi choti hai !!");
  	}catch(NullPointerException e) {
  		System.out.println("Sunder sa name nahi hai");
  	}finally {
		System.out.println("Shakya hu me");	
		
  	}
	}
}
