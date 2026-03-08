package com.manojs.hospitalmanagement.patient.service.impl;

import com.manojs.hospitalmanagement.patient.entity.Patient;
import com.manojs.hospitalmanagement.patient.entity.type.BloodGroupType;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;

public class PatientSpecification {

    public static Specification<Patient> hasName(String name) {
        return (root, query, cb) ->
                name == null ? null
                        : cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%");
    }

    public static Specification<Patient> hasGender(String gender) {
        return (root, query, cb) ->
                gender == null ? null
                        : cb.equal(root.get("gender"), gender);
    }

    public static Specification<Patient> hasBloodGroup(BloodGroupType bloodGroup) {
        return (root, query, cb) ->
                bloodGroup == null ? null
                        : cb.equal(root.get("bloodGroup"), bloodGroup);
    }

    public static Specification<Patient> hasMinAge(Integer minAge) {
        return (root, query, cb) -> {
            if (minAge == null) return null;
            LocalDate maxBirthDate = LocalDate.now().minusYears(minAge);
            return cb.lessThanOrEqualTo(root.get("birthDate"), maxBirthDate);
        };
    }

    public static Specification<Patient> hasMaxAge(Integer maxAge) {
        return (root, query, cb) -> {
            if (maxAge == null) return null;
            LocalDate minBirthDate = LocalDate.now().minusYears(maxAge);
            return cb.greaterThanOrEqualTo(root.get("birthDate"), minBirthDate);
        };
    }

    public static Specification<Patient> hasInsurance(Boolean hasInsurance) {
        return (root, query, cb) -> {
            if (hasInsurance == null) return null;
            return hasInsurance
                    ? cb.isNotNull(root.get("insurance"))
                    : cb.isNull(root.get("insurance"));
        };
    }
}