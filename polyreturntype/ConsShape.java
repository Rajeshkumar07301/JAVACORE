package com.rays.polyreturntype;

public class ConsShape {
	private String color;
	private int borderwidth;
	public static final float PI=3.14f;
	
	public ConsShape() {
		
	}
	public ConsShape(String a, int b) {
		color = a;
		borderwidth=b;
		
	}
	
	public String getColor() {
		return color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public double area() {
		return 0;
		}
		public ConsShape getShape(int i) {
			if (i==1) {
			return new Circle2();
			}
			if (i==2) {
				return new Rectangle2();
			}
			if (i==3) {
				return new Triangle2();
			}
			return new ConsShape();
				
			
		}

	

}
