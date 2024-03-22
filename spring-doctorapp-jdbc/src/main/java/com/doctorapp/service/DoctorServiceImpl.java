package com.doctorapp.service;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.exceptions.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.DoctorRepositoryImpl;
import com.doctorapp.repository.IDoctorRepository;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DoctorServiceImpl implements IDoctorService{
	@Autowired
    private IDoctorRepository doctorRepository;
    @Override
    public void addDoctor(Doctor doctor) {
        doctorRepository.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
    	doctorRepository.updateDoctor(doctorId, fees);
    }

    @Override
    public void deleteDoctor(int doctorId) {
    	doctorRepository.deleteDoctor(doctorId);

    }

    @Override
    public Doctor getById(int doctorId) throws IdNotFoundException {
        Doctor doctor = doctorRepository.findById(doctorId);
        if(doctor==null){
            throw new IdNotFoundException("Invalid ID");
        }
        return doctor;

    }

    @Override
    public List<Doctor> getAll() {
        List<Doctor> doctorList = doctorRepository.findAll();
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
        List<Doctor> doctorList = doctorRepository.findSpeciality(speciality);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundException("doctor with this speciality");
        Collections.sort(doctorList,
                (d1,d2)->d1.getDoctorName().compareTo(d2.getDoctorName()));
        return doctorList;


    }

    @Override
    public List<Doctor> getBySpecialityAndExp(String speciality, int experince) throws DoctorNotFoundException {
        List<Doctor> doctorList = doctorRepository.findSpeciality(speciality);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundException("doctor with this speciality");
        Collections.sort(doctorList,
                (d1,d2)-> ((Integer)(d2.getExperience())).compareTo(d1.getExperience()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
        List<Doctor> doctorList = doctorRepository.findSpecialityAndLessFees(speciality,fees);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundException("doctor with this speciality");
        Collections.sort(doctorList,
                (d1,d2)-> (((Double)d2.getFees())).compareTo(d2.getFees()));
        return doctorList;
    }

    @Override
    public void getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
        List<Doctor> doctorList = doctorRepository.findSpecialityAndRatings(speciality,ratings);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundException("doctor with this speciality and exp not found");
        Collections.sort(doctorList,
                (d1,d2)-> ((Integer)(d1.getRatings())).compareTo(d1.getRatings()));
        return ;
    }

    @Override
    public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException {
        List<Doctor> doctorList = doctorRepository.findSpecialityAndNameContains(speciality,doctorName);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundException("doctor with this speciality");
        Collections.sort(doctorList,
                (d1,d2)-> (((Double)d2.getFees())).compareTo(d2.getFees()));

        return doctorList;
    }
}
