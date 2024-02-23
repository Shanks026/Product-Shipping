package com.self;
import java.util.*;

public class DigitalProduct extends Product{
	public int size;

	public DigitalProduct(int id, String name, double price, int size) {
		super(id, name, price);
		this.size = size;
	}
	
	public void displayDigital()
	{
		display();
		System.out.println("Product Size : "+size+" GB");
	}
	
	public void CalculateShippingCost()
	{
		System.out.println("Cannot be calculated");
	}
}
