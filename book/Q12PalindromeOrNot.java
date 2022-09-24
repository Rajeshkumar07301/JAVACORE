package com.rays.book;

public class Q12PalindromeOrNot {

	public static void main(String[] args) {
		int number = 121;
		int r = 0;
		int sum = 0;
		int n = number;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (sum==number) {
			System.out.println("Palindrome number " +number);
		}else {
			System.out.println("Not palindrome number " +number);
		}

	}

}
