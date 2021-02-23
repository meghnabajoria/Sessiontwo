package com.example.Sessiontwo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author meghna.bajoria
 * @since 23/02/21 2:31 PM
 **/
@Entity //tells database that I will use this class to interact with the database
@Getter
@Setter

public class Employee {

    @Id // tells that this is the primary key
    @GenericGenerator(name = "employee_id_seq", strategy = "increment")
    @GeneratedValue(generator = "employee_id_seq", strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String departmentName;

}
