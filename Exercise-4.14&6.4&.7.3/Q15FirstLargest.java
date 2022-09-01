package com.rays.book;

public class Q15FirstLargest {

	public static void main(String[] args) {
		int a[] = { 200, 22, 104, 100, 1000};
		int x = 0;
		int y = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > x) {
				y = x;
				x = a[i];
			} else if (a[i] > y && a[i] < x) {
				y = a[i];
			}
		}
		System.out.println("Second largest number is : " + x);

	}

}
