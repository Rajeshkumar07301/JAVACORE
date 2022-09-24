package com.rays.Assignment1;

public class BubbleSortAccendingTest {

	public static void main(String[] args) {
		int[]a = {36,19,29,12,5};
		System.out.print("Accending order = ");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int number=0;
				if(a[i]>a[j]) {
					number=a[i];
					a[i]=a[j];
					a[j]=number;
					
				}
				
			}
			System.out.print(a[i]+",");
		}
      
	}

}
