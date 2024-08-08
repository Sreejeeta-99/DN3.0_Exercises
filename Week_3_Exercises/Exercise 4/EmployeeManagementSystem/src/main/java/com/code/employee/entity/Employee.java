package com.code.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter

public class Employee {
	
	
	
	 public Employee(int id, String name, String email, double salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.department = department;
	}
	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;

	    @Column(name="name",nullable = false)
	    private String name;

	    @Column(name="email",nullable = false, unique = true)
	    private String email;
	    
	    @Column(name="salary",nullable = false)
	    private double salary;
//relationship with department one employee can works in one department
//under1 department there will be many employees
	    
	    @ManyToOne //relationship manyToOne
	    @JoinColumn(name = "department_id", nullable = false)//creating a foreign key department_id ref to the pk ofthe Department
	    private Department department;
}
