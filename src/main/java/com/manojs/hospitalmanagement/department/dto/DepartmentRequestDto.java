package com.manojs.hospitalmanagement.department.dto;

import com.manojs.hospitalmanagement.doctor.dto.DoctorRequestDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class DepartmentRequestDto{
    @NotBlank
    String name;
    @NotBlank
    Long headDoctorId;
}