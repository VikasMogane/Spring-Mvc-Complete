package com.vikas.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Company {

	@Value("${company.name}")
	String companyName;
	
	@Autowired
	@Qualifier("hardwareEnginer")
	Engineer engineer;

	public void showInfo()
	{
		System.out.println("hello details!");
		System.out.println("companyName =  "+companyName);

	}
}
