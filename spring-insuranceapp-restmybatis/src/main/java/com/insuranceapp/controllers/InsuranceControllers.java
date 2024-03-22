package com.insuranceapp.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insuranceapp.exception.InsurancenotFoundException;
import com.insuranceapp.model.Insurance;
import com.insuranceapp.service.IInsuranceService;
@RestController
@RequestMapping("/insurance-api-v1")
public class InsuranceControllers {
	@Autowired
	IInsuranceService insuranceService;
	
	
	@PostMapping("/insurances")
	ResponseEntity<Void> addInsurance(@RequestBody  Insurance insurance) {
		insuranceService.addInsurance(insurance);
		return ResponseEntity.status(HttpStatusCode.valueOf(201)).build();
	}
	
	
	@PutMapping("/insurances")
	ResponseEntity<Void> updateInsurance(@RequestBody Insurance insurance) {
		insuranceService.updateInsurance(insurance.getInsuranceId(), insurance.getPremium());
		return ResponseEntity.accepted().build();
	}
	
	
	@DeleteMapping("/insurances/insurance-id/{insuranceId}")
	ResponseEntity<Void> deleteInsurance(@RequestBody Insurance insurance) {
		insuranceService.deleteInsurance(insurance.getInsuranceId());
		return ResponseEntity.ok().build();
	}
	
	
	@GetMapping("/insurances")
	ResponseEntity<List<Insurance>> getAll(){
		//create headers
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "returning list of insurances");
		headers.add("desc","All insurances from db");
		//get the data for body of response
		List<Insurance> insurances = insuranceService.getAll();
		ResponseEntity<List<Insurance>> entity =
				new ResponseEntity<>(insurances,headers,HttpStatus.OK);
		return entity;
	}
	
	
	@GetMapping("/insurances/brand/{brand}")
	ResponseEntity<List<Insurance>> getByBrand(@PathVariable String brand){
		List<Insurance> insurances = insuranceService.getByBrand(brand);
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "returning list of insurances by brand "+brand);
		return ResponseEntity.status(200).headers(headers).body(insurances);
	}
	
	
	@GetMapping("/insurances/brand/{brand}/type/{type}")
	List<Insurance> getByBrandAndtype(@PathVariable("brand")String brand,
			@PathVariable("type")String type){
		return
				insuranceService.getByBrandAndtype(brand, type);
	}
	
		
	@GetMapping("/insurances/type-premium")
	ResponseEntity<List<Insurance>> getByTypeAndLesspremium(
			@RequestParam("type")String type,@RequestParam("premium")double premium) {
		List<Insurance> insurances = insuranceService.getByTypeAndLesspremium(type, premium);
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "returning list of insurances by type premiu "+type);
		return ResponseEntity.accepted().headers(headers).body(insurances);				
		
	}
	
	
	@GetMapping("/insurances/insurance-id/{insuranceId}")
	ResponseEntity<Insurance> getById(@PathVariable("insuranceId")int insuranceId) {
		Insurance insurance = insuranceService.getById(insuranceId);
		return ResponseEntity.ok().body(insurance);
				
	}
}
