package com.rays.Polymorphinsm;

public class Triangle2 extends Shape2 {
	private int base;
	private int hight;

	public Triangle2() {
	}

	Triangle2(int b, int h) {
		base = b;
		hight = h;

	}

	public double area() {
		double Tarr = base * hight / 2;
		System.out.println("Triangle Area = " + Tarr);
		return Tarr;
	}

}
