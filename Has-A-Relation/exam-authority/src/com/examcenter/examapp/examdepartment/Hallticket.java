package com.examcenter.examapp.examdepartment;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Hallticket {

    private String studentName;
    private String usn;
    private String subjectName;
    private String subjectCode;

//    public void  setStudentName(String studentName){
//        this.studentName =studentName;
//    }
//    public void setUsn(String usn){
//
//        this.usn = usn ;
//    }
//    public void setSubjectName(String subjectName){
//        this.subjectName =subjectName;
//    }
//    public void setSubjectCode(String subjectCode){
//        this.subjectCode =subjectCode ;
//    }

    public void displayDetails(){

        System.out.println("the student name is " + studentName);
        System.out.println("the usn is " + usn);
        System.out.println("the subject Name is " + subjectName);
        System.out.println("the subject code is " + subjectCode);
    }
}
