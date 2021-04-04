package com.vikas.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Company {

	@Autowired
	Engineer engineer;

	public void showInfo()
	{
		System.out.println("hello details!");
	}
}
