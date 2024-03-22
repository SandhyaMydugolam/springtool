package com.doctorapp.repository;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDb;
import com.doctorapp.util.Queries;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {
	private JdbcTemplate jdbcTemplate;
	
	
public DoctorRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}


@Override
public void addDoctor(Doctor doctor) {
Object[] docArr= {doctor.getDoctorName(),doctor.getSpeciality(),doctor.getExperience(),doctor.getFees(),doctor.getRatings()};
	jdbcTemplate.update(Queries.UPDATEQUERY,docArr);
	
}


@Override
public void updateDoctor(int doctorId, double fees) {
	jdbcTemplate.update(Queries.UPDATEQUERY,fees,doctorId);
	
}


@Override
public void deleteDoctor(int doctorId) {
	jdbcTemplate.update(Queries.DELETEQUERY,doctorId);
}





@Override
public List<Doctor> findAll() {
	RowMapper<Doctor> mapper = new DoctorMapper();
	List<Doctor> doctor = jdbcTemplate.query(Queries.FINDALLQUERY, mapper);
	return doctor;
}


@Override
public List<Doctor> findSpeciality(String speciality) throws DoctorNotFoundException {
	List<Doctor> doctor = jdbcTemplate.query(Queries.FINDBYSPECIALITY, new DoctorMapper(),speciality);
	return doctor;
}


@Override
public List<Doctor> findSpecialityAndExp(String speciality, int experince) throws DoctorNotFoundException {
	//List<Doctor> doctor = jdbcTemplate.query(Queries., new DoctorMapper(),speciality);
	return null;
}


@Override
public List<Doctor> findSpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
	List<Doctor> doctor = jdbcTemplate.query(Queries.FINDBYSPECANDFEES, new DoctorMapper(),speciality,fees);
	return doctor;
}


@Override
public List<Doctor> findSpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
	List<Doctor> doctor = jdbcTemplate.query(Queries.FINDBYSPECANDRATINGS, new DoctorMapper(),speciality,ratings);
	return doctor;
}


@Override
public List<Doctor> findSpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException {
	List<Doctor> doctor = jdbcTemplate.query(Queries.FINDBYSPECANDNAME, new DoctorMapper(),speciality,doctorName);
	return doctor;
}


@Override
public Doctor findById(int doctorId) {
	Doctor doctor = jdbcTemplate.queryForObject(Queries.FINDBYID,new DoctorMapper(), doctorId);
	return doctor;
}
}

   