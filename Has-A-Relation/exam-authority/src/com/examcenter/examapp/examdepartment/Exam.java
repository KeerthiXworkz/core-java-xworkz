package com.examcenter.examapp.examdepartment;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Exam {

    Hallticket halltickets;
    private int examFees ;

    public Exam(){

    }
    public Exam(Hallticket halltickets){

        this.halltickets =halltickets;
    }
//     public void setExamFees(int examFees){
//        this.examFees = examFees;
//    }
    public boolean allow(){

        boolean isAllowed = false;
        if (examFees >= 1770) {
            System.out.println("exam fees is paid you can eligible to get hallticket");

            if (halltickets != null) {
                System.out.println("the hallticket is fine ...initilize the details");
                halltickets = halltickets;
                this.halltickets.displayDetails();
                isAllowed = true;
                System.out.println("the details are correct ..you can allowed to exam");
            }
            else {
                System.out.println("details are not correct..");
            }
        }
            else {
                System.out.println("hey first pay the fees..");
            }
        return  isAllowed;
    }
}
