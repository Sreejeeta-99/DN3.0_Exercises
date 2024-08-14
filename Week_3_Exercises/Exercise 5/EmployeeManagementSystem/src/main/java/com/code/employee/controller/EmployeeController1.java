package com.code.employee.controller;

import com.code.employee.entity.Employee;
import com.code.employee.repository.DepartmentRepository;
import com.code.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/employee")
public class EmployeeController1 {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    // Create a new Employee
    @PostMapping(value = "/add")

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
    //@path variable used to get the variable passed from url
    //https://localhost:8185/api/employee/1
    //@PathVariable int id returns 1
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employeeDet) {
        //returns object of Optional
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            //ispresent checks whether it contains object, if not returns null
            //setting the new value
            Employee employee = optionalEmployee.get();
            employee.setName(employeeDet.getName());
            employee.setEmail(employeeDet.getEmail());
            employee.setDepartment(employeeDet.getDepartment());
            //setting the object
            Employee updatedEmployee = employeeRepository.save(employee);
            //returning the object
            return updatedEmployee;
        } else {
            //returning null if not object found
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

    //named query
    @GetMapping(value = "/email/{email}")
    public Employee findByEmail(@PathVariable String email){
        return employeeRepository.findByEmailNamed(email);
    }

    @GetMapping(value = "department/{id}")
    public List<Employee> findByDepartmentId(@PathVariable int id){
        return employeeRepository.findByDepartmentIdNamed(id);
    }
}