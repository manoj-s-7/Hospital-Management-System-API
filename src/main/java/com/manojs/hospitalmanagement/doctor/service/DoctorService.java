package com.manojs.hospitalmanagement.doctor.service;

import com.manojs.hospitalmanagement.doctor.dto.DoctorFilterDto;
import com.manojs.hospitalmanagement.doctor.dto.DoctorRequestDto;
import com.manojs.hospitalmanagement.doctor.dto.DoctorResponseDto;
import com.manojs.hospitalmanagement.patient.dto.PageResponse;

import org.springframework.data.domain.Pageable;

public interface DoctorService {

    PageResponse<DoctorResponseDto> getAllDoctors(Pageable pageable);

    DoctorResponseDto getDoctorById(Long id);

    DoctorResponseDto saveDoctor(DoctorRequestDto doctorRequestDto);

    DoctorResponseDto updateDoctor(Long id,DoctorRequestDto doctorRequestDto);

    DoctorResponseDto partialUpdateDoctor(Long id,DoctorRequestDto doctorRequestDto);

    void deleteDoctor(Long id);

    public PageResponse<DoctorResponseDto> filterDoctors(DoctorFilterDto filter, Pageable pageable);

}
