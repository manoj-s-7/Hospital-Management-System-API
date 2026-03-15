package com.manojs.hospitalmanagement.appointment.dto;

import java.time.LocalDateTime;

public record AppointmentSummaryDto(
   Long id,
   LocalDateTime appointmentTime,
   String reason,
   String doctorName,
   String doctorSpecialization
) {}
