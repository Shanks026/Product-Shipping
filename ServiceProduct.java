package com.self;

public class ServiceProduct extends Product {
	public int duration;

	public ServiceProduct(int id, String name, double price, int duration) {
		super(id, name, price);
		this.duration = duration;
	}
	
	public void displayService()
	{
		display();
		System.out.println("Product Duration : "+duration+" Days");
	}
	
	public void CalculateShippingCost()
	{
		System.out.println("Shipping is free");
	}
}
