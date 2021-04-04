package com.di;

public class Car {

	Engine engine;
	
	public Car(Engine engine)
	{
		System.out.println("I m Car constructor");
		this.engine=engine;
	}
	
	public void startEngine()
	{
		if(engine == null)
			System.out.println("unable to start Car engine!!");
		engine.start();
	}
}
