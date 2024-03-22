package com.insuranceapp.service;

import java.util.List;

import com.insuranceapp.exception.InsurancenotFoundException;
import com.insuranceapp.model.Insurance;

public interface IInsuranceService {
	
	void addInsurance(Insurance insurance);
	void updateInsurance(int insuranceId, double premium);
	void deleteInsurance(int insuranceId);
	
	List<Insurance> getAll();
	List<Insurance> getByBrand(String brand) throws InsurancenotFoundException;
	List<Insurance> getByBrandAndtype(String brand,String type)throws InsurancenotFoundException;
	List<Insurance> getByTypeAndLesspremium(String type,double premium)throws InsurancenotFoundException;
	Insurance getById(int insuranceId)throws InsurancenotFoundException;

}
