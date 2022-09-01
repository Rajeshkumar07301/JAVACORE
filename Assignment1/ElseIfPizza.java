package com.rays.basics;

public class ElseIfPizza {
	public static void main(String[]args) {
		int money = 120;
		if (money<100) {
		System.out.println("you can not buy pizza");
	}else if(money>100 && money<500) {
		System.out.println("you can buy medium size pizza");
		
	}else if(money>500 && money<100) {
		System.out.println("you can buy large size pizza");
	}else {
		System.out.println("you can buy any pizza");
	}
		
	}
}

