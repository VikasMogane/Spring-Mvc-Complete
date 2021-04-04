package com.vikas.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HardwareEnginer  implements Engineer{

	public void development()
	{
		System.out.println("h/w developement");
	}
}
