package com.doctorapp.util;

public class Queries {
    public static final String INSERTQUERY =
            "insert into doctor (doctor_name,speciality,experince,fees,ratings) values(?,?,?,?,?)";
    public static final String UPDATEQUERY=
            "UPDATE DOCTOR SET fees=? WHERE doctor_id=?";
    public static final String DELETEQUERY=
            "DELETE FROM DOCTOR WHERE doctor_id=?";
    public static final String FINDALLQUERY=
            "select * FROM DOCTOR";
    public static final String FINDBYID=
            "select * FROM DOCTOR WHERE doctor_id=?";
    public static final String FINDBYSPECIALITY=
            "select * FROM DOCTOR WHERE speciality=?";
    public static final String FINDBYSPECANDRATINGS=
            "select * FROM DOCTOR WHERE speciality = ? AND experience >= ?";
    public static final String FINDBYSPECANDFEES=
            "select * FROM DOCTOR WHERE speciality = ? AND fees >= ?";
    public static final String FINDBYSPECANDNAME=
            "select * FROM DOCTOR WHERE speciality = ? AND doctor_name like ?";
    public static final String FINDBYSPECANDID=
            "select * FROM DOCTOR WHERE doctor_id = ?";



}
