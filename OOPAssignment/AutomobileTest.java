package com.rays.OPPAssignment;

public class AutomobileTest {

	public static void main(String[] args) {
		AutomobileGS sp=new AutomobileGS();
		sp.setColor("black");
		sp.setMake("Honda");
		sp.setSpeed(60);
		
		System.out.println("color:"+sp.getColor());
		System.out.println("Make By:"+sp.getMake());
		System.out.println("Speed:="+sp.getSpeed());
		
		//method output
		sp.changeGear(4);
	    System.out.println("changeGear:="+sp.getSpeed());
	    
	    sp.breakk(060);
	    System.out.println("Break presed speed is:="+sp.getSpeed());
	    
	    sp.accelerator(65);
	    System.out.println("Break presed speed is:="+sp.getSpeed());
	}
}
