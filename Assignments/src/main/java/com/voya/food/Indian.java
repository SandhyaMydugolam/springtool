package com.voya.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Indian implements IFoodMenu{

	@Override
	public List<String> ShowMenu() {
		List<String> indian=Arrays.asList("dosa","puri");
		return indian;
	}
	
	
		

}
