package com.manojs.hospitalmanagement.doctor.service.impl;

import com.manojs.hospitalmanagement.department.entity.Department;
import com.manojs.hospitalmanagement.doctor.entity.Doctor;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDateTime;

public class DoctorSpecification {

    public static Specification<Doctor> hasName(String name) {
        return (root, query, cb) ->
                name == null ? null
                        : cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%");
    }

    public static Specification<Doctor> hasSpecialisation(String specialisation) {
        return (root, query, cb) ->
                specialisation == null ? null
                        : cb.like(cb.lower(root.get("specialisation")), "%" + specialisation.toLowerCase() + "%");
    }

    public static Specification<Doctor> hasEmail(String email) {
        return (root, query, cb) ->
                email == null ? null
                        : cb.equal(cb.lower(root.get("email")), email.toLowerCase());
    }

    public static Specification<Doctor> createdAfter(LocalDateTime date) {
        return (root, query, cb) ->
                date == null ? null
                        : cb.greaterThanOrEqualTo(root.get("createdAt"), date);
    }

    public static Specification<Doctor> createdBefore(LocalDateTime date) {
        return (root, query, cb) ->
                date == null ? null
                        : cb.lessThanOrEqualTo(root.get("createdAt"), date);
    }

    public static Specification<Doctor> inDepartment(String departmentName) {
        return (root, query, cb) -> {
            if (departmentName == null) return null;
            query.distinct(true);
            Join<Doctor, Department> dept = root.join("departments", JoinType.INNER);
            return cb.like(cb.lower(dept.get("name")), "%" + departmentName.toLowerCase() + "%");
        };
    }
}