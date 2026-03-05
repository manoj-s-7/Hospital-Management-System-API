package com.manojs.hospitalmanagement.service;

import com.manojs.hospitalmanagement.dto.BloodGroupCountDTO;
import com.manojs.hospitalmanagement.dto.PatientRequestDto;
import com.manojs.hospitalmanagement.dto.PatientResponseDto;
import com.manojs.hospitalmanagement.entity.Patient;
import com.manojs.hospitalmanagement.exception.ResourceNotFoundException;
import com.manojs.hospitalmanagement.mapper.PatientMapper;
import com.manojs.hospitalmanagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    public List<PatientResponseDto> getAllPatients() {
        List<Patient> patientList = patientRepository.findAll();
        return patientList.stream().map(patientMapper::toPatientDto).toList();
    }

    public PatientResponseDto getPatientById(Long id) {

        Patient byId = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id:" + id));

        return patientMapper.toPatientDto(byId);
    }

    public PatientResponseDto savePatient(PatientRequestDto patient) {
        Patient saved = patientRepository.save(patientMapper.toPatient(patient));
        return patientMapper.toPatientDto(saved);
    }

    @Transactional
    public PatientResponseDto updatePatient(Long id, PatientRequestDto patientRequestDto) {
        Patient byId = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id:" + id));
        patientMapper.updatePatient(byId, patientRequestDto);
        return patientMapper.toPatientDto(byId);
    }

    @Transactional
    public void deletePatient(Long id) {
        Patient byId = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id:" + id));
        patientRepository.delete(byId);
    }

    public List<PatientResponseDto> findByName(String name) {
        return patientRepository.findByName(name)
                .map(patientMapper::toPatientDto)
                .stream().toList();
    }

    public List<BloodGroupCountDTO> bloodGroupCount() {
        return patientRepository.groupByBloodGroup();
    }

    public Page<PatientResponseDto> findAllPatients(Pageable pageable) {
        return patientRepository.findAll(pageable)
                .map(patientMapper::toPatientDto);
    }
}
