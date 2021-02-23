package com.example.Sessiontwo.repository;

import com.example.Sessiontwo.entity.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * @author meghna.bajoria
 * @since 23/02/21 2:36 PM
 **/

// will pe performing crud operations
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
