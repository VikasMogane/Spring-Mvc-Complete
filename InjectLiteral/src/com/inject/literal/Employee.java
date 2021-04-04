package com.inject.literal;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	

	public String empName;
	
	@Value("${employee.id}")
	public int empId;
	
	@Value("${employee.skills}")
	public String empOtherSkills;
	
	@Value("${employee.name}")
	public void setEmpName(String empName) {
		this.empName = empName;
		System.out.println("setter emp name");
	}
	
	
	public void showDetails()
	{
		System.out.println("Emaployee name is = "+empName);
		System.out.println("Emaployee Id is = "+empId);	
		System.out.println("Emaployee other skills are = "+empOtherSkills);

	}
	

}
