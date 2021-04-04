package com.vikas.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="com.vikas.annotation")
public class ConfigClass {
	
	@Bean
	public SoftwareEnginer engineer()
	{
		return new SoftwareEnginer();
	}
	
	@Bean
	public Company company()
	{
		Company company = new Company(engineer());
	
		return company;
	}
	
	

}
