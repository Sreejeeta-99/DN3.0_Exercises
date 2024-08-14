package com.code.employee.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name="departments")
@Getter
@Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //adding constraints unique =true not allow duplicate departmentname
    @Column(nullable = false,unique = true)
    private String name;

    //@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    //private List<Employee> employees;

    public Department(){
        //this.employees=null;
        this.id=0;
        this.name=null;
    }

}
