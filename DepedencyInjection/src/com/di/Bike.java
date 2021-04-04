package com.di;

public class Bike 
{
	String color;	
	public Bike(String color)
	{
		System.out.println("I m constructor");
		this.color=color;
	}
	
	public void showColor()
	{
		System.out.println("Your color is = "+color);
	}
	
}

