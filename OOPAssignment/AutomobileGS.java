package com.rays.OPPAssignment;

public class AutomobileGS {

  private String Color;
  private int Speed;
  private String Make;
  
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
public int getSpeed() {
	return Speed;
}
public void setSpeed(int speed) {
	Speed = speed;
}
public String getMake() {
	return Make;
}
public void setMake(String make) {
	Make = make;
}
//method
public void breakk(int spd) {
	int speed = getSpeed()-spd;
	setSpeed(speed);
}
public void accelerator(int spd) {
	int speed = getSpeed()+spd;
	setSpeed(speed);
}
public void changeGear(int gear) {
	if(gear==1) {
		Speed=10;
	}
	if(gear==2) {
		Speed=20;
	}
	if(gear==3) {
		Speed=40;
	}
	if(gear==4) {
		Speed=60;
	}
	if(gear==0) {
		Speed=0;
	}	
}

}
