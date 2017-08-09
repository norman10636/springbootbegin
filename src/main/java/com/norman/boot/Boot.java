package com.norman.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.norman")
public class Boot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Boot.class, args);
	}

}
