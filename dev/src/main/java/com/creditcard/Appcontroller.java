package com.creditcard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Appcontroller {
	@GetMapping("/")
	public String sayhello()
	{
		return "Hi anuja";
		
	}
	


}
