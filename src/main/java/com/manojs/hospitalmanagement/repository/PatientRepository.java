package com.manojs.hospitalmanagement.repository;

import com.manojs.hospitalmanagement.dto.BloodGroupByPatientsDTO;
import com.manojs.hospitalmanagement.dto.BloodGroupCountDTO;
import com.manojs.hospitalmanagement.dto.PatientContactDTO;
import com.manojs.hospitalmanagement.entity.type.BloodGroupType;
import com.manojs.hospitalmanagement.entity.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Optional<Patient> findByName(String name);

    @Query("SELECT new com.manojs.hospitalmanagement.dto.BloodGroupCountDTO(p.bloodGroup,COUNT(p)) From Patient p GROUP BY p.bloodGroup")
    List<BloodGroupCountDTO> groupByBloodGroup();

    @Query(value = "SELECT * FROM patients_table", nativeQuery = true)
    Page<Patient> findAllPatients(Pageable pageable);
}
