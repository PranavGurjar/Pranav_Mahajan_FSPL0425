package com.sampleProject.EmployeeManagementSystem.controller;

import com.sampleProject.EmployeeManagementSystem.dto.DepartmentDTO;
import com.sampleProject.EmployeeManagementSystem.entity.Department;
import com.sampleProject.EmployeeManagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/departmentData")
    public ResponseEntity<Department> addData (DepartmentDTO departmentDTO){
        return new ResponseEntity<>(departmentService.departmentData(departmentDTO),CREATED);
    }

}

