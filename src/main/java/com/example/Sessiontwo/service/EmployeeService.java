package com.example.Sessiontwo.service;

import com.example.Sessiontwo.dto.EmployeeRequestDto;
import com.example.Sessiontwo.dto.EmployeeResponseDto;

/**
 * @author meghna.bajoria
 * @since 23/02/21 2:27 PM
 **/
public interface EmployeeService {

    EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto);

    EmployeeResponseDto getEmployeeById(Long id);
}
