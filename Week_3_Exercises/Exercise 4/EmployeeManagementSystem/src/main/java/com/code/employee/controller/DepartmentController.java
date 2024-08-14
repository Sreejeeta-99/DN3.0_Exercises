package com.code.employee.controller;

import com.code.employee.entity.Department;
import com.code.employee.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    @Autowired
    DepartmentRepository departmentRepository;

    @PostMapping("/add")
    public Department createDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    @GetMapping("/")
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Get a single Department by ID
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable int id) {
        Optional<Department> department = departmentRepository.findById(id);
        return department.get();
    }

    // Update a Department
    @PutMapping("/edit/{id}")
    public Department updateDepartment(@PathVariable int id, @RequestBody Department departmentDetails) {
        Optional<Department> optionalDepartment = departmentRepository.findById(id);
        if (optionalDepartment.isPresent()) {
            Department department = optionalDepartment.get();
            department.setName(departmentDetails.getName());
            Department updatedDepartment = departmentRepository.save(department);
            return department;
        } else {
            return null;
        }
    }

    // Delete a Department
    @DeleteMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable int id) {
        Optional<Department> optionalDepartment = departmentRepository.findById(id);
        if (optionalDepartment.isPresent()) {
            departmentRepository.delete(optionalDepartment.get());
            return "Department with id" + id + "deleted successfully";
        } else {
            return "Department with id" + id + " not found";


        }
    }
}