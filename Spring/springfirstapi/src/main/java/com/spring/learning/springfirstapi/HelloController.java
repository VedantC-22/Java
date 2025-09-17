package com.spring.learning.springfirstapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/vedant")
	public String hello() {
		return "Let's Start"; 
			
	}
}
