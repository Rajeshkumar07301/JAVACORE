package com.rays.OPPAssignment;

import java.util.Date;

public class ConstructorPersonGS {
	private String Name;
	private Date Dob;
	private String Address;
	
	public ConstructorPersonGS(String c,String a,Date b) {
		Name =c;
		Address=a;
		Dob = b;
		//System.out.println(Name+" "+Dob+" "+Address);
	}
	public String getName() {
		return Name;
	}
	//public void setName(String name) {
		//Name = name;
	//}
	public Date getDob() {
		return Dob;
	}
	//public void setDob(Date dob) {
		//Dob = dob;
	//}
	public String getAddress() {
		return Address;
	}
	//public void setAddress(String address) {
		//Address = address;
	//}
	

}
