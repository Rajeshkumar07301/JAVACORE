package com.rays.Collectionframework;

public class MarkSheet implements Comparable<MarkSheet> {
	private String rollnumber;
	private String Fname;
	private String Lname;
	private int Physics;
	private int Chemistry;
	private int maths;

	public MarkSheet() {
		// TODO Auto-generated constructor stub
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		this.Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}

	public int getPhysics() {
		return Physics;
	}

	public void setPhysics(int physics) {
		Physics = physics;
	}

	public int getChemistry() {
		return Chemistry;
	}

	public void setChemistry(int chemistry) {
		Chemistry = chemistry;
	}

	public int getMaths() {

		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	@Override
	public int compareTo(MarkSheet obj) {

		return this.rollnumber.compareTo(obj.rollnumber);
	}

	@Override
	public String toString() {
		return rollnumber + " , " + Fname + " , " + Lname +" ,"+Physics+" , "+Chemistry+" , "+maths;
	}

}
