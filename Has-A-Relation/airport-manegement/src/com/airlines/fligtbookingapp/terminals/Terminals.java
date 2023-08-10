package com.airlines.fligtbookingapp.terminals;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Terminals {

     private int terminalId;
     private  String name;
     private  int age;
     private String gender;

     public void displayDetails(){

         System.out.println("terminal details is" + terminalId);

     }
}
