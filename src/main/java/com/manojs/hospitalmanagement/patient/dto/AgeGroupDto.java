package com.manojs.hospitalmanagement.patient.dto;

public record AgeGroupDto(
        Long children,
        Long adults,
        Long middleAge
) {}