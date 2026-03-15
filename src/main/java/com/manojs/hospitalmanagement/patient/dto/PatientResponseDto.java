package com.manojs.hospitalmanagement.patient.dto;

import com.manojs.hospitalmanagement.appointment.dto.AppointmentSummaryDto;
import com.manojs.hospitalmanagement.appointment.entity.Appointment;
import com.manojs.hospitalmanagement.insurance.dto.InsuranceResponseDto;
import com.manojs.hospitalmanagement.patient.entity.type.BloodGroupType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record PatientResponseDto (
    Long id,
    String name,
    LocalDate birthDate,
    String email,
    String gender,
    LocalDateTime createdAt,
    BloodGroupType bloodGroup,
    InsuranceResponseDto insurance,
    List<AppointmentSummaryDto> appointment
){}