package com.rays.polyreturntype;
//using Getter Setter
public class ShapeTest {
	public static void main(String[]args) {
	Shape s = new Shape();
	
	Circle c = (Circle) s.getShape(1);
		   c.setRadius(25);
		   
		
	Rectangle r = (Rectangle)s.getShape(2);
	          r.setLength(20);
	          r.setWidth(30);
	      
	Triangle t = (Triangle)s.getShape(3);
	          t.setBase(15);
	          t.setHight(15);
	          
	     c.area();
	     r.area();
	     t.area();
	     
	     
}
}
