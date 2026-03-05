package com.manojs.hospitalmanagement.mapper;

import com.manojs.hospitalmanagement.dto.PatientRequestDto;
import com.manojs.hospitalmanagement.dto.PatientResponseDto;
import com.manojs.hospitalmanagement.entity.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    Patient toPatient(PatientRequestDto patientRequestDto);

    PatientResponseDto toPatientDto(Patient patient);

    void updatePatient(@MappingTarget Patient patient, PatientRequestDto patientRequestDto);

}