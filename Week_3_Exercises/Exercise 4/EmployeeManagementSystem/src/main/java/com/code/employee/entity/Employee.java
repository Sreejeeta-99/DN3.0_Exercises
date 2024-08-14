package com.code.employee.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name="department_id",nullable = false)
    private Department department;

    ////relationship with department one employee can works in one department
  //under1 department there will be many employees
    
    public Employee(){
        this.id=0;
    }
}
