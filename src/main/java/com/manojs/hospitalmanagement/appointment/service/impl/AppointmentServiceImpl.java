package com.manojs.hospitalmanagement.appointment.service.impl;

import com.manojs.hospitalmanagement.appointment.Mapper.AppointmentMapper;
import com.manojs.hospitalmanagement.appointment.dto.AppointmentRequestDTO;
import com.manojs.hospitalmanagement.appointment.dto.AppointmentResponseDTO;
import com.manojs.hospitalmanagement.appointment.entity.Appointment;
import com.manojs.hospitalmanagement.appointment.repository.AppointmentRepository;
import com.manojs.hospitalmanagement.appointment.service.AppointmentService;
import com.manojs.hospitalmanagement.doctor.entity.Doctor;
import com.manojs.hospitalmanagement.doctor.repository.DoctorRepository;
import com.manojs.hospitalmanagement.exception.ResourceNotFoundException;
import com.manojs.hospitalmanagement.patient.entity.Patient;
import com.manojs.hospitalmanagement.patient.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final AppointmentMapper appointmentMapper;


    @Override
    @Transactional
    public AppointmentResponseDTO createNewAppointment(final AppointmentRequestDTO appointmentRequestDTO) {
        Appointment appointment = appointmentMapper.toEntity(appointmentRequestDTO);

        Patient patient = patientRepository.findById(appointmentRequestDTO.getPatientId())
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
        Doctor doctor = doctorRepository.findById(appointmentRequestDTO.getDoctorId())
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        return appointmentMapper.toResponseDTO(appointmentRepository.save(appointment));
    }
}
