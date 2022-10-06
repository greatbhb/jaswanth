package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringbootwithdockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwithdockerApplication.class, args);
	}

}
