package com.self;

public class Main {

	public static void main(String[] args) {
		PhysicalProduct PP = new PhysicalProduct(001,"Playstation",80000.0,6);
		DigitalProduct DP = new DigitalProduct(002,"Grand Theft Auto 6",5000,128);
		ServiceProduct SP = new ServiceProduct(003,"Antivirus",999,365);
		PP.displayPhysical();
		PP.CalculateShippingCost();
		System.out.println("...");
		DP.displayDigital();
		DP.CalculateShippingCost();
		System.out.println("...");
		SP.displayService();
		SP.CalculateShippingCost();
		System.out.println("...");
		

	}

}
