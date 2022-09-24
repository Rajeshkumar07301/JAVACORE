package com.rays.java8Assig;

public class HarmonicSeries {
    public static void main(String[] args) {
		OddOREvenNum num = (a) -> {
			return a;
		};
		double a = num.clac(10);
		double sum = 0;
		for (int i = 1; i <= a; i++) {
			sum = sum+(1/i);
			
		}
		System.out.println("Harmonic Value = " + sum);
	}
}
