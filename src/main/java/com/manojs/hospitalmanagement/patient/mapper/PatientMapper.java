package com.manojs.hospitalmanagement.patient.mapper;

import com.manojs.hospitalmanagement.appointment.Mapper.AppointmentMapper;
import com.manojs.hospitalmanagement.patient.dto.PatientRequestDto;
import com.manojs.hospitalmanagement.patient.dto.PatientResponseDto;
import com.manojs.hospitalmanagement.patient.entity.Patient;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",uses = {AppointmentMapper.class})
public interface PatientMapper {

    @Mapping(target = "appointment" ,source = "appointments")
    @Mapping(target = "insurance", source = "insurance")
    Patient toEntity(PatientRequestDto patientRequestDto);

    @Mapping(target = "appointment",source = "appointment")
    PatientResponseDto toDto(Patient patient);

    void updateFromDto(@MappingTarget Patient patient, PatientRequestDto patientRequestDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdateFromDto(@MappingTarget Patient patient, PatientRequestDto patientRequestDto);

}