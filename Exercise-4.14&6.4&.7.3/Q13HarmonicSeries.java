package com.rays.book;

public class Q13HarmonicSeries {

	public static void main(String[] args) {
		double n =15,i;
		double sum = 0;
		for(i=1;i<=n;i++) {
			sum = sum+(1/i);
		}
        System.out.println("Harmonic value = " +sum);
	}

}
