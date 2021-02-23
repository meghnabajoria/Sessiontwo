package com.example.Sessiontwo.controller;

import com.example.Sessiontwo.dto.EmployeeRequestDto;
import com.example.Sessiontwo.dto.EmployeeResponseDto;
import com.example.Sessiontwo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author meghna.bajoria
 * @since 23/02/21 2:26 PM
 **/
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //POST - /employee
    @PostMapping
    public EmployeeResponseDto createEmployee(@RequestBody EmployeeRequestDto employeeRequestDto){
        return employeeService.createEmployee(employeeRequestDto);
    }

    //GET - /employee/{id}

    @GetMapping("/{id}")
    public EmployeeResponseDto getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }

    //PUT - /employee/{id}

    //DELETE - /employee/{id}
}