package com.rays.java8Assig;

public class TestOddAnDEvenNum {

	public static void main(String[] args) {
		OddOREvenNum num = (a) ->{
			return a;
			
		};
		int a = num.clac(2);
		if (a%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}

	}

}
