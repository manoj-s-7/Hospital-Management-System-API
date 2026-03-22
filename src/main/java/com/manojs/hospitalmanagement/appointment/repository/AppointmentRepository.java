package com.manojs.hospitalmanagement.appointment.repository;

import com.manojs.hospitalmanagement.appointment.entity.Appointment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    Page<Appointment> findAllByDoctor_Id(Long doctorId, Pageable pageable);
    Page<Appointment> findAllByPatient_Id(Long patientId, Pageable pageable);
}