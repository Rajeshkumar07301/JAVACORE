package com.rays.DeepCloning;

public class BothCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address a = new Address();
		a.setStreet("Vijay Nagar");
		a.setCity("Indore");
		a.setState("MadhyaPardesh");
		
		Employee e = new Employee();
		e.setId(1);
		e.setFname("Rajesh");
		e.setLname("Kumar");
		
		Address a1 = (Address)a.clone();
//		a1.setStreet("Nanda Nagar");
//		a1.setCity("Khandwa");
//		a1.setStreet("Chhattisgard");
//		
		Employee e1 = (Employee)e.clone();
//		e1.setId(2);
//		e1.setFname("Aman");
//		e1.setLname("Sahu");
		
		
		System.out.println(e.getId());
		System.out.println(e.getFname());
		System.out.println(e.getLname());
		System.out.println(a.getStreet());
		System.out.println(a.getCity());
		System.out.println(a.getState());
		
		System.out.println("<=====================================>");
		
		System.out.println(e1.getId());
		System.out.println(e1.getFname());
		System.out.println(e1.getLname());
		System.out.println(a1.getStreet());
		System.out.println(a1.getCity());
		System.out.println(a1.getState());
	}
}
