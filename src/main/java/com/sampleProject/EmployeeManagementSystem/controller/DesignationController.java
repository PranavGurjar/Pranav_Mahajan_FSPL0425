package com.sampleProject.EmployeeManagementSystem.controller;

import com.sampleProject.EmployeeManagementSystem.dto.DesignationDTO;
import com.sampleProject.EmployeeManagementSystem.entity.Designation;
import com.sampleProject.EmployeeManagementSystem.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/designation")
public class DesignationController {

    @Autowired
    DesignationService designationService;

    @PostMapping("/designationData")
    public ResponseEntity<Designation> addData (DesignationDTO designationDTO){
        return new ResponseEntity<>(designationService.designationData(designationDTO),CREATED);
    }
}

