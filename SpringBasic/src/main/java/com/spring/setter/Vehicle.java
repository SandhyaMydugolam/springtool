package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	private Integer VehicleId;
	private String Model;
	private String Brand;
	private String Price;
	private Engine engine;
	
	public Vehicle() {
		super();
	}
	public Integer getVehicleId() {
		return VehicleId;
	}
	@Value("1234")
	public void setVehicleId(Integer vehicleId) {
		VehicleId = vehicleId;
	}
	public String getModel() {
		return Model;
	}
	@Value("2022")
	public void setModel(String model) {
		Model = model;
	}
	public String getBrand() {
		return Brand;
	}
	@Value("Jeep")
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getPrice() {
		return Price;
	}
	@Value("400000")
	public void setPrice(String price) {
		Price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [VehicleId=" + VehicleId + ", Model=" + Model + ", Brand=" + Brand + ", Price=" + Price
				+ ", engine=" + engine + "]";
	}
	
	
	

}
