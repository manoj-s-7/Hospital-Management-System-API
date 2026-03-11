package com.manojs.hospitalmanagement.department.dto;

import com.manojs.hospitalmanagement.doctor.dto.DoctorResponseDto;

import java.time.LocalDateTime;

public record DepartmentResponseDto(String name, LocalDateTime createdAt, DoctorResponseDto dto) {
}