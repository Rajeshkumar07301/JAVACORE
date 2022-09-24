package com.rays.java8Assig;

public class PalinderomeOrNot {

	public static void main(String[] args) {
		OddOREvenNum num = (a) -> {
			return a;
		};
		int a = num.clac(121);
		int r = 0;
		int sum = 0;
		int n = a;
		while (n>0) {
			r = n%10;
			sum = (sum*10) + r;
			n = n/10;
		}
		if (sum==a) {
			System.out.println("Palinderome Number = "+a);
		}else {
			System.out.println("Not Palinderome Number = "+a);
		}

	}

}
