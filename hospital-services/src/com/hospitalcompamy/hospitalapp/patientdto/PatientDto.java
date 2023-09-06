package com.hospitalcompamy.hospitalapp.patientdto;

import com.hospitalcompamy.hospitalapp.constant.BloodGroup;
import com.hospitalcompamy.hospitalapp.constant.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class PatientDto {

    private int patientId;
    private String name;
    private int age;
    private String address;
    private BloodGroup bloodGroup;
    private long phNo;
    private Gender gender;
    private String wardNo;
    private String attenderName;
    private String hospitalName;
}
