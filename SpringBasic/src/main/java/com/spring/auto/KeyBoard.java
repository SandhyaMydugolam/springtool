package com.spring.auto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.voya.food.IInstrument;

@Component
@Qualifier("keyboard")
public class KeyBoard implements IInstrument{

	@Override
	public void play(String song) {
		
		System.out.println(song);
	}
	

}
