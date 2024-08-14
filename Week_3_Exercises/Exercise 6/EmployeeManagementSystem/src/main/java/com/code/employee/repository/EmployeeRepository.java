package com.code.employee.repository;

import com.code.employee.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //List<Employee> findByName(String name);
    //List<Employee> findByDepartmentId(int DepartmentId);
    //List<Employee> findByEmail(String email);
    @Query(name = "Employee.findByEmail")
    Employee findByEmailNamed(@Param("email") String email);

    @Query(name = "Employee.findByDepartmentId")
    List<Employee> findByDepartmentIdNamed(@Param("departmentId") int departmentId);

    Page<Employee> findAll(Pageable pageable);

    Page<Employee> findByDepartmentId(int departmentId, Pageable pageable);
    //@Query("SELECT e.name as name, e.email as email from Employee e")
    //List<EmployeeProjection> findByEmployee;

}