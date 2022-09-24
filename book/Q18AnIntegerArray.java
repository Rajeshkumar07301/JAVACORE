package com.rays.book;

public class Q18AnIntegerArray {

	public static void main(String[] args) {
		int a[]= {9,8,7,6,5,4,3,2,1};
		int b = 5;
		add(b,a);
	}
    public static void add(int b,int a[]) {
    	int p=0;
    	int s=0;
    	for (int i = 0; i < a.length; i++) {
			if (b==a[i]) {
				s=i;
				p++;
			}
		}
    	if(p>0) {
    		System.out.println("value exist = "+s);
    	}
    	else {
    		System.out.println(-1);
    	}
    }
}
