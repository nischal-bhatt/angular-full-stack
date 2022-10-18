package com.in28minutes.rest.webservices.helloworldcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.helloworld.HelloWorldBean;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
public class HelloWorldController {

	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String helloWorld()
	{
		return "Hello world";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean()
	{
		//throw new RuntimeException("Some bloody error occurred");
		return new HelloWorldBean("hi from spring boot");
	}
	
	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello world from spring boot, %s",name));
	}
}
