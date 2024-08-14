package com.code.employee.repository;

import com.code.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByName(String name);
    List<Employee> findByDepartmentId(int DepartmentId);
    List<Employee> findByEmail(String email);
}
