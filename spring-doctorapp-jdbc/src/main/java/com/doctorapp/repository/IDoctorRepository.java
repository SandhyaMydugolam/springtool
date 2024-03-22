package com.doctorapp.repository;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

import java.sql.SQLException;
import java.util.List;

public interface IDoctorRepository {

    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId, double fes);
    void deleteDoctor(int doctorId);
    
    List<Doctor> findAll() ;
    List<Doctor> findSpeciality(String speciality) throws DoctorNotFoundException;
    List<Doctor> findSpecialityAndExp(String speciality,int experince)throws DoctorNotFoundException;
    List<Doctor> findSpecialityAndLessFees(String speciality,double fees)throws DoctorNotFoundException;
    List<Doctor> findSpecialityAndRatings(String speciality,int ratings)throws DoctorNotFoundException;
    List<Doctor> findSpecialityAndNameContains(String speciality,String doctorName)throws DoctorNotFoundException;

                                                                                            Doctor findById(int doctorId);
}


