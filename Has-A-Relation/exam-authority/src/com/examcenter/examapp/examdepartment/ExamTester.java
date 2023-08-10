package com.examcenter.examapp.examdepartment;

public class ExamTester {

    public static void main(String[] args){

        Exam exam = new Exam();
        exam.setExamFees(1800);
        Hallticket hallticket = new Hallticket();
        exam.halltickets =hallticket;
//        hallticket.setStudentName("Kumar");
//        hallticket.setUsn("4UB19ME026");
//        hallticket.setSubjectName("EE");
//        hallticket.setSubjectCode("18ME81");
        exam.allow();
    }
}
