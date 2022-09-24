package com.rays.book;

public class Q7DivisibleBy7 {

	public static void main(String[] args) {
		int result=0;
	 for (int i = 10; i<=20;i++) {
		 if(i%7==0) {
			result +=i;
			 System.out.println(i);
		 }
		 System.out.println("o/p of program = "+result);
	 }

	}

}
