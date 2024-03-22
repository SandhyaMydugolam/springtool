package com.insuranceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.insuranceapp.model.Insurance;
import com.insuranceapp.service.IInsuranceService;

@SpringBootApplication
public class SpringInsuranceappRestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringInsuranceappRestApplication.class, args);
	}
	@Autowired
	IInsuranceService service;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Insurance insurance=new Insurance(104, "as-98", "bajaj", "motor", 10, 10000);
//		service.addInsurance(insurance);
	}
	
}
