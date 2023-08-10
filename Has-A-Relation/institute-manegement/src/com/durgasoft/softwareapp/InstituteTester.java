package com.durgasoft.softwareapp;

import com.durgasoft.softwareapp.institute.Institute;
import com.durgasoft.softwareapp.trainers.Trainers;

public class InstituteTester {

    public static void main(String[] args){

        Institute institute = new Institute();
        Trainers trainer = new Trainers();

        institute.trainers = trainer;
    }
}
