package com.vikas.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Company {

	SoftwareEnginer engineer;

	@Autowired
	public  Company(SoftwareEnginer engineer) {
		this.engineer = engineer;
		System.out.println("constructor  -- company");
	}
	
	public void showInfo()
	{
		System.out.println("hello details!");
	}
}
