package me.art.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
public class ArtRequestController {
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello Aanu!";
	}
	
	@GetMapping("/sayHello/{name}")
	public String sayHelloSpecific(@PathVariable String name) {
		return "Hello " + name.toUpperCase() + "!";
	}
	
}
