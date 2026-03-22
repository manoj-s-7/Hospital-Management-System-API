package com.manojs.hospitalmanagement.appointment.service;

import com.manojs.hospitalmanagement.appointment.dto.AppointmentRequestDTO;
import com.manojs.hospitalmanagement.appointment.dto.AppointmentResponseDTO;
import com.manojs.hospitalmanagement.appointment.entity.Appointment;
import com.manojs.hospitalmanagement.patient.dto.PageResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AppointmentService {

    AppointmentResponseDTO createNewAppointment(AppointmentRequestDTO appointmentRequestDTO);

    AppointmentResponseDTO reassignAppointment(AppointmentRequestDTO appointmentRequestDTO,Long id);

    PageResponse<AppointmentResponseDTO> getAppointmentsByDoctorId(Long id, Pageable pageable);

    PageResponse<AppointmentResponseDTO> getAppointmentsByPatientId(Long patientId, Pageable pageable);

}
