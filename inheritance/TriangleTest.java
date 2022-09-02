package com.rays.inheritance;

public class TriangleTest {

	public static void main(String[] args) {
     Triangle tr = new Triangle();
     tr.setBase(15);
     tr.setHight(12);
     tr.setColor("Green");
     tr.setBorderwidth(50);
     System.out.println("color = "+tr.getColor());
     System.out.println("borderwidth = "+tr.getBorderwidth());
     System.out.println("area of triangle = "+tr.area());
     }

}
