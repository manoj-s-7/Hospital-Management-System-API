package com.manojs.hospitalmanagement.doctor.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DoctorFilterDto {

    private String name;
    private String specialisation;
    private String email;
    private LocalDateTime createdAfter;
    private LocalDateTime createdBefore;
    private String departmentName;
}