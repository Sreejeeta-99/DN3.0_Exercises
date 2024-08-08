package com.code.employee.controller;

import com.code.employee.entity.Department;
import com.code.employee.entity.Employee;
import com.code.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    // Create a new Employee
    @PostMapping("/add")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // Get all Employees
    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get a single Employee by ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        Employee employee = employeeRepository.findById(id).get();
        return employee;
    }
    // Update an Employee
    @PutMapping("/edit/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employeeDet) {

        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            employee.setName(employeeDet.getName());
            employee.setEmail(employeeDet.getEmail());
            employee.setDepartment(employeeDet.getDepartment());
            Employee updatedEmployee = employeeRepository.save(employee);

            return updatedEmployee;
        } else {
            return null;
        }

    }

    // Delete an Employee
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            employeeRepository.delete(optionalEmployee.get());
            return "Deleted successfully";
        } else {
            return "Not Deleted ";
	   }
	}
}