package com.rays.OPPAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonSG {
    
	private String Name;
	private Date Dob;
	private String Address;
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			
	public String getName() {
		return Name;
	}
	public void setName(String n) {
		this.Name = n;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(String dob) throws ParseException {
		Date d=sdf.parse(dob);
		this.Dob=d;
		
	}
	public String getAdd() {
		return Address;
	}
	public void setAddress(String add) {
		this.Address=add;
	}
	
}


