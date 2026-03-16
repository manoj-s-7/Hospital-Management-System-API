package com.manojs.hospitalmanagement.appointment.service;

import com.manojs.hospitalmanagement.appointment.dto.AppointmentRequestDTO;
import com.manojs.hospitalmanagement.appointment.dto.AppointmentResponseDTO;
import com.manojs.hospitalmanagement.appointment.entity.Appointment;
import org.springframework.stereotype.Service;

public interface AppointmentService {
    AppointmentResponseDTO createNewAppointment(AppointmentRequestDTO appointmentRequestDTO);

    AppointmentResponseDTO reassignAppointment(AppointmentRequestDTO appointmentRequestDTO,Long id);
}
