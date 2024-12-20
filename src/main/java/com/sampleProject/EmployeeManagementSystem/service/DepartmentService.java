package com.sampleProject.EmployeeManagementSystem.service;

import com.sampleProject.EmployeeManagementSystem.dto.DepartmentDTO;
import com.sampleProject.EmployeeManagementSystem.entity.Department;
import com.sampleProject.EmployeeManagementSystem.entity.Designation;
import com.sampleProject.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department departmentData(DepartmentDTO departmentDTO) {
        Department department = new Department();

        // Map DTO values to Entity
//        department.setDepartmentId(0L);
        department.setDepartmentName(departmentDTO.getDepartmentName());
        department.setActive(true); // Assuming all new departments are active by default
        department.setCreateBy(departmentDTO.getCreateBy());
        department.setUpdateBy(departmentDTO.getUpdateBy());
        department.setCreateDate(LocalDateTime.now());
        department.setUpdatedDate(LocalDateTime.now());

        // Save and return the saved entity
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartment() {
        List<Department> list = departmentRepository.findAll();
        return list;
    }
}
