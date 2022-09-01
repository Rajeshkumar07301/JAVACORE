package com.rays.basics;

public class GradingSys {

	public static void main(String[] args) {
		int marks = 40;
		if (marks<35) {
			System.out.println("he/she is fail");
		}else if (marks>=35 && marks<=50) {
			System.out.println("Grade D+");
		}else if(marks>=51 && marks<=60) {
			System.out.println("Grade C+");
		}else if(marks>=61 && marks<=75) {
			System.out.println("Grade B+");
		}else if (marks>=76 && marks<=85) {
			System.out.println("Grade A");
		}else if (marks>=86 && marks<=100) {
			System.out.println("Grade A+");
		}else {
			System.out.println("not Grade system");
		}

	}

}
