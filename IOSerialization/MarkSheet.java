package com.rays.IOSerialization;

import java.io.Serializable;

public class MarkSheet  implements Serializable {
       private String name = null;
       private int maths = 0;
       private int physics = 0;
       private int chemistry = 0;
       
       
       public MarkSheet() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
       
}
