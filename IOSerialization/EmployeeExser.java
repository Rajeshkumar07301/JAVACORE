package com.rays.IOSerialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeExser implements Externalizable{
		private String id = null;
		private String Fname = null;
		private String Lname = null;
		private double salary = 0;
		@Override
		public void writeExternal(ObjectOutput out) throws IOException {
			out.writeObject(id);
			out.writeObject(Fname);
			out.writeObject(Lname);
			out.writeDouble(salary);
		}
		@Override
		public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
			id = (String) in.readObject();
			Fname = (String) in.readObject();
			Lname = (String) in.readObject();
			salary = in.readDouble();
			
			
		}
		
		
		
		
		
		

	

}
