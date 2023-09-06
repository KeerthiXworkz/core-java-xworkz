package com.hospitalcompamy.hospitalapp.exception;


// custom checked exception
public class PatientAgeNotFoundException extends Exception{

    public PatientAgeNotFoundException(String errorMessege){
        System.out.println(errorMessege);
    }
}
