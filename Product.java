package com.self;

public abstract class Product {
	public int id;
	public String name;
	public double price;
	
	public Product(int id, String name, double price)
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void display()
	{
		System.out.println("Product ID : "+id);
		System.out.println("Product Name : "+name);
		System.out.println("Product Price : "+price+" Rupees");
	}

	public abstract void CalculateShippingCost();
	

}
