package com.hospitalcompamy.hospitalapp.exception;

//custom checked exception
public class PatientAddressNotFoundException extends Exception{

    public PatientAddressNotFoundException(String errorMessege){
        System.out.println(errorMessege);

    }
}
