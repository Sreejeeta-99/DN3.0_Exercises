package com.code.employee.repository;

import com.code.employee.entity.Department;

public interface DepartmentRepository {
	Department findByName(String name);
}
