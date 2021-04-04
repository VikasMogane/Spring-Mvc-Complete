package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	HrDept dept;
	
	public Company() {}
	
	
	public Company(HrDept dept)
	{
		this.dept = dept;
		System.out.println(" company constructor !! ");

		
	}
	@Autowired
	@Qualifier("dept1")  
	public void setDept(HrDept dept)
	{
		System.out.println("Inside company setter dept method !! ");
		this.dept = dept;
		
	}
	
	public void companyWork()
	{
		if(dept == null)
		{ System.out.println("No client to work");}
		else
			dept.work();
	}

}
