package com.manojs.hospitalmanagement.appointment.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentResponseDTO {

    private Long id;
    private LocalDateTime appointmentTime;
    private String reason;

    private Long patientId;
    private String patientName;


    private Long doctorId;
    private String doctorName;
    private String doctorSpecialization;
}