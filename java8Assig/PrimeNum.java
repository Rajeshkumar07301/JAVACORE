package com.rays.java8Assig;

public class PrimeNum {

	public static void main(String[] args) {
		OddOREvenNum num = (a) ->{
			return a;
		};
		int a = num.clac(4);
		int count = 0;
		if (a <= 1) {
			count++;
		}
		for(int i = 2; i <=a/2;i++) {
			if (a%i==0) {
				count++;
			}
		}
		if (count>0) {
			System.out.println("Not prime number");
		}else {
			System.out.println("Prime Number");
		}
	}

}
