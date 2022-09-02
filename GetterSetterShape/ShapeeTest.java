package com.rays.GetterSetterShape;

public class ShapeeTest {
	public static void main (String[]args) {
		ShapeSetGet sp = new ShapeSetGet();
		sp.setColor("red");
		sp.setBorderWdth(55);
		System.out.println("color :-"+sp.getColor());
		System.out.println("BoderWidth :-"+sp.getBorderWdth());
	}

}
