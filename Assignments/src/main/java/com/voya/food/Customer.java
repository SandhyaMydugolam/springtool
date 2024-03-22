package com.voya.food;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Customer {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.voya.food");
		Waiter waiter =(Waiter) context.getBean("waiter");
		List <String>menuList=waiter.viewMenuCard("indian");
		for (String menu : menuList) {
			System.out.println(menu);
		}
	}

}
