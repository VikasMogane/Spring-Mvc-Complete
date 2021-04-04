package com.di;

public class Bike 
{
	String color;	
	public Bike()
	{
		System.out.println("creation of object bike");
	}
	
	public void setColor(String color)
	{
		System.out.println("inside setter method");
		this.color=color;
	}
	public void showColor()
	{
		System.out.println("Your color is = "+color);
	}
	
}

