package com.hospitalcamps.healthcareapp;

import com.hospitalcamps.healthcareapp.hospital.Hospital;
import com.hospitalcamps.healthcareapp.patient.Patients;

public class HospitalTester {

    public static  void main(String []args){

        Hospital hospital = new Hospital();
        Patients patient  =new Patients();

        hospital.patients = patient;
    }
}
