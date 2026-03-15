package com.manojs.hospitalmanagement.appointment.Mapper;


import com.manojs.hospitalmanagement.appointment.dto.AppointmentRequestDTO;
import com.manojs.hospitalmanagement.appointment.dto.AppointmentResponseDTO;
import com.manojs.hospitalmanagement.appointment.dto.AppointmentSummaryDto;
import com.manojs.hospitalmanagement.appointment.entity.Appointment;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface AppointmentMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "patient", ignore = true)
    @Mapping(target = "doctor", ignore = true)
    Appointment toEntity(AppointmentRequestDTO appointmentRequestDto);

    @Mapping(source = "patient.id",             target = "patientId")
    @Mapping(source = "patient.name",           target = "patientName")
    @Mapping(source = "doctor.id",              target = "doctorId")
    @Mapping(source = "doctor.name",            target = "doctorName")
    @Mapping(source = "doctor.specialisation",  target = "doctorSpecialization")
    AppointmentResponseDTO toResponseDTO(Appointment appointment);

    @Mapping(source = "doctor.name", target = "doctorName")
    @Mapping(source = "doctor.specialisation", target = "doctorSpecialization")
    AppointmentSummaryDto toSummaryDto(Appointment appointment);


    void updateAppointment(@MappingTarget Appointment appointment, AppointmentRequestDTO appointmentRequestDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdateAppointment(@MappingTarget Appointment doctor,AppointmentRequestDTO doctorRequestDto);
}
