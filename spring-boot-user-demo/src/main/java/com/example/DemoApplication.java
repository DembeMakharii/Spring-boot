package com.example;

import org.springframework.boot.SpringApplication;
import com.example.service.UserService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DemoApplication.class, args);
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService.addUser("Dembe", "Makhari"));
		System.out.println(userService.getUser(1));
		System.out.println(userService.removeUser(1));

	}

}
