package com.rays.Polymorphinsm;

public class ArrayPolymorphinssmShape2Test {

	public static void main(String[] args) {
		Shape2[] a = new Shape2[3];
		a[0] = new Circle2(50);
		a[1] = new Rectangle2(60, 40);
		a[2] = new Triangle2(30, 90);
		double TotalArea = calcArea(a);
		System.out.println("Total Area of Shape ="+TotalArea);

	}

	private static double calcArea(Shape2[] a) {
		double TotalArea = 0;

		for (int i = 0; i < a.length; i++) {
			TotalArea = TotalArea + a[i].area();
		}
		return TotalArea;
	}

}
