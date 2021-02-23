package com.example.Sessiontwo.service;

import com.example.Sessiontwo.dto.EmployeeRequestDto;
import com.example.Sessiontwo.dto.EmployeeResponseDto;
import com.example.Sessiontwo.entity.Employee;

/**
 * @author meghna.bajoria
 * @since 23/02/21 2:27 PM
 **/
public interface EmployeeService {

    EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto);

    EmployeeResponseDto getEmployeeById(Long id);

    EmployeeResponseDto updateEmployeeById(Long id, EmployeeRequestDto employeeRequestDto);

    EmployeeResponseDto deleteEmployeeById(Long id);
}
