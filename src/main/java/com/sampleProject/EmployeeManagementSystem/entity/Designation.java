package com.sampleProject.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "designation")
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long designationId;
    private String designationName;

    private boolean isActive;
    private String createBy;
    private LocalDateTime createDate;
    private String updateBy;
    private LocalDateTime updatedDate;
}

