package com.rays.basics;

public class StarPrint {

	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			for (int j = i; j < 4; j++) {
				System.out.print(" ");

			}
		for (int k = 0; k <= i; k++) { 
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println();
		}
		for (int i = 2; i>=0; i--) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
				
			}
			for (int k = 0; k <=i ; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}

}
