package com.rays.Assignment1;

public class daimond {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = (i * 2) + 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	}


