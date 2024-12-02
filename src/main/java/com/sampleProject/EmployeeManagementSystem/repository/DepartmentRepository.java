package com.sampleProject.EmployeeManagementSystem.repository;

import com.sampleProject.EmployeeManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository <Department, Long> {
}
