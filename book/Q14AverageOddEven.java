package com.rays.book;

public class Q14AverageOddEven {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int i;
		for ( i = 0; i < 10; i++) {
			sum1 = sum1+i;
			
		}
		System.out.println("sum of odd number="+sum1);
		for (int j = 0; j < 20; j++) {
			sum2 = sum2+j;
		}
		System.out.println("sum of even number="+sum2);
		int average = (sum2+sum1)/2;
		System.out.println("average="+average);
	}
}