package com.example.Sessiontwo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;


/**
 * @author meghna.bajoria
 * @since 23/02/21 2:31 PM
 **/
@Document //tells database that I will use this class to interact with the database
@Getter
@Setter

public class Employee {
    @MongoId
    private long id;

    private String name;

    private String departmentName;

}
