package com.example.greeting.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("/greetings/{username}")
	String greeting(@PathVariable("username") String username) {
		return String.format("Hello %s!\n", username);
	}

}
