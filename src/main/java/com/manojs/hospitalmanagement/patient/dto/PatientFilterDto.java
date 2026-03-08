package com.manojs.hospitalmanagement.patient.dto;

import com.manojs.hospitalmanagement.patient.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class PatientFilterDto {
    private String name;
    private String gender;
    private BloodGroupType bloodGroup;
    private Integer minAge;
    private Integer maxAge;
    private String insuranceProvider;
    private Boolean hasInsurance;
}