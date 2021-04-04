package com.vikas.annotation;

import org.springframework.stereotype.Component;

@Component 
public class Company {

	SoftwareEnginer engineer;
	public void showInfo()
	{
		System.out.println("hello details!");
	}
}
