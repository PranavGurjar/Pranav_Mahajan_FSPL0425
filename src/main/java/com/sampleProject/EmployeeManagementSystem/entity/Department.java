package com.sampleProject.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "departmet")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    private String departmentName;


    private boolean isActive;
    private String createBy;
    private LocalDateTime createDate;
    private String updateBy;
    private LocalDateTime updatedDate;
}




