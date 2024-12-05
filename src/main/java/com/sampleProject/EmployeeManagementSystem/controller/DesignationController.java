package com.sampleProject.EmployeeManagementSystem.controller;

import com.sampleProject.EmployeeManagementSystem.dto.DesignationDTO;
import com.sampleProject.EmployeeManagementSystem.entity.Designation;
import com.sampleProject.EmployeeManagementSystem.entity.Employee;
import com.sampleProject.EmployeeManagementSystem.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/designation")
public class DesignationController {

    @Autowired
    DesignationService designationService;

    @PostMapping("/designationData")
    public ResponseEntity<Designation> designationData (@RequestBody DesignationDTO designationDTO){
        return new ResponseEntity<>(designationService.designationData(designationDTO),CREATED);
    }

    @GetMapping("/getAllDesignation")
    public ResponseEntity<List<Designation>> getAllDesignation() {
        List<Designation> designation = designationService.getAllDesignation();
        return new ResponseEntity<>(designation, OK);
    }
}









//        {
//        "designationName": "Software Engineer",
//        "createBy": "Admin",
//        "updateBy": "HR"
//        }