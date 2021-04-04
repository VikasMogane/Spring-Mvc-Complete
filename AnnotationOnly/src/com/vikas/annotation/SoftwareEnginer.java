package com.vikas.annotation;

import org.springframework.stereotype.Component;

@Component
public class SoftwareEnginer  implements Engineer{

	public void development()
	{
		System.out.println("s/w developement");
	}
}
