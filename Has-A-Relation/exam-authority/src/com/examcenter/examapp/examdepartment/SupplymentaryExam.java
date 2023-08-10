package com.examcenter.examapp.examdepartment;

public class SupplymentaryExam extends Exam {

    public int noOfAttempts ;
    // method overriding
    public boolean allow(){
        if(noOfAttempts >1){

            return super.allow();
        }
        return false;
    }
}
