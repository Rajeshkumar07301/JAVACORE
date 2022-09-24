package com.rays.java8Assig;

public class ArmsstrongNum {

	public static void main(String[] args) {
		OddOREvenNum num = (a) -> {
			return a;
			
		};
		int a = num.clac(153);
		int r = 0;
		int sum = 0;
		int n = a;
		while (n>0) {
			r = n%10;
			sum = sum+(r*r*r);
			n = n/10;
		}
		if(sum==a) {
			System.out.println("Armsstrong Number =" +a);
		}else {
			System.out.println("Not Armsstring Number =" +a);
		}
		

	}

}
