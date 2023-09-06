package com.hospitalcompamy.hospitalapp;

import com.hospitalcompamy.hospitalapp.constant.BloodGroup;
import com.hospitalcompamy.hospitalapp.constant.Gender;
import com.hospitalcompamy.hospitalapp.exception.AttenderNameNotFoundException;
import com.hospitalcompamy.hospitalapp.exception.GenderNotFoundException;
import com.hospitalcompamy.hospitalapp.exception.PatientAgeNotFoundException;
import com.hospitalcompamy.hospitalapp.exception.PatientAddressNotFoundException;
import com.hospitalcompamy.hospitalapp.hospital.Hospital;
import com.hospitalcompamy.hospitalapp.hospital.Impl.ApolloHospitalImpl;
import com.hospitalcompamy.hospitalapp.patientdto.PatientDto;

import java.util.Scanner;

public class HospitalTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of patients:");


        int size = sc.nextInt();
        Hospital hospital = new ApolloHospitalImpl(size);

        ApolloHospitalImpl apollo = new ApolloHospitalImpl(size);

        for (int index=0; index < apollo.patients.length ;index++) {

            PatientDto patient = new PatientDto();

            // System.out.println("Enter the patient ID");
            //patient.setPatientId(sc.nextInt());

            System.out.println("Enter the patient name");
            patient.setName(sc.next());
            System.out.println("Enter the patient bloodgroup");
            patient.setBloodGroup(BloodGroup.valueOf(sc.next()));
            System.out.println("Enter the patient gender");
            patient.setGender(Gender.valueOf(sc.next()));
            System.out.println("Enter the patient Address");
            patient.setAddress(sc.next());
            System.out.println("Enter the patient age");
            patient.setAge(sc.nextInt());
            System.out.println("Enter the patient attenderName");
            patient.setAttenderName(sc.next());
            System.out.println("Enter the patient ph number");
            patient.setPhNo(sc.nextLong());
            System.out.println("Enter the patient hospital name");
            patient.setHospitalName(sc.next());
            System.out.println("Enter the patient ward no");
            patient.setWardNo(sc.next());

            hospital.addPatients(patient);


        }
        String userInput = null;
        do{
            System.out.println("press 1 : to get all the patient details");
            System.out.println("press 2 : to get attender name");
            System.out.println("press 3: to get patient gender");
            System.out.println("press 4: to get patient age");
            System.out.println("press 5: to get patient address");
            System.out.println("press 6: to get blood group");
            System.out.println("press 7: to get  patient details");
            System.out.println("press 8: to update the patient age ");
            System.out.println("press 9: to update the patient ward no");
            System.out.println("press 10: to delete the patient details");

            int option = sc.nextInt();
            switch (option){
                case 1 : hospital.getAllPatients();
                    break;

                case 2: System.out.println("enter the patient id to get attender name");
                try {
                    String attenderName = hospital.getAttenderNamebyPatientId(sc.nextInt());
                    System.out.println("the attender name is:" + attenderName);
                }catch (AttenderNameNotFoundException pat){
                    pat.printStackTrace();
                }
                    break;

                case 3: System.out.println("enter the patient name to get gender");
                   try {
                       Gender gender = hospital.getGenderbyName(sc.next());
                       System.out.println("the Gender is:" + gender);
                   }catch (GenderNotFoundException gen) {
                       gen.printStackTrace();
                   }
                    break;

                case 4: System.out.println("enter the patient id to get age");
                    try {
                        int Age = hospital.getAgeByPatientId(sc.nextInt());
                        System.out.println("the patient age is:" + Age);
                     }catch (PatientAgeNotFoundException p){
                        p.printStackTrace();
                    }
                    break;

                case 5: System.out.println("enter patient name to get address ");
                try {
                    String Address = hospital.getAddressByName(sc.next());
                    System.out.println("the patient address is:" + Address);
                }catch (PatientAddressNotFoundException pa){
                    pa.printStackTrace();
                }
                    break;

                case 6: System.out.println("enter the patient name to get Blood group");
                    BloodGroup bloodGroup = hospital.getBloodGroupByName(sc.next());
                    System.out.println("the patient blood groupis:" + bloodGroup);
                    break;

                case 7: System.out.println("enter patient id to get patient object details");
                    PatientDto patients = hospital.getPatientsByPatientId(sc.nextInt());
                    System.out.println("the patient details is:" +patients);
                    break;

                case 8:  System.out.println("enter the patient name to update the patient  age");
                    String existingName = sc.next();
                    System.out.println("enter the  updated age");
                    int updatedAge = sc.nextInt();
                    boolean isAgeUpdated = hospital.updatePatientAgeByName(updatedAge, existingName);
                    System.out.println("the updated patient Age is:"+ isAgeUpdated);
                    break;

                case 9:  System.out.println("enter the patient name to update the patient ward no");
                    String existingsName = sc.next();
                    System.out.println("enter the updated ward no ");
                    String upadatedWardNo = sc.next();
                    boolean isWardNoUpdated= hospital.updatePatientWardNoByPatientName(upadatedWardNo,existingsName);

                    System.out.println("the updated ward no:" +isWardNoUpdated);
                    break;

                case 10:
                    System.out.println("enter the patient id to delete the patient");
                    int patientId = sc.nextInt();
                    boolean isPatientDeleted = hospital.deletePatientByPatientId(patientId);
                    System.out.println("the deleted patient is:" + isPatientDeleted);
                    break;

            }
            System.out.println(" enter yes/no to continue");
            userInput  = sc.next();
        } while (userInput.equals("yes"));

        System.out.println("thank you for using ...come again");
    }
}
