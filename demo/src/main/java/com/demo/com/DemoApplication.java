package com.demo.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
	
	@RequestMapping("/sayMessage")
	public String getMessage()
	{
		return "Congrats on your first message"; 
	}
	
	@RequestMapping("/sayBye")
	public String byeMessage()
	{       
		return "BYE BYE :(";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
