package com.rays.polyreturntype;

public class Triangle extends Shape {
	private int base;
	private int hight;


	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}


	public int getHight() {
		return hight;
	}


	public void setHight(int hight) {
		this.hight = hight;
	}


	public double area() {
		double Tarr = base * hight / 2;
		System.out.println("Triangle Area = " + Tarr);
		return Tarr;
	}


}
