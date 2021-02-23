package com.example.Sessiontwo.service.impl;

import com.example.Sessiontwo.dto.EmployeeRequestDto;
import com.example.Sessiontwo.dto.EmployeeResponseDto;
import com.example.Sessiontwo.entity.Employee;
import com.example.Sessiontwo.repository.EmployeeRepository;
import com.example.Sessiontwo.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author meghna.bajoria
 * @since 23/02/21 2:28 PM
 **/

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto){
        Employee employee = new Employee();

        //copy fields from dto to employee
        BeanUtils.copyProperties(employeeRequestDto,employee);
        //save employee to db
        Employee savedEmployee = employeeRepository.save(employee);

        //copy from employee to responsedto
        EmployeeResponseDto responseDto =  new EmployeeResponseDto();
        BeanUtils.copyProperties(savedEmployee,responseDto);

        return responseDto;
    }

    @Override
    public EmployeeResponseDto getEmployeeById(Long id){
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if(employeeOptional.isPresent()){
            EmployeeResponseDto responseDto = new EmployeeResponseDto();
            BeanUtils.copyProperties(employeeOptional.get(),responseDto);

            return responseDto;
        }
        return null;
    }
}
