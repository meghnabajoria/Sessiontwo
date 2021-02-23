package com.example.Sessiontwo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;


/**
 * @author meghna.bajoria
 * @since 23/02/21 2:31 PM
 **/

@RedisHash//tells database that I will use this class to interact with the database
@Getter
@Setter

public class Employee {
    @Id
    private long id;

    private String name;

    private String departmentName;

}
