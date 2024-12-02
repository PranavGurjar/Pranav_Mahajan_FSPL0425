package com.sampleProject.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "employeeInfo")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

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


//isActive
//        createdBy
//createdDate
//        updatedBy
//updatedDate
