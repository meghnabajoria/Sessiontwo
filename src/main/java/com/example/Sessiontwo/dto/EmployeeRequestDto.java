package com.example.Sessiontwo.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author  meghna.bajoria
 * @since  23/02/21 2:39 PM
 **/
@Getter
@Setter
public class EmployeeRequestDto {

   private  long id;
    private String name;
    private  DepartmentRequestDto department;
}