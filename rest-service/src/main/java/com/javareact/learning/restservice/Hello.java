package com.javareact.learning.restservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Hello {
	
	@GetMapping( path="/hello")
	public String hello() {
		return "Hello";
	}	
	
	@GetMapping( path="/hellomessage")
	public HelloBean helloBean() {
		return new HelloBean("Hello World");
	}
	
	@GetMapping( path="/hellomessage/{name}")
	public HelloBean helloBeanPath(@PathVariable String name) {
	//throw new RuntimeException("something went wrong");

		return new HelloBean(String.format("Hello World , %s" , name));
	}
	
}
