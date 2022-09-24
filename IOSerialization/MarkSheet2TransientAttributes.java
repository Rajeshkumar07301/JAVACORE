package com.rays.IOSerialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class MarkSheet2TransientAttributes implements Serializable ,Externalizable{
	private String name;
	private int maths;
	private int physics;
	private int chemistry;
	private transient int total;
	private transient double percentage;
	
	public MarkSheet2TransientAttributes() {
		// TODO Auto-generated constructor stub
	}
    public MarkSheet2TransientAttributes(String a, int b,int c,int d ,int e,double f) {
    	this.name = a;
    	this.maths = b;
    	this.physics = c;
    	this.chemistry = d;
    	this.total = e;
    	this.percentage = f;
    }
	public String getName() {
		return name;
	}
	public int getMaths() {
		return maths;
	}
	public int getPhysics() {
		return physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public int getTotal() {
		return total;
	}
	public double getPercentage() {
		return percentage;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
	    out.writeObject(name);
	    out.write(maths);
	    out.write(physics);
	    out.write(chemistry);
	    out.write(total);
	    out.writeDouble(percentage);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		maths = in.read();
		physics = in.read();
		chemistry = in.read();
		total = in.read();
		percentage = in.readDouble();
		
	}
	

}
