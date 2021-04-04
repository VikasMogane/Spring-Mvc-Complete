package com.autowire;

public class Company {
	HrDept dept;
	
	public Company(HrDept dept)
	{
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
