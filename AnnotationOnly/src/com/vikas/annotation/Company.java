package com.vikas.annotation;

import org.springframework.stereotype.Component;

@Component 
public class Company {

	SoftwareEnginer engineer;

	
	public void setEngineer(SoftwareEnginer engineer) {
		this.engineer = engineer;
		System.out.println("settter engineer  -- company");
	}
	
	public void showInfo()
	{
		System.out.println("hello details!");
	}
}
