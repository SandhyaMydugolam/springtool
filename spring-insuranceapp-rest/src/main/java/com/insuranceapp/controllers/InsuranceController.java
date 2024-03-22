package com.insuranceapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insuranceapp.exception.InsurancenotFoundException;
import com.insuranceapp.model.Insurance;
import com.insuranceapp.service.IInsuranceService;

@RestController
public class InsuranceController {

	@Autowired
	IInsuranceService insuranceService;
	
//	@GetMapping("/insurances")
//	List<Insurance> showInsurances(){
//		return insuranceService.getAll();
//	}
//	
//	@GetMapping("/insurances/insurance-id/{insuranceId}")
//	Insurance getone(@PathVariable("insuranceId")int  insuranceId) {
//		return insuranceService.getById(insuranceId);
//	}
	@PostMapping("/insurances")
	void addInsurance(Insurance insurance) {
		insuranceService.addInsurance(insurance);
	}
	void updateInsurance(int insuranceId, double premium);
	void deleteInsurance(int insuranceId);
	
	List<Insurance> getAll();
	List<Insurance> getByBrand(String brand) throws InsurancenotFoundException;
	List<Insurance> getByBrandAndtype(String brand,String type)throws InsurancenotFoundException;
	List<Insurance> getByTypeAndLesspremium(String type,double premium)throws InsurancenotFoundException;
	Insurance getById(int insuranceId)throws InsurancenotFoundException;

	
}
