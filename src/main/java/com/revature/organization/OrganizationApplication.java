package com.revature.organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class OrganizationApplication {
	
	
	 @Bean  //method that generates an instance of  BCryptPasswordEncoder 
	    public BCryptPasswordEncoder bCryptPasswordEncoder() {
	        return new BCryptPasswordEncoder();
	    }


	public static void main(String[] args) {
		SpringApplication.run(OrganizationApplication.class, args);
		
	}
	
}
