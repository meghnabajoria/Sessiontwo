package com.example.Sessiontwo.controller;

import com.example.Sessiontwo.dto.DepartmentRequestDto;
import com.example.Sessiontwo.dto.DepartmentResponseDto;
import com.example.Sessiontwo.dto.EmployeeRequestDto;
import com.example.Sessiontwo.dto.EmployeeResponseDto;
import com.example.Sessiontwo.entity.Department;
import com.example.Sessiontwo.service.DepartmentService;
import com.example.Sessiontwo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author meghna.bajoria
 * @since 24/02/21 10:15 AM
 **/

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //POST - /department
    @PostMapping
    public DepartmentResponseDto createDepartment(@RequestBody DepartmentRequestDto departmentRequestDto){
        return departmentService.createDepartment(departmentRequestDto);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Long id){
        return departmentService.getDepartmentById(id);

    }




}
