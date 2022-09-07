package com.rays.ShallowCloning;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address a= new Address();
		a.setStreet("Vijay Nagar");
		a.setCity("indore");
		a.setState("Madhyapardesh");
		
		Employee e = new Employee();
		e.setId(1);
		e.setFname("Rajesh");
		e.setLname("Kumar");
		e.setAddr(a);
		
		Employee e1 = (Employee)e.clone();
		
		System.out.println(e.getId());
		System.out.println(e.getFname());
		System.out.println(e.getLname());
		System.out.println(e.getAddr().getStreet());
		System.out.println(e.getAddr().getCity());
		System.out.println(e.getAddr().getState());
		
		System.out.println("-------------------------------");
		
		System.out.println(e1.getId());
		System.out.println(e1.getFname());
		System.out.println(e1.getLname());
		System.out.println(e1.getAddr().getStreet());
		System.out.println(e1.getAddr().getCity());
		System.out.println(e1.getAddr().getState());






	}

}
