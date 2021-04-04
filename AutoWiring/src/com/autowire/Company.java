package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {

	@Autowired
	@Qualifier("deptObj")  
	Dept dept;
	
	public void companyWork()
	{
		if(dept == null)
		{ System.out.println("No client to work");}
		else
			dept.work();
	}

}
