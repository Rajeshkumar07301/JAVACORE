package com.rays.AbstractMethod;

public class ShapeTest {

	public static void main(String[] args) {
		Shape []a = new Shape [3];
		a[0] = new Circle(20);
		a[1] = new Rectangle(20,30);
		a[2] = new Triangle(30,40);
		double TotalArea = calcArea (a);
		System.out.println("Total Area of Shape "+TotalArea);
	}

	private static double calcArea(Shape[] a) {
		double TotalArea = 0;
		for (int i = 0; i < a.length; i++) {
			TotalArea = TotalArea+a[i].area();
			
			
		}
		return TotalArea;
	}

}
