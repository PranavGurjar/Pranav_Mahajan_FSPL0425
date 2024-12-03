package com.sampleProject.EmployeeManagementSystem.service;

import com.sampleProject.EmployeeManagementSystem.dto.EmployeeDTO;
import com.sampleProject.EmployeeManagementSystem.entity.Employee;
import com.sampleProject.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addData(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();

        // Map DTO values to Entity
        employee.setEmployeeFirstName(employeeDTO.getEmployeeFirstName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setActive(true); // Assuming all new employees are active by default
        employee.setCreateBy(employeeDTO.getCreateBy());
        employee.setUpdateBy(employeeDTO.getUpdateBy());
        employee.setCreateDate(LocalDateTime.now());
        employee.setUpdatedDate(LocalDateTime.now());

        // Save and return the saved entity
        return employeeRepository.save(employee);
    }
}
