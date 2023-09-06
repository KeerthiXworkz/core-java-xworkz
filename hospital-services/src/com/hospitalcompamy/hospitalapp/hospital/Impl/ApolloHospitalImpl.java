package com.hospitalcompamy.hospitalapp.hospital.Impl;

import com.hospitalcompamy.hospitalapp.constant.BloodGroup;
import com.hospitalcompamy.hospitalapp.constant.Gender;
import com.hospitalcompamy.hospitalapp.exception.AttenderNameNotFoundException;
import com.hospitalcompamy.hospitalapp.exception.GenderNotFoundException;
import com.hospitalcompamy.hospitalapp.exception.PatientAgeNotFoundException;
import com.hospitalcompamy.hospitalapp.exception.PatientAddressNotFoundException;
import com.hospitalcompamy.hospitalapp.hospital.Hospital;
import com.hospitalcompamy.hospitalapp.patientdto.PatientDto;

import java.util.Arrays;

public class ApolloHospitalImpl implements Hospital {

    public PatientDto patients[];
    int index;
    int id;

    public ApolloHospitalImpl(int size){

        patients = new PatientDto[size];
    }
    @Override
    public boolean addPatients(PatientDto patients) {
        boolean isAdded= false;
        if(patients != null) {
            patients.setPatientId(++id);
            this.patients[index++] = patients;
            isAdded = true;
        }
        else{
            System.out.println("the patient details is null ...please provide valid details");
        }

        return  isAdded;
    }

    @Override
    public boolean updatePatientAgeByName(int updatedAge, String existingName) {
        boolean isAgeUpdated= false;
        for (index = 0 ; index <patients.length ; index++){
            if (patients[index].getName().equals(existingName)){
                patients[index].setAge(updatedAge);
                isAgeUpdated = true;
            }
        }
        return  isAgeUpdated;
    }

//    @Override
//    public boolean updatePatientNamebyPatientId(String updatedName, int existingPatientId) {
//        boolean isNameUpdated = false;
//        for (index = 0; index<patients.length ;index++){
//            if (patients[index].getPatientId()==existingPatientId){
//                patients[index].setName(updatedName);
//                isNameUpdated = true;
//            }
//        }
//        return isNameUpdated;
//
//    }

    @Override
    public boolean updatePatientWardNoByPatientName(String updatedWardNo, String existingsName) {
        boolean isWardNoUpdated = false;
        for (index =0; index< patients.length ; index ++){
            if (patients[index].getName().equals(existingsName)){
                patients[index].setWardNo(updatedWardNo);
                isWardNoUpdated =true;
            }
        }
        return isWardNoUpdated;
    }

    @Override
    public boolean deletePatientByPatientId(int patientId) {
        boolean isPatientDeleted=false;
        //  PatientsDTO newPatients[]= new PatientsDTO[patients.length -1];
        int oldIndex , newIndex;
        for (oldIndex=0,newIndex=0 ; oldIndex < patients.length ; oldIndex++){
            if (! (patients[oldIndex].getPatientId()==patientId)){
                patients[newIndex++] = this.patients[oldIndex] ;
            }
        }

        patients = Arrays.copyOf(patients,newIndex);
        System.out.println(Arrays.toString(patients));
        isPatientDeleted =true;
        return isPatientDeleted;
    }

    @Override
    public void getAllPatients() {

        System.out.println("the patient details are here");
        for (int patientindex=0 ; patientindex< patients.length ; patientindex++){
            System.out.println(patients[patientindex]);
        }
    }

    @Override
    public String getAttenderNamebyPatientId(int patientID) {
        String attenderName= null;
        for (int index=0 ; index< patients.length ;index++){
            if (patients[index].getPatientId()==patientID){
                attenderName=patients[index].getAttenderName();
            }
        }
        if (attenderName ==null){

            AttenderNameNotFoundException attenderNameNotFoundException = new AttenderNameNotFoundException("attender name not found from patient id" + patientID);
                throw attenderNameNotFoundException;
        }
        return attenderName;
    }

    @Override
    public Gender getGenderbyName(String name) {
        Gender gender =null;
        for(int index=0 ; index < patients.length ; index++){
            if(patients[index].getName().equals(name)){
                gender=patients[index].getGender();
            }
        }
        if (gender == null){
            throw new GenderNotFoundException("gender not found from name" + name);
        }
        return gender;
    }

    @Override
    public int getAgeByPatientId(int patientId) throws PatientAgeNotFoundException {
        int age = 0;
        for (int index=0 ; index < patients.length ; index++){
            if (patients[index].getPatientId()==patientId){
                age=patients[index].getAge();
            }
        }
        if (age == 0){
            PatientAgeNotFoundException patientAgeNotFoundException =new PatientAgeNotFoundException("patient age not found from patient id" + patientId);
          throw patientAgeNotFoundException; // throw : throw the object of exception type
        }
        return age;
    }

    @Override
    public String getAddressByName(String name) throws PatientAddressNotFoundException {
        String address=null;
        for (int index=0; index<patients.length ; index++){
            if(patients[index].getName().equals(name)){
                address=patients[index].getAddress();
            }
        }
        if(address == null){
            PatientAddressNotFoundException patientAddressNotFound = new PatientAddressNotFoundException("patient address not  found from name" + name);
            throw patientAddressNotFound;
        }
        return address;
    }

    @Override
    public BloodGroup getBloodGroupByName(String name) {
        BloodGroup bloodGroup=null;
        for (int index =0 ; index< patients.length ; index++){
            if (patients[index].getName().equals(name)){
                bloodGroup=patients[index].getBloodGroup();
            }
        }
        if (bloodGroup == null){

        }
        return bloodGroup;
    }

    @Override
    public PatientDto getPatientsByPatientId(int patientId) {
        PatientDto patient = null;
        for (int index=0;index < patients.length;index++){
            if(patients[index].getPatientId()== patientId){
                patient = patients[index];
            }
        }
        return patient;
    }
}
