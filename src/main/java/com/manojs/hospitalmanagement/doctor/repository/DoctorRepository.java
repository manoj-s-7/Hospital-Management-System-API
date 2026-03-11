package com.manojs.hospitalmanagement.doctor.repository;

import com.manojs.hospitalmanagement.doctor.entity.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface DoctorRepository extends JpaRepository<Doctor, Long>, JpaSpecificationExecutor<Doctor> {


    @Query(value = "SELECT * FROM doctor", countQuery = "SELECT COUNT(*) FROM doctor",
            nativeQuery = true)
    Page<Doctor> findAllDoctors(Pageable pageable);

}