package com.rays.GetterSetterShape;

public class ConstandFinalShap {
	private String Color;
	private int BorderWidth;
	public static final float PI=3.14f;
	
	public ConstandFinalShap(String c,int b) {
		Color = c;
		BorderWidth = b;
		
		
	}
//	public ConstandFinalShap(String c,int b){
//		Color = c;
//		BorderWidth = b;
//	}
	public String getColor() {
		return Color;
	}
	//public void setColor(String color) {
	  // Color = color;
	//}
	public int getBorderWidth() {
		return BorderWidth;
	}
	// public void setBorderWidth(int borderWidth) {
		//BorderWidth = borderWidth;
	//}

	

}
