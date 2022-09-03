package com.rays.MethodOverloading;

public class MethodOverLoding {
	
	public void Addition(int a,int b) {
		System.out.println(a+b);
	}
	public void Addition(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public double Addition (double a,int b) {
		
		return a+b;
	}
	public void Addition(String a,String b) {
		System.out.println(a+b);
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	public void multi (double a, double b) {
		double c = a*b;
		System.out.println("multifiction = " +c);
	}
	public void Div(double a,long b) {
		double c = a/b;
		System.out.println("Div = "+ c);
	}

}
