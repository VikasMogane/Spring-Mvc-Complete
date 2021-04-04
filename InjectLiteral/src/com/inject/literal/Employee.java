package com.inject.literal;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	public String empName;
	public int empId;
	public String empOtherSkills;
	
	@Value("Raj")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpOtherSkills(String empOtherSkills) {
		this.empOtherSkills = empOtherSkills;
	}
	
	public void showDetails()
	{
		System.out.println("Emaployee name is = "+empName);
		System.out.println("Emaployee Id is = "+empId);	
		System.out.println("Emaployee other skills are = "+empOtherSkills);

	}
	

}
