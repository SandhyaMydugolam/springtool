package com.doctorapp.model;

public enum Specialization {
    ORTHO ("ORTHOPEDICIAN"),
    PEDIA("PEDIATRICIAN"),
    PHYSICIAN("GENERAL PHYSICIAN"),
    GYNAEC("GYNAECOLOGIST"),
    DERAMA("DERMATOLOGIST"),
    NEURO("NEUROLOGIST");

    private String speciality;

    Specialization(String speciality) {
        this.speciality=speciality;
    }

    public String getSpeciality() {
        return speciality;
    }
}
