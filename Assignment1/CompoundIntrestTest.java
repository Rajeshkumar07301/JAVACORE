package com.rays.basics;

public class CompoundIntrestTest {

	public static void main(String[] args) {
		float p,r,n,t;
		p=1200;
		r=10;
		n=5;
		t=1;
		double A=p;
		for (int i = 0; i < n; i++) {
			A=A*(1+r/n);
			
		}
		System.out.println(A);		

	}

}
