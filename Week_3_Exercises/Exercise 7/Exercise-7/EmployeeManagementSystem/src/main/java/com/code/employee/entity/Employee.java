package com.code.employee.entity;
import com.code.employee.entity.Department;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

import static jakarta.persistence.TemporalType.TIMESTAMP;

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
@EntityListeners(AuditingEntityListener.class)
//for each and every entity we can have Entity Listerner
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

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Temporal(TIMESTAMP)
    @Column(nullable = false)
    private LocalDateTime lastModifiedDate;

    @CreatedBy
    @Column(nullable = false, updatable = false)
    private String createdBy;

    @LastModifiedBy
    @Temporal(TIMESTAMP)
    @Column(nullable = false)
    private String lastModifiedBy;

    public Employee(){
        this.id=0;
        this.name=null;
        this.email=null;
    }
}
