package com.rays.Constructor;

public class Person {

	protected String Fname;
	protected String Lname;
	protected String Address;

	public Person() {
		System.out.println("by duflate");
	}

	public Person(String f, String l) {
		Fname = f;
		Lname = l;
		System.out.println("Person 2 param " + Fname + " " + Lname);
	}

	public Person(String f, String l, String add) {
		this(f, l);
		Address = add;
		System.out.println("Person 3 parm " + Fname + " " + Lname + " " + add);
	}

}



class ABC {

	public static void main(String[] args) {

		Person p = new Person("Rays", "Tech", "Indore");

	}
}
