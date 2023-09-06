package com.hospitalcompamy.hospitalapp.hospital;

import com.hospitalcompamy.hospitalapp.constant.BloodGroup;
import com.hospitalcompamy.hospitalapp.constant.Gender;
import com.hospitalcompamy.hospitalapp.exception.PatientAgeNotFoundException;
import com.hospitalcompamy.hospitalapp.exception.PatientAddressNotFoundException;
import com.hospitalcompamy.hospitalapp.patientdto.PatientDto;

public interface Hospital {


    public boolean addPatients(PatientDto patients);
    public boolean updatePatientAgeByName(int updatedAge ,String existingName);
  //  public boolean updatePatientNamebyPatientId(String updatedName , int existingPatientId);
    public boolean updatePatientWardNoByPatientName(String updatedWardNo , String existingsName);
    public boolean deletePatientByPatientId(int patientId);
    public void getAllPatients();
    public String getAttenderNamebyPatientId(int patientID);
    public Gender getGenderbyName(String name);
    public int getAgeByPatientId(int patientId) throws PatientAgeNotFoundException;
    public String getAddressByName(String name) throws PatientAddressNotFoundException;
    public BloodGroup getBloodGroupByName(String name);
    public PatientDto getPatientsByPatientId(int patientId);

}
