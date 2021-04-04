package com.vikas.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Company {

	@Autowired
	@Qualifier("hardwareEnginer")
	Engineer engineer;

	public void showInfo()
	{
		System.out.println("hello details!");
	}
}
