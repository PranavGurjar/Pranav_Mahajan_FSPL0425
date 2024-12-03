package com.sampleProject.EmployeeManagementSystem.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DepartmentDTO {
    private String departmentName;
    private boolean isActive;
    private String createBy;
    private LocalDateTime createDate;
    private String updateBy;
    private LocalDateTime updatedDate;
}
