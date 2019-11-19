package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController 

public class HelloWorldController {

	//simple method
	//URI - /hello word
	//GET

	//@RequestMapping (method= RequestMethod.GET ,path ="/helloworld")
	@GetMapping("helloworld1")
	public String helloWorld(){
		return "hello world";
		
		
	}
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean()
	{
		return new UserDetails ("aman","kapoor","chandigarh");
		
	}
	
}
