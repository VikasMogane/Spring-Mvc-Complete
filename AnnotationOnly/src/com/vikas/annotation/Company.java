package com.vikas.annotation;

import org.springframework.stereotype.Component;

@Component 
public class Company {

	SoftwareEnginer engineer;

	
	public  Company(SoftwareEnginer engineer) {
		this.engineer = engineer;
		System.out.println("constructor  -- company");
	}
	
	public void showInfo()
	{
		System.out.println("hello details!");
	}
}
