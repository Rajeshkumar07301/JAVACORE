package com.rays.AbstractMethod;

public class Triangle {
	private int base;
	private int hight;

//	public Triangle() {
//	}
//
//	Triangle(int b, int h) {
//		base = b;
//		hight = h;
//
//	}
	public double area() {
		double Tarr = base * hight / 2;
		System.out.println("Triangle Area = " + Tarr);
		return Tarr;
	}


}
