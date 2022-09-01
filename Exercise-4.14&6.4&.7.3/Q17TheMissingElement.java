package com.rays.book;

public class Q17TheMissingElement {
	public static void main(String[]args) {
		int[]a = {1,2,3,4,5,6};
		int[]b = {1,2,3,4,5};
		MissingElement(a,b);
		
		
	}
	public static void MissingElement(int []a,int []b) {
		int c=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a.length>b.length) {
					c=a[i];
					
				}
			}
		}
		System.out.println(c);
	}
}

	


