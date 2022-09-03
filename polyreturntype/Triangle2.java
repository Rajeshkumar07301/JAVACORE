package com.rays.polyreturntype;

public class Triangle2 extends ConsShape {
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
