package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.javabase.Waiter;

@SpringBootApplication
public class SpringBootAutowireApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowireApplication.class, args);
	}
	
	@Autowired
	Waiter waiter;
	@Override
	public void run(String... args) throws Exception {
		List<String> menus = waiter.viewMenuCard("chinese");
		for(String menu : menus) {
			System.out.println(menu);
		}
		
	}
	

}
