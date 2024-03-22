package com.spring.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MusicAuto {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.auto");
		Performer performer =(Performer)context.getBean("performer");
		
		performer.PlayMusic("k","rrr");
	}
}
