package com.springSecurity.angular.springsecurityangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAngularApplication.class, args);
	}

}
