package com.code.employee.repository;

import com.code.employee.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
    Department findByName(String name);
    //Custom JPQL query to find a department by name
    @Query("SELECT d from Department d where d.name=:name")
    Department findByNameUsingJPQL(@Param("name") String name);

    //default nativeQuery=false so when we want to use sql query native query set to true
    @Query(value = "SELECT * FROM departments d WHERE d.name LIKE %:pattern%", nativeQuery = true)
    List<Department> findByNamePattern(@Param("pattern") String pattern);

}
