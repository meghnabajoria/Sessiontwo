package com.example.Sessiontwo.service.impl;

import com.example.Sessiontwo.dto.DepartmentRequestDto;
import com.example.Sessiontwo.dto.DepartmentResponseDto;
import com.example.Sessiontwo.entity.Department;
import com.example.Sessiontwo.repository.DepartmentRepository;
import com.example.Sessiontwo.service.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author meghna.bajoria
 * @since 24/02/21 10:16 AM
 **/
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentResponseDto createDepartment(DepartmentRequestDto departmentRequestDto){
        Department department = new Department();
        BeanUtils.copyProperties(departmentRequestDto,department);
        Department savedDepartment = departmentRepository.save(department);
        DepartmentResponseDto responseDto =  new DepartmentResponseDto();
        BeanUtils.copyProperties(savedDepartment,responseDto);

        return responseDto;
    }

    @Override
    public Department getDepartmentById(Long Id){
        return departmentRepository.findById(Id).get();
    }

}
