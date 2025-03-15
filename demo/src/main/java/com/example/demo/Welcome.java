package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	@GetMapping("/")
	String welcome() {
	      return "Welcome to SpringBoot Project2!";
	   }

}
