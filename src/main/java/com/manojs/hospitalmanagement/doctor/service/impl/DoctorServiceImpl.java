package com.manojs.hospitalmanagement.doctor.service.impl;

import com.manojs.hospitalmanagement.doctor.dto.DoctorFilterDto;
import com.manojs.hospitalmanagement.doctor.dto.DoctorRequestDto;
import com.manojs.hospitalmanagement.doctor.dto.DoctorResponseDto;
import com.manojs.hospitalmanagement.doctor.mapper.DoctorMapper;
import com.manojs.hospitalmanagement.doctor.service.DoctorService;
import com.manojs.hospitalmanagement.doctor.entity.Doctor;
import com.manojs.hospitalmanagement.doctor.repository.DoctorRepository;
import com.manojs.hospitalmanagement.exception.ResourceNotFoundException;
import com.manojs.hospitalmanagement.patient.dto.PageResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    @Override
    public PageResponse<DoctorResponseDto> getAllDoctors(Pageable pageable) {
        Page<Doctor> all = doctorRepository.findAllDoctors(pageable);
        Page<DoctorResponseDto> map = all.map(doctorMapper::toDto);
        return PageResponse.from(map);
    }

    @Override
    public DoctorResponseDto getDoctorById(final Long id) {
        Doctor byId = doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id:" + id));
        return doctorMapper.toDto(byId);
    }

    @Override
    @Transactional
    public DoctorResponseDto saveDoctor(final DoctorRequestDto doctorRequestDto) {
        Doctor entity = doctorRepository.save(doctorMapper.toEntity(doctorRequestDto));
        return doctorMapper.toDto(entity);
    }

    @Override
    @Transactional
    public DoctorResponseDto updateDoctor(final Long id, final DoctorRequestDto doctorRequestDto) {
        Doctor byId = doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id:" + id));
        doctorMapper.updateDoctor(byId,doctorRequestDto);
        return doctorMapper.toDto(byId);
    }

    @Override
    @Transactional
    public DoctorResponseDto partialUpdateDoctor(final Long id, final DoctorRequestDto doctorRequestDto) {
        Doctor byId = doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id:" + id));
        doctorMapper.partialUpdateDoctor(byId,doctorRequestDto);
        return doctorMapper.toDto(byId);
    }

    @Override
    @Transactional
    public void deleteDoctor(final Long id) {
        if (!doctorRepository.existsById(id)) {
            throw new ResourceNotFoundException("Doctor not found with id: " + id);
        }
//        if (departmentRepository.existsByHeadDoctorId(id)) {
//            throw new IllegalStateException("Cannot delete doctor with id: " + id + " — they are heading a department. Assign a new head first.");
//        }
        doctorRepository.deleteById(id);
    }

    @Override
    public PageResponse<DoctorResponseDto> filterDoctors(
            DoctorFilterDto filter, Pageable pageable) {

        Specification<Doctor> spec = Specification
                .where(DoctorSpecification.hasName(filter.getName()))
                .and(DoctorSpecification.hasSpecialisation(filter.getSpecialisation()))
                .and(DoctorSpecification.hasEmail(filter.getEmail()))
                .and(DoctorSpecification.createdAfter(filter.getCreatedAfter()))
                .and(DoctorSpecification.createdBefore(filter.getCreatedBefore()))
                .and(DoctorSpecification.inDepartment(filter.getDepartmentName()));

        Page<DoctorResponseDto> result = doctorRepository.findAll(spec, pageable)
                .map(doctorMapper::toDto);
        return PageResponse.from(result);
    }
}
