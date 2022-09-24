package com.rays.Constructor;

public class Employee extends Person{
	private int Id;
	private String designation;
	public Employee() {
		System.out.println("Emp default");
	}
	public Employee(int i,String des,String f,String l,String add) {
	 super (f,l,add);
		Id = i;
		designation = des;
		System.out.println("Person 5 param "+ i +" "+ des + f + l + add);
	}
	public static void main(String[] args) {
		Employee e = new Employee(1,"IT"," Rajesh "," kumar"," indore");
		
		
	}	
	}

