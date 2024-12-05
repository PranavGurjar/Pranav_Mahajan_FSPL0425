
package com.sampleProject.EmployeeManagementSystem.service;

import com.sampleProject.EmployeeManagementSystem.dto.EmployeeDTO;
import com.sampleProject.EmployeeManagementSystem.entity.Employee;
import com.sampleProject.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee employeeData(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();

//        employee.setEmployeeId(0L);
        employee.setEmployeeFirstName(employeeDTO.getEmployeeFirstName());
        employee.setEmployeeLastName(employeeDTO.getEmployeeLastName());
        employee.setContactNo(employeeDTO.getContactNo());
        employee.setEmail(employeeDTO.getEmail());
        employee.setAddress(employeeDTO.getAddress());
        employee.setDateOfJoining(employeeDTO.getDateOfJoining());
        employee.setSalary(employeeDTO.getSalary());
        employee.setActive(true); // Assuming all new employees are active by default
        employee.setCreateBy(employeeDTO.getCreateBy());
        employee.setUpdateBy(employeeDTO.getUpdateBy());
        employee.setCreateDate(LocalDateTime.now());
        employee.setUpdatedDate(LocalDateTime.now());

        // Save and return the saved entity
        return employeeRepository.save(employee);
    }


    public List<Employee> getAllEmployee(){
            List<Employee> list = employeeRepository.findAll();
            return list;
    }
}








