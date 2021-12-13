package com.BankingApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String home(){
		return "Hello Welcome to SBI Bank";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "Your contact no. is 9444xxxxxx";
		
	}
	
	@RequestMapping("/balance")
	public String balance() {
		return "Your SBI balance is 25000/-";
		
	}
	
	@RequestMapping("/about")
	public String about() {
		return "What do you think about SBI?";
		
	}

}
