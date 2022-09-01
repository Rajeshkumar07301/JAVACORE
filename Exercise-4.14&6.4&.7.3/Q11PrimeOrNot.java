package com.rays.book;

public class Q11PrimeOrNot {

	public static void main(String[] args) {
		int i = 0;
		int m = 0;
		int flag = 0;
		int n = 2;
		m = n/2;
		if(n==0||n==0) {
			System.out.println(n+ " is not Prime number");
		}else {
			for (i = 2; i <=m; i++) {
				if(n%i==0);
				System.out.println(n+ " is not Prime Number");
				flag =1;
				break;
				
			}
		}
		if(flag==0) {
			System.out.println(n+ " is Prime number");
		}
		

	}

}
