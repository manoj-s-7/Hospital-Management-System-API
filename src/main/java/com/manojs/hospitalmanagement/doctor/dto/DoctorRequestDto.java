package com.manojs.hospitalmanagement.doctor.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class DoctorRequestDto {
    @NotBlank
    String name;

    @NotBlank
    String specialisation;

    @NotBlank
    @Email
    String email;
}
