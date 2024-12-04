package com.sampleProject.EmployeeManagementSystem.controller;

import com.sampleProject.EmployeeManagementSystem.dto.EmployeeDTO;
import com.sampleProject.EmployeeManagementSystem.entity.Employee;
import com.sampleProject.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employeeData")
    public ResponseEntity<Employee> employeeData(@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity<>(employeeService.employeeData(employeeDTO),CREATED);
    }

//    @GetMapping("/getAllEmployee")
//    public ResponseEntity<List<Employee>> getAllEmployee() {
//        List<Employee> employees = employeeService.getAllEmployee();
//        return new ResponseEntity<>(employees, HttpStatus.OK); // Use HttpStatus.OK (200) here
//    }
}











//@GetMapping("/getAllEmployee")
//public ResponseEntity<List<Employee>> getAllEmployee() {
//    List<Employee> employees = employeeService.getAllEmployee();
//    return new ResponseEntity<>(employees, HttpStatus.OK); // Use HttpStatus.OK (200) here
//}





//       {
//        "employeeFirstName": "Pranav",
//        "employeeLastName": "Mahajan",
//        "contactNo": "8329401951",
//        "email": "pranavmahajan@gmail.com",
//        "address": "Jalgaon",
//        "dateOfJoining": "05-Aug-2024",
//        "salary": 3000.0,
//        "createBy": "Admin",
//        "updateBy": "HR"
//        }