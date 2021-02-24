package com.example.Sessiontwo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author meghna.bajoria
 * @since 24/02/21 10:14 AM
 **/
@Getter
@Setter
@Entity
public class Department {

    @javax.persistence.Id // tells that this is the primary key
    @GenericGenerator(name = "department_id_seq", strategy = "increment")
    @GeneratedValue(generator = "department_id_seq", strategy = GenerationType.AUTO)

    private long id;

    private String name;
}
