package com.rays.book;

public class Q5ReversDigit {

	public static void main(String[] args) {
		int n = 12345;
		int r = 0;
		int i = 0;
		while(i<n) {
			r = n%10;
			System.out.print(r);
			n=n/10;
		}

	}

}
