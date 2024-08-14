package com.code.employee.entity;
import com.code.employee.entity.Department;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NamedQueries({
        @NamedQuery(
                name="Employee.findByEmail",
                query="SELECT e FROM Employee e WHERE e.email= :email"
        ),
        @NamedQuery(
                name="Employee.findByDepartmentId",
                query="SELECT e FROM Employee e WHERE e.department.id = :departmentId"
        )
})
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

    public Employee(){
        this.id=0;
    }
}
