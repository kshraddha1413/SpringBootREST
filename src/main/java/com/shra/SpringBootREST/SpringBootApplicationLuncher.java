package com.shra.SpringBootREST;

import org.springframework.boot.SpringApplication;

import com.shr.SpringBootREST.controller.HelloWorldController;

public class SpringBootApplicationLuncher {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}
}
