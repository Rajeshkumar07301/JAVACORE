package com.rays.PolymorphinsimTypeCasting;

public class ShapeTest {

	public static void main(String[] args) {
		// Shape s = new Shape();
		Circle cr = (Circle) new Shape();
		cr.setRedius(10);

		System.out.println(cr.getRedius());
	}
}
