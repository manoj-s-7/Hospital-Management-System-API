package com.manojs.hospitalmanagement.department.mapper;

import com.manojs.hospitalmanagement.department.dto.DepartmentRequestDto;
import com.manojs.hospitalmanagement.department.dto.DepartmentResponseDto;
import com.manojs.hospitalmanagement.department.entity.Department;
import com.manojs.hospitalmanagement.doctor.mapper.DoctorMapper;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", uses = DoctorMapper.class)
public interface DepartmentMapper {

    @Mapping(target = "headDoctor", ignore = true)
    @Mapping(target = "doctors", ignore = true)
    Department toEntity(DepartmentRequestDto departmentRequestDto);

    DepartmentResponseDto toDto(Department department);

    @Mapping(target = "headDoctor", ignore = true)
    @Mapping(target = "doctors", ignore = true)
    void updateDepartment(@MappingTarget Department department, DepartmentRequestDto departmentRequestDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "headDoctor", ignore = true)
    @Mapping(target = "doctors", ignore = true)
    void partialUpdateDepartment(@MappingTarget Department department, DepartmentRequestDto departmentRequestDto);
}