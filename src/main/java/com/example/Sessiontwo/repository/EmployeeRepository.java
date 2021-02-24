package com.example.Sessiontwo.repository;

import com.example.Sessiontwo.entity.Department;
import com.example.Sessiontwo.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author meghna.bajoria
 * @since 23/02/21 2:36 PM
 **/

// will pe performing crud operations
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    //by method name
    List<Employee> findByDepartment(Department department);
    List<Employee> findByDepartment_id(Long departmentId);

    //by @Query annotation
    @Query("SELECT e FROM Employee e WHERE e.department.id = ?1")
    //@Query("FROM Employee e WHERE e.department.id = ?1")
    List<Employee> getEmployeeListByDepartmentId(Long departmentId);

    //by native query
    @Query(value = "SELECT * FROM employee e WHERE e.department_id = ?1", nativeQuery = true)
    List<Employee> getEmployeeListByNativeQuery(Long departmentId);
}
