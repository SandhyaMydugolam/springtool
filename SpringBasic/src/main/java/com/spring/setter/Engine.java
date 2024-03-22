package com.spring.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Engine {
	
	private Integer Capacity;
	private String Type;
	public Engine() {
		super();
	}
	public Integer getCapacity() {
		return Capacity;
	}
	@Value("100")
	public void setCapacity(Integer capacity) {
		Capacity = capacity;
	}
	public String getType() {
		return Type;
	}
	@Value("Petrol")
	public void setType(String type) {
		Type = type;
	}
	@Override
	public String toString() {
		return "Engine [Capacity=" + Capacity + ", Type=" + Type + "]";
	}
	
	

}
