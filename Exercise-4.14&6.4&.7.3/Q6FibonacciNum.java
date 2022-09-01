package com.rays.book;

public class Q6FibonacciNum {
	public static void main(String[]args) {
		int a = 0;
		int b = 1;
	    int i = 0;
		int c;
		while (i<10) {
			System.out.println(a);
			i++;
			c = a+b;
			a=b;
			b=c;
		}
	}

}
