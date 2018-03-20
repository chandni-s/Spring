package com.springmvc.SpringMVC.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@RequestMapping("/")
	public String home() {
		return "Home page";
	}

}
