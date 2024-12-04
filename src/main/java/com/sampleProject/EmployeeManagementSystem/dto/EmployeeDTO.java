package com.sampleProject.EmployeeManagementSystem.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeDTO {
    private String employeeFirstName;
    private String employeeLastName;
    private String contactNo;
    private String email;
    private String address;
    private String dateOfJoining;
    private double salary;

    private boolean isActive;
    private String createBy;
    private LocalDateTime createDate;
    private String updateBy;
    private LocalDateTime updatedDate;
}

//{
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

