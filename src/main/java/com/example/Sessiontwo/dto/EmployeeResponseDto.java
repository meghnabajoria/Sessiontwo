package com.example.Sessiontwo.dto;

import com.example.Sessiontwo.entity.Department;
import lombok.Getter;
import lombok.Setter;

/**
 * @author meghna.bajoria
 * @since 23/02/21 2:41 PM
 **/

@Getter
@Setter
public class EmployeeResponseDto {
    private long id;

    private String name;

    private DepartmentResponseDto department;

    public void setDepartmentFromEntity(Department department){
        DepartmentResponseDto departmentResponseDto =  new DepartmentResponseDto();
        departmentResponseDto.setId(department.getId());
        departmentResponseDto.setName(department.getName());
        this.department = departmentResponseDto;
    }
}
