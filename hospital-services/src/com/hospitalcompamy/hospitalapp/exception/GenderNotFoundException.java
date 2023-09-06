package com.hospitalcompamy.hospitalapp.exception;

public class GenderNotFoundException extends RuntimeException {

    public GenderNotFoundException(String errorMessege){
        System.out.println(errorMessege);
    }
}
