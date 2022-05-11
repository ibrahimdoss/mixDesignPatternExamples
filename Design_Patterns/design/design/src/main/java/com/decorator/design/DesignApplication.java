package com.decorator.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignApplication.class, args);
		
		Phone phone = new Iphone_Max(new Iphone());
		
		System.out.println("Name : " + phone.getName());
	}

}

