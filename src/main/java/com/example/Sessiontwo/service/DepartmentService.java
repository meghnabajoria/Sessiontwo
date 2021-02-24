package com.example.Sessiontwo.service;

import com.example.Sessiontwo.dto.DepartmentRequestDto;
import com.example.Sessiontwo.dto.DepartmentResponseDto;
import com.example.Sessiontwo.entity.Department;

/**
 * @author meghna.bajoria
 * @since 24/02/21 10:20 AM
 **/
public interface DepartmentService {
    DepartmentResponseDto createDepartment(DepartmentRequestDto departmentRequestDto);

    Department getDepartmentById(Long Id);
}
