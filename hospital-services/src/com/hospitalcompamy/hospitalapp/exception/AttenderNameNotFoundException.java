package com.hospitalcompamy.hospitalapp.exception;

// custom unchecked exception
public class AttenderNameNotFoundException extends RuntimeException {



    public AttenderNameNotFoundException(String errorMessege){

        System.out.println(errorMessege);
    }
}
