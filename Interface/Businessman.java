package com.rays.Interface;

public class Businessman  implements Richman,SocialWorker{
	private String name;
	private String address;
	private String party;

	@Override
	public void helpToOther() {
		System.out.println("Hellp to Other ");
		
	}

	@Override
	public void earnmoney() {
		System.out.println("Earnmoney");
		
	}

	@Override
	public void donation() {
		System.out.println("Donation");
		
	}

	@Override
	public void party() {
		System.out.println("Party");
		
		
	}

}
