package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RefreshScope
public class GreetingController {
	
	@Value("${my.greeting}")
	private String greetingMessage ;
	
	@Value("${app.name}")
	private String appName ;
	
	@Value("${app.discription}")
	private String appDiscription ;
	
	
	@GetMapping("/greeting")
	public String greeting() {
		System.out.println("greetingMessage : "+greetingMessage);
		return greetingMessage;
	}
	
	@GetMapping("/appName")
	public String appName() {
		System.out.println("appName : "+appName);
		return appName;
	}
	
	@GetMapping("/appDiscription")
	public String appDiscription() {
		System.out.println("appDiscription : "+appDiscription);
		return appDiscription;
	}


}