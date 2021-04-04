package com.vikas.annotation;

import org.springframework.stereotype.Component;

@Component("test")
public class Company {

	public void showInfo()
	{
		System.out.println("hello details!");
	}
}
