package com.example.javabase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
public class AppConfig {
	
	//bean definitions
	@Bean
	@Primary
	public Chinese getChinese() {
		return new Chinese();
	}
	@Bean

	public Indian getIndian() {
		return new Indian();
		}
	@Bean
	public Italian getItalian() {
		return new Italian();
	}
	@Bean
	public Waiter getWaiter() {
		Waiter waiter = new Waiter();
		waiter.setMenu(getChinese());
		return waiter;
	}

}
