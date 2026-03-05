package com.manojs.hospitalmanagement.dto;

import com.manojs.hospitalmanagement.entity.type.BloodGroupType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record PatientResponseDto (
    Long id,
    String name,
    LocalDate birthDate,
    String email,
    String gender,
    LocalDateTime createdAt,
    BloodGroupType bloodGroup
){}