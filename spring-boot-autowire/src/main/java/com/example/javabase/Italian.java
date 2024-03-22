package com.example.javabase;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

public class Italian implements IFoodMenu{

	@Override
	public List<String> ShowMenu() {
		List<String> italian=Arrays.asList("idly","pizza");
		return italian;
	}
	
	
		

}
