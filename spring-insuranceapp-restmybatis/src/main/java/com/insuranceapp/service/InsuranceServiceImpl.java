package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.insuranceapp.exception.InsurancenotFoundException;
import com.insuranceapp.model.Insurance;
import com.insuranceapp.repository.IInsuranceRepository;
@Service
public class InsuranceServiceImpl implements IInsuranceService {
	
	
	@Autowired
    private IInsuranceRepository insuranceRepository;

	@Override
	public void addInsurance(Insurance insurance) {
		 insuranceRepository.addInsurance(insurance);
		
	}

	@Override
	public void updateInsurance(int insuranceId, double premium) {
		insuranceRepository.updateInsurance(insuranceId, premium);
		
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		insuranceRepository.deleteInsurance(insuranceId);
		
	}

	@Override
	public List<Insurance> getAll() {
		return insuranceRepository.findAll();
	}

	@Override
	public List<Insurance> getByBrand(String brand) throws InsurancenotFoundException {
		return insuranceRepository.findByBrand(brand);
	}

	@Override
	public List<Insurance> getByBrandAndtype(String brand, String type) throws InsurancenotFoundException {
		return insuranceRepository.findByBrandAndtype(brand, type);
	}

	@Override
	public List<Insurance> getByTypeAndLesspremium(String type, double premium) throws InsurancenotFoundException {
		return insuranceRepository.findByTypeAndLesspremium(type, premium);
	}

	@Override
	public Insurance getById(int insuranceId) throws InsurancenotFoundException {
		Insurance insurance = insuranceRepository.findById(insuranceId);
        if(insurance==null){
            throw new InsurancenotFoundException("Invalid ID");
        }
        return insurance;
	}
}	