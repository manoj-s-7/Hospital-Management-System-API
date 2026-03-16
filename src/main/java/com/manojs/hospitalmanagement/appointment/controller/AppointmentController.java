package com.manojs.hospitalmanagement.appointment.controller;


import com.manojs.hospitalmanagement.appointment.dto.AppointmentRequestDTO;
import com.manojs.hospitalmanagement.appointment.dto.AppointmentResponseDTO;
import com.manojs.hospitalmanagement.appointment.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/appointments")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;

    @PostMapping
    public ResponseEntity<AppointmentResponseDTO> addNewAppointment(@RequestBody AppointmentRequestDTO appointmentRequestDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.createNewAppointment(appointmentRequestDTO));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<AppointmentResponseDTO> reassignDoctor(@PathVariable Long id, @RequestBody AppointmentRequestDTO appointmentRequestDTO){
        return ResponseEntity.ok(appointmentService.reassignAppointment(appointmentRequestDTO,id));
    }
}
