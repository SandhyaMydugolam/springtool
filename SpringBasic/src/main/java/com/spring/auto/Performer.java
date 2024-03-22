package com.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.voya.food.IInstrument;
@Component
public class Performer {
	@Autowired
	@Qualifier("violin")
	IInstrument iInstrument;
	
	@Autowired
	@Qualifier("keyboard")
	IInstrument iInstrument1;
	
	@Autowired
	@Qualifier("guitar")
	IInstrument iInstrument2;
	
	public void PlayMusic(String choice,String song ) {
		if(choice.equals("v"))
			iInstrument.play(song);
		if(choice.equals("k"))
			iInstrument1.play(song);
		if(choice.equals("g"))
			iInstrument2.play(song);
		
		
	}
}
