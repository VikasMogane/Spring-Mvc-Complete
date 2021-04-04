package com.di;

public class Bike 
{
//	String color;
//	
//	public void showColor()
//	{
//		System.out.println("your color is = "+color);
//	}
//	
	Engine engine;
	
	public Bike(Engine engine)
	{
		System.out.println("I m constructor");
		this.engine=engine;
	}
	
	public void startEngine()
	{
		if(engine == null)
			System.out.println("unable to start engine!!");
		engine.start();
	}
	
}

