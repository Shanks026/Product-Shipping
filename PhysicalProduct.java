package com.self;

public class PhysicalProduct extends Product {
	public int weight;

	public PhysicalProduct(int id, String name, double price, int weight)
	{
		super(id, name, price);
		this.weight = weight;
	}
	
	public void displayPhysical()
	{
		display();
		System.out.println("Product Weight : "+weight+" Kgs");
	}
	
	
	public void CalculateShippingCost()
	{
		System.out.println("The Shippng Cost of the Product is : "+2*weight);
	}
	
	
}
