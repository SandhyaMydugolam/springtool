package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;
@Service
public class InsuranceServiceImpl implements IInsuranceService {

	@Override
	public List<Insurance> getAll() {
		return getAllInsurances();
	}

	@Override
	public Insurance getById(int insuranceId) {
		List<Insurance> insurances = getAllInsurances();
		for (Insurance insurance : insurances) {
			if(insurance.getInsuranceId()==insuranceId)
				return insurance;
		}
		return null;
	}
	 
	private List<Insurance> getAllInsurances(){
		return Arrays.asList(
			new Insurance(101, "V0-H001","voya","health",10,10000),
			new Insurance(102, "BJ-M01","Bajaj","motor",10,5000),
			new Insurance(103, "FI-Life","Fidelitv","life",15,8000),
			new Insurance(104, "FI-Life","Fidelitv","life",15,8000));
				
				
	}
}
