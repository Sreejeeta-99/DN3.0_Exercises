package com.code.employee.repository;

import com.code.employee.entity.Employee;
import com.code.employee.projection.EmployeeProjection;
import com.code.employee.projection.EmployeeValueProjection;

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
    
  //adding the query for employee projection by value
    @Query("SELECT e.name as name, e.email as email FROM Employee e WHERE e.department.name= :departmentName")
    List<EmployeeValueProjection> findByDepartmentName1(@Param("departmentName") String departmentName);

    //adding the query for employee projection
    @Query("SELECT e.name as name,e.email as email FROM Employee e")
    List<EmployeeProjection> findByEmployee();
}
