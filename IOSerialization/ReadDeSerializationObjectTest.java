package com.rays.IOSerialization;

import java.io.*;

public class ReadDeSerializationObjectTest {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("d:/raj.ser");
		ObjectInputStream in = new ObjectInputStream(file);
		
		MarkSheet m = (MarkSheet) in.readObject();
		
		System.out.println(m.getName());
		System.out.println(m.getMaths());
		System.out.println(m.getPhysics());
		System.out.println(m.getChemistry());
		
			
		
		in.close();
		file.close();

	

	FileInputStream file2 = new FileInputStream("d:/app.ser");
	ObjectInputStream in2 = new ObjectInputStream(file2);
	
	MarkSheet2TransientAttributes m1 = (MarkSheet2TransientAttributes) in2.readObject();
	
	System.out.println(m1.getName());
	System.out.println(m1.getMaths());
	System.out.println(m1.getPhysics());
	System.out.println(m1.getChemistry());
	System.out.println(m1.getTotal());
	System.out.println(m1.getPercentage());
    
	
	
	
	
	in.close();
	file.close();

}	
}