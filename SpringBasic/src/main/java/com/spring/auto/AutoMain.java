package com.spring.auto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AutoMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.auto");
		ShapeFactory shapeFactory =(ShapeFactory)context.getBean("shapeFactory");
		System.out.println(shapeFactory);
		shapeFactory.printArea("t",2,3);
	}
}
