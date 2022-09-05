package com.rays.Interface;

public class BusinessmanTest {

	public static void main(String[] args) {
		SocialWorker s = new Businessman();
		s.helpToOther();
		
		Richman r = new Businessman();
		r.earnmoney();
		r.donation();
		r.party();
		
		

	}

}
