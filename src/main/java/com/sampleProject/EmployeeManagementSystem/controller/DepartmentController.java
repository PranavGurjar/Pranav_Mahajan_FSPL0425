package com.sampleProject.EmployeeManagementSystem.controller;

import com.sampleProject.EmployeeManagementSystem.dto.DepartmentDTO;
import com.sampleProject.EmployeeManagementSystem.entity.Department;
import com.sampleProject.EmployeeManagementSystem.entity.Designation;
import com.sampleProject.EmployeeManagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/departmentData")
    public ResponseEntity<Department> departmentData (@RequestBody DepartmentDTO departmentDTO){
        return new ResponseEntity<>(departmentService.departmentData(departmentDTO),CREATED);
    }

    @GetMapping("/getAllDepartment")
    public ResponseEntity<List<Department>> getAllDepartment() {
        List<Department> department = departmentService.getAllDepartment();
        return new ResponseEntity<>(department, OK);
    }

}







//        {
//        "departmentName": "Research and Development",
//        "isActive": true,
//        "createBy": "Admin",
//        "createDate": "2024-12-04T10:15:30",
//        "updateBy": "HR",
//        "updatedDate": "2024-12-04T12:30:45"
//        }
